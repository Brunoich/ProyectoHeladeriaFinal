/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.form.bean;

import aplicacion.bean.UsuarioBean;
import aplicacion.modelo.dominio.Usuario;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@RequestScoped
public class UsuarioFormBean implements Serializable{
    @ManagedProperty(value = "#{UsuarioBean}")
    private UsuarioBean usuarioBean;
    private Usuario usuario;
    
    /**
     * Creates a new instance of UsuarioFormBean
     */
    public UsuarioFormBean() {
        usuario = new Usuario();
    }

    public UsuarioFormBean(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public void agregarUsuario(){
        getUsuarioBean().getUsuarioDao().agregarUsuario(usuario);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the usuarioBean
     */
    public UsuarioBean getUsuarioBean() {
        return usuarioBean;
    }

    /**
     * @param usuarioBean the usuarioBean to set
     */
    public void setUsuarioBean(UsuarioBean usuarioBean) {
        this.usuarioBean = usuarioBean;
    }
    
}
