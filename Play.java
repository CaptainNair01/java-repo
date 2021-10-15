import java.util.Scanner;

public class Play {
    public static void game() {
        int counter = 0;
        int random = (int) Math.floor(Math.random() * 101);

        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int response = scan.nextInt();

        while(response != random){
            if(response < random){
                counter++;
                System.out.println("Too Low!");
                response = scan.nextInt();
            } else if(response > random){
                counter++;
                System.out.println("Too High!");
                response = scan.nextInt();
            }
            if(response == random){
                counter++;
                System.out.println("You guessed correctly and it took you " + counter + " tries!!!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        game();
    }
}
