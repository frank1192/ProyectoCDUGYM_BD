
package controlador;

import modelo.ModeloAsistencia;
import java.util.Vector;
import accesoDatos.*;
/**
 *
 * @author Franklin Aguirre
 */
public class ControladorAsistencia {
    
    Asistencia_DAO Asistencia_DAO;
    
    public ControladorAsistencia(){
        Asistencia_DAO=new Asistencia_DAO();
    }
    
    public int  insertarRegistroAsistencia(String  Id_usuario_asistencia, String fecha_asistencia ){
        ModeloAsistencia ModeloAsistencia = new ModeloAsistencia();        

        ModeloAsistencia.setId_usuario_asistencia(Id_usuario_asistencia);              
        ModeloAsistencia.setFecha_asistencia(fecha_asistencia);               

        
        //Se llama al dao para guardar
        System.out.println("Se va a insertar un programa");
        
        int result =Asistencia_DAO.guardarRegistroAsistencia(ModeloAsistencia);

        System.out.println("Se  insertó  un  nuevo programa");
        
        return result;

    }
}
