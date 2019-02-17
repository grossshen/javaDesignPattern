package composite;

public class Leaf extends Component{
    public void add(Component component) {

    }

    public void remove(Component component) {

    }

    public Component getChild(int i) {
        //handle with the exception
        //leaf has no child
        return null;
    }

    public void operation() {

    }
}
