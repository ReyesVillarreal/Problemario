import java.util.Random;
import java.util.Scanner;

public class App {
public static void main(String[] args) throws Exception { 

    Random random = new Random(); 
    Scanner teclado = new Scanner(System.in); 

    System.out.println("escribe un numero del 1 al 100");
    int human = teclado.nextInt(); 
    int real = random.nextInt(100);
    
     if (human == real)
     { System.out.println("verdad");
    
    } else{ System.out.println("no es"); 
        System.out.println("era:" + real);  }
}
}