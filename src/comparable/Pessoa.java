package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pessoa implements Comparable<Pessoa> {
	
	private Long id;
	private String name;
	private int age;
	
	public Pessoa(Long id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Pessoa peopleToCompare) {
		return Integer.compare(id.intValue(), peopleToCompare.getId().intValue());
	}
	
	@Override
	public String toString() {
		return "People: id: " + id + ", Name: " + name + " Age: " + age;
	}
	
	public int getAge() {
		return age;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}	
	
	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa(2l, "Maria", 30));
		pessoas.add(new Pessoa(3l, "Ana", 20));
        pessoas.add(new Pessoa(1l,"João", 25));

        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
        
        Collections.sort(pessoas);
        
        System.out.println("Sorted");
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
	}

}
