public class Main {

    public static void main(String[] args) {

        int sayı1 = 24;
        int sayı2 = 25;
        int sayı3 = 2;
        int enBüyük = sayı1;

        if(enBüyük<sayı2){
            enBüyük=sayı2;
        }


        if(enBüyük<sayı3){
            enBüyük = sayı3;

        }
        System.out.println("En büyük = " +enBüyük);
    }
}
