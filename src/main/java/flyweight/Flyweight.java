package flyweight;

abstract class Flyweight {
    private String intrinsicState;
    public Flyweight(String intrinsicState){
        this.intrinsicState=intrinsicState;
    }
    public void operation(String extrinsicState){
        System.out.println(extrinsicState);
        System.out.println(intrinsicState);
    }
}
