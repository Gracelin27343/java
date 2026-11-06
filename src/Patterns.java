public class Patterns {
    public static void main(String[] args){
  //5x5 pattern
        for (int i=1 ; i<=5 ; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
         System.out.println("*" );
        }

        //reverse right tringle
        for (int i=1 ; i<=5 ; i++) {
            for (int j = 1; j <=5-i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // right tringle
        for (int i=1 ; i<=5 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //inverted space right tringle
        for (int i=1 ; i<=5 ; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5 - i+1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        //
        for (int i=1 ; i<=5 ; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("   ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }

            System.out.println();
        }
//numbers
        for (int i=1 ; i<=5 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    //numbers pyramid
        for (int i=0 ; i<=5 ; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print(i+j);
            }
            System.out.println();
        }


        for (int i=0 ; i<=5 ; i++) {
            for(int j=0; j <= 5-i; j++) {
                System.out.print("  ");
            }
                for (int j = 0; j <= i; j++) {
                    System.out.print(" "+i+" " );
                }

            System.out.println();
        }
    }

}
