#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloController {
    private static final Logger logger = LoggerFactory
            .getLogger(HelloController.class);

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    private Stage stage;

    @FXML
    void initialize() {
        logger.debug("initializing");

    }
    
    public setStage(Stage stage) {
        this.stage = stage;
    }

}
