
package accesoDatos;

import modelo.ModeloUsuario;
import java.sql.*;
/**
 *
 * @author Franklin Aguirre
 */
public class Usuario_DAO {
    FachadaBD fachada;
    Connection conn;
    public Usuario_DAO(){
        fachada= new FachadaBD();
        conn= fachada.getConnetion();
    }
//    Sirve para guardar el estudiante en la base de datos
    public int guardarPrograma(ModeloUsuario ModeloUsuario){
        String sql_guardar;
        int numFilas=0;

        sql_guardar="INSERT INTO programa VALUES ('" +
                ModeloUsuario.getId_usuario()+ "', '" + ModeloUsuario.getNombre_usuario()+  "', '" +
                ModeloUsuario.getEstamento_usuario() + "', " + ModeloUsuario.getDependencia() + "', " + ModeloUsuario.getGenero() + "', " + ModeloUsuario.getEstado()+ ")";
        try{
            
            Statement sentencia = this.conn.createStatement();

            numFilas = sentencia.executeUpdate(sql_guardar);            
            System.out.println("up " + numFilas);
            return numFilas;
            
        }
        catch(SQLException e){
            System.out.println(e); 
            }
        catch(Exception e){ 
            System.out.println(e);
        }
        return -1;
    }
    
}
