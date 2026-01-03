package mi4j;
import mi4j.interpreter.Parser;
import mi4j.interpreter.Tokenizer;
import mi4j.interpreter.ast.AST;
import mi4j.interpreter.lexer.*;
import java.io.File;
import java.util.ArrayList;

/**
 * A utility class with methods for interpreting basic arithmetic. Only integers are supported, and decimals
 * will be ignored.
 * @author <a href="https://github.com/carlosreyna0">Carlos Reyna</a>
 */
public class MathInterpreter{
    /**
     * @param source The math you want to interpret as a String. For example "5 + 9 / 6 * 2".
     * @return An integer, which is the result of your math.
     */
    public static int interpret(String source){
        ArrayList<String> tokens = Tokenizer.tokenize(source);
        ArrayList<Lexeme> lexemes = Lexer.parse(tokens);
        AST ast = new AST(lexemes);

        return ast.compute();
    }

    /**
     * @param f The File containing the math you want to interpret.
     * @return An integer, which is the result of your math.
     */
    public static int interpret(File f){
        return MathInterpreter.interpret(Parser.parse(f));
    }

}