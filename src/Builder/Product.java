package Builder;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private List<String> parts;
    private String name;

    public Product(String name) {
        this.name = name;
        parts = new ArrayList<>();
    }

    public void add(String part) {
        parts.add(part);
    }

    public void displayProduct() {
        for (String part : parts) {
            System.out.println(part);
        }
    }

    public Product getProduct() {
        return this;
    }

}
