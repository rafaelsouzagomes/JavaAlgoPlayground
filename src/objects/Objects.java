package objects;

public class Objects {

	public static void main(String[] args) throws CloneNotSupportedException {
		ClassA instance = ClassA.getInstance();
		instance.setAttr(1l);
		
		ClassA clone = (ClassA) instance.clone();
		
	}
}
