import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Pr35 extends Application {

    @Override
    public void start(Stage stage) {
        double maxHeight = 300;

        VBox projectsBar = createBar("Projects — 20%", 20, maxHeight, Color.RED);
        VBox quizzesBar = createBar("Quizzes — 10%", 10, maxHeight, Color.BLUE);
        VBox midtermBar = createBar("Midterm Exams — 30%", 30, maxHeight, Color.GREEN);
        VBox finalBar = createBar("Final Exam — 40%", 40, maxHeight, Color.ORANGE);

        HBox root = new HBox(30);
        root.setAlignment(Pos.BOTTOM_CENTER);
        root.getChildren().addAll(projectsBar, quizzesBar, midtermBar, finalBar);

        Scene scene = new Scene(root, 600, 400);
        stage.setTitle("Grade Distribution Bar Chart");
        stage.setScene(scene);
        stage.show();
    }

    private VBox createBar(String labelText, int percentage, double maxHeight, Color color) {
        double height = (percentage / 100.0) * maxHeight;

        Rectangle bar = new Rectangle(60, height);
        bar.setFill(color);

        Text label = new Text(labelText);

        VBox box = new VBox(10);
        box.setAlignment(Pos.BOTTOM_CENTER);
        box.getChildren().addAll(bar, label);

        return box;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
