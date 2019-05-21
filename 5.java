
import  java.util.Scanner ;

public class  5
{
    Public  static  void  main ( String  args [])
    {
        Escáner teclado = nuevo  Escáner ( System . In );
        int num = 0 ;
        int suma = 0 ;
        mientras (num < 9999 )
        {
        	Sistema . a cabo . imprimir ( " Ingresar un numero " );
			num = teclado . nextInt ();
			suma = suma + num;
        }
        si (num == 0 )
        {
        	Sistema . a cabo . imprimir ( " El valor es " + num +  " \ n " );
        }
        si (num < 0 )
        {
        	Sistema . a cabo . imprimir ( " El valor es " + num +  " y es menor a 0 " );	
        }
        si (num > 0 )
        {
        	Sistema . a cabo . imprimir ( " El valor es " + num +  " y es mayor a 0 " );	
        }
    }
}