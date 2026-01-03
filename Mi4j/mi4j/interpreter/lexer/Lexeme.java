package mi4j.interpreter.lexer;

public class Lexeme{
    private final Type type;
    private final String token;

    public Lexeme(Type type, String token){
        this.type = type;
        this.token = token;
    }

    public enum Type{
        MATH_OPERATOR,
        NUMBER
    }

    public Type getType() {
        return this.type;
    }

    public String getToken(){
        return this.token;
    }


}