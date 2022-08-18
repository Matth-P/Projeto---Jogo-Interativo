public class Character {
    String name;
    int mC;
    int fearFactor;

    public Character(String name,
            int mC,
            int fearFactor) {
        this.name = name;
        this.mC = mC;
        this.fearFactor = fearFactor;
    }

    // Character fear change method
    void Fear(int newFear) {
        this.fearFactor = this.fearFactor + newFear;

        if (this.fearFactor > 100) {
            if (mC == 1) {
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
