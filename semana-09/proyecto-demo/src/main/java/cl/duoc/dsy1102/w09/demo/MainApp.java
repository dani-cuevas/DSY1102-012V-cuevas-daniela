package cl.duoc.dsy1102.w09.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(
            MainApp.class.getResource("/cl/duoc/dsy1102/w09/demo/ui/MainView.fxml")
        );
        Scene scene = new Scene(loader.load(), 600, 320);
        stage.setTitle("Registro de Vehiculos");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
