package home;

import java.net.URL;
import java.util.ResourceBundle;

import home.Prestazioni;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class Prestazioni_controller implements Initializable {
    

      @FXML
    private TableView<Prestazioni> table;

    @FXML
    private TableColumn<Prestazioni, Integer> id;

    @FXML
    private TableColumn<Prestazioni, String> name;

    @FXML
    private TableColumn<Prestazioni, String> lname;

    @FXML
    private TableColumn<Prestazioni, String> gmail;

    @FXML
    private TableColumn<Prestazioni, String> yahoo;

    @FXML
    private TableColumn<Prestazioni, String> phone;

    @FXML
    private TableColumn<Prestazioni, String> country;
    
    
    ObservableList<Prestazioni> list = FXCollections.observableArrayList(
    
            new Prestazioni(1, "Amir", "code", "codeamirquestion@gmail.com", "mail@yahoo.com", "0254554444444","USA"),
            new Prestazioni(2, "Yassin", "code", "ab@gmail.com", "b@yahoo.com", "0254554444444","UK"),
            new Prestazioni(3, "Adam", "code", "bv@gmail.com", "c@yahoo.com", "0254555544444","Russia"),
            new Prestazioni(4, "Panda", "code", "d@gmail.com", "d@yahoo.com", "0254554444444","China"),
            new Prestazioni(5, "Sara", "code", "e@gmail.com", "e@yahoo.com", "0254554444444","France")
    );
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        id.setCellValueFactory(new PropertyValueFactory<Prestazioni,Integer>("id"));
        name.setCellValueFactory(new PropertyValueFactory<Prestazioni,String>("name"));
        lname.setCellValueFactory(new PropertyValueFactory<Prestazioni,String>("lname"));
        gmail.setCellValueFactory(new PropertyValueFactory<Prestazioni,String>("gmail"));
        yahoo.setCellValueFactory(new PropertyValueFactory<Prestazioni,String>("yahoo"));
        phone.setCellValueFactory(new PropertyValueFactory<Prestazioni,String>("phone"));
        country.setCellValueFactory(new PropertyValueFactory<Prestazioni,String>("country"));
        
        table.setItems(list);
        
        
    }    
    
}
