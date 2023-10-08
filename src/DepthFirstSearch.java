
public class DepthFirstSearch {
   
	private int nodeCount = 0;
    private int maxHeight = 0;

    /**
     * Constructor for DepthFirstSearch class.
     */
    public DepthFirstSearch() {
        System.out.println("Call DFS with root node to do a Depth First Search.");
    }

    /**
     * Perform Depth First Search starting from the given node.
     *
     * @param node The starting node for DFS traversal.
     */
    public void DFS(Node node) {
        traverseNode(node, 1);
        System.out.println("Number of nodes traversed: " + nodeCount);
        System.out.println("Height of the tree: " + maxHeight);
    }

    /**
     * Recursive method to traverse the tree in depth-first preorder manner and calculate height.
     *
     * @param node: The current node in the traversal.
     * @param height: The height of the current node in the tree.
     */
    private void traverseNode(Node node, int height) {
        if (node != null) {
            // Print the value of the current node
            System.out.println("Node value: " + node.getData());

            // Count the traversed node
            nodeCount++;

            // Update the maximum height if the current height is greater
            maxHeight = Math.max(maxHeight, height);

            // Recursive method for left and right children with increased height
            traverseNode(node.getlChild(), height + 1);
            traverseNode(node.getrChild(), height + 1);
        }
    }

}
