/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.form.bean;

import aplicacion.modelo.dominio.Producto;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@RequestScoped
public class ProductoFormBean {
    Producto producto1;
    
    /**
     * Creates a new instance of ProductoFormBean
     */
    public ProductoFormBean() {
        
    }
    
}
