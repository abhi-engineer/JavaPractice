package pattern;

public class Pyramid_1_2 {
        public static void main(String[] args) {

            int row = 4;
            for(int i=1; i<=row; i++){
                for(int j=1; j<=2*row-1; j++){
                    if(j>=row+1-i && j<=row-1+i){   // makes pyramid gives character
                        if(i%2!=0){ // i = Odd
                            if (j % 2 == 0) // j = even
                                System.out.print("1");
                            else            // j = odd
                                System.out.print("2");
                        }
                        else {  // i = even
                            if (j % 2 == 0) // j = even
                                System.out.print("2");
                            else    // j = odd
                                System.out.print("1");
                        }
                    }
                    else
                        System.out.print(" ");  //makes pyramid gives space
                }
                System.out.println();       // next line

            }
        }
    }
