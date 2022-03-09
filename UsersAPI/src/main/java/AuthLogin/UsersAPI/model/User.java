package AuthLogin.UsersAPI.model;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotEmpty;

@MappedSuperclass
public class User extends BaseEntity {
    @Column(name = "user")
    @NotEmpty
    private String user;

    @Column(name = "password")
    @NotEmpty
    private String password;

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}