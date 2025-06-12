package EPN_PLUS;

import javax.print.Doc;

public class Docente {
    private String nombre;
    private String especializacion;
    private String cedula;
    private String curso;


    public Docente (String nombre, String especializacion, String cedula, String curso){

        this.nombre=nombre;
        this.especializacion=especializacion;
        this.cedula=cedula;
        this.curso=curso;
    }

    public String getNombre() {return nombre;}
    public String getEspecializacion() {return especializacion;}
    public String getCedula() {return cedula;}
    public String  getCurso() {return curso;}

    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setEspecializacion(String especializacion) {this.especializacion = especializacion;}
    public void setCedula(String cedula) {this.cedula = cedula;}
    public void setCurso(String curso) {this.curso = curso;}

    public void mostrarPerfil(){
        System.out.println("Nombre del docente: "+ nombre);
        System.out.println("Especializacion en: "+ especializacion);
        System.out.println("Cedula: "+ cedula);
        System.out.println("Curso encargado: "+ getCurso());
    }
}
