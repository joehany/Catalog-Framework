package application.Models;

public abstract class Model {
    protected String id;
    protected String createdAt;

    public String getId(){
        return id;
    };

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
