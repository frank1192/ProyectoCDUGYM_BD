
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
    public int guardarUsuario(ModeloUsuario ModeloUsuario){
        String sql_guardar;
        int numFilas=0;

        sql_guardar="INSERT INTO usuario VALUES ('" +
                ModeloUsuario.getId_usuario()+ "', '" + ModeloUsuario.getNombre_usuario()+  "', '" +
                ModeloUsuario.getEstamento_usuario() + "', '" + ModeloUsuario.getDependencia() + "', '" + ModeloUsuario.getGenero() + "', '" + ModeloUsuario.getEstado()+ "')";
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
    
    public ModeloUsuario Consultarusuario(String Id_usuario) {
        ModeloUsuario ModeloUsuario= new ModeloUsuario();
        String sql_select;
        sql_select="SELECT Id_usuario, nombre_usuario, estamento_usuario, dependencia, genero, Estado   FROM  usuario WHERE Id_usuario='" + Id_usuario +  "'";
         try{
            
            System.out.println("consultando en la bd");
            Statement sentencia = this.conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
                
               ModeloUsuario.setId_usuario(tabla.getString(1));              
               ModeloUsuario.setNombre_usuario(tabla.getString(2));               
               ModeloUsuario.setEstamento_usuario(tabla.getString(3)); 
               ModeloUsuario.setDependencia(tabla.getString(4));              
               ModeloUsuario.setGenero(tabla.getString(5));               
               ModeloUsuario.setEstado(tabla.getString(6));
               
              
              //System.out.println("ok");
            }
           
            return ModeloUsuario;
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
        return null;
    }
    
    public void cerrarConexionBD(){
        fachada.closeConection(fachada.getConnetion());
    }
    
}
