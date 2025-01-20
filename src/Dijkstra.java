import java.util.*;

public class Dijkstra {
    private final Graph graph;

    public Dijkstra(Graph graph) {
        this.graph = graph;
    }

    /**
     * Implements Dijkstra's algorithm to find the shortest path between two vertices.
     *
     * @param start  The starting vertex
     * @param target The destination vertex
     * @return A string in the format "Path (distance): vertex1 -> vertex2 -> ... -> vertexN"
     * Returns "No path exists between start and target" if no path is found
     * Returns "Invalid vertex" if either vertex is not in the graph
     */
    public String findShortestPath(String start, String target) {
        ArrayList<String> vertices = graph.giveVertices();
        HashMap<String, Integer> weights = new HashMap<>();
        HashMap<String, String> done = new HashMap<>();
        PriorityQueue<Edge> queue = new PriorityQueue<>(new Compare());
        if (!graph.giveVertices().contains(start) || !graph.giveVertices().contains(target)) {
            return "";
        }

        for (int i = 0; i < vertices.size(); i++) {
            String vertex = vertices.get(i);
            weights.put(vertex, 999999999);
            done.put(vertex, null);
        }
        weights.put(start, 0);
        queue.add(new Edge(start, 0));
        while (!queue.isEmpty()) {
            Edge current = queue.poll();
            String currentVertex = current.getDestination();
            List<String> neighbors = graph.getNeighbors(currentVertex);
            if (currentVertex.equals(target)) {
                return constructPath(done, weights, start, target);
            }
            for (int i = 0; i < neighbors.size(); i++) {
                String neighbor = neighbors.get(i);
                int newDistance = weights.get(currentVertex) + graph.getWeight(currentVertex, neighbor);
                if (newDistance < weights.get(neighbor)) {
                    weights.put(neighbor, newDistance);
                    done.put(neighbor, currentVertex);
                    queue.add(new Edge(neighbor, newDistance));
                }
            }
            // TODO: Implement Dijkstra's algorithm here
            // The graph provides the following methods you can use:
            // graph.getVertices() - returns Set<String> of all vertices
            // graph.getNeighbors(vertex) - returns Map<String, Integer> of neighbor vertices and their weights
            // graph.hasVertex(vertex) - returns boolean indicating if vertex exists

        }
        return "";
    }
        private String constructPath(HashMap<String, String> done, HashMap<String, Integer> weights, String start, String target) {
            ArrayList<String> path = new ArrayList<>();
            String current = target;
            while (current != null) {
                path.add(current);
                current = done.get(current);
            }
            Collections.reverse(path);
            StringBuilder result = new StringBuilder();
            result.append("Path (").append(weights.get(target)).append("): ");
            result.append(String.join(" -> ", path));

            return result.toString();
        }
    }

