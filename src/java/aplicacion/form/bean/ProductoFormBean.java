/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.form.bean;

import aplicacion.bean.CategoriaBean;
import aplicacion.bean.ProductoBean;
import aplicacion.modelo.dominio.Categoria;
import aplicacion.modelo.dominio.Producto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author Alumno
 */
@ManagedBean
@SessionScoped
public class ProductoFormBean implements Serializable {
    @ManagedProperty(value = "#{productoBean}")
    private ProductoBean productoBean;
    @ManagedProperty(value = "#{categoriaBean}")
    private CategoriaBean categoriaBean;
    private Producto producto;
    private Producto unProducto;
    private Integer cod = 1;
    private List<Producto> listadoProducto;
    private transient UploadedFile archivo = null;
    
    /**
     * Creates a new instance of ProductoFormBean
     */
    public ProductoFormBean() {
        producto = new Producto();
        listadoProducto =  new ArrayList();
    }

    public ProductoFormBean(ProductoBean productoBean, CategoriaBean categoriaBean, Producto producto, Producto unProducto, List<Producto> listadoProducto) {
        this.productoBean = productoBean;
        this.categoriaBean = categoriaBean;
        this.producto = producto;
        this.unProducto = unProducto;
        this.listadoProducto = listadoProducto;
    }
    
    public List<Producto> obtenerListadoProducto(){
       return productoBean.obtenerListaProducto();
    }
    
    public List<Categoria> obtenerListaCategoria(){
        return categoriaBean.obtenerListaCategoria();
    }
    
    public void agregarProducto(){
        producto.setEstado(Boolean.TRUE);
        producto.setCodProducto(cod);
        setCod(cod + 1);
        if(getArchivo() != null){
            byte[] contents = getArchivo().getContents();
            getUnProducto().setFoto(contents);
        } else {
            getUnProducto().setFoto(null);
        }
        try{
            productoBean.agregarProducto(producto);
            FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "Producto agregado correctamente", "Producto" + getUnProducto().getDescripcion());
        } catch (Exception e) {
            FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_WARN, "Error Grave", "No se pudo agregar producto");
            FacesContext.getCurrentInstance().addMessage(null, facesMessage);
        }
        setUnProducto(new Producto());
    }
    
    public void establecerProducto(Producto otroProducto){
        unProducto = otroProducto;
    }
    
    public void eliminarProducto(){
        productoBean.eliminarProducto(unProducto);
        FacesMessage msg = new FacesMessage("Producto Eliminado");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        unProducto = new Producto();
    }
    
    public void modificarProducto(){
        productoBean.modificarProducto(unProducto);
        FacesMessage msg = new FacesMessage("Producto Modificado");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        unProducto = new Producto();
    }
    
    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Producto getUnProducto() {
        return unProducto;
    }

    public void setUnProducto(Producto unProducto) {
        this.unProducto = unProducto;
    }

    public UploadedFile getArchivo() {
        return archivo;
    }

    public void setArchivo(UploadedFile archivo) {
        this.archivo = archivo;
    }

    public ProductoBean getProductoBean() {
        return productoBean;
    }

    public void setProductoBean(ProductoBean productoBean) {
        this.productoBean = productoBean;
    }

    public CategoriaBean getCategoriaBean() {
        return categoriaBean;
    }

    public void setCategoriaBean(CategoriaBean categoriaBean) {
        this.categoriaBean = categoriaBean;
    }

    public List<Producto> getListadoProducto() {
        return listadoProducto;
    }

    public void setListadoProducto(List<Producto> listadoProducto) {
        this.listadoProducto = listadoProducto;
    }
    
}
