package singleton;
//Initialization Demand Holder(IoDH)
//不通过synchronized等来实现线程安全，通过static的内部类，java中算是目前为止我看到的最好的线程安全的实现
class IoDHSingleton {
    private IoDHSingleton(){};
    private static class HolderClass{
        private final static IoDHSingleton ioDHSingleton=new IoDHSingleton();
    }
    public IoDHSingleton getInstance(){
        return HolderClass.ioDHSingleton;
    }
}
