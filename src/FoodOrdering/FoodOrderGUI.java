package FoodOrdering;

import LeapYear.LeapYearGUI;

import javax.swing.*;

public class FoodOrderGUI extends JFrame{
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    double total=0;
    public FoodOrderGUI(){
        btnOrder.addActionListener(b -> {
            try {
                if (cPizza.isSelected()) {
                    total += 100;
                }
                if (cBurger.isSelected()) {
                    total += 80;
                }
                if (cFries.isSelected()) {
                    total += 65;
                }
                if (cSoftDrinks.isSelected()) {
                    total += 55;
                }
                if (cTea.isSelected()) {
                    total += 50;
                }
                if (cTea.isSelected()) {
                    total += 40;
                }
                if (rb5.isSelected()) {
                    total *= .95;
                } else if (rb10.isSelected()) {
                    total *= .90;
                } else if (rb15.isSelected()) {
                    total *= .85;
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            JOptionPane.showMessageDialog(null, "The total price is "+String.format("%.2f", total));
            total = 0;
        });
    }
    public static void main(String[] args) {
        JFrame jframe = new JFrame("Food Ordering System");
        jframe.setContentPane(new FoodOrderGUI().panel1);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.pack();
        jframe.setVisible(true);
    }
}
