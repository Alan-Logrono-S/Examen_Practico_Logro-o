package EPN_PLUS;

public class CursoRegular extends Curso{
    private String cupo;

    public CursoRegular(Docente docente, String n_curso,double duracion, double precio, String cupo){

        super(docente,n_curso,duracion,precio);
        this.cupo=cupo;
    }

    @Override
    public void mostrarResumen() {
        super.mostrarResumen();
        System.out.println("Cupo adicional: "+cupo);
    }
}
