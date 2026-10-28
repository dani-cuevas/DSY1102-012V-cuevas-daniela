import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {

        try {

            EstadoJuego estado =
                    new EstadoJuego("Lina", 3);

            Path carpeta = Path.of("data");

            Files.createDirectories(carpeta);

            ObjectMapper mapper =
                    new ObjectMapper();

            mapper.writerWithDefaultPrettyPrinter()
                    .writeValue(
                            Path.of("data", "estado.json").toFile(),
                            estado
                    );

            System.out.println(
                    "Estado guardado correctamente."
            );

        } catch (IOException exception) {

            System.out.println(
                    "Error al guardar el archivo."
            );
        }
    }
}

