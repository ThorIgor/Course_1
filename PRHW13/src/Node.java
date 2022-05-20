
public class Node<T> {
	private Node<T> next;
	private T inf;
	
	public Node(T i) {
		inf = i;
		next = null;
	}
	public Node(T i, Node n)
	{
		inf = i;
		next = n;
	}
	
	public void setNext(Node<T> n) {next = n;}
	public void setInf(T i) {inf = i;}
	
	public <T> Node<T> getNext() {return (Node<T>) next;}
	public <T> T getInf() {return (T) inf;}
}
