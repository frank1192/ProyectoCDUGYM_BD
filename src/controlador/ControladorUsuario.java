/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import modelo.ModeloUsuario;
import java.util.Vector;
import accesoDatos.*;

/**
 *
 * @author Franklin Aguirre
 */
public class ControladorUsuario {
    
    Usuario_DAO Usuario_DAO;
    
    public ControladorUsuario(){
        Usuario_DAO=new Usuario_DAO();
    }
    public int  insertarUsuario(String  Id_usuario, String nombre_usuario, String estamento_usuario , String dependencia, String genero ,String Estado ){
        ModeloUsuario ModeloUsuario = new ModeloUsuario();        

        ModeloUsuario.setId_usuario(Id_usuario);              
        ModeloUsuario.setNombre_usuario(nombre_usuario);               
        ModeloUsuario.setEstamento_usuario(estamento_usuario); 
        ModeloUsuario.setDependencia(dependencia);              
        ModeloUsuario.setGenero(genero);               
        ModeloUsuario.setEstado(Estado);
        
        //Se llama al dao para guardar
        System.out.println("Se va a insertar un programa");
        
        int result =Usuario_DAO.guardarUsuario(ModeloUsuario);

        System.out.println("Se  insertó  un  nuevo programa");
        
        return result;

    }
    public ModeloUsuario consultarUsuario(String Id_usuario){
        
         System.out.println("Se va a consultar un programa");
         ModeloUsuario ModeloUsuario= Usuario_DAO.Consultarusuario(Id_usuario);
      
       return ModeloUsuario;
    }
     public void cerrarConexionBD(){
        Usuario_DAO.cerrarConexionBD();
    }

}
