package application.Models;

public class AdminUserModel extends UserModel {
    protected String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
