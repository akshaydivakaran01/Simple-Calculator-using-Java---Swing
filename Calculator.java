import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.*;

public class Calculator implements ActionListener {
    JLabel displayLabel;
    JButton buttonSeven, buttonEight, buttonNine, buttonDivision, buttonFour, buttonFive, buttonSix, buttonMultiplication, buttonOne, 
    buttonTwo, buttonThree, buttonMinus, buttonZero, buttonDot, buttonEquals, buttonPlus, buttonClear;
    String inputText = "";

    public Calculator() {
        JFrame jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(500, 600);
        jf.setLocation(500, 150);
        jf.getContentPane().setBackground(Color.black);

        displayLabel = new JLabel();
        displayLabel.setBounds(30, 50, 420, 40);
        displayLabel.setBackground(Color.white);
        displayLabel.setOpaque(true);
        displayLabel.setForeground(Color.black);
        displayLabel.setHorizontalAlignment(SwingConstants.CENTER);
        displayLabel.setFont(new Font("Arial", 1, 20));
        jf.add(displayLabel);

        buttonSeven = new JButton("7");
        buttonSeven.setBounds(30, 140, 60, 60);
        SetButtonStyle(buttonSeven);
        jf.add(buttonSeven);
        setButtonMouseListeners(buttonSeven);
        buttonSeven.addActionListener(this);

        buttonEight = new JButton("8");
        buttonEight.setBounds(120, 140, 60, 60);
        SetButtonStyle(buttonEight);
        jf.add(buttonEight);
        setButtonMouseListeners(buttonEight);
        buttonEight.addActionListener(this);

        buttonNine = new JButton("9");
        buttonNine.setBounds(210, 140, 60, 60);
        SetButtonStyle(buttonNine);
        jf.add(buttonNine);
        setButtonMouseListeners(buttonNine);
        buttonNine.addActionListener(this);

        buttonDivision = new JButton("/");
        buttonDivision.setBounds(300, 140, 60, 60);
        SetButtonStyle(buttonDivision);
        jf.add(buttonDivision);
        setButtonMouseListeners(buttonDivision);
        buttonDivision.addActionListener(this);

        buttonFour = new JButton("4");
        buttonFour.setBounds(30, 230, 60, 60);
        SetButtonStyle(buttonFour);
        jf.add(buttonFour);
        setButtonMouseListeners(buttonFour);
        buttonFour.addActionListener(this);

        buttonFive = new JButton("5");
        buttonFive.setBounds(120, 230, 60, 60);
        SetButtonStyle(buttonFive);
        jf.add(buttonFive);
        setButtonMouseListeners(buttonFive);
        buttonFive.addActionListener(this);

        buttonSix = new JButton("6");
        buttonSix.setBounds(210, 230, 60, 60);
        SetButtonStyle(buttonSix);
        jf.add(buttonSix);
        setButtonMouseListeners(buttonSix);
        buttonSix.addActionListener(this);

        buttonMultiplication = new JButton("x");
        buttonMultiplication.setBounds(300, 230, 60, 60);
        SetButtonStyle(buttonMultiplication);
        jf.add(buttonMultiplication);
        setButtonMouseListeners(buttonMultiplication);
        buttonMultiplication.addActionListener(this);

        buttonOne = new JButton("1");
        buttonOne.setBounds(30, 320, 60, 60);
        SetButtonStyle(buttonOne);
        jf.add(buttonOne);
        setButtonMouseListeners(buttonOne);
        buttonOne.addActionListener(this);

        buttonTwo = new JButton("2");
        buttonTwo.setBounds(120, 320, 60, 60);
        SetButtonStyle(buttonTwo);
        jf.add(buttonTwo);
        setButtonMouseListeners(buttonTwo);
        buttonTwo.addActionListener(this);

        buttonThree = new JButton("3");
        buttonThree.setBounds(210, 320, 60, 60);
        SetButtonStyle(buttonThree);
        jf.add(buttonThree);
        setButtonMouseListeners(buttonThree);
        buttonThree.addActionListener(this);

        buttonMinus = new JButton("-");
        buttonMinus.setBounds(300, 320, 60, 60);
        SetButtonStyle(buttonMinus);
        jf.add(buttonMinus);
        setButtonMouseListeners(buttonMinus);
        buttonMinus.addActionListener(this);

        buttonZero = new JButton("0");
        buttonZero.setBounds(30, 410, 60, 60);
        SetButtonStyle(buttonZero);
        jf.add(buttonZero);
        setButtonMouseListeners(buttonZero);
        buttonZero.addActionListener(this);

        buttonDot = new JButton(".");
        buttonDot.setBounds(120, 410, 60, 60);
        SetButtonStyle(buttonDot);
        jf.add(buttonDot);
        setButtonMouseListeners(buttonDot);
        buttonDot.addActionListener(this);

        buttonEquals = new JButton("=");
        buttonEquals.setBounds(210, 410, 60, 60);
        SetButtonStyle(buttonEquals);
        jf.add(buttonEquals);
        setButtonMouseListeners(buttonEquals);
        buttonEquals.addActionListener(this);

        buttonPlus = new JButton("+");
        buttonPlus.setBounds(300, 410, 60, 60);
        SetButtonStyle(buttonPlus);
        jf.add(buttonPlus);
        setButtonMouseListeners(buttonPlus);
        buttonPlus.addActionListener(this);

        buttonClear = new JButton("AC");
        buttonClear.setBounds(390, 410, 60, 60);
        buttonClear.setFont(new Font("Arial", 1, 16));
        buttonClear.setForeground(Color.BLACK);
        buttonClear.setBackground(Color.WHITE);
        jf.add(buttonClear);
        setButtonMouseListeners(buttonClear);
        buttonClear.addActionListener(this);


        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void SetButtonStyle(JButton button) {
        button.setFont(new Font("Arial", 0, 25));
        button.setForeground(Color.BLACK);
        button.setBackground(Color.WHITE);
    }

    private void setButtonMouseListeners(JButton button) {
        button.addMouseListener(new MouseAdapter() {
        public void mouseEntered(MouseEvent me) {
            button.setForeground(Color.white);
            button.setBackground(Color.black);
        }
      
         public void mouseExited(MouseEvent me) {
            button.setForeground(Color.black);
            button.setBackground(Color.WHITE);
        }
        });
    }

    public static void main(String[] args) {
        new Calculator();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonSeven) {
            displayLabel.setText(displayLabel.getText() + "7");
        } 
        else if (e.getSource() == buttonEight) {
            displayLabel.setText(displayLabel.getText() + "8");
        } 
        else if (e.getSource() == buttonNine) {
            displayLabel.setText(displayLabel.getText() + "9");
        } 
        else if (e.getSource() == buttonFour) {
            displayLabel.setText(displayLabel.getText() + "4");
        } 
        else if (e.getSource() == buttonFive) {
            displayLabel.setText(displayLabel.getText() + "5");
        } 
        else if (e.getSource() == buttonSix) {
            displayLabel.setText(displayLabel.getText() + "6");
        } 
        else if (e.getSource() == buttonOne) {
            displayLabel.setText(displayLabel.getText() + "1");
        } 
        else if (e.getSource() == buttonTwo) {
            displayLabel.setText(displayLabel.getText() + "2");
        } 
        else if (e.getSource() == buttonThree) {
            displayLabel.setText(displayLabel.getText() + "3");
        } 
        else if (e.getSource() == buttonZero) {
            displayLabel.setText(displayLabel.getText() + "0");
        } 
        else if (e.getSource() == buttonDot) {
            displayLabel.setText(displayLabel.getText() + ".");
        } 
        else if (e.getSource() == buttonClear) {
            displayLabel.setText("");
            inputText = "";
        } 
        else if (e.getSource() == buttonDivision) {
            inputText += displayLabel.getText() + "/";
            displayLabel.setText("");
        } 
        else if (e.getSource() == buttonMultiplication) {
                inputText += displayLabel.getText() + "*";
                displayLabel.setText("");
        } 
        else if (e.getSource() == buttonMinus) {
            inputText += displayLabel.getText() + "-";
            displayLabel.setText("");
        } 
        else if (e.getSource() == buttonPlus) {
            inputText += displayLabel.getText() + "+";
            displayLabel.setText("");
        } 
        else if (e.getSource() == buttonEquals) {
            inputText += displayLabel.getText();
            displayLabel.setText(evaluate(inputText));
            inputText = "";
            }
        }

        public static String evaluate(String expression) {
            char[] arr = expression.toCharArray();
            String operand = ""; 
            char operator = '+';
            double result = 0.0;
            double currentOperand = 0.0;
            boolean isFirstOperand = true;
    
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= '0' && arr[i] <= '9' || arr[i] == '.') {
                    operand += arr[i];
                }
                if (i == arr.length - 1 || arr[i] == '+' || arr[i] == '-' || arr[i] == '*' || arr[i] == '/') {
                    currentOperand = Double.parseDouble(operand);
                    operand = "";
    
                    if (isFirstOperand) {
                        result = currentOperand;
                        isFirstOperand = false;
                    } 
                    else {
                        switch (operator) {
                            case '+':
                                result += currentOperand;
                                break;
                            case '-':
                                result -= currentOperand;
                                break;
                            case '*':
                                result *= currentOperand;
                                break;
                            case '/':
                                result /= currentOperand;
                                break;
                        }
                    }
                    operator = arr[i];
                }
            }   
            return String.valueOf(result);
        }
    }
