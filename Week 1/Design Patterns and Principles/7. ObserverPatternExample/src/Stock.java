// Step 1
// Already created a new Java project named ObserverPatternExample

// Step 2

public interface Stock
{
	void register(Observer observer);
    void deregister(Observer observer);
    void notifyO();
}
