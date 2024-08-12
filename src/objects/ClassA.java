package objects;

public class ClassA  implements Cloneable {
	
	private static ClassA instance = null;
	
	public static ClassA getInstance() {
		if(instance!=null) 
			return instance;
		
		instance = new ClassA();
		return instance;
	}

	private Long attr;
	
	public void setAttr(Long attr) {
		this.attr = attr;
	}
	
	public Long getAttr() {
		return attr;
	}
	
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
