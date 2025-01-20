import java.util.*;

public class Graph  {
    private Map<String, List<Edge>> adjacencyList;  // Vertex -> List of Edges
    private boolean isDirected;

    public Graph(boolean isDirected) {
        this.isDirected = isDirected;
        adjacencyList = new HashMap<String, List<Edge>>();
        // TODO: Initialize the graph with proper data structures
    }
    public ArrayList<String> giveVertices() {
        return new ArrayList<>(adjacencyList.keySet());
        }

    public void addVertex(String vertex) {
        if(vertex == null) {
            return;
        }
        adjacencyList.put(vertex, new ArrayList());
        // TODO: Add vertex to the graph
    }

    public void addWeightedEdge(String source, String destination, int weight) {
        if(source == null || destination == null) {
            return;
        }
        if(adjacencyList.get(source) == null || adjacencyList.get(destination) == null) {
            return;
        }
        List<Edge> edgeList = adjacencyList.get(source);
        edgeList.add(new Edge(destination, weight));

        if(!isDirected) {
            List<Edge> edgeList2 = adjacencyList.get(destination);
            edgeList2.add(new Edge(source, weight));
            adjacencyList.put(destination, edgeList2);
        }
    }

    public int getWeight(String source, String destination) {
        List<Edge> edgeList = adjacencyList.get(source);
        if(edgeList == null) return 0;

        for(Edge edge : edgeList) {
            if(edge.getDestination().equals(destination)) {
                return edge.getWeight();
            }
        }
        return 0;
    }

    public boolean hasEdge(String source, String destination) {
        List<Edge> edgeList = adjacencyList.get(source);
        if(edgeList == null) return false;

        for(Edge edge : edgeList) {
            if(edge.getDestination().equals(destination)) {
                return true;
            }
        }
        return false;
    }


    public List<String> getNeighbors(String vertex) {
        if(vertex == null || adjacencyList.get(vertex) == null) {
            return null;
        }

        List<Edge> edgeList = adjacencyList.get(vertex);
        List<String> neighbors = new ArrayList<>();
        for(Edge edge : edgeList) {
            neighbors.add(edge.getDestination());
        }
        return neighbors;
    }

    public int getVertexCount() {
        // TODO: Return number of vertices in graph
        return adjacencyList.size();
    }

    public boolean isDirected() {
        // TODO: Return whether graph is directed
        return isDirected;
    }
}