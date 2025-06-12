package EPN_PLUS;

public class Evaluacion {
    private double resultado;

    public Evaluacion(double resultado){
        this.resultado=resultado;
    }

    public double getResultado() {return resultado;}
    public void setResultado(double resultado) {this.resultado = resultado;}

    public void mostrarresultado(){
        System.out.println("Resultado: "+ resultado + "/10");
    }
}
