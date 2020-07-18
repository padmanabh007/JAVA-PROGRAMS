
import java.util.*;//Random class comes unter util header file
public class Rps{
    public static void main(String[] args){
        int n,computer_choice,ch,c=0,y=0,i=0;
        Scanner s=new Scanner(System.in);
        Random rand=new Random();//Declaring object of random class
        System.out.println("Come lets play Rock Paper and Sissors ");

        //How many times the user want to play with the computer
        System.out.println("Enter for how many points you like to play \t");
        n=s.nextInt();

        for(i=0;i<n;i++){

            //User input for Rock ,Paper and Scissors
            System.out.println("Enter the input \n1.Rock\n2.Paper\n3.Scissors \t");
            ch=s.nextInt();//Taking input from the user

            computer_choice=rand.nextInt(3)+1;   //To generate numbers from 0-2 by the computer but we want 1-3 so we add 1 to it 


            //Compairing computers input with Users input
            if(computer_choice==1){
                System.out.println("Computer=Rock");
                if(ch==1){
                    System.out.println("No point tie ");
                }
                else if(ch==2){
                    System.out.println("You scores ");
                    y++;
                }
                else {
                    System.out.println("Computer scores");
                    c++;
                }
            }


            else if(computer_choice==2){
                System.out.println("Computer=Paper");
                if(ch==1){
                    System.out.println("Computer scores ");
                    c++;
                }
                else if(ch==2){
                    System.out.println("No point tie ");
                }
                else {
                    System.out.println("You scores ");
                    y++;
                }
            }


            else{
                System.out.println("Computer=Scissors");
                if(ch==1){
                    System.out.println("You scores ");
                    y++;
                }
                else if(ch==2){
                    System.out.println("Computer scores ");
                    c++;
                }
                else {
                    System.out.println("No point tie  ");
                }
            }   
        }

        //Score of computer and user
        System.out.println("Scores");
        System.out.println("Computer You");
        System.out.println(c+"         "+y);
        
        
        if(c>y){
            System.out.println("Computer Wins");
        }
        else if(c<y){
             System.out.println("You Wins");
        }
        else{
             System.out.println("Tie");
        }
        


        //Regards
        System.out.println("Thank you for playing");
    }
}
