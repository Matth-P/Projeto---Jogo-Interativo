import java.util.Scanner;

class Jogo {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            Character matt = new Character(
                "Matt",
                5);
            Character ross = new Character(
                "Ross",
                5);
            Character tina = new Character(
                "Tina",
                10);
            Character parker = new Character(
                "Parker",
                0);

            System.out.println("Chapter 1 ------- The ghost at school!");
            System.out.println();
            System.out.println("Matt, Ross, Tina and Parker heard rummors that a spirit, called ''La Chika'', roams an abandoned school at night");
            System.out.println("and now are going to investigate it further. The four went to the school at night, and found a guard at the gate, tina");
            System.out.println("is too scared and wants to go home, Ross wants to talk with the guard and Parker wants to jump over the gate without him noticing it.");
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println();
            System.out.println(matt.name);
            System.out.println(matt.fearFactor);
            System.out.println();
            System.out.println(ross.name);
            System.out.println(ross.fearFactor);
            System.out.println();
            System.out.println(tina.name);
            System.out.println(tina.fearFactor);
            System.out.println();
            System.out.println(parker.name);
            System.out.println(parker.fearFactor);
            System.out.println();
            System.out.println("1 - Do what Tina wants and go to home.");
            System.out.println("2 - Go with Ross and ask the guard to get inside.");
            System.out.println("3 - Take the risky approach and jump with Parker.");
            System.out.println();
            int X = input.nextInt();
            System.out.println();
            int Y = 1;
            
