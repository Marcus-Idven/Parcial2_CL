/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgControlador;

import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author carlos
 */
public class clsConecta {
     java.sql.Connection con; //carga el driver
     java.sql.Statement st; //Conecta al motor de base de datos
     java.sql.ResultSet rs; //procesar la consulta SQl

    public clsConecta() {
        try {
            Class.forName("org.postgresql.Driver");//se cargo el driver
            System.out.println("se cargo el driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("problemas con el driver");
        }
         try {
             con=DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/db", "postgres","123456");
         System.out.println("se conecto");
         } catch (SQLException ex) {
             System.out.println("Problemas para conectarse");
         }
    }
    public boolean insertar(String sql) throws SQLException{
    st=con.createStatement(); //se conecta con la base de datos
    return st.execute(sql);
    }
    
}
