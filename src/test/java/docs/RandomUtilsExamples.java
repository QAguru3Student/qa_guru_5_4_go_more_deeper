package docs;

import org.junit.jupiter.api.Test;

import static utils.RandomUtils.*;

public class RandomUtilsExamples {
    @Test
    void randomExample(){
        String randomString = getRandomString(11);
        System.out.println(randomString);

        String randomMessage = getRandomMessage(22, 10);
        System.out.println(randomMessage);

        int randomInt = getRandomInt(22333, 10000000);
        System.out.println(randomInt);

        String randomPhone = getRandomPhone();
        System.out.println(randomPhone);

        String randomPhoneWithPrefix = getRandomPhone("+7");
        System.out.println(randomPhoneWithPrefix);

        String difficultRandomPhoneWithPrefix = getDifficultRandomPhone("+8");
        System.out.println(difficultRandomPhoneWithPrefix);

        String randomEmail = getRandomEmail();
        System.out.println(randomEmail);
    }
}
