import java.util.Scanner;

class Jogo {
    public static void main(String[] args)
    {       
            Scanner scan = new Scanner(System.in);
            Character matt = new Character(
                "Matt",
                5);
                     
            // Chapter 1    
            Chapter chapter1 = new Chapter(
                "- Chapter 1 ------- The ghost at school! -",
                "Matt, Ross, Tina and Parker heard rummors that a spirit, called ''La Chika'', roams an abandoned school at night " +
                "and now are going to investigate it further. The four went to the school at night, and found a guard at the gate, tina " +
                "is too scared and wants to go home, Ross wants to talk with the guard and Parker wants to jump over the gate without him noticing it.",
                matt,
                0,
                "1 - Do what Tina wants and go to home.",
                "2 - Take the risky approach and jump with Parker.",
                scan);                     
                
            // Choice 1    
            Chapter chapter2 = new Chapter(
                "- The fear gets to you all -",                    
                "You told your friends it's too dangerous and it's time to go home. " +
                " Party's fear reached it's maximum. " +
                "" +
                "End 1 - Try again",
                matt,
                100,
                null,
                null,
                scan);               
            
            // Choice 2
            Chapter chapter4 = new Chapter(
                "- The daring move -",                    
                "You followed Parker to the wall and find a safe spot to jump, you then proced to the interior of the school, it's too dark and only " +
                "your flashligh's light brigthens the darkness a bit. Tina is afraid, Ross is apprehensive and Parker is excited. You then hear something " +
                "comming from one of the classrooms, that might be the perfect spot for the Ouija bord you brought to investigate. The whole party is " +
                "on edge, everyone gained 20 fear points",
                matt,
                20,
                "1 - Forget this ghost thing and go home since it's really late",
                "2 - Put the Ouija board on one of the chairs and call for ''La chika''",
                scan);
            
            // Choice 3
            Chapter chapter5 = new Chapter(
                "- Probably for the best -",                    
                "It's getting too late and you guys decidade that this is not worth the effort and leave the school, without talking with the ghost." +
                "Party's fear reached it's maximum" +
                "" +
                "End 2 - Try again",
                matt,
                100,
                null,
                null,
                scan);
             
            // Choice 4
            Chapter chapter6 = new Chapter(
                "- La Chika -",                    
                "With the board on the table, you and your friends start calling for the name of the ghost, then, the name Chika is spelled on the" +
                "board, and, as if that was not enough, a big blue spectral head starts coming out of the board. The scene is scary enough for you" +
                "and your friends to leave the area screaming in terror. Everyone gained 40 points of fear. " +
                "" +
                "End of Chapter 1",
                matt,
                40,
                null,
                null,
                scan);
            
            System.out.println();
            System.out.println("-- Ghost Party --");
            chapter1.display();
            int choice = chapter1.Choose();
            
            if(choice == 1)
            {
                chapter2.display();
            }
            
            else if(choice == 2)
            {
                chapter4.display();
                choice = chapter4.Choose();
                    if(choice == 1)
                    {
                        chapter5.display();
                    }
                    else if(choice == 2)
                    {
                        chapter6.display();
                    }
            }
        
        scan.close();       
    }    
}




        
 

    