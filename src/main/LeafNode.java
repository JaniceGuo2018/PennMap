package main;

import java.util.List;
import java.util.Spliterator;

import org.junit.validator.PublicClassValidator;

/**
 * LeafNode of our QuadTree, which stores the location info
 * @author calchen
 *
 */
public class LeafNode extends BaseNode {

	/**
	 * name of the location
	 */
	private String name;
	
	/**
	 * type of location
	 */
	private String type;
	
	/**
	 * Coordinate of the location
	 */
	private Coordinate coord;
	
	/**
	 * @return name of the location
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name new name of the location
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return type of location
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type new type of the location
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return Coordinate of the location
	 */
	public Coordinate getCoord() {
		return coord;
	}

	/**
	 * @param coord new Coordinate of the location
	 */
	public void setCoord(Coordinate coord) {
		this.coord = coord;
	}

//	/**
//	 * other locations this connects to via road(s)
//	 */
//	private List<LeafNode> roadTo;
	
	/**
	 * copy constructor of this class, which initializes name, type and coord with given values
	 * @param name name of the location
	 * @param type type of location
	 * @param coord coordinate of the location
	 * @param roadTo other locations this connects to via road(s)
	 */
	public LeafNode(String name, String type, Coordinate coord) {
		this.name = name;
		this.type = type;
		this.coord = coord;
//		this.roadTo = roadTo;
	}

	/**
	 * 
	 */
	@Override
	public void search(String type, Range range, List<Location> locs) {
		
	}
	
	/**
	 * split() splits a LeafNode into 4 and returns the InternalNode that is the root of these 4 LeafNodes
	 * @return the InternalNode that is the root of the 4 LeafNodes after splitting
	 */
	public InternalNode split() {
		if (range.contains(coord) && this.type.equals(type)) {
			Location cur = new Location(this.getName(), this.getType(), this.getCoord());
			locs.add(cur);
		}
		return null;
	}
}