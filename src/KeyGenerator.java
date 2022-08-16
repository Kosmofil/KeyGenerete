
import java.util.Random;

public class KeyGenerator {

    private static final Random random = new Random();
    //private static final String words[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
    //                                     "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private static final char[] words = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                                         'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
   
//private static final String charsis[] = {"!", "@", "#", "$", "%", "&", "^", "*", "(", ")", "-", ",", ".", "/"};
   private static final char[] charsis = {'!', '@', '#', '$', '%', '&', '^', '*', '(', ')', '.'};


private static final int randomWords = words.length-1;
private static final int randomChar = charsis.length-1;
    
    
    public static String generate(int sizeKey, boolean chars) {
// TODO: 19.09.17 сделать проверку sizeKey на соразмерность массивам 
        StringBuilder temp = new StringBuilder();
        int max = 9;
        
    if(chars == true){
        for(int i = sizeKey; i > 0; i--){
            //temp.append(i);
            temp.append(words[random.nextInt(randomWords-1)+1]);
            temp.append(charsis[random.nextInt(randomChar-1)+1]);
            temp.append(random.nextInt(max));
        }
    }
    else {
        for(int i = sizeKey; i > 0; i--){
            //temp.append(i)
             temp.append(words[random.nextInt(randomWords-1)+1])
                    .append(random.nextInt(max));
         }
     
    }
   temp.setLength(sizeKey);
   temp.toString();
        return temp.toString();
    }

}

