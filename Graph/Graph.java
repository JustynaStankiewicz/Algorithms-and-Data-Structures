import java.util.LinkedList;

public class Graph {
    //Skladowe
    private LinkedList<Vertex> vertexList = new LinkedList<Vertex>();    //lista wierzcholkow grafu
    private int vertexCount;//skladowa ktora wskazuje ile wierzcholkow ma graf


    //Konstruktor
    public Graph() {
        vertexCount = 0;
    }

    public Graph(int n) {
        for (int i = 0; i < n; i++)
            vertexList.add(new Vertex(i));

        vertexCount = n;
    }


    //dodaj wierzchołek -metoda zwraca id wierzcholka
    public void addVertex() {
        vertexList.add(new Vertex(vertexCount));
        vertexCount++;
    }

    //usun wierzcholek -metoda usuwa wierzcholek o okreslonym id
    public void removeVertex(int n) {
        if (n < vertexCount) {
            vertexList.set(n, null);
            for (Vertex v : vertexList)
                if (v != null)
                    v.removeEdge(n);
        }
    }

    public void removeVertex(Vertex v) {
        removeVertex(v.getNumber());
    }


    //dodaj krawedz -metoda dodaje krawedz o danej wadze pomiedzy wierzcholkami
    public void addEdge(int b, int e, double w) {
        if (b >= 0 && b <= vertexCount && e >= 0 && e <= vertexCount && vertexList.get(b) != null && vertexList.get(e) != null)
            addEdge(new Edge(vertexList.get(b), vertexList.get(e), w));
    }

    public void addEdge(Edge e) {
        vertexList.get(e.getBegin().getNumber()).addEdge(e);
    }


    //usun krawedz -usuwa krawedz pomiedzy wierzcholkami
    public void removeEdge(int b, int e) {
        if (b >= 0 && b <= vertexCount && vertexList.get(b) != null)
            vertexList.get(b).removeEdge(e);
    }

    public void removeEdge(Edge e) {
        if (e.getBegin() == null) return;

        int b = e.getBegin().getNumber();
        if (b >= 0 && b <= vertexCount && vertexList.get(b) != null)
            vertexList.get(b).removeEdge(e.getEnd().getNumber());
    }


    public Vertex getVertex(int n)//n to liczba porzadkowa szukanego wierzcholka
    {
        return vertexList.get(n);
    }


    //metoda zwraca kopie listy wierzcholkow
    public LinkedList<Vertex> getVertexList() {
        return new LinkedList<Vertex>(vertexList);
    }


    public String toString() {
        String out = new String();
        for (Vertex v : vertexList)
            if (v != null && v.toString() != "")
                out = out + v.toString() + "\n";
        return out;
    }

    public int getVertexCount() {
        return vertexCount;
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);

        graph.addEdge(0, 2, 4);
        graph.addEdge(0, 3, 8);
        graph.addEdge(0, 4, 2);

        graph.addEdge(1, 2, 5);
        graph.addEdge(1, 3, 8);
        graph.addEdge(1, 4, 6);

        graph.addEdge(2, 3, 9);
        graph.addEdge(2, 4, 4);

    }
}
