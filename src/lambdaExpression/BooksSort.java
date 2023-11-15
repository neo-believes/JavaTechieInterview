package lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BooksSort {

	public static void main(String[] args) {

		List<Books> books = new ArrayList<Books>();
		books.add(new Books(101, "Adam"));
		books.add(new Books(102, "Cole"));
		books.add(new Books(103, "Mordor"));
		books.add(new Books(104, "Zoe"));

		Collections.sort(books, (b1, b2) -> b2.getName().compareTo(b1.getName()));

		System.out.println(books);
	}

}

class Books {
	int id;
	String name;

	public Books(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Books [id=" + id + ", name=" + name + "]";
	}

}