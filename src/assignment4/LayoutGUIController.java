package assignment4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LayoutGUIController {
    private String crrntArtOpt= "DEFAULT";
    private String oprnd1= "0";
    private int result = -999999999;
    private int memNum = 0;
    @FXML
    private TextField opperand;

    @FXML
    private Button Num2;

    @FXML
    private Button Num1;

    @FXML
    private Button Num4;

    @FXML
    private Button Num9;

    @FXML
    private Button Num7;

    @FXML
    private Button Num3;

    @FXML
    private Button Num5;

    @FXML
    private Button equal;

    @FXML
    private Button Num6;

    @FXML
    private Button Num8;

    @FXML
    private Button subtract;

    @FXML
    private Button add;

    @FXML
    private Button divide;

    @FXML
    private Button multiply;

    @FXML
    private Button Num0;
     @FXML
    private Button clear;

    @FXML
    void ArtOp(ActionEvent event) {
        if (result != -999999999){
            crrntArtOpt = "DEFAULT";
            result = -999999999;
        }
        if( ((Button)event.getSource()).getText().equals("+")){
            if(crrntArtOpt.equals("DEFAULT")){
                oprnd1 = opperand.getText();
                crrntArtOpt = "ADD";
                opperand.clear();
            }
        }
        else if( ((Button)event.getSource()).getText().equals("x")){
            if(crrntArtOpt.equals("DEFAULT")){
                oprnd1 = opperand.getText();
                crrntArtOpt = "MULTIPLY";
                opperand.clear();
            }
        }
        else if( ((Button)event.getSource()).getText().equals("-")){
            if(crrntArtOpt.equals("DEFAULT")){
                oprnd1 = opperand.getText();
                crrntArtOpt = "SUBTRACT";
                opperand.clear();
            }
        }
        else if( ((Button)event.getSource()).getText().equals("/")){
            if(crrntArtOpt.equals("DEFAULT")){
                oprnd1 = opperand.getText();
                crrntArtOpt = "DIVIDE";
                opperand.clear();
            }
        }

    }
    
    @FXML
    void Clear(ActionEvent event) {
        if( ((Button)event.getSource()).getText().equals("C")){
            if ((opperand.getText()).equals("")){
                crrntArtOpt = "DEFAULT";
                oprnd1 = "0";
            }
        opperand.clear();
        }
    }

    @FXML
    void processNum(ActionEvent event) {
        Button btn = (Button)event.getSource();
        if((opperand.getText()).equals("ERROR") || result != -999999999){
            opperand.clear();
            result = -999999999;
            crrntArtOpt = "DEFAULT";
        }
        switch(btn.getText()){
            case "1": opperand.setText(opperand.getText()+"1");break;
            case "2": opperand.setText(opperand.getText()+"2");break;
            case "3": opperand.setText(opperand.getText()+"3");break;
            case "4": opperand.setText(opperand.getText()+"4");break;
            case "5": opperand.setText(opperand.getText()+"5");break;
            case "6": opperand.setText(opperand.getText()+"6");break;
            case "7": opperand.setText(opperand.getText()+"7");break;
            case "8": opperand.setText(opperand.getText()+"8");break;
            case "9": opperand.setText(opperand.getText()+"9");break;
            case "0": opperand.setText(opperand.getText()+"0");break;
        }

    }

    @FXML
    void processOptn(ActionEvent event) {
        if((opperand.getText()).equals("") || oprnd1.equals("")|| (opperand.getText()).equals("ERROR")){
            opperand.setText("ERROR");
            crrntArtOpt = "DEFAULT";
        }
        else{
            int num1;
            int num2;
            if(Integer.parseInt(opperand.getText())==result){
               num1= result;
               num2= memNum; 
            }
            else{
                num1= Integer.parseInt(oprnd1);
                num2= Integer.parseInt(opperand.getText());
                memNum = num2;
            }
            if (crrntArtOpt.equals("ADD")){
                opperand.setText(""+(num1 + num2));
                result = num1 + num2;
            }
            else if (crrntArtOpt.equals("MULTIPLY")){
                opperand.setText(""+(num1 * num2));
                result = num1 * num2;
            }
            else if (crrntArtOpt.equals("SUBTRACT")){
                opperand.setText(""+(num1 - num2));
                result = num1 - num2;
            }
            else if (crrntArtOpt.equals("DIVIDE")){
                opperand.setText(""+(num1 / num2));
                result = num1 / num2;
            }
        }
    }
}
