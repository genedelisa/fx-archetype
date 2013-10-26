#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainApp extends Application {

    private static final Logger log = LoggerFactory.getLogger(MainApp.class);

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    public void start(Stage stage) throws Exception {

        log.info("Starting JavaFX");

        String fxmlFile = "/fxml/hello.fxml";
        log.debug("Loading FXML for main view from: {}", fxmlFile);
        FXMLLoader loader = new FXMLLoader();
        Parent rootNode = (Parent) loader.load(getClass().getResourceAsStream(
                fxmlFile));

        log.debug("Showing JFX scene");
        Scene scene = new Scene(rootNode);
        scene.getStylesheets().add("/styles/styles.css");

        stage.setTitle("Hello JavaFX");
        stage.setScene(scene);
        
        // make it full screen
        stage.setX(0);
        stage.setY(0);
        stage.setWidth(Screen.getPrimary().getVisualBounds().getWidth());
        stage.setHeight(Screen.getPrimary().getVisualBounds().getHeight());
        
        stage.show();
    }
}
