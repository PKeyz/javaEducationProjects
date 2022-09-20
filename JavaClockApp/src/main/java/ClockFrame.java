import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;

/**
 * 1.
 * hoursLabel background-color: black , text-color: green , text-font : needed?
 * get system hours
 * display system hours in pm
 * add label to frame
 * 2.
 * dayLabel background-color: none , text-font: choose one
 * 3.
 * dateLabel background-color: none , dd.mm.yyyy format , text-font: same as dayLabel
 */

public class ClockFrame extends JFrame {

    //vars
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel hoursLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    Font font = new Font("Helvetica Neue", Font.PLAIN,14);

    //constructor with actual frame
    ClockFrame() throws FontFormatException {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("MyClockApp");
        this.setLayout(new FlowLayout());
        this.setSize(350,200);
        this.setResizable(false);

        hoursLabel = new JLabel();
        this.hoursLabel.setText(String.valueOf(timeFormat));

        this.hoursLabel.setBackground(Color.BLACK);
        this.hoursLabel.setForeground(Color.GREEN);
        this.hoursLabel.setFont(font);

        timeFormat = new SimpleDateFormat("HH:mm:ss");

        this.setVisible(true);
    }
//JLabels to display information time: hh:mm:ss am | pm , day in all letters , date dd.mm.yyyy





}
