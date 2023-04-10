public class NoWordsDisplay implements Observer{
    MyStringData data;
    public NoWordsDisplay(MyStringData data){
        this.data = data;
        data.registerObserver(this);
    }

    @Override
    public void update(int wordCount, int charCount, int vowelCount, int uppCount, int lowCount) {
        System.out.println("Number of words in string: "+wordCount);
    }
}
