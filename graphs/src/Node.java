package graphs.src;

import java.util.ArrayList;
import java.util.List;

public class Node {

    int val;

    boolean isVisited;

    List<Node> neighbours;

    public Node(int val) {
        this.val = val;
        this.neighbours = new ArrayList<>();
    }

    public void addNeighbours(Node node) {

        this.neighbours.add(node);
    }


    public List<Node> getNeighbours() {

        return this.neighbours;
    }

    public void setNeighbours(List<Node> neighbours) {

        this.neighbours = neighbours;
    }

    @Override
    public String toString() {

        return " " + val;
    }
}
