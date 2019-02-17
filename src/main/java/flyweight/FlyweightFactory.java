package flyweight;

import java.util.HashMap;
import java.util.Hashtable;

class FlyweightFactory {
    private static FlyweightFactory instance=new FlyweightFactory();
    private Hashtable flyweights;
    private FlyweightFactory(){
        flyweights=new Hashtable();
        Flyweight a=new ConcreteFlyweightA("");
        flyweights.put("a",a);
        Flyweight b = new ConcreteFlyweightB("");
        flyweights.put("b",b);
    }
    public static FlyweightFactory getInstance(){
        return instance;
    }
    public Flyweight getFlyweight(String key){
        if(flyweights.containsKey(key)){
            return (Flyweight) flyweights.get(key);
        }else {
            Flyweight flyweight=new ConcreteFlyweightA("");
            flyweights.put(key,flyweight);
            return flyweight;
        }
    }
}
