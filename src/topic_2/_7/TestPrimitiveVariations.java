package topic_2._7;

import static java.lang.System.out;
import java.time.LocalDateTime;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.DoubleToIntFunction;
import java.util.function.IntConsumer;
import java.util.function.LongPredicate;
import java.util.function.ToIntFunction;

/**
 * @author jjsanche
 */
public class TestPrimitiveVariations {
    public static void main(String[] args) {
        BooleanSupplier isMoorning = () -> LocalDateTime.now().getHour() < 12;
        DoubleSupplier pi3 = () -> Math.PI * 3;
        DoubleToIntFunction round = d -> (int) Math.round(d);
        IntConsumer isPar = number -> System.out.println("par: " + (number % 2 == 0));
        LongPredicate isGTInt = number -> Integer.MAX_VALUE < number;
        ToIntFunction<String> diffVowels = s -> {
            String vowels = "AEIOU";
            StringBuilder remainVowels = new StringBuilder(vowels);
            
            for (int i = 0; i < s.length(); i ++) {
                int index = vowels.indexOf(Character.toUpperCase(s.charAt(i)));
                
                if (index >= 0) {
                    remainVowels.deleteCharAt(index);
                    vowels = remainVowels.toString();
                }
            }
            
            return 5 - vowels.length();
        };
        
        System.out.println("Is moorning: " + isMoorning.getAsBoolean());
        System.out.println("3 PI: " + pi3.getAsDouble());
        System.out.println("PI round: " + round.applyAsInt(Math.PI));
        isPar.accept(30);
        System.out.println(3434343434l + " > ints: " + isGTInt.test(3434343434l));
        String searchString = "murcielago";
        
        System.out.println("The word: " + searchString + " contains " + diffVowels.applyAsInt(searchString) + " vowels");
    }
}
