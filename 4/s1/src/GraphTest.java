import StdClasses.Graph;
import StdClasses.In;

//4.1.7
public class GraphTest {
    public static void main(String[] args) {
        In in = new In(args[0]);
        Graph g = new Graph(in);

        System.out.println(g);
    }
}
