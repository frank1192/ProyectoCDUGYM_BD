/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesoDatos;
import modelo.ModeloAsistencia;
import java.sql.*;
/**
/**
 *
 * @author Franklin Aguirre
 */
public class Asistencia_DAO {
    
    FachadaBD fachada;
    Connection conn;
    public Asistencia_DAO(){
        fachada= new FachadaBD();
        conn= fachada.getConnetion();
    }
     public int guardarRegistroAsistencia(ModeloAsistencia ModeloAsistencia){
        String sql_guardar;
        int numFilas=0;

        sql_guardar="INSERT INTO asistencia VALUES ('" +
                ModeloAsistencia.getId_usuario_asistencia()+ "', '" + ModeloAsistencia.getFecha_asistencia()+  "')";
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
