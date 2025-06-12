package EPN_PLUS;

public class Curso {
    private Docente docente;
    private String curso;
    private double duracion;
    private double precio;

    public Curso(Docente docente, String n_curso,double duracion, double precio){
        this.docente=docente;
        this.curso=n_curso;
        this.duracion=duracion;
        this.precio=precio;
    }

    public Docente getDocente() {return docente;}
    public String getCurso() {return curso;}
    public double getDuracion() {return duracion;}
    public double getPrecio() {return precio;}

    public void setDocente(Docente docente) {this.docente = docente;}
    public void setCurso(String curso) {this.curso = curso;}
    public void setDuracion(double duracion) {this.duracion = duracion;}
    public void setPrecio(double precio) {this.precio = precio;}

    public double calcular_precio(){
        return precio + (precio * 0.25);
    }
    public void mostrarResumen(){
        System.out.println("Nombre del Curso: "+ curso);
        System.out.println("Duración: "+ duracion + " días.");
        System.out.println("Docente encargado: "+docente.getNombre());
        System.out.println("Precio Base: $" +precio);

    }
    public Docente asignarDocente(String docente){
        System.out.println("Docente: "+docente);
        return (getDocente());
    }
}
