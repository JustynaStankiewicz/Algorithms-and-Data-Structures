public class Edge implements Comparable<Edge> {
    //Skladowe
    private Vertex begin;//wierzcholek poczatkowy
    private Vertex end;//wierzcholek koncowy
    private double weight;//waga krawedzi

    //Konstruktor
    private Edge() {
    }

    public Edge(Vertex begin, Vertex end, double weight) {
        this.begin = begin;
        this.end = end;
        this.weight = weight;
    }

    //Metody
    public Vertex getBegin() {
        return begin;
    }

    public Vertex getEnd() {
        return end;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return Integer.toString(begin.getNumber()) + " ---( "
                + Double.toString(weight) + " )---> "
                + Integer.toString(end.getNumber());
    }

    @Override
    public int compareTo(Edge e) {
        if (getWeight() > e.getWeight()) {
            return 1;
        } else if (getWeight() < e.getWeight()) {
            return -1;
        }
        return 0;
    }
}
