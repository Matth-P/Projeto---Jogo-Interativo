import java.util.Scanner;

class Jogo {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Matt, Ross, Tina and Parker heard rummors that a spirit, called ''La Chika'', roams an abandoned school at night and now are going to investigate it further");
            System.out.println("The four went to the school at night, and found a guard at the gate, Tina is too scared and wants to go home, Ross wants to talk with the guard and Parker wants to jump over the gate without him noticing it.");
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println("1 - Do what Tina wants and go to home.");
            System.out.println("2 - Go with Ross and ask the guard to get inside.");
            System.out.println("3 - Take the risky approach and jump with Parker.");
            int X = input.nextInt();
            int Y = 1;
            
            while(Y == 1){
                if (X == 2){
                    System.out.println("-----------------------------------------------------------------------------------------------------------------");
                    System.out.println("You and Ross went to the guard and talked with him about going inside for to find the ghost.");
                    System.out.println("The guard ask for you to leave.");
                    System.out.println("What will you do now ?");
                    System.out.println("-----------------------------------------------------------------------------------------------------------------");
                    System.out.println("1 - Do what Tina wants and go to home.");
                    System.out.println("3 - Take the risky approach and jump with Parker.");
                    X = input.nextInt(); 
                    
                }    

                if (X == 1){
                    Y -= 1;
                    System.out.println("-----------------------------------------------------------------------------------------------------------------");
                    System.out.println("You told your friends it's too dangerous and it's time to go home.");
                    System.out.println("Ending 1");
                    System.out.println("-----------------------------------------------------------------------------------------------------------------");
                    break;
                }
                if (X == 3){
                    System.out.println("-----------------------------------------------------------------------------------------------------------------");
                    System.out.println("You followed Parker to the wall and find a safe spot to jump, you then proced to the interior of the school, it's too dark and only your flashligh's light brigthens the darkness a bit. Tina is");
                    System.out.println("afraid, Ross is apprehensive and Parker is excited. You then hear something comming from one of the classrooms, that might be the perfect spot for the Ouija bord you brought to investigate.");
                    System.out.println("-----------------------------------------------------------------------------------------------------------------");
                    System.out.println("1 - Forget this ghost thing and go home since it's really late");
                    System.out.println("2 - Put the Ouija board on one of the chairs and call for ''La chika''");
                    X = input.nextInt();
                    while (Y == 1){
                        if (X == 1){
                            Y -= 1;
                            System.out.println("-----------------------------------------------------------------------------------------------------------------");
                            System.out.println("It's getting too late and you guys decidade that this is not worth the effort and leave the school, without talking with the ghost.");
                            System.out.println("Ending 2");
                            System.out.println("-----------------------------------------------------------------------------------------------------------------");
                            break;
                        }
                        if (X == 2){
                            Y -= 1;
                            System.out.println("-----------------------------------------------------------------------------------------------------------------");
                            System.out.println("With the board on the table, you and your friends start calling for the name of the ghost, then, the name Chika is spelled on the board, and, as if that was not enough,");
                            System.out.println("a big blue spectral head starts leaving out of the board, the scene is scary enough for you and your friends to leave the area screaming in terror.");
                            System.out.println("Ending 3");
                            System.out.println("-----------------------------------------------------------------------------------------------------------------");
                            break;
                        }
                        else{ 
                            System.out.println("-----------------------------------------------------------------------------------------------------------------");
                            System.out.println("Choose a valid answer");
                            X = input.nextInt();
                        }
                    }
                }
                else{
                    System.out.println("-----------------------------------------------------------------------------------------------------------------");
                    System.out.println("Choose a valid answer");
                    X = input.nextInt();
                }    
            }
        }

    }

}
        
 

    