            while(Y == 1){
                if (X == 2){
                    matt.fearFactor = 15;
                    ross.fearFactor = 15;
                    tina.fearFactor = 20;
                    parker.fearFactor = 15;
                    System.out.println("-----------------------------------------------------------------------------------------------------------------");
                    System.out.println();
                    System.out.println("You and Ross went to the guard and talked with him about going inside for to find the ghost.");
                    System.out.println("The guard ask for you to leave. Everyone gained 10 points of fear.");
                    System.out.println("What will you do now ?");
                    System.out.println();
                    System.out.println("-----------------------------------------------------------------------------------------------------------------");
                    System.out.println();
                    System.out.println(matt.name);
                    System.out.println(matt.fearFactor);
                    System.out.println();
                    System.out.println(ross.name);
                    System.out.println(ross.fearFactor);
                    System.out.println();
                    System.out.println(tina.name);
                    System.out.println(tina.fearFactor);
                    System.out.println();
                    System.out.println(parker.name);
                    System.out.println(parker.fearFactor);
                    System.out.println();
                    System.out.println("1 - Do what Tina wants and go to home.");
                    System.out.println("3 - Take the risky approach and jump with Parker.");
                    X = input.nextInt(); 
                    
                }    

                if (X == 1){
                    Y -= 1;
                    matt.fearFactor = 100;
                    ross.fearFactor = 100;
                    tina.fearFactor = 100;
                    parker.fearFactor = 100;
                    System.out.println();
                    System.out.println("-----------------------------------------------------------------------------------------------------------------");
                    System.out.println();
                    System.out.println("You told your friends it's too dangerous and it's time to go home.");
                    System.out.println("Party's fear reached it's maximum");
                    System.out.println();
                    System.out.println(matt.name);
                    System.out.println(matt.fearFactor);
                    System.out.println();
                    System.out.println(ross.name);
                    System.out.println(ross.fearFactor);
                    System.out.println();
                    System.out.println(tina.name);
                    System.out.println(tina.fearFactor);
                    System.out.println();
                    System.out.println(parker.name);
                    System.out.println(parker.fearFactor);
                    System.out.println();
                    System.out.println("Ending 1");
                    System.out.println();
                    System.out.println("-----------------------------------------------------------------------------------------------------------------");
                    break;
                }
                if (X == 3){
                    matt.fearFactor = 25;
                    ross.fearFactor = 25;
                    tina.fearFactor = 30;
                    parker.fearFactor = 25;
                    System.out.println();
                    System.out.println("-----------------------------------------------------------------------------------------------------------------");
                    System.out.println();
                    System.out.println("You followed Parker to the wall and find a safe spot to jump, you then proced to the interior of the school, it's too dark and only");
                    System.out.println("your flashligh's light brigthens the darkness a bit. Tina is afraid, Ross is apprehensive and Parker is excited. You then hear something");
                    System.out.println("comming from one of the classrooms, that might be the perfect spot for the Ouija bord you brought to investigate. The whole party is");
                    System.out.println("on edge, everyone gained 20 fear points");
                    System.out.println();
                    System.out.println("-----------------------------------------------------------------------------------------------------------------");
                    System.out.println();
                    System.out.println(matt.name);
                    System.out.println(matt.fearFactor);
                    System.out.println();
                    System.out.println(ross.name);
                    System.out.println(ross.fearFactor);
                    System.out.println();
                    System.out.println(tina.name);
                    System.out.println(tina.fearFactor);
                    System.out.println();
                    System.out.println(parker.name);
                    System.out.println(parker.fearFactor);
                    System.out.println();
                    System.out.println("1 - Forget this ghost thing and go home since it's really late");
                    System.out.println("2 - Put the Ouija board on one of the chairs and call for ''La chika''");
                    X = input.nextInt();
                    while (Y == 1){
                        if (X == 1){
                            Y -= 1;
                            matt.fearFactor = 100;
                            ross.fearFactor = 100;
                            tina.fearFactor = 100;
                            parker.fearFactor = 100;
                            System.out.println();
                            System.out.println("-----------------------------------------------------------------------------------------------------------------");
                            System.out.println();
                            System.out.println("It's getting too late and you guys decidade that this is not worth the effort and leave the school, without talking with the ghost.");
                            System.out.println("Party's fear reached it's maximum");
                            System.out.println();
                            System.out.println(matt.name);
                            System.out.println(matt.fearFactor);
                            System.out.println();
                            System.out.println(ross.name);
                            System.out.println(ross.fearFactor);
                            System.out.println();
                            System.out.println(tina.name);
                            System.out.println(tina.fearFactor);
                            System.out.println();
                            System.out.println(parker.name);
                            System.out.println(parker.fearFactor);
                            System.out.println();
                            System.out.println("Ending 2");
                            System.out.println();
                            System.out.println("-----------------------------------------------------------------------------------------------------------------");
                            break;
                        }
                        if (X == 2){
                            Y -= 1;
                            matt.fearFactor = 85;
                            ross.fearFactor = 85;
                            tina.fearFactor = 90;
                            parker.fearFactor = 85;
                            System.out.println();
                            System.out.println("-----------------------------------------------------------------------------------------------------------------");
                            System.out.println();
                            System.out.println("With the board on the table, you and your friends start calling for the name of the ghost, then, the name Chika is spelled on the");
                            System.out.println("board, and, as if that was not enough, a big blue spectral head starts coming out of the board. The scene is scary enough for you");
                            System.out.println("and your friends to leave the area screaming in terror. Evetyone gained 80 points of fear");
                            System.out.println();
                            System.out.println(matt.name);
                            System.out.println(matt.fearFactor);
                            System.out.println();
                            System.out.println(ross.name);
                            System.out.println(ross.fearFactor);
                            System.out.println();
                            System.out.println(tina.name);
                            System.out.println(tina.fearFactor);
                            System.out.println();
                            System.out.println(parker.name);
                            System.out.println(parker.fearFactor);
                            System.out.println();
                            System.out.println("End of Chapter 1");
                            System.out.println();
                            System.out.println("-----------------------------------------------------------------------------------------------------------------");
                            break;
                        }
                        else{ 
                            System.out.println();
                            System.out.println("-----------------------------------------------------------------------------------------------------------------");
                            System.out.println();
                            System.out.println("Choose a valid answer");
                            X = input.nextInt();
                        }
                    }
                }
                else{
                    System.out.println();
                    System.out.println("-----------------------------------------------------------------------------------------------------------------");
                    System.out.println();
                    System.out.println("Choose a valid answer");
                    X = input.nextInt();
                }    
            }
        }

    }

}
        
 

    