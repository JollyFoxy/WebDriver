package Tests;

import org.junit.jupiter.api.Test;

public class TestButtons extends MainTest{
    @Test
    public void testing(){
        pageButtons.transition();
        pageButtons.oneClick();
        pageButtons.rightClick();
        pageButtons.doubleClick();
    }
}
