package EPN_PLUS;

public class CursoCertificado extends CursoRegular{
    private boolean certificado;

    public CursoCertificado(Docente docente, String n_curso,double duracion, double precio, String cupo
    , boolean certificado){
        super(docente,n_curso,duracion,precio,cupo);
        this.certificado=certificado;
    }

    public void setCertificado(boolean certificado) {this.certificado = certificado;}


    @Override
    public void mostrarResumen() {
        super.mostrarResumen();
        System.out.println("Certificado: "+ (certificado));
        System.out.println("Precio Final: "+ calcular_precio());
    }
}