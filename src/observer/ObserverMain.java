package observer;

public class ObserverMain {

	public static void main(String[] args) {
		Quantity quantity = new Quantity();
		
		Observer obs1 = new QuantityManager("Sofia logistic center");
		Observer obs2 = new QuantityManager("Plovdiv logistic center");
		Observer obs3 = new QuantityManager("Burgas logistic center");
		
		quantity.subscribe(obs1);
		quantity.subscribe(obs2);
		quantity.subscribe(obs3);
		
		
		quantity.setQuantity("10 boxes of X medicine");
		System.out.println("------------------------");
		quantity.setQuantity("30 boxes of Y medicine");

	}

}
