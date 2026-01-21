package SE411.edu;

	public class NumberBox<T extends Number> {

	    private T item;

	    public void setItem(T item) {
	        this.item = item;
	    }

	    public T getItem() {
	        return item;
	    }

	    // Method to add numbers and calculate the sum
	    public double add(Number other) {
	        return item.doubleValue() + other.doubleValue();
	    }
	}


