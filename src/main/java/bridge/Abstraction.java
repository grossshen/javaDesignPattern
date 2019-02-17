package bridge;

abstract class Abstraction {
    Implementor implementor;
    public void setImplementor(Implementor implementor){
        this.implementor=implementor;
    }
    public abstract void operation();
}
