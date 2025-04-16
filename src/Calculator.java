import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {

    JTextField text;
    JButton ac, delete, divide, multiply, seven, eight, nine, zero, equal,dod ,four, five, six, one, two, three, substract, Add;
    int num = 0;

    Calculator() {
        setLayout(null);

        text = new JTextField();
        text.setBounds(50, 50, 260, 138);
        text.setFont(new Font("Tahoma", Font.BOLD, 30));
        text.setHorizontalAlignment(JTextField.CENTER);
        text.setBackground(Color.BLACK);
        text.setForeground(Color.WHITE);
        text.setEditable(false);
        add(text);

        ac = new JButton("AC");
        ac.setFont(new Font("Tahoma", Font.BOLD, 15));
        ac.setBounds(34,386,62,62);
        ac.setBackground(Color.decode("#A5A5A5"));
        ac.setForeground(Color.decode("#616161"));
        ac.setFocusable(false);
        ac.addActionListener(this);
        add(ac);

        ImageIcon de = new ImageIcon("E:\\Java Y2\\Calculator\\CalculatorApp\\src\\de.png");
        Image de1 = de.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
        ImageIcon de2 = new ImageIcon(de1);

        delete = new JButton(de2);
        delete.setFont(new Font("Tahoma", Font.BOLD, 15));
        delete.setBounds(116,386,62,62);
        delete.setBackground(Color.decode("#A5A5A5"));
        delete.setForeground(Color.decode("#616161"));
        delete.setFocusable(false);
        delete.addActionListener(this);
        add(delete);

        divide = new JButton("/");
        divide.setFont(new Font("Tahoma", Font.BOLD, 25));
        divide.setBounds(198,386,62,62);
        divide.setBackground(Color.decode("#005DB2"));
        divide.setForeground(Color.decode("#339DFF"));
        divide.setFocusable(false);
        divide.addActionListener(this);
        add(divide);

        multiply = new JButton("*");
        multiply.setFont(new Font("Tahoma", Font.BOLD, 25));
        multiply.setBounds(280,386,62,62);
        multiply.setBackground(Color.decode("#005DB2"));
        multiply.setForeground(Color.decode("#339DFF"));
        multiply.setFocusable(false);
        multiply.addActionListener(this);
        add(multiply);

        seven = new JButton("7");
        seven.setFont(new Font("Tahoma", Font.BOLD, 25));
        seven.setBounds(34,470,62,62);
        seven.setBackground(Color.decode("#303136"));
        seven.setForeground(Color.decode("#29A8FF"));
        seven.setFocusable(false);
        seven.addActionListener(this);
        add(seven);

        eight = new JButton("8");
        eight.setFont(new Font("Tahoma", Font.BOLD, 25));
        eight.setBounds(116,470,62,62);
        eight.setBackground(Color.decode("#303136"));
        eight.setForeground(Color.decode("#29A8FF"));
        eight.setFocusable(false);
        eight.addActionListener(this);
        add(eight);

        nine = new JButton("9");
        nine.setFont(new Font("Tahoma", Font.BOLD, 25));
        nine.setBounds(198,470,62,62);
        nine.setBackground(Color.decode("#303136"));
        nine.setForeground(Color.decode("#29A8FF"));
        nine.setFocusable(false);
        nine.addActionListener(this);
        add(nine);

        substract = new JButton("-");
        substract.setFont(new Font("Tahoma", Font.BOLD, 25));
        substract.setBounds(280,470,62,62);
        substract.setBackground(Color.decode("#005DB2"));
        substract.setForeground(Color.decode("#339DFF"));
        substract.setFocusable(false);
        substract.addActionListener(this);
        add(substract);

        four = new JButton("4");
        four.setFont(new Font("Tahoma", Font.BOLD, 25));
        four.setBounds(34,546,62,62);
        four.setBackground(Color.decode("#303136"));
        four.setForeground(Color.decode("#29A8FF"));
        four.setFocusable(false);
        four.addActionListener(this);
        add(four);


        five = new JButton("5");
        five.setFont(new Font("Tahoma", Font.BOLD, 25));
        five.setBounds(116,546,62,62);
        five.setBackground(Color.decode("#303136"));
        five.setForeground(Color.decode("#29A8FF"));
        five.setFocusable(false);
        five.addActionListener(this);
        add(five);

        six = new JButton("6");
        six.setFont(new Font("Tahoma", Font.BOLD, 25));
        six.setBounds(198,546,62,62);
        six.setBackground(Color.decode("#303136"));
        six.setForeground(Color.decode("#29A8FF"));
        six.setFocusable(false);
        six.addActionListener(this);
        add(six);

        Add = new JButton("+");
        Add.setFont(new Font("Tahoma", Font.BOLD, 25));
        Add.setBounds(280,552,62,96);
        Add.setBackground(Color.decode("#005DB2"));
        Add.setForeground(Color.decode("#339DFF"));
        Add.setFocusable(false);
        Add.addActionListener(this);
        add(Add);

        one = new JButton("1");
        one.setFont(new Font("Tahoma", Font.BOLD, 25));
        one.setBounds(34,622,62,62);
        one.setBackground(Color.decode("#303136"));
        one.setForeground(Color.decode("#29A8FF"));
        one.setFocusable(false);
        one.addActionListener(this);
        add(one);

        two = new JButton("2");
        two.setFont(new Font("Tahoma", Font.BOLD, 25));
        two.setBounds(116,622,62,62);
        two.setBackground(Color.decode("#303136"));
        two.setForeground(Color.decode("#29A8FF"));
        two.setFocusable(false);
        two.addActionListener(this);
        add(two);

        three = new JButton("3");
        three.setFont(new Font("Tahoma", Font.BOLD, 25));
        three.setBounds(198,622,62,62);
        three.setBackground(Color.decode("#303136"));
        three.setForeground(Color.decode("#29A8FF"));
        three.setFocusable(false);
        three.addActionListener(this);
        add(three);

        zero = new JButton("0");
        zero.setFont(new Font("Tahoma", Font.BOLD, 25));
        zero.setBounds(34,710,144,62);
        zero.setBackground(Color.decode("#303136"));
        zero.setForeground(Color.decode("#29A8FF"));
        zero.setFocusable(false);
        zero.addActionListener(this);
        add(zero);

        dod = new JButton(".");
        dod.setFont(new Font("Tahoma", Font.BOLD, 25));
        dod.setBounds(198,710,62,62);
        dod.setBackground(Color.decode("#303136"));
        dod.setForeground(Color.decode("#29A8FF"));
        dod.setFocusable(false);
        dod.addActionListener(this);
        add(dod);

        equal = new JButton("=");
        equal.setFont(new Font("Tahoma", Font.BOLD, 25));
        equal.setBounds(280,674,62,96);
        equal.setBackground(Color.decode("#005DB2"));
        equal.setForeground(Color.decode("#339DFF"));
        equal.setFocusable(false);
        equal.addActionListener(this);
        add(equal);

        setSize(375, 830);
        setLocation(300, 0);
        setTitle("Calculator");
        setResizable(false);
        getContentPane().setBackground(Color.BLACK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ea) {
        if (ea.getSource() == ac) {
            text.setText(""); // Clear the text field
        } else if (ea.getSource() == delete) {
            String currentText = text.getText();
            if (!currentText.isEmpty()) {
                // Remove the last character
                text.setText(currentText.substring(0, currentText.length() - 1));
            }
        } else if (ea.getSource() == zero) {
            text.setText(text.getText() + "0");
        } else if (ea.getSource() == one) {
            text.setText(text.getText() + "1");
        } else if (ea.getSource() == two) {
            text.setText(text.getText() + "2");
        } else if (ea.getSource() == three) {
            text.setText(text.getText() + "3");
        } else if (ea.getSource() == four) {
            text.setText(text.getText() + "4");
        } else if (ea.getSource() == five) {
            text.setText(text.getText() + "5");
        } else if (ea.getSource() == six) {
            text.setText(text.getText() + "6");
        } else if (ea.getSource() == seven) {
            text.setText(text.getText() + "7");
        } else if (ea.getSource() == eight) {
            text.setText(text.getText() + "8");
        } else if (ea.getSource() == nine) {
            text.setText(text.getText() + "9");
        } else if (ea.getSource() == Add) {
            text.setText(text.getText() + "+");
        } else if (ea.getSource() == substract) {
            text.setText(text.getText() + "-");
        } else if (ea.getSource() == multiply) {
            text.setText(text.getText() + "*");
        } else if (ea.getSource() == divide) {
            text.setText(text.getText() + "/");
        } else if (ea.getSource() == dod) {
            text.setText(text.getText() + ".");
        }
        else if (ea.getSource() == equal){
            try {
                //String expression = Double.parseDouble(text.getText());
                String expression = text.getText();
                double result = evaluateExpression(expression);
                text.setText(String.valueOf(result));
            } catch (Exception e) {
                text.setText("Fuck you");
            }

        }
    }
    private double evaluateExpression(String expression) throws Exception {
        // Remove spaces from the expression
        expression = expression.replaceAll("\\s+", "");

        // Use two stacks: one for numbers and one for operators
        Stack<Double> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            // If the character is a digit, parse the full number
            if (Character.isDigit(c) || c == '.') {
                StringBuilder sb = new StringBuilder();
                while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    sb.append(expression.charAt(i));
                    i++;
                }
                i--; // Adjust for the loop increment
                numbers.push(Double.parseDouble(sb.toString()));
            } else if (c == '(') {
                operators.push(c);
            } else if (c == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    numbers.push(applyOperation(operators.pop(), numbers.pop(), numbers.pop()));
                }
                operators.pop(); // Remove '('
            } else if (isOperator(c)) {
                while (!operators.isEmpty() && precedence(c) <= precedence(operators.peek())) {
                    numbers.push(applyOperation(operators.pop(), numbers.pop(), numbers.pop()));
                }
                operators.push(c);
            }
        }

        // Apply remaining operations
        while (!operators.isEmpty()) {
            numbers.push(applyOperation(operators.pop(), numbers.pop(), numbers.pop()));
        }

        return numbers.pop();
    }

    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private int precedence(char operator) {
        if (operator == '+' || operator == '-') return 1;
        if (operator == '*' || operator == '/') return 2;
        return -1;
    }

    private double applyOperation(char operator, double b, double a) throws Exception {
        switch (operator) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': 
                if (b == 0) throw new ArithmeticException("Division by zero");
                return a / b;
            default: throw new Exception("Invalid operator");
        }
    }

    public static void main(String[] args) throws Exception {
        new Calculator();
    }
}