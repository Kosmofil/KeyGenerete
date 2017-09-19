
import java.util.Random;

public class KeyGenerator {

    private static Random random = new Random();
    private static String words[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                                         "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private static String[] chars = {"!", "@", "#", "$", "%", "&", "^", "*", "(", ")", "-", ",", ".", "/"};

    private static int randomWords = random.nextInt(words.length);
    private static int randomChar = random.nextInt(chars.length);

    public static String generate(int sizeKey) {

        String temp = "";
        while (temp.length() < sizeKey) {
            int max = 9999;
            temp += words[random.nextInt(randomWords)]
                    + chars[random.nextInt(randomChar)]
                    + random.nextInt(max);
        }
        return temp;
    }

}
