import StdClasses.DepthFirstSearch;
import StdClasses.Graph;
import StdClasses.UF;

//4.1.8
public class Search {

    private final UF uf;
    private final int count;
    private final int s;

    public Search(Graph G, int s) {
        this.s = s;
        uf = new UF(G.V()); //uf that will represent this source
        count = 0;

        DepthFirstSearch depthFirstSearch = new DepthFirstSearch(G, s);

        for (int v = 0; v < G.V(); v++)
            if (depthFirstSearch.marked(v))
                uf.union(v, s);

    }

    public boolean marked(int v) {
        return uf.connected(s, v);
    }

    public int count() {
        return count;
    }


}
