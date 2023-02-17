package numbersthread;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumbersThread thread = new NumbersThread(2, 2);
        thread.start();


    }
}
