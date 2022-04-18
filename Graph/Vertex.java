import java.util.LinkedList;

public class Vertex {
    //Skladowe
    private int number;//numer porzadkowy wierzcholka
    private LinkedList<Edge> edgeList = new LinkedList<Edge>();//lista krawedzi
    //wychodzacych z wierzcholka
    private boolean marked;


    //Konstruktor
    private Vertex() {
    }

    public Vertex(int number) {
        this.number = number;
        marked = false;
    }


    //Metody
    public int getNumber() {
        return number;
    }

    //metoda zwraca kopie listy krawedzi
    public LinkedList<Edge> getEdgeList() {
        return new LinkedList<Edge>(edgeList);
    }

    //usun krawedz -metoda usuwa krawedzie biegnace do danego wierzcholka
    //i to numer wierzcholka do ktorego biegnie usuwana krawedz
    public void removeEdge(int i) {
        int e = edgeList.size() - 1;//liczba krawedzi do sprawdzenia
        while (e >= 0) {
            if (edgeList.get(e).getEnd().getNumber() == i)
                edgeList.remove(e);
            e--;
        }
    }

    public void removeEdge(Vertex v)//v to wierzcholek do ktorego biegnie usuwana krawedz
    {
        removeEdge(v.getNumber());
    }


    //dodanie krawedzi e
    public void addEdge(Edge e) {
        edgeList.add(e);
    }

    //n to numer porzadkowey wierzcholka do ktorego biegnie szukana krawedz
    public Edge getEdge(int n) {
        for (Edge e : edgeList)
            if (e.getEnd().getNumber() == n)
                return e;
        return null;
    }


    //metoda zwraca n-ta w kolejnosci krawedz wychodzaca z danego wierzcholka
    public Edge getEdgeAt(int n) {
        if (n >= 0 && n < edgeList.size())
            return edgeList.get(n);
        else
            return null;
    }

    public boolean isMarked() {
        return marked;
    }

    public void setMarked(boolean marked) {
        this.marked = marked;
    }

    public String toString() {
        if (edgeList.size() == 0)
            return "";

        String out = new String();
        for (Edge e : edgeList)
            out = out + e.toString() + "\n";
        return out;
    }

}
