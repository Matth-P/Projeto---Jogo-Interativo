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
