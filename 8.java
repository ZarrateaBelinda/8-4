
import  java.util.Scanner ;
public class  8
{
    Public  static  void  main ( String  args [])
    { 
    	/ * HICIMOS TODO EN UN METODO PORQUE NO SABEMOS COMO HACER OTRA CLASE QUE HEREDE DE ESTA * /
        Escáner teclado = nuevo  Escáner ( System . In );
        char nom;
        int edad;
        int sueldo;
        Sistema . a cabo . imprimir ( " Ingresar su nombre " );
		nom = teclado . nextInt ();
		Sistema . a cabo . imprimir ( " Ingresar su edad " );
		edad = teclado . nextInt ();
		Sistema . a cabo . imprimir ( " Ingresar su sueldo " );
		sueldo = teclado . nextInt ();
		Sistema . a cabo . imprimir ( " El nombre es: " + nombre + " y la edad es " + edad + " y el sueldo es " + sueldo + );
    }
}