import java.util.Scanner;

public class MyScanner
{
    public void run() {
        Scanner scanner = new Scanner(System.in).useDelimiter(",");
        while (true) { // loop continues to run while conditions are true
            if (scanner.hasNext()) { // If input has a next token lines 9 & 10 apply
                String str = scanner.next(); // stores data as string and reads data
                System.out.println(str); // prints out the tokens seperated by delimiter (",")
            }
        }
    }

    public static void main(String[] args) {
        MyScanner myScanner = new MyScanner();
        myScanner.run();
    }
}

