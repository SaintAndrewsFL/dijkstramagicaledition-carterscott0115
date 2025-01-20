public class HogwartsGraph extends Graph {
    public HogwartsGraph() {
        super(true);
        initializeLocations();
    }

    private void initializeLocations() {
        // Add all vertices (locations)
        addVertex("Gryffindor Tower");
        addVertex("Great Hall");
        addVertex("Astronomy Tower");
        addVertex("Library");
        addVertex("Dungeons");
        addVertex("Hospital Wing");
        addVertex("Transfiguration");
        addVertex("Forbidden Forest");
        addVertex("Hagrid's Hut");
        addVertex("Quidditch Pitch");
        addWeightedEdge("Gryffindor Tower", "Hospital Wing", 5);
        addWeightedEdge("Gryffindor Tower", "Library", 6);
        addWeightedEdge("Astronomy Tower", "Transfiguration", 6);
        addWeightedEdge("Astronomy Tower", "Library", 7);
        addWeightedEdge("Library", "Hospital Wing", 4);
        addWeightedEdge("Hospital Tower", "Transfiguration", 4);
        addWeightedEdge("Transfiguration", "Quidditch Pitch", 0);
        addWeightedEdge("Quidditch Pitch", "Hagrid's Hut", 5);
        addWeightedEdge("Hagrid's Hut", "Forbidden Forest", 3);
        addWeightedEdge("Forbidden Forest", "Dungeons", 12);
        addWeightedEdge("Dungeons", "Great Hall", 4);
        addWeightedEdge("Great Hall", "Hagrid's Hut", 10);
        addWeightedEdge("Great Hall", "Transfiguration", 3);
        addWeightedEdge("Great Hall", "Library", 5);



        // Add edges with distances (in arbitrary units)
        // Main Castle Connections

    }

    public static String getLocationDescription(String location) {
        if(location.equals("Gryffindor Tower")) {
            return "The tower of Gryffindor. I did not watch the movies";
        }
        if(location.equals("Great Hall")) {
            return "This hall is very great. I did not watch the movies";
        }
        if(location.equals("Astronomy Tower")) {
            return "The tower of Astronomy. It has Astronomy! I did not watch the movies";
        }
        if(location.equals("Library")) {
            return "The Library is the place to be. Contains Books. I did not watch the movies";
        }
        if(location.equals("Dungeons")) {
            return "The baaad place for bad people. I did not watch the movies";
        }
        if(location.equals("Hospital Wing")) {
            return "The place where you go when you are dying. I did not watch the movies";
        }
        if(location.equals("Transfiguration")) {
            return "I honestly do not have the slightest clue. I did not watch the movies";
        }
        if(location.equals("Forbidden Forest")) {
            return "This Forest is Forbidden! I did not watch the movies";
        }
        if(location.equals("Hagrid's Hut")) {
            return "Where Hagrid lives. I did not watch the movies";
        }
        if(location.equals("Quidditch Pitch")) {
            return "Where Quidditch is played. I did not watch the movies";
        }
        return "not a location";
    }
}