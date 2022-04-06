package AuthLogin.UsersAPI.user;

public class UserDTO {

    private String user;
    private String pwd;
    private String token;
    private String tipo;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "user='" + user + '\'' +
                ", pwd='" + pwd + '\'' +
                ", token='" + token + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
