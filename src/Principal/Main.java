package Principal;

import EPN_PLUS.*;

public class Main {
    public static void main (String[] args){
        Estudiante estudiante1 = new Estudiante("Pepe","Rito","098765432",20,"098712123");
        Docente docente1= new Docente("Ricardo","Ingeniero en Sistemas","0987645123","Programación");
        CursoRegular cursoRegular1= new CursoRegular(docente1,"Programación",25,20,"Medio");

        System.out.println("----------- DATOS ESTUDIANTE -----------");
        estudiante1.mostrarDatos();
        System.out.println("----------- DATOS DOCENTE-----------");
        docente1.mostrarPerfil();
        System.out.println("----------- DATOS CURSO-----------");
        cursoRegular1.mostrarResumen();

        System.out.println("##########################################");

        Estudiante estudiante2 = new Estudiante("Mike","Crosoft","0928342543",23,"0987123454");
        Docente docente2 = new Docente("Maria","Economista","0928734124","Economia");
        CursoCertificado cursoCertificado2 = new CursoCertificado(docente2, "Economia",25,20,"Alto",true);

        System.out.println("----------- DATOS ESTUDIANTE -----------");
        estudiante2.mostrarDatos();
        System.out.println("----------- DATOS DOCENTE-----------");
        docente2.mostrarPerfil();
        System.out.println("----------- DATOS CURSO-----------");
        cursoCertificado2.mostrarResumen();
    }
}
