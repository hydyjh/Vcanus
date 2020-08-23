package bakery;

public class BreadFactory {
	public Bread getBread(String breadType) {
		if(breadType==null) {
			return null;
		}
		if(breadType.equalsIgnoreCase("Cream")) {
			return new Cream();
		}
		else if (breadType.equalsIgnoreCase("Sugar")) {
			return new Sugar();
		}
		else if (breadType.equalsIgnoreCase("Butter")) {
			return new Butter();
		}
		
		return null;
	}
}
