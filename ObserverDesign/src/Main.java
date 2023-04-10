import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str ="";

        MyStringData data = new MyStringData();//data
        NoWordsDisplay words = new NoWordsDisplay(data);//wordcount
        LengthDisplay len = new LengthDisplay(data);// char count
        VowelDisplay vowels = new VowelDisplay(data);//vowel count
        CaseDisplay cases = new CaseDisplay(data);//upper and lowercase count

        do{
            System.out.print("Enter a string:");
            str = sc.nextLine();
            if(str.compareTo("quit")==0)
                break;

            String[] list = str.split(" ");
            int wc = list.length;
            int vowelCount = 0;
            int upperCount = 0;
            int lowerCount = 0;
            String lowerStr = str.toLowerCase();
            for (int i = 0; i < str.length(); i++) {
                if (Character.isUpperCase(str.charAt(i)))
                    upperCount++;
                else if (Character.isLowerCase(str.charAt(i)))
                    lowerCount++;
                char c = lowerStr.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                }
            }

            data.setMeasurements(wc, str.length(), vowelCount, upperCount, lowerCount);
            System.out.println();
        }while(str.compareTo("quit")!=0);
        System.out.println("Goodbye.");



    }
}
