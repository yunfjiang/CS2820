
public class Production
{
    public static void main(String[] args){
        Belt newBelt = new Belt();
        Floor newFloor = new Floor();
        Inventory newInventory = new Inventory();
        Order newOrder = new Order();
        Robot newRobot = new Robot(0,0,1,100);
        Shelf newShelf = new Shelf();
        Visualizer newVisualizer = new Visualizer();
        
        Master myMaster = new Master();
        myMaster.runSimulation();
    }
    
    public void addBelt(Belt newBelt){
	    myBelt = newBelt;
    }

    public void addFloor(Floor newFloor){
	    myFloor = newFloor;
    }
	
    public void addInventory(Inventory newInventory){
	    myInventory = newInventory;
    }

    public void addOrder(Order newOrder){
	    myOrder = newOrder;
    }

    public void addRobot(Robot newRobot){
	    myRobot = newRobot;
    }
	
    public void addShelf(Shelf newShelf){
	    myShelf = newShelf;
    }
	
    public void addVisualizer(Visualizer myVisualizer){
	    myVisualizer = newVisualizer;
    }

}
