public class Character {
    String name;
    int fearFactor;
    
    public Character(String name,
                     int fearFactor)
    {
        this.name = name;
        this.fearFactor = fearFactor;
    }

    void Fear(int newFear) {
        this.fearFactor = this.fearFactor + newFear;
        
        if(this.fearFactor > 100)
        {
            this.fearFactor = 100;
            System.out.println("Max Fear!!!");
        }
        else if(this.fearFactor < 0)
        {
            this.fearFactor = 0;
        }
    }

              
}
