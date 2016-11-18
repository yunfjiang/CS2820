
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
}
