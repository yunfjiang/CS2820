package production;

public interface RobotScheduler {
	void requestShelf(Shelf s, int x);
	
	void returnShelf(Robot r);
}
