package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {
    public static double x;
    public static double y;
    public static int type;
    public static int operationFlag, resultFlag, historyFlag;
    public static History history;


    public Button getButton1() {
        return button1;
    }

    public Button getButton2() {
        return button2;
    }

    public Button getButton3() {
        return button3;
    }

    public Button getButton4() {
        return button4;
    }

    public Button getButton5() {
        return button5;
    }

    public Button getButton6() {
        return button6;
    }

    public Button getButton7() {
        return button7;
    }

    public Button getButton8() {
        return button8;
    }

    public Button getButton9() {
        return button9;
    }

    public Button getButton0() {
        return button0;
    }

    public Button getButtonDot() {
        return buttonDot;
    }

    public Button getButtonC() {
        return buttonC;
    }

    public Button getButtonCE() {
        return buttonCE;
    }

    public Button getButtonAdd() {
        return buttonAdd;
    }

    public Button getButtonSubtract() {
        return buttonSubtract;
    }

    public Button getButtonDivided() {
        return buttonDivided;
    }

    public Button getButtonEqual() {
        return buttonEqual;
    }

    public Button getButtonMultiply() {
        return buttonMultiply;
    }

    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button button7;
    @FXML
    private Button button8;
    @FXML
    private Button button9;
    @FXML
    private Button button0;
    @FXML
    private Button buttonDot;
    @FXML
    private Button buttonC;
    @FXML
    private Button buttonCE;
    @FXML
    private Button buttonAdd;
    @FXML
    private Button buttonSubtract;
    @FXML
    private Button buttonDivided;
    @FXML
    private Button buttonEqual;
    @FXML
    private Button buttonMultiply;


    @FXML
    Label display;

    @FXML
    void button0Clicked(ActionEvent event) {
        if (resultFlag == 1 || historyFlag == 1) {
            display.setText("");

            resultFlag = 0;
            historyFlag = 0;
        }
        if (display.getText().equalsIgnoreCase("0")) {
            display.setText("0");
        } else {
            display.setText(display.getText() + "0");

        }

    }

    @FXML
    void button1Clicked(ActionEvent event) {
        if (resultFlag == 1 || historyFlag == 1) {
            display.setText("");
            resultFlag = 0;
            historyFlag = 0;
        }
        if (display.getText().equalsIgnoreCase("0")) {
            display.setText("1");
        } else {
            display.setText(display.getText() + "1");

        }

    }

    @FXML
    void button2Clicked(ActionEvent event) {
        if (resultFlag == 1 || historyFlag == 1) {
            display.setText("");
            resultFlag = 0;
            historyFlag = 0;
        }
        if (display.getText().equalsIgnoreCase("0")) {
            display.setText("2");
        } else {
            display.setText(display.getText() + "2");

        }

    }

    @FXML
    void button3Clicked(ActionEvent event) {
        if (resultFlag == 1 || historyFlag == 1) {
            display.setText("");
            resultFlag = 0;
            historyFlag = 0;
        }
        if (display.getText().equalsIgnoreCase("0")) {
            display.setText("3");
        } else {
            display.setText(display.getText() + "3");

        }

    }

    @FXML
    void button4Clicked(ActionEvent event) {
        if (resultFlag == 1 || historyFlag == 1) {
            display.setText("");
            resultFlag = 0;
            historyFlag = 0;
        }
        if (display.getText().equalsIgnoreCase("0")) {
            display.setText("4");
        } else {
            display.setText(display.getText() + "4");
        }

    }

    @FXML
    void button5Clicked(ActionEvent event) {
        if (resultFlag == 1 || historyFlag == 1) {
            display.setText("");
            resultFlag = 0;
            historyFlag = 0;
        }
        if (display.getText().equalsIgnoreCase("0")) {
            display.setText("5");
        } else {
            display.setText(display.getText() + "5");

        }

    }

    @FXML
    void button6Clicked(ActionEvent event) {
        if (resultFlag == 1 || historyFlag == 1) {
            display.setText("");
            resultFlag = 0;
            historyFlag = 0;
        }
        if (display.getText().equalsIgnoreCase("0")) {
            display.setText("6");
        } else {
            display.setText(display.getText() + "6");

        }

    }

    @FXML
    void button7Clicked(ActionEvent event) {
        if (resultFlag == 1 || historyFlag == 1) {
            display.setText("");
            resultFlag = 0;
            historyFlag = 0;
        }
        if (display.getText().equalsIgnoreCase("0")) {
            display.setText("7");
        } else {
            display.setText(display.getText() + "7");

        }

    }


    @FXML
    void button8Clicked(ActionEvent event) {
        if (resultFlag == 1 || historyFlag == 1) {
            display.setText("");
            resultFlag = 0;
            historyFlag = 0;
        }
        if (display.getText().equalsIgnoreCase("0")) {
            display.setText("8");
        } else {
            display.setText(display.getText() + "8");

        }

    }

    @FXML
    void button9Clicked(ActionEvent event) {
        if (resultFlag == 1 || historyFlag == 1) {
            display.setText("");
            resultFlag = 0;
            historyFlag = 0;
        }
        if (display.getText().equalsIgnoreCase("0")) {
            display.setText("9");
        } else {
            display.setText(display.getText() + "9");

        }


    }

    @FXML
    void buttonDotClicked(ActionEvent event) {
        display.setText(display.getText() + ".");
        buttonDot.setDisable(true);
    }

    @FXML
    void setButtonCclicked() {
        if (display.getText().length() <= 1) {
            display.setText("");
        } else {
            if (display.getText().charAt(display.getText().length() - 1) == '.') {
                buttonDot.setDisable(false);
            }
            display.setText(display.getText().substring(0, display.getText().length() - 1));
            if (operationFlag == 0) {
                x = Double.parseDouble(display.getText());
            } else {
                y = Double.parseDouble(display.getText());
            }
        }
    }

    @FXML
    void buttonCEClicked() {
        display.setText("0");
        buttonDot.setDisable(false);
        if (operationFlag == 0) {
            x = 0;
        } else {
            y = 0;
        }
    }

    @FXML
    void buttonAddClicked() {
        if (operationFlag != 1) {
            if (!display.getText().equalsIgnoreCase("")) {
                type = 1;
                operationFlag = 1;
                x = Double.parseDouble(display.getText());
                display.setText("");
                buttonDot.setDisable(false);
            }
        }
    }

    @FXML
    void buttonSubtractClicked() {
        if (operationFlag != 1) {
            if (!display.getText().equalsIgnoreCase("")) {
                type = 2;
                operationFlag = 1;
                x = Double.parseDouble(display.getText());
                display.setText("");
                buttonDot.setDisable(false);
            }
        }

    }

    @FXML
    void buttonMultiplyClicked() {
        if (operationFlag != 1) {
            if (!display.getText().equalsIgnoreCase("")) {
                type = 3;
                operationFlag = 1;
                x = Double.parseDouble(display.getText());
                display.setText("");
                buttonDot.setDisable(false);
            }
        }
    }

    @FXML
    void buttonDividedClicked() {
        if (operationFlag != 1) {
            if (!display.getText().equalsIgnoreCase("")) {
                type = 4;
                operationFlag = 1;
                x = Double.parseDouble(display.getText());
                display.setText("");
                buttonDot.setDisable(false);
            }
        }
    }

    @FXML
    void buttonEqualClicked() {
        if (historyFlag==1){
            display.setText(String.valueOf(history.getCurrent().getResult()));
            resultFlag=1;
            operationFlag=0;
            historyFlag=0;
        }
       else if (operationFlag == 1 && !(display.getText().equalsIgnoreCase(""))) {
            y = Double.parseDouble(display.getText());
            resultFlag = 1;
            operationFlag = 0;
            Operations operation = new Operations(x, y, type);
            operation.makeOperation();
            history.addtohistory(operation);
            double result = operation.getResult();
            display.setText(String.valueOf(result));
            if (display.getText().equalsIgnoreCase("Infinity")) {
                display.setText("");
                ErrorBox error = new ErrorBox();
                error.errorDisplay();
            }
            if (display.getText().equalsIgnoreCase("NaN")) {
                display.setText("");
                ErrorBox error = new ErrorBox();
                error.errorDisplay();
            }
            buttonDot.setDisable(false);
        }
    }

    @FXML
    void buttonNextClicked() {
        historyFlag = 1;
        history.next();
        String operator = new String();
        switch (history.getCurrent().getType()) {
            case 1:
                operator = "+";
                break;
            case 2:
                operator = "-";
                break;
            case 3:
                operator = "*";
                break;
            case 4:
                operator = "/";
                break;
            default:
                break;
        }
        display.setText(String.valueOf(history.getCurrent().getNum1() + "" + operator + "" + String.valueOf(history.getCurrent().getNum2())));
        y = 0;
        x = history.getCurrent().getResult();
        resultFlag = 0;
        operationFlag = 1;
        historyFlag = 1;
    }

    @FXML
    void buttonPreviousClicked() {
        historyFlag = 1;
        history.previous();
        String operator = new String();
        switch (history.getCurrent().getType()) {
            case 1:
                operator = "+";
                break;
            case 2:
                operator = "-";
                break;
            case 3:
                operator = "*";
                break;
            case 4:
                operator = "/";
                break;
            default:
                break;
        }
        display.setText(String.valueOf(history.getCurrent().getNum1() + "" + operator + "" + String.valueOf(history.getCurrent().getNum2())));
        y = 0;
        x = history.getCurrent().getResult();
        resultFlag = 0;
        operationFlag = 1;
        historyFlag = 1;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        history = new History();
    }
}
