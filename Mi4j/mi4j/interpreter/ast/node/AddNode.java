package mi4j.interpreter.ast.node;

public class AddNode extends MathNode{
    private int x, y;

    public AddNode(int x, int y){
        this.setX(x);
        this.setY(y);
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void setX(MathNode node) {
        this.x = node.compute();
    }

    @Override
    public void setY(MathNode node) {
        this.y = node.compute();
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }
    @Override
    public String type(){
        return "+";
    }
    @Override
    public int compute() {
        return this.x + this.y;
    }
}