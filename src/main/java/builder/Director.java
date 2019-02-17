package builder;

//用户只需要关心Builder。通过配置文件来改变Builder
//Builder builder=new ConcreteBuilderA();
//Director director=new Director(builder)
//Product product=director.construct();

//director不是必须的，它的行为可以由Builder来完成，但是加重了builder的负担，不符合单一行为原则（我个人的理解就是一个类里面写过多的东西）
class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder=builder;
    }
    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Product construct(){
        builder.buildPartA();
        builder.buildPartB();
        if(builder.useC()){
            builder.buildPartC();
        }
        return builder.getProduct();
    }
}
