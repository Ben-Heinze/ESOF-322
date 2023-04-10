public class VowelDisplay implements Observer{
    MyStringData data;
    public VowelDisplay(MyStringData data){
        this.data = data;
        data.registerObserver(this);
    }

    public void update(int wordCount, int charCount, int vowelCount, int uppCount, int lowCount) {
        System.out.println("Number of vowels in string: " + vowelCount);
    }
}
