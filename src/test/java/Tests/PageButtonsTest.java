package Tests;

import Steps.PageButtons;
import org.junit.jupiter.api.Test;

public class PageButtonsTest extends MainTest{
    @Test
    public void testing(){
        PageButtons buttons = new PageButtons(driver);
        buttons.transition();
        buttons.oneClick();
        buttons.rightClick();
        buttons.doubleClick();
    }
}
