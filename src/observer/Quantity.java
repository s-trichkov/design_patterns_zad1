package observer;

import java.util.ArrayList;
import java.util.List;

public class Quantity implements Observable {

	private List<Observer> observers;
	private String quantity;
	
	public Quantity() {
		this.observers = new ArrayList<>();
	}
	
	@Override
	public void subscribe(Observer observer) {
		this.observers.add(observer);
		observer.setQuantity(this);
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}
	}
	
	public void setQuantity(String quantity) {
		this.quantity = quantity;
		this.notifyObservers();
	}

	@Override
	public String getUpdate() {
		return this.quantity;
	}

}
