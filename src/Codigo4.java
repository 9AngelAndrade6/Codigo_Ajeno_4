import java.util.Scanner;
//faltaba e import del scanner
public class Codigo4 {
	//faltaba el public static void main(String[] args) para poder correr el programa
	public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    //Aqui falata el System.in dentro del Scanner puesto que necesitamos especificar de donde se recibe la info
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
    //Aqui se corrige el Syso porque estaba repetido Turno del jugador 1
    //Se intercambia por  Turno del jugador 2
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    Scanner s2 = new Scanner(System.in);
    String j2 = s.nextLine();
    // Aqui abajo sobraba un cierre de parentesis (j1 == j2))
    if (j1 == j2) {
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2 == "tijeras") {
            g = 1;
          }//if
          break;
// aqui falataba un break
        case "papel":
          if (j2 == "piedra") {
            g = 1;
          }//if
          break;
// aqui faltaba otro break
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          }//if
          break;
        default:
      }//switch
      System.out.println("Gana el jugador " + g);
    }//else 
    
	}//main  Aqui se agrega llave de cierre para el main
}//class Codigo4
