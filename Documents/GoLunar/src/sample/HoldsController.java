
    package sample;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

    public class HoldsController {
        public Connection connect = SqliteConnection.Connector();
        @FXML
        public Label holdInfo;
        Connection conn = null;
        ResultSet rs;
        ResultSet rs2;
        Statement st;
        int id;
        public static String username;

        public HoldsController() {
        }

        @FXML
        private void mainBClicked(ActionEvent event) throws IOException {
            Stage stage = (Stage) ((Button) ((Button) event.getSource())).getScene().getWindow();
            Parent root = (Parent) FXMLLoader.load(this.getClass().getResource("MainMenu.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setWidth(1125.0D);
            stage.setHeight(700.0D);
            stage.show();
        }

        @FXML
        private void recordsBClicked(ActionEvent event) throws IOException {
            Stage stage = (Stage) ((Button) ((Button) event.getSource())).getScene().getWindow();
            Parent root = (Parent) FXMLLoader.load(this.getClass().getResource("Records.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Records Menu");
            stage.setWidth(1125.0D);
            stage.setHeight(700.0D);
            stage.show();
        }

        @FXML
        private void infoBClicked(ActionEvent event) throws IOException {
            Stage stage = (Stage) ((Button) ((Button) event.getSource())).getScene().getWindow();
            Parent root = (Parent) FXMLLoader.load(this.getClass().getResource("PersonalInfo.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Personal Information Menu");
            stage.setWidth(1125.0D);
            stage.setHeight(700.0D);
            stage.show();
        }

        @FXML
        private void registrationBClicked(ActionEvent event) throws IOException {
            Stage stage = (Stage) ((Button) ((Button) event.getSource())).getScene().getWindow();
            Parent root = (Parent) FXMLLoader.load(this.getClass().getResource("Registration.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Registration Menu");
            stage.setWidth(1125.0D);
            stage.setHeight(700.0D);
            stage.show();
        }
        public void setUsername(String name){
            username = name;
        }
        public String getUsername(){
            return username;
        }
        public void setHoldInfo(String str){
            holdInfo.setText(str);
        }
    }

