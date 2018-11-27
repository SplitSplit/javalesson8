package ru.ponomarev.se;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp {

    private String a;
    private String b;
    private String operation;
    private boolean stage;

    private JPanel panel1;
    private JTextField textField1;
    private JButton Button7;
    private JButton Button4;
    private JButton Button1;
    private JButton a0Button;
    private JButton Button8;
    private JButton Button5;
    private JButton Button2;
    private JButton buttonPerc;
    private JButton Button9;
    private JButton Button6;
    private JButton Button3;
    private JButton buttonEq;
    private JButton buttonDiv;
    private JButton buttonMult;
    private JButton buttonSum;
    private JButton buttonDec;
    private JButton buttonReset;

    public CalculatorApp() {
        a = "";
        b = "";
        operation = "";
        stage = true;

        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (stage) {
                    a = a + "0";
                    textField1.setText(a);
                } else {
                    b = b + "0";
                    textField1.setText(b);
                }
            }
        });

        Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (stage) {
                    a = a + "1";
                    textField1.setText(a);
                } else {
                    b = b + "1";
                    textField1.setText(b);
                }
            }
        });
        Button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (stage) {
                    a = a + "2";
                    textField1.setText(a);
                } else {
                    b = b + "2";
                    textField1.setText(b);
                }
            }
        });
        Button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (stage) {
                    a = a + "3";
                    textField1.setText(a);
                } else {
                    b = b + "3";
                    textField1.setText(b);
                }
            }
        });
        Button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (stage) {
                    a = a + "4";
                    textField1.setText(a);
                } else {
                    b = b + "4";
                    textField1.setText(b);
                }
            }
        });
        Button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (stage) {
                    a = a + "5";
                    textField1.setText(a);
                } else {
                    b = b + "5";
                    textField1.setText(b);
                }
            }
        });
        Button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (stage) {
                    a = a + "6";
                    textField1.setText(a);
                } else {
                    b = b + "6";
                    textField1.setText(b);
                }
            }
        });
        Button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (stage) {
                    a = a + "7";
                    textField1.setText(a);
                } else {
                    b = b + "7";
                    textField1.setText(b);
                }
            }
        });
        Button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (stage) {
                    a = a + "8";
                    textField1.setText(a);
                } else {
                    b = b + "8";
                    textField1.setText(b);
                }
            }
        });
        Button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (stage) {
                    a = a + "9";
                    textField1.setText(a);
                } else {
                    b = b + "9";
                    textField1.setText(b);
                }
            }
        });
        buttonDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operation.isEmpty() && !b.isEmpty()) {
                    stage = false;
                    operation = "/";
                    textField1.setText(a + "/");
                } else {
                    stage = false;
                    operationExec(false);
                    operation = "/";
                    textField1.setText(a + "/");
                }
            }
        });
        buttonMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operation.isEmpty() && !b.isEmpty()) {
                    stage = false;
                    operation = "*";
                    textField1.setText(a + "*");
                } else {
                    stage = false;
                    operationExec(false);
                    operation = "*";
                    textField1.setText(a + "*");
                }
            }
        });
        buttonSum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operation.isEmpty() && !b.isEmpty()) {
                    stage = false;
                    operation = "+";
                    textField1.setText(a + "+");
                } else {
                    stage = false;
                    operationExec(false);
                    operation = "+";
                    textField1.setText(a + "+");
                }
            }
        });
        buttonDec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operation.isEmpty() && !b.isEmpty()) {
                    stage = false;
                    operation = "-";
                    textField1.setText(a + "-");
                } else {
                    stage = false;
                    operationExec(false);
                    operation = "-";
                    textField1.setText(a + "-");
                }
            }
        });
        buttonPerc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (stage) {
                    if(!a.contains(".")) {
                        a = a + ".";
                        textField1.setText(a);
                    }
                } else {
                    if(b.contains(".")) {
                        b = b + ".";
                        textField1.setText(b);
                    }
                }
            }
        });
        buttonEq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!stage && !operation.isEmpty() && !b.isEmpty()) {
                    operationExec(true);
                }
            }
        });
        buttonReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = "";
                b = "";
                operation = "";
                stage = true;
                textField1.setText("0");
            }
        });
    }

    private void operationExec(boolean opExec) {
        if (!operation.isEmpty() && stage == false) {
            double adbl = Double.parseDouble(a);
            double bdbl = Double.parseDouble(b);
            if (operation.equals("/")) {
                a = Double.toString(adbl / bdbl);
            } else if (operation.equals("*")) {
                a = Double.toString(adbl * bdbl);
            } else if (operation.equals("+")) {
                a = Double.toString(adbl + bdbl);
            } else if (operation.equals("-")) {
                a = Double.toString(adbl - bdbl);
            }
            //a = Double.toString(adbl / bdbl);
            b = "";
            if (!opExec) {
                textField1.setText(a + operation);
                operation = "";
            } else {
                operation = "";
                textField1.setText(a);
            }

        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new CalculatorApp().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
