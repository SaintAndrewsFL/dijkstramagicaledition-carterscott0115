public class Main {

    public static void main(String[] args) {
        HogwartsGraph hogwarts = new HogwartsGraph();
        Dijkstra baa_baa = new Dijkstra(hogwarts);
        System.out.println(hogwarts.giveVertices());
        System.out.println(baa_baa.findShortestPath("Dungeons", "Great Hall"));
    }
}
