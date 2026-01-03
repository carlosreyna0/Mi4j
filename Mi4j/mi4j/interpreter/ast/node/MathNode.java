package mi4j.interpreter.ast.node;

public abstract class MathNode{
    public abstract void setX(int x);
    public abstract void setY(int y);
    public abstract void setX(MathNode node);
    public abstract void setY(MathNode node);
    public abstract int getX();
    public abstract int getY();
    public abstract String type();
    public abstract int compute();
}
