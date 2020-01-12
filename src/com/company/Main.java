package com.company;

public class Main {

    private static String wordToChange = "Hhelllloooooooooooooo";
    private static int wordToChangeLength = wordToChange.length();
    private static StringBuffer stringBuffer = new StringBuffer();
    private static int count = 1;


    public static void main(String[] args) {
        starting();
        System.out.print(stringBuffer);
    }


    private static void starting(){
        for(int i = 0; i< wordToChangeLength; i++){
            makeCountOne();
            loopForRepeatingChars(i);
            appendToString(wordToChange.charAt(i));
            appendToString(count);
        }
    }


    private static void loopForRepeatingChars(int i){
        while(i<wordToChangeLength -1 && checkingLetters(i)){
            count++;
            i++;
            updateCount(i);
        }
    }


    private static boolean checkingLetters(int i){
        if(wordToChange.charAt(i) == wordToChange.charAt(i+1)){
            return true;
        }
        return false;
    }


    private static void updateCount(int i){
        if(count >= 10){
            appendToString(wordToChange.charAt(i));
            appendToString(count);
            makeCountOne();

        }
    }


    private static void appendToString(char a){
        stringBuffer.append(a);
    }
    private static void appendToString(int a){
        stringBuffer.append(a);
    }
    private static void makeCountOne(){
        count = 1;
    }


}
