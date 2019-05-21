
import  java.util.Scanner ;

público  de clase  6
{
    Public  static  void  main ( String  args [])
    {
        Escáner teclado = nuevo  Escáner ( System . In );
        int des = 1 ;
        char emp;
        int sueldo = 0 ;
        while (des == 1 )
        {   
        	Sistema . a cabo . imprimir ( " Ingresar un empleado " );
			emp = teclado . nextInt ();
			Sistema . a cabo . imprimir ( " Ingresar su sueldo " );
			sueldo = teclado . nextInt ();
			si (sueldo > = 3000 )
			{
				Sistema . a cabo . imprimir ( " Su nombre es " + emp + " y su sueldo es " + sueldo + " y debe pagar impuestos \ n " );
			} else {
				Sistema . a cabo . imprimir ( " Su nombre es " + emp + " y su sueldo es " + sueldo + " y no debe pagar impuestos \ n " );
			}
			Sistema . a cabo . imprimir ( " 1) Si desea ingresar otro empleado o 2) Si no lo desea " );
			des = teclado . nextInt ();
        }
    }
}