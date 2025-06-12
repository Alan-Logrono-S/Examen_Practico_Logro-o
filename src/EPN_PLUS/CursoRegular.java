package EPN_PLUS;

public class CursoRegular extends Curso{
    private String posicion_Economica;

    public CursoRegular(Docente docente, String n_curso,double duracion, double precio, String posicion_Economica ){

        super(docente,n_curso,duracion,precio);
        this.posicion_Economica=posicion_Economica;
    }

    @Override
    public void mostrarResumen() {
        super.mostrarResumen();
        System.out.println("Posicion Economica: "+posicion_Economica);
    }
}
