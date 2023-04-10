public class CaseDisplay implements Observer{
    private MyStringData data;

    public CaseDisplay(MyStringData data){
        this.data = data;
        data.registerObserver(this);
    }

    public void update(int wordCount, int charCount, int vowelCount, int upperCount, int lowerCount) {
        System.out.println("number of lowercase letters in string: "+ lowerCount);
        System.out.println("number of uppercase letters in string: "+upperCount);

    }
}
