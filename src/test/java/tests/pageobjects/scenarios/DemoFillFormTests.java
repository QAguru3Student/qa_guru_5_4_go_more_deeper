package tests.pageobjects.scenarios;

import org.junit.jupiter.api.Test;

public class DemoFillFormTests {

    DemoFillFormPage demoFillFormPage = new DemoFillFormPage();
    @Test
    void successfulFillFormTest(){
        demoFillFormPage.openPage();
        demoFillFormPage.fillForm();
        demoFillFormPage.checkForm();

    }
}