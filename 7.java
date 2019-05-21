import  java.util.Scanner ;

public class  7
{
    Public  static  void  main ( String  args [])
    {
        Escáner teclado = nuevo  Escáner ( System . In );
        int num1 = 0 ;
        int num2 = 0 ;
        int suma;
        int resta;
        int multi;
        int div;
        Sistema . a cabo . imprimir ( " Ingresar un numero " );
		num1 = teclado . nextInt ();
		Sistema . a cabo . imprimir ( " Ingresar otro numero " );
		num2 = teclado . nextInt ();
		suma = num1 + num2;
		Sistema . a cabo . print ( " La suma es: " + suma + " \ n " );
		resta = num1 - num2;
		Sistema . a cabo . print ( " La resta es: " + resta + " \ n " );
		multi = num1 * num2;
		Sistema . a cabo . imprimir ( " La multiplicación es: " + multi + " \ n " );
		div = num1 / num2;
		Sistema . a cabo . print ( " La division es " + div + " \ n " );
    }
}