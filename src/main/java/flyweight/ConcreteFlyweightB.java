package flyweight;

class ConcreteFlyweightB extends Flyweight{
    public ConcreteFlyweightB(String intrinsicState) {
        super(intrinsicState);
    }
    void operation(){
        System.out.println("b");
    }
}
