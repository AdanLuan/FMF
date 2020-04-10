/**
 * Sample Skeleton for 'App.fxml' Controller Class
 */

package app;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class AppController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnRetirar"
    private Button btnRetirar; // Value injected by FXMLLoader

    @FXML // fx:id="btnDepositar"
    private Button btnDepositar; // Value injected by FXMLLoader

    @FXML // fx:id="lblTotalDisponivel"
    private Label lblTotalDisponivel; // Value injected by FXMLLoader

    @FXML
    void btnDepositarClick(MouseEvent event) {
        lblTotalDisponivel.setText("20,00");
    }

    @FXML
    void btnRetirarClick(MouseEvent event) {
        lblTotalDisponivel.setText("10,00");
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnRetirar != null : "fx:id=\"btnRetirar\" was not injected: check your FXML file 'App.fxml'.";
        assert btnDepositar != null : "fx:id=\"btnDepositar\" was not injected: check your FXML file 'App.fxml'.";
        assert lblTotalDisponivel != null : "fx:id=\"lblTotalDisponivel\" was not injected: check your FXML file 'App.fxml'.";

    }
}
