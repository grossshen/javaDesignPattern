package facade;

class Facede {
    SubSystemA subSystemA=new SubSystemA();
    SubSystemB subSystemB=new SubSystemB();
    SubSystemC subSystemC=new SubSystemC();
    void method(){
        subSystemA.hi();
        subSystemB.hi();
        subSystemC.hi();
    }
}
