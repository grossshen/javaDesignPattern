package prototype;

class ConcretePrototype implements Prototype,Cloneable{
    private String attributes;
    public void setAttributes(String attributes){
        this.attributes=attributes;
    }
    public String getAttributes(){
        return this.attributes;
    }
    public Prototype clone(){
        Prototype prototype;
        try {
            prototype=(Prototype)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
        return prototype;
    }
}
