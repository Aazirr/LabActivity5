package SimpleCalc;

import LeapYear.LeapYearGUI;

import javax.swing.*;

public class SimpleCalcGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public SimpleCalcGUI(){
        btnCompute.addActionListener(b -> {
        try {
                String operation = (String) cbOperations.getSelectedItem();
                double num1 = Double.parseDouble(tfNumber1.getText());
                double num2 = Double.parseDouble(tfNumber2.getText());
                double result=0;
                switch(operation){
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        result = num1 / num2;
                        break;
                }
                lblResult.setText(String.valueOf(result));

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        });
    }
    public static void main(String[] args) {
        JFrame jframe = new JFrame("Simple Calculator");
        jframe.setContentPane(new SimpleCalcGUI().panel1);

        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.pack();
        jframe.setVisible(true);

    }
}
