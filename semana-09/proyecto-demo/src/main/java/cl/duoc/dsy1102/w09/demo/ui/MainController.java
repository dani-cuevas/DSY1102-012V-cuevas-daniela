package cl.duoc.dsy1102.w09.demo.ui;

import cl.duoc.dsy1102.w09.demo.model.Vehiculo;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
    @FXML private TextField patenteField;
    @FXML private TextField edadField;
    @FXML private Label resultadoLabel;

    @FXML
    private void registrar() {

        try {

            int edad = Integer.parseInt(edadField.getText());

            if (edad <= 0) {
                throw new IllegalArgumentException(
                        "La edad debe ser mayor que cero"
                );
            }

            Vehiculo vehiculo =
                    new Vehiculo(patenteField.getText());

            resultadoLabel.setText(
                    "Patente válida: "
                            + vehiculo.getPatente()
                            + " | Edad mascota: "
                            + edad
            );

        } catch (NumberFormatException exception) {

            resultadoLabel.setText(
                    "La edad debe ser un número entero"
            );

        } catch (IllegalArgumentException exception) {

            resultadoLabel.setText(
                    exception.getMessage()
            );
        }
    }
}
