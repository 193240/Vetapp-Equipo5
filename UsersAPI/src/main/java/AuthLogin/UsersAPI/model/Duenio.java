package AuthLogin.UsersAPI.model;

import javax.persistence.*;

@Entity
@Table(name="duenio")
public class Duenio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDuenio;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "telefono")
    private String  telefono;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "idUsuario")
    private int idUsuario;

    public Duenio(){}

    public Duenio(int idDuenio, String nombre, String telefono, String direccion, int idUsuario) {
        this.idDuenio = idDuenio;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.idUsuario = idUsuario;
    }

    public int getIdDuenio() {
        return idDuenio;
    }

    public void setIdDuenio(int idDuenio) {
        this.idDuenio = idDuenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}