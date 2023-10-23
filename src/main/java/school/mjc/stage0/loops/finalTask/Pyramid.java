package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {


        for (int i = 1; i <= cathetusLength; i++) {

            for (int space = 1; space <= cathetusLength - i; space++) {
                System.out.print(" ");
            }
            for (int num = i; num >= 1; num--) {
                System.out.print(num);
            }
            for (int k = 2; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();

        }
    }

        public static void main (String[]args){
            new Pyramid().printPyramid(7);
        }
    }

