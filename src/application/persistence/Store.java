package application.persistence;

import application.Models.Model;

import java.util.List;

public interface Store {
    public void save(String tableName, Model data);

    public void remove(String tableName, String id);

    public void removeAll(String tableName, String keyword);

    public Model findOne(String tableName, String id);

    public List<Model> findAll(String tableName, String keyword);
}
