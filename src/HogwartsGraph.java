public class HogwartsGraph extends Graph {
private Graph hogwartsGraph;
    public HogwartsGraph() { super(true); }

    private void initializeLocations() {
        // Add all vertices (locations)
        hogwartsGraph = new Graph(true);
        hogwartsGraph.addVertex("Gryffindor Tower");
        hogwartsGraph.addVertex("Great Hall");
        hogwartsGraph.addVertex("Astronomy Tower");
        hogwartsGraph.addVertex("Library");
        hogwartsGraph.addVertex("Dungeons");
        hogwartsGraph.addVertex("Hospital Wing");
        hogwartsGraph.addVertex("Transfiguration");
        hogwartsGraph.addVertex("Forbidden Forest");
        hogwartsGraph.addVertex("Hagrid's Hut");
        hogwartsGraph.addVertex("Quidditch Pitch");
        hogwartsGraph.addWeightedEdge("Gryffindor Tower", "Hospital Wing", 5);
        hogwartsGraph.addWeightedEdge("Gryffindor Tower", "Library", 6);
        hogwartsGraph.addWeightedEdge("Astronomy Tower", "Transfiguration", 6);
        hogwartsGraph.addWeightedEdge("Astronomy Tower", "Library", 7);
        hogwartsGraph.addWeightedEdge("Library", "Hospital Wing", 4);
        hogwartsGraph.addWeightedEdge("Hospital Tower", "Transfiguration", 4);
        hogwartsGraph.addWeightedEdge("Transfiguration", "Quidditch Pitch", 0);
        hogwartsGraph.addWeightedEdge("Quidditch Pitch", "Hagrid's Hut", 5);
        hogwartsGraph.addWeightedEdge("Hagrid's Hut", "Forbidden Forest", 3);
        hogwartsGraph.addWeightedEdge("Forbidden Forest", "Dungeons", 12);
        hogwartsGraph.addWeightedEdge("Dungeons", "Great Hall", 4);
        hogwartsGraph.addWeightedEdge("Great Hall", "Hagrid's Hut", 10);
        hogwartsGraph.addWeightedEdge("Great Hall", "Transfiguration", 3);
        hogwartsGraph.addWeightedEdge("Great Hall", "Library", 5);



        // Add edges with distances (in arbitrary units)
        // Main Castle Connections

    }

    public static String getLocationDescription(String location) {
        return null;
    }
}