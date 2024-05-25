import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

// Main class for the Date Picker Example
public class datePickerClass {

    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Date Picker Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create the date picker model
        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");

        // Create the date panel
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);

        // Create the date picker with a DateLabelFormatter
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());

        // Add the date picker to the frame
        frame.getContentPane().add(datePicker);

        // Display the frame
        frame.setVisible(true);
    }
}

// Formatter class for the date picker
class DateLabelFormatter extends JFormattedTextField.AbstractFormatter {

    private String datePattern = "yyyy-MM-dd";
    private SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);

    @Override
    public Object stringToValue(String text) throws ParseException {
        return dateFormatter.parseObject(text);
    }

    @Override
    public String valueToString(Object value) throws ParseException {
        if (value != null) {
            Calendar cal = (Calendar) value;
            return dateFormatter.format(cal.getTime());
        }
        return "";
    }
}
