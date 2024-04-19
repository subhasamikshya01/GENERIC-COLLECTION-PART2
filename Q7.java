import java.util.Iterator;
import java.util.TreeMap;

class Address {
    private String plotNo;
    private String at;
    private String post;

    public Address(String plotNo, String at, String post) {
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }

    // Getter and setter methods
    public String getPlotNo() {
        return plotNo;
    }

    public void setPlotNo(String plotNo) {
        this.plotNo = plotNo;
    }

    public String getAt() {
        return at;
    }

    public void setAt(String at) {
        this.at = at;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a TreeMap to store names of people and their addresses
        TreeMap<String, Address> addressMap = new TreeMap<>();

        // Insert some key-value pairs into the TreeMap
        addressMap.put("John", new Address("123", "Main Street", "CityA"));
        addressMap.put("Alice", new Address("456", "Park Avenue", "CityB"));
        addressMap.put("Bob", new Address("789", "Broadway", "CityC"));

        // Use an iterator to display the TreeMap
        System.out.println("TreeMap Contents:");
        Iterator<String> iterator = addressMap.keySet().iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            Address address = addressMap.get(name);
            System.out.println("Name: " + name + ", Address: " + address.getPlotNo() + ", " + address.getAt() + ", " + address.getPost());
        }
    }
}
