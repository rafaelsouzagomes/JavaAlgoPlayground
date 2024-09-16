package comparable;

import java.util.TreeSet;

public class Student implements Comparable<Student> {

	private Long id;

	private String name;

	public Student(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Student studentToCompare) {
		//Ordem Crescente
//		return Long.compare(id, studentToCompare.getId());
		
		//Ordem decrescente
		return Long.compare(studentToCompare.getId(), id);
	}

	@Override
	public String toString() {
		return "Student - id: " + id + ", Name: " + name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		TreeSet<Student> tree = new TreeSet<>();
		tree.add(new Student(3L, "Joe"));
		tree.add(new Student(1L, "Rafa"));
		tree.add(new Student(2L, "Marc"));

		for (Student student : tree) {
			System.out.println(student);
		}
		System.out.println(" - - ");
		tree.forEach(curr -> {
			System.out.println(curr);
		});

	}

}
