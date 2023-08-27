package co.edu.uts.appdev.models;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Usuario {
    private String nombre;
    private String apellido;
    private String email;

    public Usuario(String nombre, String apellido, String email){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email =  email;
    }
    
}
