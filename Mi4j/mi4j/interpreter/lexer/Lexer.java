package mi4j.interpreter.lexer;
import java.util.ArrayList;

public class Lexer{
    public static ArrayList<Lexeme> parse(ArrayList<String> tokens)
    {
        ArrayList<Lexeme> lexemes = new ArrayList<>();

        tokens.forEach(token->{
            switch(token)
            {
                case "+", "-", "*", "/":
                    lexemes.add(new Lexeme(Lexeme.Type.MATH_OPERATOR, token));
                    break;
                default:
                    boolean containsOnlyNumbers = true;
                    for(char c : token.toCharArray()){
                        switch (c){
                            case '1', '2', '3', '4', '5', '6', '7', '8', '9', '0':
                                continue;
                            default:
                                containsOnlyNumbers = false;
                        }
                    }

                   if(containsOnlyNumbers) {
                       lexemes.add(new Lexeme(Lexeme.Type.NUMBER, token));
                   }
                    break;
            }
        });
        return lexemes;
    }
}