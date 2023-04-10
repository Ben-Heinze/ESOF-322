public class LengthDisplay implements Observer{
    MyStringData data;
    public LengthDisplay(MyStringData data){
        this.data = data;
        data.registerObserver(this);
    }

    public void update(int wordCount, int charCount, int vowelCount, int upperCount, int lowerCount) {
        System.out.println("Length of string: "+charCount);
    }
}
