package application.persistence;

import application.Models.Model;

import java.util.List;

public interface Store {
    public void save(String tableName, Model data);

    public void remove(String id);

    public void removeAll(String keyword);

    public Model find(String id);

    public List<Model> findAll(String keyword);
}
