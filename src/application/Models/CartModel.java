package application.Models;

import java.util.HashMap;
import java.util.Map;

public class CartModel extends Model {
    protected Map<String, Model> items = new HashMap<>();

    public Map<String, Model> getItems() {
        return items;
    }

    public void setItems(Map<String, Model> items) {
        this.items = items;
    }
}
