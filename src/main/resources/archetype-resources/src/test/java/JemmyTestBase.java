#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import javafx.application.Application;

import org.jemmy.fx.AppExecutor;
import org.jemmy.input.AWTRobotInputFactory;
import org.junit.After;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JemmyTestBase {
    private static final Logger logger = LoggerFactory
            .getLogger(JemmyTestBase.class);

    private static final String osName = System.getProperty("os.name")
            .toLowerCase();;

    static {
        if (osName.contains("mac os")) {
            AWTRobotInputFactory.runInOtherJVM(true);
        }
    }

    protected static void startApp(Class<? extends Application> app)
            throws InterruptedException {
        logger.debug("staring app {}", app);
        AppExecutor.executeNoBlock(app);
        if (osName.contains("mac os")) {
            Thread.sleep(1000);
        }
    }

   // @After
    public void after() throws Exception {
        // this sleep is just for a demo purposes - to see what's on the screen
        Thread.sleep(1000);
    }

}
