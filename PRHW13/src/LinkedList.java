import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;

public class LinkedList<T> implements Collection<T>{
	Node<T> first;
	Node<T> end;
	
	public LinkedList(){
		first = null;
		end = null;
	}
	
	public void add(int index, T inf) throws Exception {
		if(size() < index)
			throw new Exception("Out of range");
		Node buff = first;
		int count = 0;
		while(count != index-1)
		{
			buff = buff.getNext();
			count++;
		}
		Node next = buff.getNext();
		buff.setNext(new Node(inf));
		buff.getNext().setNext(next);
	}

	public void clear(){first = null;}
	public int size()
	{
		if(first == null)
			return 0;
		else
		{
			Node buff = first;
			int count = 1;
			while(true)
			{
				if(buff.getNext() == null)
					return count;
				else
				{
					count++;
					buff = buff.getNext();
				}
			}
		}
	}

	@Override
	public boolean isEmpty() {
		return first == null;
	}

	@Override
	public boolean contains(Object o) {
		if(first.getInf().equals(o))
			return true;
		else
		{
			Node buff = first;
			while(buff != null)
			{
				if(buff.getInf().equals(o))
					return true;
				else
					buff = buff.getNext();
			}
		}
		return false;
	}

	@Override
	public Iterator<T> iterator() {
		Iterator<T> i = new Iterator<T>() {
			Node<T> now = new Node<T>(null, first);
			@Override
			public boolean hasNext() {
				if(now.getNext() != null)
					return true;
				return false;
			}

			@Override
			public T next() {
				now = now.getNext();
				return now.getInf();
			}
			
		};
		return i;
	}

	@Override
	public Object[] toArray() {
		Object arr[] = new Object[size()];
		Node buff = first;
		for(int i = 0; buff != null; i++)
		{
			arr[i] = buff.getInf();
			buff = buff.getNext();
		}
		return arr;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		Object arr[] = new Object[size()];
		Node<T> buff = (Node<T>) first;
		for(int i = 0; buff != null; i++)
		{
			arr[i] = buff.getInf();
			buff = buff.getNext();
		}
		return (T[]) arr;
	}

	@Override
	public boolean add(T e) {
		if(first == null)
		{
			first = new Node(e);
			end = first;
			return true;
		}
		else
		{
			end.setNext(new Node(e));
			end = end.getNext();
			return true;
		}
	}

	@Override
	public boolean remove(Object o) {
		if(first.getInf().equals(o))
		{
			first = first.getNext();
			return true;
		}
		else
		{
			Node buff = first;
			while(buff != null)
			{
				if(buff.getNext().getInf().equals(o))
				{
					buff.setNext(buff.getNext().getNext());
					return true;
				}
				else
					buff = buff.getNext();
			}
		}
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		Object arr[] = c.toArray();
		for(int i = 0; i < c.size(); i++)
		{
			Node buff = first;
			boolean find = false;
			for(int j = 0; j < size(); j++)
			{
				if(buff.getInf().equals(arr[i]))
				{
					find = true;
					break;
				}
				else
					buff = buff.getNext();
			}
			if(!find)
				return false;
		}
		return true;
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		for(T o:c)
			add(o);
		return true;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		if(!containsAll(c))
			return false;
		for(Object o:c)
			remove(o);
		return true;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		if(!containsAll(c))
			return false;
		Object arr[] = c.toArray();
		Node<T> buff = first;
		while(buff != null)
		{
			if(!c.contains(buff.getInf()))
			{
				Node<T> del = buff;
				buff = buff.getNext();
				remove(del.getInf());
			}
			else
				buff = buff.getNext();
		}
		return true;
	}
}
