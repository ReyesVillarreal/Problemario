import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("escribe valores de a b y c");
    int a = teclado.nextInt();
    int b = teclado.nextInt();
    int c = teclado.nextInt();
if (a > b+c)
{
 System.out.println("no se puede");   
}
if (a < b+c)

{
    System.out.println("si es triangulo");
}


    }
}
