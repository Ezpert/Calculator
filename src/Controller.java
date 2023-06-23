import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javax.swing.*;
import java.math.BigDecimal;

import java.math.RoundingMode;
import java.util.Objects;

import static java.lang.Math.round;


//TODO:: FIX negative signs for second num


public class Controller {

    @FXML
    private Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,
            clearButton,mButton,dButton,eButton,aButton,sButton, dotButton,negButton;
    @FXML
    private Label myLabel, myLabel1;



    Boolean usedOp = false;
    Boolean usedDot = false;
    Boolean finishedOp = false;
    Boolean negateNum1 = false;
    Boolean negateNum2 = false;
    String num1 = "";
    String num2 = "";
    char op;















    public void clear(ActionEvent event) {


        System.out.println(num1);
        System.out.println(num2);



        finishedOp = false;
        negateNum1 = false;
        negateNum2 = false;
        usedDot = false;
        usedOp = false;
        myLabel.setText("0");
        myLabel1.setText("");
        num1 = "";
        num2 = "";


    }


    public void buttonInput(ActionEvent event)
    {

        Button button = (Button) event.getSource();



        String text = myLabel.getText();

        if(!finishedOp && !Objects.equals(text, "0")) {
            if (!usedOp) {
                if (button == button1) {

                    myLabel.setText(myLabel.getText() + "1");
                    num1 = num1.concat("1");


                } else if (button == button2) {
                    myLabel.setText(myLabel.getText() + "2");
                    num1 = num1.concat("2");


                } else if (button == button3) {
                    myLabel.setText(myLabel.getText() + "3");
                    num1 = num1.concat("3");

                } else if (button == button4) {
                    myLabel.setText(myLabel.getText() + "4");
                    num1 = num1.concat("4");

                } else if (button == button5) {
                    myLabel.setText(myLabel.getText() + "5");
                    num1 = num1.concat("5");

                } else if (button == button6) {
                    myLabel.setText(myLabel.getText() + "6");
                    num1 = num1.concat("6");

                } else if (button == button7) {

                    myLabel.setText(myLabel.getText() + "7");
                    num1 = num1.concat("7");


                } else if (button == button8) {

                    myLabel.setText(myLabel.getText() + "8");
                    num1 = num1.concat("8");

                } else if (button == button9) {
                    myLabel.setText(myLabel.getText() + "9");
                    num1 = num1.concat("9");

                } else if (button == button0) {
                    myLabel.setText(myLabel.getText() + "0");
                    num1 = num1.concat("0");

                } else if (button == dotButton && !usedDot && !myLabel.getText().isEmpty() && !num1.contains(".")) {
                    myLabel.setText(myLabel.getText() + ".");
                    num1 = num1.concat(".");
                    usedDot = true;

                } else if (button == negButton && !negateNum1 && !num1.contains("-"))
                {
                    negateNum1 = true;
                    myLabel.setText("-" + myLabel.getText());
                    num1 = "-" + num1;





                }
            } else {
                if (button == button1 && !finishedOp) {

                    myLabel.setText(myLabel.getText() + "1");
                    num2 = num2.concat("1");


                } else if (button == button2 && !finishedOp) {
                    myLabel.setText(myLabel.getText() + "2");
                    num2 = num2.concat("2");


                } else if (button == button3 && !finishedOp) {
                    myLabel.setText(myLabel.getText() + "3");
                    num2 = num2.concat("3");

                } else if (button == button4 && !finishedOp) {
                    myLabel.setText(myLabel.getText() + "4");
                    num2 = num2.concat("4");

                } else if (button == button5 && !finishedOp) {
                    myLabel.setText(myLabel.getText() + "5");
                    num2 = num2.concat("5");

                } else if (button == button6 && !finishedOp) {
                    myLabel.setText(myLabel.getText() + "6");
                    num2 = num2.concat("6");

                } else if (button == button7 && !finishedOp) {

                    myLabel.setText(myLabel.getText() + "7");
                    num2 = num2.concat("7");


                } else if (button == button8 && !finishedOp) {

                    myLabel.setText(myLabel.getText() + "8");
                    num2 = num2.concat("8");

                } else if (button == button9 && !finishedOp) {
                    myLabel.setText(myLabel.getText() + "9");
                    num2 = num2.concat("9");

                } else if (button == button0 && !finishedOp) {
                    myLabel.setText(myLabel.getText() + "0");
                    num2 = num2.concat("0");

                }else if(button == dotButton && !usedDot && !myLabel.getText().isEmpty() && !num2.contains("."))
                {
                    myLabel.setText(myLabel.getText() + ".");
                    num2 = num2.concat(".");
                    usedDot = true;

                } else if (button == negButton && !negateNum2 && !num2.contains("-"))
                {
                    negateNum2 = true;
                    myLabel.setText("-" + myLabel.getText());
                    num2 = "-" + num2;





                }

            }

        }else
        {
            if (button == button1) {

                clear(event);
                myLabel.setText("1");
                num1 = num1.concat("1");


            } else if (button == button2) {
                clear(event);
                myLabel.setText("2");
                num1 = num1.concat("2");


            } else if (button == button3) {
                clear(event);
                myLabel.setText("3");
                num1 = num1.concat("3");

            } else if (button == button4) {
                clear(event);
                myLabel.setText("4");
                num1 = num1.concat("4");

            } else if (button == button5) {
                clear(event);
                myLabel.setText("5");
                num1 = num1.concat("5");

            } else if (button == button6) {
                clear(event);
                myLabel.setText("6");
                num1 = num1.concat("6");

            } else if (button == button7) {

                clear(event);
                myLabel.setText("7");
                num1 = num1.concat("7");


            } else if (button == button8) {

                clear(event);
                myLabel.setText("8");
                num1 = num1.concat("8");

            } else if (button == button9) {
                clear(event);
                myLabel.setText("9");
                num1 = num1.concat("9");

            } else if (button == button0) {
                clear(event);
                myLabel.setText("0");
                num1 = num1.concat("0");

            }

        }




    }

