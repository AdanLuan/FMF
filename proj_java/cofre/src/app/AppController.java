/**
 * Sample Skeleton for 'App.fxml' Controller Class
 */

package app;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class AppController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="tblDepositos"
    private TableView<?> tblDepositos; // Value injected by FXMLLoader

    @FXML // fx:id="lblTotalMoedas"
    private Label lblTotalMoedas; // Value injected by FXMLLoader

    @FXML // fx:id="txtValorMoeda"
    private TextField txtValorMoeda; // Value injected by FXMLLoader

    @FXML // fx:id="btnDepositar"
    private Button btnDepositar; // Value injected by FXMLLoader

    @FXML // fx:id="txtNomeMoeda"
    private TextField txtNomeMoeda; // Value injected by FXMLLoader

    @FXML // fx:id="lblMaiorMoeda"
    private Label lblMaiorMoeda; // Value injected by FXMLLoader

    @FXML // fx:id="lblTotalDepositado"
    private Label lblTotalDepositado; // Value injected by FXMLLoader

    @FXML
    void btnDepositarClick(MouseEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Erro");
        alert.setHeaderText("Look, an Information Dialog");
        alert.setContentText("I have a great message for you!");
        alert.showAndWait().ifPresent(rs -> {
            if (rs == ButtonType.OK) {
                System.out.println("Pressed OK.");
            }
        });
    }

    @FXML
    void txtMoedaKeyTyped(KeyEvent event) {

    }

    @FXML
    void txtValorKeyTyped(KeyEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert tblDepositos != null : "fx:id=\"tblDepositos\" was not injected: check your FXML file 'App.fxml'.";
        assert lblTotalMoedas != null : "fx:id=\"lblTotalMoedas\" was not injected: check your FXML file 'App.fxml'.";
        assert txtValorMoeda != null : "fx:id=\"txtValorMoeda\" was not injected: check your FXML file 'App.fxml'.";
        assert btnDepositar != null : "fx:id=\"btnDepositar\" was not injected: check your FXML file 'App.fxml'.";
        assert txtNomeMoeda != null : "fx:id=\"txtNomeMoeda\" was not injected: check your FXML file 'App.fxml'.";
        assert lblMaiorMoeda != null : "fx:id=\"lblMaiorMoeda\" was not injected: check your FXML file 'App.fxml'.";
        assert lblTotalDepositado != null : "fx:id=\"lblTotalDepositado\" was not injected: check your FXML file 'App.fxml'.";

    }
}
