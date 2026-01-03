package mi4j.interpreter;
import java.util.ArrayList;

public class Tokenizer{
    public static ArrayList<String> tokenize(String sourceCode)
    {
        char[] source = sourceCode.toCharArray();
        ArrayList<String> tokens = new ArrayList<>();
        String currentWord = "";

        for(char c : source)
        {
           switch (c)
           {
               case '+', '-', '*', '/':
                   tokens.add(currentWord);
                   tokens.add(String.valueOf(c));
                   currentWord = "";

                   continue;
               case ' ', '(', ')':
                   continue;
               case '1', '2', '3', '4', '5', '6', '7', '8','9', '0':
                   currentWord += c;
           }
        }

        tokens.add(currentWord);

        return tokens;
    }
}