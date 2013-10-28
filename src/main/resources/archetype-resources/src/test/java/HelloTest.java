#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import javafx.scene.control.Button;

import org.jemmy.fx.SceneDock;
import org.jemmy.fx.control.LabeledDock;
import org.jemmy.resources.StringComparePolicy;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloTest extends JemmyTestBase {

    private static final Logger logger = LoggerFactory
            .getLogger(HelloTest.class);
    private static SceneDock scene;

    @BeforeClass
    public static void startApp() throws InterruptedException {
        startApp(MainApp.class);
        scene = new SceneDock();

    }

    /**
     * 
     */
    @Test
    public void shouldFindTheButton() {
        logger.debug("looking up the button");

        // a Button is a Labeled. Every Labeled can be found by text.
        LabeledDock dock = new LabeledDock(scene.asParent(), "Press",
                StringComparePolicy.EXACT);

        // assertThat(actual, is(equalTo(expected)));
        assertThat("The labeled dock is not null.", dock, notNullValue());

        assertEquals(Button.class, dock.wrap().getControl().getClass());
        // assertThat("", clazz, equalTo(Button.class));
    }

    /**
     * 
     */
    @Test
    public void shouldClickTheButton() {
        logger.debug("Pressing the button");
        LabeledDock dock = new LabeledDock(scene.asParent(), "Press",
                StringComparePolicy.EXACT);
        dock.mouse().click();
        // check that the click did something
    }

}
