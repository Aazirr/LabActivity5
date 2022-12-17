package LeapYear;

import javax.swing.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class LeapYearGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI(){
        btnCheckYear.addActionListener(b -> {
        try{
            AtomicBoolean leap = new AtomicBoolean(false);
                int year = Integer.parseInt(tfYear.getText());
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0)
                            leap.set(true);
                        else
                            leap.set(false);
                    }
                    else
                        leap.set(true);
                }

                else
                    leap.set(false);

                if (leap.get())
                    JOptionPane.showMessageDialog(null, "Leap Year");
                else
                    JOptionPane.showMessageDialog(null, "Not a leap year");

        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        });
    }
    public static void main(String[] args) {
        try{
            JFrame jframe = new JFrame("Leap Year Checker");
            jframe.setContentPane(new LeapYearGUI().panel1);

            jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jframe.pack();
            jframe.setVisible(true);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
}
