package home;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.layout.AnchorPane;


public class Controller implements Initializable {

	
    @FXML
    private VBox pnItems = null;
    @FXML
    private Button btnOverview;

    @FXML
    private Button btnOrders;

    @FXML
    private Button btnCustomers;

    @FXML
    private Button btnMenus;

    @FXML
    private Button btnPackages;

    @FXML
    private Button btnSettings;

    @FXML
    private Button btnSignout;

    @FXML
    private Pane pnlCustomer;

    @FXML
    private Pane pnlOrders;

    @FXML
    private Pane pnlOverview;

    @FXML
    private Pane pnlMenus;
    
    
    /*
     * 
     * DUPLICATO
     * 
     */
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
   
   @FXML
   private AnchorPane rootPane;
   
   @FXML
   private AnchorPane FileLoadPane;
   
   

   
   ObservableList<Prestazioni> list = FXCollections.observableArrayList(
   
		
			   new Prestazioni(34, 	"70128", "ANDRIA EXPRESS", "119", "11", "54","11"),
			   new Prestazioni(24, 	"70127", "ANDRIA EXPRESS", "543", "11", "54","11"),
			   new Prestazioni(18, 	"70128", "ANDRIA EXPRESS", "11", "11", "54","11"),
			   new Prestazioni(38, 	"70128", "ANDRIA EXPRESS", "19", "11", "54","11"),
			   new Prestazioni(41, 	"70128", "ANDRIA EXPRESS", "200", "11", "54","11"),
			   new Prestazioni(55, 	"70121", "ANDRIA EXPRESS", "54", "11", "54","11"),
			   new Prestazioni(67, 	"70128,70127", "ANDRIA EXPRESS", "119", "11", "54","11"),
			   new Prestazioni(89, 	"70128", "ANDRIA EXPRESS", "799", "11", "54","11"),
			   new Prestazioni(11, 	"70128", "ANDRIA EXPRESS", "111", "11", "54","11"),
			   new Prestazioni(9, 	"70128", "ANDRIA EXPRESS", "14", "11", "54","11"),
			   new Prestazioni(89, 	"70125", "ANDRIA EXPRESS", "29", "11", "54","11")
	
     
   );
    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    	
    	/*
    	 * 
    	 * DUPLICATO
    	 */
    	   id.setCellValueFactory(new PropertyValueFactory<Prestazioni,Integer>("id"));
           name.setCellValueFactory(new PropertyValueFactory<Prestazioni,String>("name"));
           lname.setCellValueFactory(new PropertyValueFactory<Prestazioni,String>("lname"));
           gmail.setCellValueFactory(new PropertyValueFactory<Prestazioni,String>("gmail"));
           yahoo.setCellValueFactory(new PropertyValueFactory<Prestazioni,String>("yahoo"));
           phone.setCellValueFactory(new PropertyValueFactory<Prestazioni,String>("phone"));
           country.setCellValueFactory(new PropertyValueFactory<Prestazioni,String>("country"));
           
           table.setItems(list);
    	
    	
  /*      Node[] nodes = new Node[100];
        for (int i = 0; i < nodes.length; i++) {
            try {

                final int j = i;
                nodes[i] = FXMLLoader.load(getClass().getResource("Item.fxml"));

                //give the items some effect

                nodes[i].setOnMouseEntered(event -> {
                    nodes[j].setStyle("-fx-background-color : #0A0E3F");
                });
                nodes[i].setOnMouseExited(event -> {
                    nodes[j].setStyle("-fx-background-color : #02030A");
                });
                pnItems.getChildren().add(nodes[i]);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
*/
    }

    

    @FXML
    private void loadPerformaces(ActionEvent actionEvent) throws IOException
    {	
    	AnchorPane pane = FXMLLoader.load(getClass().getResource("Item.fxml"));
    	rootPane.getChildren().setAll(pane);
    	
    }
    //@FXML
    //private void LoadHome(ActionEvent actionEvent) throws IOException
    //{	
    	//AnchorPane pane = FXMLLoader.load(getClass().getResource("Home.fxml"));
    	//FileLoadPane.getChildren().setAll(pane);
    	
   // }
    
    
    public void handleClicks(ActionEvent actionEvent) throws IOException {
        if (actionEvent.getSource() == btnCustomers) {
        	
        
           pnlCustomer.setStyle("-fx-background-color : #1620A1");
           pnlCustomer.toFront();
        }
        if (actionEvent.getSource() == btnMenus) {
            pnlMenus.setStyle("-fx-background-color : #53639F");
            pnlMenus.toFront();
        }
        if (actionEvent.getSource() == btnOverview) {
            pnlOverview.setStyle("-fx-background-color : #02030A");
            pnlOverview.toFront();
        }
        if(actionEvent.getSource()==btnOrders)
        {
            pnlOrders.setStyle("-fx-background-color : #464F67");
            pnlOrders.toFront();
        }
        
        if(actionEvent.getSource()==btnSignout)
        {
        	
        	System.exit(0);
        	/*Alert alert = new Alert(AlertType.CONFIRMATION);
        	
        	alert.setTitle("Confirmation Dialog");
        	alert.setHeaderText("Look, a Confirmation Dialog");
        	alert.setContentText("Are you ok with this?");

        	Optional<ButtonType> result = alert.showAndWait();
        	
        	if (result.get() == ButtonType.OK){
        		System.exit(0);
        	} else {
        	    // ... user chose CANCEL or closed the dialog
        	}*/
               
              
        }
        
    }
}
