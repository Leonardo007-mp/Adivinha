import java.util.Random;
import java.util.Scanner;

public class Adivinha {
    public static void main(String[] args) {
    
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1; 
        int tentativasMaximas = 10; 
        int tentativasFeitas = 0;
        boolean acertou = false;

        Scanner scanner = new Scanner(System.in);

        
        while (tentativasFeitas < tentativasMaximas && !acertou) {
            System.out.println("Tentativa " + (tentativasFeitas + 1) + ". Digite um número entre 1 e 100:");
            int palpite = scanner.nextInt();

            if (palpite == numeroAleatorio) {
                acertou = true;
            } else {
                
                if (palpite < numeroAleatorio) {
                    System.out.println("Tente um número maior.");
                } else {
                    System.out.println("Tente um número menor.");
                }
            }

            tentativasFeitas++;
        }

        if (acertou) {
            System.out.println("Parabéns! Você adivinhou o número " + numeroAleatorio + " corretamente em " + tentativasFeitas + " tentativas.");
        } else {
            System.out.println("Você não conseguiu adivinhar o número. O número era: " + numeroAleatorio);
        }

        
        scanner.close();
    }
}
