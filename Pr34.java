import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Pr34 extends Application {

    @Override
    public void start(Stage stage) {

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);

        Label lblRoll = new Label("Roll No:");
        Label lblName = new Label("Name:");
        Label lblAge = new Label("Age:");
        Label lblEmail = new Label("Email:");

        TextField txtRoll = new TextField();
        TextField txtName = new TextField();
        TextField txtAge = new TextField();
        TextField txtEmail = new TextField();

        Button btnSubmit = new Button("Submit");

        grid.add(lblRoll, 0, 0);
        grid.add(txtRoll, 1, 0);

        grid.add(lblName, 0, 1);
        grid.add(txtName, 1, 1);

        grid.add(lblAge, 0, 2);
        grid.add(txtAge, 1, 2);

        grid.add(lblEmail, 0, 3);
        grid.add(txtEmail, 1, 3);

        grid.add(btnSubmit, 1, 4);

        btnSubmit.setOnAction(e -> {
            String roll = txtRoll.getText();
            String name = txtName.getText();
            String age = txtAge.getText();
            String email = txtEmail.getText();

            try {
                int rollNo = Integer.parseInt(roll);
                int ageVal = Integer.parseInt(age);

                if (!email.contains("@") || !email.contains(".")) {
                    throw new Exception("Invalid Email format");
                }

                String data = "Roll No: " + rollNo +
                        "\nName: " + name +
                        "\nAge: " + ageVal +
                        "\nEmail: " + email;

                Alert success = new Alert(Alert.AlertType.INFORMATION);
                success.setTitle("Success");
                success.setHeaderText("Registration Successful");
                success.setContentText(data);
                success.showAndWait();

                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Save Data");
                fileChooser.getExtensionFilters().add(
                        new FileChooser.ExtensionFilter("Text Files", "*.txt")
                );

                File file = fileChooser.showSaveDialog(stage);

                if (file != null) {
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                        writer.write(data);
                    }
                }

            } catch (NumberFormatException ex) {
                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setTitle("Error");
                error.setHeaderText("Invalid Input");
                error.setContentText("Roll No and Age must be integers");
                error.showAndWait();

            } catch (Exception ex) {
                Alert error = new Alert(Alert.AlertType.ERROR);
                error.setTitle("Error");
                error.setHeaderText("Validation Failed");
                error.setContentText(ex.getMessage());
                error.showAndWait();
            }
        });

        Scene scene = new Scene(grid, 350, 250);
        stage.setTitle("Registration Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
