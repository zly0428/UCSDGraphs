package roadgraph;


public class NodeDist {
	
	private MapNode node;
	private double currentDist;
	
	public NodeDist( MapNode mapnode, double dist) {
		this.node = mapnode;
		this.currentDist = dist;
	}
	
	public MapNode getNode() {
		return node;
	}
	
	public double getDist() {
		return currentDist;
	}
	
	public double setDist(double d) {
		return currentDist = d;
	}
}
