import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LayoutGUIController {
    private String crrntArthOp = "Default";
    private String opd1 = "0";
    private String opd2 = "0";
    
    @FXML
    private Button pmBtn;

    @FXML
    private TextField txt1;

    @FXML
    private Button btn1;

    @FXML
    private Button btn4;

    @FXML
    private Button decimalBtn;

    @FXML
    private Button btn2;

    @FXML
    private Button btn5;

    @FXML
    private Button btn3;

    @FXML
    private Button btn6;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    @FXML
    private Button multBtn;

    @FXML
    private Button minusBtn;

    @FXML
    private Button addBtn;

    @FXML
    private Button eqBtn;

    @FXML
    private Button divBtn;
    
    @FXML
    private Button clearBtn;

    @FXML
    private Button percentBtn;
    
    @FXML
    private Button deleteBtn;
    
    @FXML
    private Button zeroBtn;

    @FXML
    void addDigit(ActionEvent event) {

    Button btn = (Button)event.getSource(); 
    
    switch (btn.getText())
    {
        case "1": txt1.setText(txt1.getText() + "1"); break;
        case "2": txt1.setText(txt1.getText() + "2"); break;
        case "3": txt1.setText(txt1.getText() + "3"); break;
        case "4": txt1.setText(txt1.getText() + "4"); break;
        case "5": txt1.setText(txt1.getText() + "5"); break;
        case "6": txt1.setText(txt1.getText() + "6"); break;
        case "7": txt1.setText(txt1.getText() + "7"); break;
        case "8": txt1.setText(txt1.getText() + "8"); break;
        case "9": txt1.setText(txt1.getText() + "9"); break;
        case "0": txt1.setText(txt1.getText() + "0"); break;
        case "clear": txt1.setText(""); break;
    }
    }

    @FXML
    void arthOp(ActionEvent event) {
        
        if(((Button)event.getSource()).getText().equals("+")){
            if(crrntArthOp.equals("Default")){
                opd1 = txt1.getText();
                crrntArthOp = "Add";
                txt1.clear();

            }
        }else if(((Button)event.getSource()).getText().equals("*")){
            if(crrntArthOp.equals("Default")){
                opd1 = txt1.getText();
                crrntArthOp = "Mult";
                txt1.clear();
            }
            
        }else if(((Button)event.getSource()).getText().equals("-")){
            if(crrntArthOp.equals("Default")){
                opd1 = txt1.getText();
                crrntArthOp = "Minus";
                txt1.clear();
            }
        
        }else if(((Button)event.getSource()).getText().equals("/")){
            if(crrntArthOp.equals("Default")){
                opd1 = txt1.getText();
                crrntArthOp = "Div";
                txt1.clear();
            }
        }else if(((Button)event.getSource()).getText().equals("%")){
            if(crrntArthOp.equals("Default")){
                opd1 = txt1.getText();
                crrntArthOp = "Percent";
                txt1.clear();
            }
        }

    }

    @FXML
    void processResult(ActionEvent event) {
        
        int num1 = Integer.parseInt(opd1);
        int num2 = Integer.parseInt(txt1.getText());
        
        if(crrntArthOp.equals("Add")){
            txt1.setText(""+ (num1+num2));
            
        }else if(crrntArthOp.equals("Mult")) {
            txt1.setText(""+ (num1*num2));
            
        }else if (crrntArthOp.equals("Div")){
            txt1.setText(""+ (num1/num2));
            
        }else if (crrntArthOp.equals("Minus")){
            txt1.setText(""+ (num1-num2));
            
        }else if (crrntArthOp.equals("Percent")){
            txt1.setText(""+ (num1/num2*100));
            
        }
    }

    @FXML
    void findOpposite(ActionEvent event) {

    }
    
     @FXML
    void deleteOne(ActionEvent event){
    
    }   
}
