public class Main {

     public static void main(String[] args) {
	    int number = 25;
        int remainder = number % 2;
        //System.out.println(remainder);
        boolean isPrime = true;

        for (int i=2; i<number;i++ ){
            if (number % i == 0) {
                isPrime = false ;

            }
            }
        if (isPrime==true){
            System.out.println("sayı asaldır");
        }else{
            System.out.println("sayı asal değildir");
        }

        }
    }

