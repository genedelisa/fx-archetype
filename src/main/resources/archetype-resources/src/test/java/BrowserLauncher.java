#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import java.awt.AWTException;

import org.jemmy.fx.AppExecutor;
import org.jemmy.fx.Browser;

public class BrowserLauncher {
    public static void main(String[] args) throws AWTException {
        AppExecutor.executeNoBlock(MainApp.class);
        Browser.runBrowser();
    }
}
