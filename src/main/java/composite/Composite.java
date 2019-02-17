package composite;

import java.util.ArrayList;

//用于对树形结构的各个组件提供一种统一处理的方式的设计模式
public class Composite extends Component{
    private ArrayList<Component> list = new ArrayList<Component>();
    public void add(Component component) {
        list.add(component);
    }

    public void remove(Component component) {
        list.remove(component);
    }

    public Component getChild(int i) {
        return null;
    }

    public void operation() {
        //.....
        for(Object object:list){
            ((Component)object).operation();
        }
    }
}
