package aplicacion.modelo.dominio;
// Generated 13/06/2019 15:25:39 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private int codigo;
     private Cliente clientes;
     private String nombreUsuario;
     private String password;
     private String tipoUsuario;
     private String apellidos;
     private String nombres;
     private Boolean estado;
     private Set facturas = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(int codigo, Cliente clientes) {
        this.codigo = codigo;
        this.clientes = clientes;
    }
    public Usuario(int codigo, Cliente clientes, String nombreUsuario, String password, String tipoUsuario, String apellidos, String nombres, Boolean estado, Set facturas) {
       this.codigo = codigo;
       this.clientes = clientes;
       this.nombreUsuario = nombreUsuario;
       this.password = password;
       this.tipoUsuario = tipoUsuario;
       this.apellidos = apellidos;
       this.nombres = nombres;
       this.estado = estado;
       this.facturas = facturas;
    }
   
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public Cliente getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }
    public String getNombreUsuario() {
        return this.nombreUsuario;
    }
    
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getTipoUsuario() {
        return this.tipoUsuario;
    }
    
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getNombres() {
        return this.nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public Boolean getEstado() {
        return this.estado;
    }
    
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    public Set getFacturas() {
        return this.facturas;
    }
    
    public void setFacturas(Set facturas) {
        this.facturas = facturas;
    }




}


