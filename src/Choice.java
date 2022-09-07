
// Choice class, it will advance to the next chapter, besed on the choice the chapter is bound,
// for instance, if the user chooses choice 2, and since choice 2 is bound to chapter 4, it 
// will lead to chapter 4
public class Choice {
    private String text;
    private Chapter nextChapter;

    public Choice(String text,
            Chapter nextChapter) {
        this.text = text;
        this.nextChapter = nextChapter;
    }

    public String getT()
    {
    return this.text;
    }

    public Chapter getNext()
    {
    return this.nextChapter;
    }
}
