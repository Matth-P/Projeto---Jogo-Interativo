public class Character {
    String name;
    Boolean mC;
    int fearFactor;
    public Object characters;

    public Character(String name,
            Boolean mC,
            int fearFactor) {
        this.name = name;
        this.mC = mC;
        this.fearFactor = fearFactor;
    }

    // Character fear change method, when the value is bellow 100, it will showthe
    // normal character
    // energy, but if it reaches 100, it will show that a either a character "went
    // home" or a game
    // over in case the main character reaches that amount
    void Fear(int newFear) {
        this.fearFactor = this.fearFactor + newFear;

        if (this.fearFactor >= 100) {
            if (mC == true) {
                this.fearFactor = 100;
                System.out.println("Max Fear!!!");
                System.out.println("Game Over");
                System.out.println();
            } else {
                this.fearFactor = 100;
                System.out.println("Max Fear!!!");
                System.out.println("This character went home");
                System.out.println();

            }
        } else if (this.fearFactor < 0) {
            this.fearFactor = 0;
        }
    }
}
