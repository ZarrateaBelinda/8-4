/ * ejercicio 2 * /

import  java.util.Scanner ;

público  de clase  2
{	
	Public  static  void  main ( String  args [])
	{
		Escáner teclado = nuevo  Escáner ( System . In );
		int num;
		Sistema . a cabo . impresión ( " Ingresar un numero positivo " );
		num = teclado . nextInt ();
		if (num < 10  && num > = 0 ) {
			Sistema . a cabo . imprimir ( " El numero tiene 1 sola cifra " )
		}
		if (num > = 10  && num < 100 ) {
			Sistema . a cabo . grabado ( " El numero tiene 2 cifras " );
		}
		if (num > = 100  && num < 1000 ) {
			Sistema . a cabo . grabado ( " El numero tiene 3 cifras " );
		}
		if (num > = 1000  && num < 10000 ) {
			Sistema . a cabo . grabado ( " El numero tiene 4 cifras " );
		} else {
			Sistema . a cabo . impresión ( " El numero tiene mas de 4 cifras " );
		}
	}