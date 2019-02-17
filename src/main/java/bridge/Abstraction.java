package bridge;

//多个正交的实现使用桥接来减少类的个数
abstract class Abstraction {
    Implementor implementor;
    public void setImplementor(Implementor implementor){
        this.implementor=implementor;
    }
    public abstract void operation();
}
