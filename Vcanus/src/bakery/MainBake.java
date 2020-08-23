package bakery;

public class MainBake {

	public static void main(String[] args) {
		 BreadFactory breadFactory = new BreadFactory();
		 Bread bread = breadFactory.getBread("Cream");
		 bread.bake();
	}

}
