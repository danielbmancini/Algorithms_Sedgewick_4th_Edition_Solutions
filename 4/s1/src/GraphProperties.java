//4.1.16
import StdClasses.*;
public class GraphProperties {
    public GraphProperties(Graph G) throws IllegalArgumentException{
        Search search = new Search(G,0);
        if (search.count() != G.V()) throw new IllegalArgumentException();


    }
}
