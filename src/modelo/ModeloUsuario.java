package modelo;

/**
 *
 * @author Franklin Aguirre
 */
public class ModeloUsuario {
    private String Id_usuario ;
    private String nombre_usuario;
    private String estamento_usuario; 
    private String dependencia;
    private String genero;
    private String Estado ;

    public String getId_usuario() {
        return Id_usuario;
    }

    public void setId_usuario(String Id_usuario) {
        this.Id_usuario = Id_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getEstamento_usuario() {
        return estamento_usuario;
    }

    public void setEstamento_usuario(String estamento_usuario) {
        this.estamento_usuario = estamento_usuario;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    
    
}
