
import java.util.Random;

public class KeyGenerator {

    private static Random random = new Random();
    private static String words[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                                         "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private static String[] chars = {"!", "@", "#", "$", "%", "&", "^", "*", "(", ")", "-", ",", ".", "/"};

    private static int randomWords = random.nextInt(words.length);
    private static int randomChar = random.nextInt(chars.length);

    public static String generate(int sizeKey, boolean chars) {
// TODO: 19.09.17 сделать проверку sizeKey на соразмерность массивам 
        StringBuilder temp = new StringBuilder();
        while (temp.length() < sizeKey) {
            int max = 9999;
//04.05.18 Проверка, нужны ли спецсимволы            
            if (chars){
                temp.append(words[random.nextInt(randomWords)])
                    .append(chars[random.nextInt(randomChar)])
                    .append(random.nextInt(max));
                }
            else
                {
                temp.append(words[random.nextInt(randomWords)])
                    .append(random.nextInt(max));
                }
        }
        return temp.toString();
    }

}
