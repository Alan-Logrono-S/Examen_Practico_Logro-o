package Principal;

import EPN_PLUS.*;

public class Main {
    public static void main (String[] args){
        Estudiante estudiante1 = new Estudiante("Pepe","Rito","098765432",20,"098712123");
        Docente docente1= new Docente("Ricardo","Ingeniero en Sistemas","0987645123","Programación");
        CursoRegular cursoRegular1= new CursoRegular(docente1,"Programación",25,20,"Media");
        Evaluacion evaluacion1 = new Evaluacion(10);
        Matricula matricula1= new Matricula(estudiante1,evaluacion1,"Ninguno",2032);

        System.out.println("----------- DATOS ESTUDIANTE -----------");
        estudiante1.mostrarDatos();
        evaluacion1.mostrarresultado();
        matricula1.mostrarDetalle();
        matricula1.registrarEvaluacion();
        System.out.println("----------- DATOS DOCENTE-----------");
        docente1.mostrarPerfil();
        System.out.println("----------- DATOS CURSO-----------");
        cursoRegular1.mostrarResumen();
        System.out.println(" ");
        System.out.println("##########################################");
        System.out.println(" ");
        Estudiante estudiante2 = new Estudiante("Mike","Crosoft","0928342543",23,"0987123454");
        Docente docente2 = new Docente("Maria","Economista","0928734124","Economia");
        CursoCertificado cursoCertificado2 = new CursoCertificado(docente2, "Economia",30,20,"Alta",true);
        Evaluacion evaluacion2 = new Evaluacion(8);
        Matricula matricula2= new Matricula(estudiante2,evaluacion2,"Ninguno",2032);

        System.out.println("----------- DATOS ESTUDIANTE -----------");
        estudiante2.mostrarDatos();
        evaluacion2.mostrarresultado();
        matricula2.mostrarDetalle();
        matricula2.registrarEvaluacion();
        System.out.println("----------- DATOS DOCENTE-----------");
        docente2.mostrarPerfil();
        System.out.println("----------- DATOS CURSO-----------");
        cursoCertificado2.mostrarResumen();
    }
}
