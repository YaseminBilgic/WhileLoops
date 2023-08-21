package whileloops;

public class WhileLoops06 {
    public static void main(String[] args) {



        for (int i = 1; i <10 ; i=i+1) {
            if (i%3==0) {
                System.out.print(i + "");
            }
        }

        /*
        //A :
        int num=3;
        while (num<10){
            System.out.print(num+"");
            num=num+3;
        }
        /*
        //B :
        int num=1;
        while (num<10){
            if (num%3==0){
                System.out.print(num+"");
            }
            num=num+1;
        }

         */

        /*
        //C :
        int num=9;
        while (num>1){
            System.out.print(num+"");
            num=num-3;
        }

         */

    }
}