    public void operator(ActionEvent event)
    {
        Button button = (Button) event.getSource();

        if(button == mButton && !usedOp && !myLabel.getText().isEmpty() )
        {
            myLabel.setText(myLabel.getText() + "×");
            op = '×';
            usedOp = true;
            usedDot = false;

        }else if(button == dButton && !usedOp && !myLabel.getText().isEmpty() )
        {
            myLabel.setText(myLabel.getText() + "÷");
            op = '÷';
            usedOp = true;
            usedDot = false;

        }else if(button == aButton && !usedOp && !myLabel.getText().isEmpty() )
        {
            myLabel.setText(myLabel.getText() + "+");
            op = '+';
            usedOp = true;
            usedDot = false;


        }else if(button == sButton && !usedOp && !myLabel.getText().isEmpty())
        {
            myLabel.setText(myLabel.getText() + "-");
            op = '-';
            usedOp = true;
            usedDot = false;
        }



    }

    public void math(ActionEvent event)
    {
        try {
            if(!finishedOp)
            {
                BigDecimal val1 = new BigDecimal(num1);
                BigDecimal val2 = new BigDecimal(num2);
                BigDecimal sum = new BigDecimal(0);


//            Double val1 = Double.parseDouble(num1);
//            Double val2 = Double.parseDouble(num2);



            finishedOp = true;


                switch (op) {
                    case '+' -> {


                        //val1 = val1.negate();






                        sum = sum.add(val1);
                        sum = sum.add(val2);
                        sum = sum.setScale(2, RoundingMode.HALF_UP);
                        sum = sum.stripTrailingZeros();
                        myLabel1.setText(num1 + " " + op + " " + num2 + " = ");
                        myLabel.setText(sum.toPlainString());

                    }
                    case '-' -> {


                        //val1 = val1.negate();

                        sum = sum.add(val1);
                        sum = sum.subtract(val2);
                        sum = sum.setScale(2, RoundingMode.HALF_UP);
                        sum = sum.stripTrailingZeros();
                        myLabel1.setText(num1 + " " + op + " " + num2 + " = ");
                        myLabel.setText(sum.toPlainString());


                    }
                    case '÷' -> {
                        try {
                            //double sum = val1 / val2;
                            sum = sum.add(val1);
                            sum = sum.divide(val2, 5 , 1);
                            sum = sum.setScale(2, RoundingMode.HALF_UP);
                            sum = sum.stripTrailingZeros();
                            myLabel1.setText(num1 + " " + op + " " + num2 + " = ");
                            myLabel.setText(sum.toPlainString());


                        } catch (ArithmeticException e) {
                            myLabel.setText("Cannot Divide by 0");
                        }


                    }
                    case '×' -> {
                        //Double sum = val1 * val2;
                        sum = sum.add(val1);
                        sum = sum.multiply(val2);
                        sum = sum.setScale(2,RoundingMode.HALF_UP);
                        sum = sum.stripTrailingZeros();
                        myLabel1.setText(num1 + " " + op + " " + num2 + " = ");
                        myLabel.setText(sum.toPlainString());


                    }
                }
            }
        }catch(NumberFormatException e)
        {
            if(num1.isEmpty())
            System.out.println("Please input a number!");
            else if(num2.isEmpty())
                System.out.println("Please input a second number!");
        }







    }








}
