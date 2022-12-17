package LeapYear;

import javax.swing.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class LeapYearGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI(){
            AtomicBoolean leap = new AtomicBoolean(false);
            btnCheckYear.addActionListener(e -> {
                int year = Integer.parseInt(tfYear.getText());

                // if the year is divided by 4
                if (year % 4 == 0) {

                    // if the year is century
                    if (year % 100 == 0) {

                        // if year is divided by 400
                        // then it is a leap year
                        if (year % 400 == 0)
                            leap.set(true);
                        else
                            leap.set(false);
                    }

                    // if the year is not century
                    else
                        leap.set(true);
                }

                else
                    leap.set(false);

                if (leap.get())
                    JOptionPane.showMessageDialog(null, "Leap Year");
                else
                    JOptionPane.showMessageDialog(null, "Not a leap year");
            });




    }
    public static void main(String[] args) {
            JFrame jframe = new JFrame("Leap Year Checker");
            jframe.setContentPane(new LeapYearGUI().panel1);

            jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jframe.pack();
            jframe.setVisible(true);


    }
}
