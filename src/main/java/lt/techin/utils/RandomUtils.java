package lt.techin.utils;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {
//    public static String generateRandomEmail() {
//        int randomNum = ThreadLocalRandom.current().nextInt(1, 9999);
//        String email = "random" + randomNum + "@Email.com";
//        return email;
//    }

    public static final String randomNumber(int length) {
        int min = (int) Math.pow(10, length - 1);
        int max = (int) Math.pow(10, length); // bound is exclusive
        Random random = new Random();
        return Integer.toString(random.nextInt(max - min) + min);
    }

}