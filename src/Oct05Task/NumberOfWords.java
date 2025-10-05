package Oct05Task;

public class NumberOfWords {
    public static void main(String[] args) {
        String str="Here is your string to validate the number of words.";
        String [] splitStr=str.split(" ");
        int len=splitStr.length;
        System.out.println("total number of words in string is: "+len);
        for (int i = 0; i < len; i++) {
            System.out.println("first letter of each word is:"+splitStr[i].charAt(0));
        }

    }
}
