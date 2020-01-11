import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class Controller {
    @FXML static Stage STAGE;

    @FXML TextField textField;

    @FXML AnchorPane pane;

    @FXML Circle switchOff;
    @FXML Circle btn7;
    @FXML Circle btn8;
    @FXML Circle btn9;
    @FXML Circle btnDivided;
    @FXML Circle btn4;
    @FXML Circle btn5;
    @FXML Circle btn6;
    @FXML Circle btnMultiply;
    @FXML Circle btn1;
    @FXML Circle btn2;
    @FXML Circle btn3;
    @FXML Circle btnMinus;
    @FXML Circle btnCE;
    @FXML Circle btnZero;
    @FXML Circle btnEquals;
    @FXML Circle btnPlus;


    public void initialize() {
        textField.setText("0");
        textField.setFocusTraversable(false);

        switchOff.setFill(new ImagePattern(new Image("res/off.png")));
        btn9.setFill(new ImagePattern(new Image("res/9.png")));
        btn8.setFill(new ImagePattern(new Image("res/8.png")));
        btn7.setFill(new ImagePattern(new Image("res/7.png")));
        btn4.setFill(new ImagePattern(new Image("res/4.png")));
        btn5.setFill(new ImagePattern(new Image("res/5.png")));
        btn6.setFill(new ImagePattern(new Image("res/6.png")));
        btn1.setFill(new ImagePattern(new Image("res/1.png")));
        btn2.setFill(new ImagePattern(new Image("res/2.png")));
        btn3.setFill(new ImagePattern(new Image("res/3.png")));
        btnZero.setFill(new ImagePattern(new Image("res/0.png")));
        btnCE.setFill(new ImagePattern(new Image("res/CE.png")));
        btnEquals.setFill(new ImagePattern(new Image("res/equals.png")));
        btnDivided.setFill(new ImagePattern(new Image("res/divided.png")));
        btnMultiply.setFill(new ImagePattern(new Image("res/multiply.png")));
        btnMinus.setFill(new ImagePattern(new Image("res/minus.png")));
        btnPlus.setFill(new ImagePattern(new Image("res/plus.png")));

        Calculator calculator = new Calculator(); //для доступа к объекту класса

        switchOff.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> STAGE.close());
        btn9.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> textField.setText(calculator.addNumber("9")));
        btn8.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> textField.setText(calculator.addNumber("8")));
        btn7.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> textField.setText(calculator.addNumber("7")));
        btn6.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> textField.setText(calculator.addNumber("6")));
        btn5.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> textField.setText(calculator.addNumber("5")));
        btn4.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> textField.setText(calculator.addNumber("4")));
        btn3.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> textField.setText(calculator.addNumber("3")));
        btn2.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> textField.setText(calculator.addNumber("2")));
        btn1.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> textField.setText(calculator.addNumber("1")));
        btnZero.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> textField.setText(calculator.addNumber("0")));
        btnCE.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> textField.setText("0"));

        btnPlus.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            calculator.addOperator("+");
            textField.setText("");
        });
        btnMinus.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            calculator.addOperator("-");
            textField.setText("");
        });
        btnMultiply.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            calculator.addOperator("*");
            textField.setText("");
        });
        btnDivided.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            calculator.addOperator("/");
            textField.setText("");
        });


        btnEquals.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            try {
                textField.setText(Integer.toString (calculator.getResult()));
            } catch (MyException e) {
                e.printStackTrace();
            }
        });
    }
}