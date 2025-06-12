package EPN_PLUS;

public class Matricula {
    private Estudiante estudiante;
    private Evaluacion evaluacion;
    private String detalle ="Ninguno";
    private int n_Matricula;

    public Matricula(Estudiante estudiante, Evaluacion evaluacion,
                     String detalle, int n_Matricula){
        this.estudiante=estudiante;
        this.evaluacion=evaluacion;
        this.detalle=detalle;
        this.n_Matricula=n_Matricula;
    }

    public Estudiante getEstudiante() {return estudiante;}
    public Evaluacion getEvaluacion() {return evaluacion;}
    public String getDetalle() {return detalle;}
    public int getN_Matricula() {return n_Matricula;}

    public void setEstudiante(Estudiante estudiante) {this.estudiante = estudiante;}
    public void setEvaluacion(Evaluacion evaluacion) {this.evaluacion = evaluacion;}
    public void setDetalle(String detalle) {this.detalle = detalle;}
    public void setN_Matricula(int n_Matricula) {this.n_Matricula = n_Matricula;}

    public void registrarEvaluacion(){
        System.out.println("Evaluación = "+ evaluacion.getResultado());
    }
    public void mostrarDetalle(){
        System.out.println("Estudiante: "+ estudiante.getNombre()+ " "+ estudiante.getApellido());
        System.out.println("Detalle: "+ detalle);
    }
    /* Añadir info estudiante */
}
