package hu.nive.ujratervezes.zarovizsga.words;

public class Words {

    public static final String NUMBERS = "0123456789";

    public boolean hasMoreDigits (String s){
        int digits = 0;
        int nonDigits = 0;
        for (char currentChar: s.toCharArray()){
            if (NUMBERS.contains(String.valueOf(currentChar))) {
                digits++;
            } else {
                nonDigits++;
            }
        }
        return (digits > nonDigits);
    }
}