public class Character {

    private String name;
    private Boolean mC;
    private int fearFactor;

    public Character(String name,
            Boolean mC,
            int fearFactor) {
        this.name = name;
        this.mC = mC;
        this.fearFactor = fearFactor;
    }

    // Character fear change method, when the value is bellow 100, it will show the
    // normal character energy, but if it reaches 100, it will show that a either a
    // character "went
    // home" or a game over in case the main character reaches that amount
    public void Fear(int newFear) {
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

    public String getName() {
        return this.name;
    }

    public int getFF() {
        return this.fearFactor;
    }
}
