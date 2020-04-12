/**
 * Sample Skeleton for 'App.fxml' Controller Class
 */

package app.controller;

import app.model.Cofre;
import app.model.Moeda;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class AppController implements Initializable{
    private Cofre cofre = new Cofre();

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="tblDepositos"
    private TableView<Moeda> tblDepositos; // Value injected by FXMLLoader
    
    @FXML // fx:id="colMoeda"
    private TableColumn<Moeda, String> colMoeda;

    @FXML // fx:id="colValor"
    private TableColumn<Moeda, Float> colValor;

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
        String nome,valor;
        float val;
        Moeda moeda;
        nome = txtNomeMoeda.getText();
        valor = txtValorMoeda.getText();
        try {
            if(nome.isBlank()){
                throw new Exception("Nome não pode ser vazio.");
            }
            if (valor.isBlank()) {
                throw new Exception("Valor não pode ser vazio");
            }
            val = Float.parseFloat(valor);
            if(val <=0){
                throw new Exception("Valor não pode ser 0 ou menor;");
            }
            moeda = new Moeda(nome, val);
            cofre.ReceberMoeda(moeda);
            colMoeda.setCellValueFactory(new PropertyValueFactory<Moeda, String>("Nome"));
            colValor.setCellValueFactory(new PropertyValueFactory<Moeda, Float>("Valor"));
            tblDepositos.getItems().setAll(cofre.getMoedas());
            System.out.println(moeda.getNome());
            System.out.println(moeda.getValor());
            System.out.println(cofre.TotalMoedas());
            System.out.println(cofre.TotalDepositado());
        } catch (NullPointerException e){
            MsgBox("Error!", "valor nullo.");
        } catch (NumberFormatException e) {
            MsgBox("Error!","\"" + txtValorMoeda.getText() + "\" . Não é um valor válido.");
        } catch (Exception e) {
            MsgBox("Error!", e.getMessage());
        }
        
    }

    @FXML
    void txtMoedaKeyTyped(KeyEvent event) {

    }

    @FXML
    void txtValorKeyTyped(KeyEvent event) {

    }

    void MsgBox(String title,String msg) {
        Alert alert = new Alert(Alert.AlertType.NONE);
        alert.setTitle(title);
        alert.setContentText(msg);
        alert.getButtonTypes().clear();
        alert.getButtonTypes().addAll(ButtonType.OK);
        alert.showAndWait();
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
       
    }
}
