package application.persistence;

import application.Models.Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MemoryStore implements Store {
    protected Map<String, HashMap<String, Model>> storage = new HashMap<String, HashMap<String, Model>>();


    @Override
    public void save(String tableName, Model data) {
        ensureTable(tableName).put(data.getId(), data);
    }

    @Override
    public void remove(String tableName, String id) {
        ensureTable(tableName).remove(id);
    }

    @Override
    public void removeAll(String tableName, String keyword) {
        Map<String, Model> table = ensureTable(tableName);

        table.entrySet().stream()
                .filter(entry -> entry.getValue().equals(keyword))
                .forEach(entry -> table.remove(entry.getKey()));
    }

    @Override
    public Model findOne(String tableName, String id) {
        return ensureTable(tableName).get(id);
    }

    @Override
    public List<Model> findAll(String tableName, String keyword) {
        Map<String, Model> table = ensureTable(tableName);

        return table.entrySet().stream()
                .filter(entry -> entry.getValue().equals(keyword))
                .map(entry -> entry.getValue())
                .collect(Collectors.toList());
    }

    public Map<String, Model> ensureTable(String tableName) {
        if (storage.containsKey(tableName)) {
            return storage.get(tableName);
        } else {
            HashMap<String, Model> table = new HashMap<>();
            storage.put(tableName, table);

            return table;
        }
    }
}
