package at.htl.examples;

public class
HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(FizzBuzz(3));
    }

    public static String FizzBuzz(int num){
        if(num % 3 == 0 && num % 5 == 0){
            return "FizzBuzz";
        }
        else if(num % 3 == 0){
            return "Fizz";
        }
        else if(num % 5 == 0){
            return "Buzz";
        }
        else{
            return String.valueOf(num);
        }
    }
}
