

public class Editorial extends General {
    private String nombre;
    private Ciudad ciudad;
    
    public Editorial() {
        
    }
    
    public Editorial(int id, String nombre, Ciudad ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Ciudad getCiudad() {
        return ciudad;
    }
    
    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
}