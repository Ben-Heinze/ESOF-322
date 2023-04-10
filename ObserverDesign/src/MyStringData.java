import java.util.ArrayList;
import java.util.List;

public class MyStringData implements Subject {

    private List<Observer> observers;
    private int wordCount;
    private int charCount;
    private int vowCount;
    private int upperCount;
    private int lowerCount;


    public MyStringData(){
        observers = new ArrayList<Observer>();
    }


    public void registerObserver(Observer o) {
        observers.add(o);
    }
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    public void notifyObserver() {
        for (Observer o: observers) {
            o.update(wordCount, charCount, vowCount, upperCount, lowerCount);//upperCount, lowerCount
        }
    }


    public void measurementsChanged(){ notifyObserver();}

    public void setMeasurements(int wc, int cc, int vc, int uc, int lc){
        this.wordCount = wc;
        this.charCount = cc;
        this.vowCount = vc;
        this.upperCount = uc;
        this.lowerCount = lc;
        measurementsChanged();
    }

    public int getWordCount(){ return wordCount;}
    public int getCharCount(){ return charCount;}
    public int getVowCount() { return vowCount;}
    public int getUpperCount(){ return upperCount;}
    public int getLowerCount(){ return lowerCount;}


}
