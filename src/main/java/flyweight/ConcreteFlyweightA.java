package flyweight;

class ConcreteFlyweightA extends Flyweight {
    public ConcreteFlyweightA(String intrinsicState) {
        super(intrinsicState);
    }
    void operation(){
        System.out.println("a");
    }
}
