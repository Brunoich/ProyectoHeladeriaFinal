/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.test;

import aplicacion.dao.IUsuarioDAO;
import aplicacion.dao.mysql.UsuarioDAOImp;
import aplicacion.modelo.dominio.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Malkanchu impaktruen
 */
public class test {
    public static void main(String[] choque){
        Usuario usuario = new Usuario();
        List<Usuario> listado = new ArrayList();
        IUsuarioDAO usuarioDao = new UsuarioDAOImp();
        listado = usuarioDao.obtenerListaUsuariosActivos();
        for(int i=0; i<listado.size();i++){
            if(listado.get(i).getCodigo()==2){
                usuario=listado.get(i);
            }
        }
        System.out.println(usuario.getClientes().getDni());
    }
}
