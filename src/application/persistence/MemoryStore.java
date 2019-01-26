package application.persistence;

import application.Models.Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemoryStore implements Store{
    protected Map<String, HashMap<String, Model>> storage = new HashMap<String, HashMap<String, Model>>();


    @Override
    public void save(String tableName, Model data) {
        ensureTable(tableName).put(data.getId(), data);
    }

    @Override
    public void remove(String id) {

    }

    @Override
    public void removeAll(String keyword) {

    }

    @Override
    public Model find(String id) {
        return null;
    }

    @Override
    public List<Model> findAll(String keyword) {
        return null;
    }

    public Map<String, Model> ensureTable(String tableName){
        if (storage.containsKey(tableName)){
            return storage.get(tableName);
        } else {
            HashMap<String, Model> table = new HashMap<>();
            storage.put(tableName, table);

            return table;
        }
    }
}
