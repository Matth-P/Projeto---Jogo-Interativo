import java.util.Scanner;

class Jogo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Character matt = new Character("Matt", 1, 5);
        Character tina = new Character("Tina", 0, 10);
        Character ross = new Character("Ross", 0, 5);
        Character parker = new Character("Parker", 0, 0);

        // Chapter 1
        Chapter chapter1 = new Chapter(
                "- Chapter 1 ------- The ghost at school! -",
                "Matt, Ross, Tina and Parker heard rummors that a spirit, called ''La Chika'', roams an abandoned school at night "
                        +
                        "and now are going to investigate it further. The four went to the school at night, and found a guard at the gate, tina "
                        +
                        "is too scared and wants to go home, Ross wants to talk with the guard and Parker wants to jump over the gate without him noticing it.",
                new Character[] { matt, tina, ross, parker },
                0,
                scan);

        // Choice 1
        Chapter chapter2 = new Chapter(
                "- The fear gets to you all -",
                "You told your friends it's too dangerous and it's time to go home. " +
                        " Party's fear reached it's maximum. " +
                        "" +
                        "End 1 - Try again",
                new Character[] { matt, tina, ross, parker },
                110,
                scan);

        // Choice 2
        Chapter chapter3 = new Chapter(
                "- The guard -",
                "You and Ross went to the guard and asked him if they could enter the school, but he denied and aked you to leave. "
                        +
                        "What are you going to do now ? ",
                new Character[] { matt, tina, ross, parker },
                10,
                scan);

        // Choice 3
        Chapter chapter4 = new Chapter(
                "- The daring move -",
                "You followed Parker to the wall and find a safe spot to jump, you then proced to the interior of the school, it's too dark and only "
                        +
                        "your flashligh's light brigthens the darkness a bit. Tina is afraid, Ross is apprehensive and Parker is excited. You then hear something "
                        +
                        "comming from one of the classrooms, that might be the perfect spot for the Ouija bord you brought to investigate. The whole party is "
                        +
                        "on edge, everyone gained 20 fear points",
                new Character[] { matt, tina, ross, parker },
                20,
                scan);

        // Choice 4
        Chapter chapter5 = new Chapter(
                "- Probably for the best -",
                "It's getting too late and you guys decidade that this is not worth the effort and leave the school, without talking with the ghost."
                        +
                        "Party's fear reached it's maximum" +
                        "" +
                        "End 2 - Try again",
                new Character[] { matt, tina, ross, parker },
                100,
                scan);

        // Choice 5
        Chapter chapter6 = new Chapter(
                "- La Chika -",
                "With the board on the table, you and your friends start calling for the name of the ghost, then, the name Chika is spelled on the"
                        +
                        "board, and, as if that was not enough, a big blue spectral head starts coming out of the board. The scene is scary enough for you"
                        +
                        "and your friends to leave the area screaming in terror. Everyone gained 40 points of fear. " +
                        "" +
                        "End of Chapter 1",
                new Character[] { matt, tina, ross, parker },
                40,
                scan);

        // Choices
        chapter1.choices.add(new Choice("Go home", chapter2));
        chapter1.choices.add(new Choice("Talk with the guard", chapter3));
        chapter1.choices.add(new Choice("Jump with Parker", chapter4));
        chapter3.choices.add(new Choice("Go home", chapter2));
        chapter3.choices.add(new Choice("Jump with Parker", chapter4));
        chapter4.choices.add(new Choice("Go home since it's really late", chapter5));
        chapter4.choices.add(new Choice("Put the Ouija board on one of the chairs", chapter6));

        Chapter one = chapter1;

        // Game Execution
        System.out.println();
        System.out.println("-- Ghost Party --");
        one.display();

        scan.close();
    }
}