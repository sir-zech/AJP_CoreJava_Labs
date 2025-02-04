class NumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

class AlphabetThread extends Thread {
    public void run() {
        for (char c = 'A'; c <= 'J'; c++) {
            System.out.println(c);
        }
    }
}

public class MultithreadingWithMultipleTasks {
    public static void main(String[] args) {
        NumberThread numberThread = new NumberThread();
        AlphabetThread alphabetThread = new AlphabetThread();

        numberThread.start();
        alphabetThread.start();
    }
}

/* Output:
1
A
2
B
3
C
4
D
5
E
6
F
7
G
8
H
9
I
10
J
*/
