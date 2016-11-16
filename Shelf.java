package production;

/**
 * 
 * @author Xinyu Qian
 */
import java.util.ArrayList;
class Shelf{
	int items = 0;
	ArrayList<item> Item = new ArrayList()<>;
	int x, y;
	public Shelf(Point P){
		this.x = P.x;
		this.y = P.y;
		P.shelf = true;
	}
	
	public String addItems(item I){
		Item.add(I);
		items++;
		if(items == 20) return "This shelf is full.";
		if(items > 20){
			items--;
			return "Load fails, shelf is full.";
		}
		return String.format("Add item %1$d %s to shelf", I.itemID, I.type);
	}
	
	public String removeItems(item I){
		Item.remove(Item.indexOf(I));
		items--;
		return String.format("Removed item %1$d %s from shelf", I.itemID, I.type);;
	}
	
	// floor will memorize the new location where robot
	// put the shelf at
	/**
     * 
     * @param P the location where robot drop the shelf
     */
	public Point reSetLocation(Point P){
		this.x = P.x;
		this.y = P.y;
		P.shelf = true;
	}
	
}
