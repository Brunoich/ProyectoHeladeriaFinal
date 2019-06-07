/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.bean;

import aplicacion.dao.mysql.UsuarioDAOImp;
import aplicacion.hibernate.mapeos.Usuario;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@ViewScoped
public class LoginBean {
    private Usuario usuario;
    private Usuario passwd;
    private UsuarioDAOImp UsuarioDAO;

    public LoginBean(Usuario usuario, Usuario passwd, UsuarioDAOImp UsuarioDAO) {
        this.usuario = usuario;
        this.passwd = passwd;
        this.UsuarioDAO = UsuarioDAO;
    }
    
    
    public LoginBean(String nombreUs, String passwdUs){
       UsuarioDAO = new UsuarioDAOImp();
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the passwd
     */
    public Usuario getPasswd() {
        return passwd;
    }

    /**
     * @param passwd the passwd to set
     */
    public void setPasswd(Usuario passwd) {
        this.passwd = passwd;
    }

    /**
     * @return the UsuarioDAO
     */
    public UsuarioDAOImp getUsuarioDAO() {
        return UsuarioDAO;
    }

    /**
     * @param UsuarioDAO the UsuarioDAO to set
     */
    public void setUsuarioDAO(UsuarioDAOImp UsuarioDAO) {
        this.UsuarioDAO = UsuarioDAO;
    }

    public Usuario validarUsuario(String nombreUs, String passwUs) {
        return UsuarioDAO.validarUsuario(nombreUs, passwUs);
    }
    
}