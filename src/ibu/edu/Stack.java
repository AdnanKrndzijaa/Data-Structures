package ibu.edu;

public class Stack <Item> {
	private Node<Item> top = null;
    private int size = 0;
    
    public void push(Item item) {
    	Node <Item> node = new Node<Item>();
    	node.data = item;
    	node.prev = top;
    	top = node;
    	size++;
    }
    
    public Item pop() {
    	Item retr;
    	
    	if(top == null) {
    		throw new IndexOutOfBoundsException("The Stack is empty.");
    	} else if (size == 1) {
    		retr = top.data;
    		top = null;
    	} else {
    		retr = top.data;
    		top = top.prev;
    	}
    	size--;
    	return retr;
    }
}