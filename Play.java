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
                game2();
            }
        }
        scan.close();
    }

    public static void game2(){
        System.out.println("Do you want to play another game? ");
        Scanner scan2 = new Scanner(System.in);
        String res = scan2.nextLine();
        String lower = res.toLowerCase();
        if(lower.equals("yes")){
            System.out.println("Pick a number: ");
            Scanner scan3 = new Scanner(System.in);
            int res2 = scan3.nextInt();
            int rand = (int) Math.floor(Math.random() * 101);
            if(res2>rand){
                System.out.println("You Picked: " + res2);
                System.out.println("Computer Picked: " + rand);
                System.out.println("YOU ARE A WINNER!!!!");
            } else if(res2<rand){
                System.out.println("You Picked: " + res2);
                System.out.println("Computer Picked: " + rand);
                System.out.println("YOU ARE A LOSER!!!!");
            } else{
                System.out.println("You Picked: " + res2);
                System.out.println("Computer Picked: " + rand);
                System.out.println("IT IS A TIE!!!!");
            }
        } else{
            System.out.println("UNACCEPTABLE!!!!");
        }
        scan2.close();
    }
    public static void main(String[] args) {
        game();
    }
}
