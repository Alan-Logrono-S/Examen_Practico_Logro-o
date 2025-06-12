package EPN_PLUS;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String cedula;
    private int edad;
    private String telefono;

    public Estudiante(String nombre, String apellido, String cedula, int edad, String telefono){
        this.nombre=nombre;
        this.apellido=apellido;
        this.cedula=cedula;
        this.edad=edad;
        this.telefono=telefono;
    }

    public String getNombre() {return nombre;}
    public String getApellido() {return apellido;}
    public String getCedula() {return cedula;}
    public int getEdad() {return edad;}
    public String getTelefono() {return telefono;}

    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setApellido(String apellido) {this.apellido = apellido;}
    public void setCedula(String cedula) {this.cedula = cedula;}
    public void setEdad(int edad) {this.edad = edad;}
    public void setTelefono(String telefono) {this.telefono = telefono;}

    public void mostrarDatos(){
        System.out.println("Nombre del Estudiante: "+ nombre+ " "+ apellido);
        System.out.println("Número de Cedula: "+cedula);
        System.out.println("Edad: "+edad + " años.");
        System.out.println("Número de Telefono: "+telefono);
    }
    public boolean validarEdad(){
        return edad >= 13 && edad<=60;
    }

}
