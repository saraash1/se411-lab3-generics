package SE411.edu;
import java.util.Arrays;
import java.util.List;

public class PrintableList<T> {

	 private List<T> list;

	    public PrintableList(T[] itemsArray) {
	        this.list = Arrays.asList(itemsArray);
	    }

	    public List<T> getList() {
	        return list;
	    }

	    public void printItems() {
	        for (T item : list) {
	            System.out.println(item);
	        }
	    }
}
