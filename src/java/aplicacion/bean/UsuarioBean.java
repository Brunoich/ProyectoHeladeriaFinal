/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.bean;

import aplicacion.dao.IUsuarioDAO;
import aplicacion.dao.mysql.UsuarioDAOImp;
import aplicacion.modelo.dominio.Usuario;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@RequestScoped
public class UsuarioBean {
    private Usuario usuario;
    private IUsuarioDAO usuarioDao;
    /**
     * Creates a new instance of UsuarioBean
     */
    public UsuarioBean() {
        usuario = new Usuario();
        usuarioDao = new UsuarioDAOImp();
    }

    public UsuarioBean(Usuario usuario, IUsuarioDAO usuarioDao) {
        this.usuario = usuario;
        this.usuarioDao = usuarioDao;
    }

    public IUsuarioDAO getUsuarioDao() {
        return usuarioDao;
    }

    public void setUsuarioDao(IUsuarioDAO usuarioDao) {
        this.usuarioDao = usuarioDao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
