package data_structures_in_Java.PriorityQueue;

public class Element<T> {
	T value;
	int priority;
	public Element(T value,int priority) {
		this.value=value;
		this.priority=priority;
	}

}
