package mi4j.interpreter.ast;
import mi4j.interpreter.ast.node.*;
import mi4j.interpreter.lexer.Lexeme;
import java.util.ArrayList;

public class AST{
    private MathNode root;

    public AST(ArrayList<Lexeme> lexemes){
        ArrayList<MathNode> mathNodes = new ArrayList<>();
        for(int i = 0; i < lexemes.toArray().length; i++){
            Lexeme lexeme = lexemes.get(i);

            switch(lexeme.getType()){
                case MATH_OPERATOR:
                    Lexeme prev = lexemes.get(i - 1);
                    Lexeme next = lexemes.get(i + 1);
                    int prevInt = Integer.parseInt(prev.getToken());
                    int nextInt = Integer.parseInt(next.getToken());

                    switch(lexeme.getToken()){
                        case "+":
                            mathNodes.add(new AddNode(prevInt, nextInt));
                            break;
                        case "-":
                            mathNodes.add(new SubNode(prevInt, nextInt));
                            break;
                        case "*":
                            mathNodes.add(new MulNode(prevInt, nextInt));
                            break;
                        case "/":
                            mathNodes.add(new DivNode(prevInt, nextInt));
                            break;
                    }
                    break;
            }
        }
        for(int i = 0; i < mathNodes.toArray().length; i++){
            int current = mathNodes.toArray().length - i - 1;
            int prev = current - 1;

            if(prev >= 0){
                MathNode currentNode = mathNodes.get(current);
                MathNode prevNode = mathNodes.get(prev);

                if(currentNode.getX() == prevNode.getY()){
                    prevNode.setY(currentNode);
                }
            }
            else{
                break;
            }
        }

        this.root = mathNodes.getFirst();
    }
    public int compute(){
        return this.root.compute();
    }
}