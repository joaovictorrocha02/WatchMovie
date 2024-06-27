import java.util.Scanner;

public class WatchMovie {

    public static void main(String args[]) {
       System.out.print("Insira o preço do ingresso do cinema \n");
        Scanner keyboard = new Scanner(System.in);
        Double ingresso = keyboard.nextDouble();
        System.out.print("Insira a classificação do filme \n");

        int rating = keyboard.nextInt();
        
        if (ingresso >=12.0 && rating == 5) {
            System.out.println(" Estou interresado em assistir "
                    + "o filme");
        } else {
            System.out.println(" Não estou interessado"
                    + "em assistir o filme");
        }

    
    }
}
