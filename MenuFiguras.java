/**
2.	Programa que dibuixa figures. (6 punts)
El programa mostra un menú amb diferents possibles figures: “1) Recta horitzontal”, “2) Recta vertical”, “3) Rectangle sòlid”, “4) Rectangle buit” i “5) sortir”.
-	L’usuari triarà una opció. 
-	Si l’opció no es vàlida, s’informarà i es tornarà a mostrar el menú.
-	Si l’opció és correcta, es demanarà la grandària de la figura i, tot seguit, es mostrarà.
-	Un cop mostrada la figura, es tornarà al menú.
**/
import java.util.Scanner;
public class MenuFiguras {
	/**iniciamos programa principal by Simonius**/
	public static void main (String [] args){
		Scanner scan=new Scanner(System.in);
		/**declaramos boleano para terminar el programa**/
		boolean runing = true;
		/**iniciamos bucle infinit a la espara de la opcion salir**/
		while (runing){
			/**imprimimos menu de opciones**/
			scan.nextLine();
			System.out.println("---- Menu ----");
			System.out.println("1) Recta horizontal");
			System.out.println("2) Recta vertical");
			System.out.println("3) Rectangul solido");
			System.out.println("4) Rectangulo vacio");
			System.out.println("5) Salir");
			System.out.println("Escoge una opcion: ");
			String opcion = scan.nextLine();
			int longitud;
			int altura;
			switch (opcion){
				case("1"):/** imprimr linea horizontal segun longitud**/
					System.out.println("Escoge una longitud :");
					 longitud = scan.nextInt();
					for(int i=0; i<longitud; i++){
						System.out.print("*");
					}
					System.out.println();
					break;
				
				case("2"):/**imprime linea vertical segun longitud**/
					System.out.println("Escoge una longitud :");
					 longitud = scan.nextInt();
					for(int i=0; i<longitud; i++){
						System.out.println("*");
					}
					break;
				
				case("3"):/**imprime rectangulo segun longitud y altura**/
					System.out.println("Escoge una longitud :");
					 longitud = scan.nextInt();
					System.out.println("Escoge una Altura :");
					 altura = scan.nextInt();
					for(int i=0; i<altura; i++){
						for(int j=0; j<longitud; j++){
						System.out.print("*");
						}
						/** Salto de linea para imprimir el rectangulo**/
						System.out.println();
					}
					
					break;
				
				case("4"):/**imprime rectangulo segun longitug y altura pero solo los extremos**/
					System.out.println("Escoge una longitud :");
					 longitud = scan.nextInt();
					System.out.println("Escoge una Altura :");
					 altura = scan.nextInt();
					for(int i=0; i<altura; i++){
						for(int j=0; j<longitud; j++){
							if((i==0||i==altura-1)||(j==0||j==longitud-1)){
								System.out.print("*");
							}else{
								System.out.print(" ");
							}
						}
						/** Salto de linea para imprimir el rectangulo**/
						System.out.println();
					}
					break;
				
				case("5"):/** sale del programa cambiando la boleana**/
					runing=false;
					break;
				
				default:
					System.out.println("Opcion no valida");
				break;
				
				
			}		
		}
	}
}	