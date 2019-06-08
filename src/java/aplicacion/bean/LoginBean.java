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
    private String usuario;
    private String passwd;
    private UsuarioDAOImp UsuarioDAO;

    public LoginBean(String usuario, String passwd, UsuarioDAOImp UsuarioDAO) {
        this.usuario = usuario;
        this.passwd = passwd;
        this.UsuarioDAO = UsuarioDAO;
    }


    public LoginBean(){
       UsuarioDAO = new UsuarioDAOImp();
    }

    public Usuario validarUsuario(String usuario,String passwd){
        return getUsuarioDAO().validarUsuario(usuario, passwd);
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the passwd
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * @param passwd the passwd to set
     */
    public void setPasswd(String passwd) {
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

   
}