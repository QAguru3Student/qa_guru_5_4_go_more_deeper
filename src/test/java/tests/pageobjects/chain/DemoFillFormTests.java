package tests.pageobjects.chain;

import org.junit.jupiter.api.Test;

public class DemoFillFormTests {

    DemoFillFormPage demoFillFormPage = new DemoFillFormPage();

    @Test
    void successfulFillFormTest(){
        demoFillFormPage
                .openPage
                .fillForm
                .checkForm;
    }
}