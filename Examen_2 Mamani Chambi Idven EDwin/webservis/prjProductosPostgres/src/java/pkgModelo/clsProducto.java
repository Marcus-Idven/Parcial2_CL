/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgModelo;

/**
 *
 * @author carlos
 */
public class clsProducto {
    private String codigo;
    private String Descripcion;
    

    public clsProducto() {
    }

    public clsProducto(String codigo, String Descripcion, String carrera, String telefono) {
        this.codigo = codigo;
        this.Descripcion = Descripcion;
        
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

   
   
}
