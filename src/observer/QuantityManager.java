package observer;

public class QuantityManager implements Observer {

	private String name;
	private Observable quantity;
	
	public QuantityManager(String name) {
		this.name = name;
	}
	
	@Override
	public void update() {
		if(this.quantity == null) {
			System.out.println(this.getName() + " is not available at the moment.");
			return;
		}
		String latestBatch = this.quantity.getUpdate();
		System.out.println(this.getName() + " just recieved: " + latestBatch);
	}

	@Override
	public void setQuantity(Observable quantity) {
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}

}
