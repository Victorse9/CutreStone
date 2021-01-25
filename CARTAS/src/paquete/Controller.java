package paquete;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    RadioButton r1;
    @FXML
    RadioButton r2;
    @FXML
    RadioButton r3;
    @FXML
    RadioButton r4;
    @FXML
    RadioButton r5;
    @FXML
    RadioButton r6;
    @FXML
    RadioButton r7;
    @FXML
    RadioButton r8;
    @FXML
    Button btnAtacar;
    @FXML
    ToggleGroup grupo1;
    @FXML
    Button btnCarta1;
    @FXML
    Button btnCarta2;
    @FXML
    Button btnCarta3;
    @FXML
    Button btnCarta4;
    @FXML
    Button btnCarta5;
    @FXML
    Button btnCarta6;
    @FXML
    Button btnCarta7;
    @FXML
    Button btnCarta8;


    public void initialize(URL location, ResourceBundle resources) {

    }

public void click1(MouseEvent event){

    if(r1.isSelected()){
        r1.setSelected(false);
    }else{
        r1.setSelected(true);
    }
    turno();
}

    public void click2(MouseEvent event){

        if(r2.isSelected()){
            r2.setSelected(false);
        }else{
            r2.setSelected(true);
        }
        turno();
    }

    public void click3(MouseEvent event){

        if(r3.isSelected()){
            r3.setSelected(false);
        }else{
            r3.setSelected(true);
        }
        turno();
    }
    public void click4(MouseEvent event){

        if(r4.isSelected()){
            r4.setSelected(false);
        }else{
            r4.setSelected(true);
        }
        turno();
    }
    public void click5(MouseEvent event){

        if(r5.isSelected()){
            r5.setSelected(false);
        }else{
            r5.setSelected(true);
        }
        turno();
    }
    public void click6(MouseEvent event){

        if(r6.isSelected()){
            r6.setSelected(false);
        }else{
            r6.setSelected(true);
        }
        turno();
    }
    public void click7(MouseEvent event){

        if(r7.isSelected()){
            r7.setSelected(false);
        }else{
            r7.setSelected(true);
        }
        turno();
    }

    public void click8(MouseEvent event){

        if(r8.isSelected()){
            r8.setSelected(false);
        }else{
            r8.setSelected(true);
        }
        turno();
    }



    public void turno(){
        if ((r1.isSelected()|r2.isSelected()|r3.isSelected()|r4.isSelected()&& (r5.isSelected()|r6.isSelected()|r7.isSelected()|r8.isSelected()))){
            btnAtacar.setDisable(false);
        }else{
            btnAtacar.setDisable(true);
        }
    }

}