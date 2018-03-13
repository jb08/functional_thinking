package wordfreq;

import java.util.Map;
import com.nealford.functionalthinking.wordfreq.Words;
import com.nealford.functionalthinking.wordfreq.Words8;

public class Runner {

    public static void main(String[] args) {
        System.out.println("main()");
        String input = "The black cat jumped over the other black cat.";

        //Imperative
        Map<String,Integer> output = new Words().wordFreq(input);
        System.out.println(output.toString());

        //Functional
        Map<String,Integer> output2 = new Words8().wordFreq(input);
        System.out.println(output2.toString());

    }
}
