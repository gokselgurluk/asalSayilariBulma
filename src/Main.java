public class Main {

    public static void main (String[] args){

        boolean primeNumber ;

        for (int i =2 ; i<=100 ; i++){
                primeNumber=true;
            for (int k=2 ;k<=Math.sqrt(i);k++){
               if(i % k ==0) {
                   primeNumber = false;

                   break;
               }
            }
                if(primeNumber) {
                    System.out.println("Asal sayılar: " + i);
                }
        }

    }
}
