package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int i=0; i<cathetusLength; i++) {
            for(int j=(cathetusLength-i)-2; j>=0; j--)
            {
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++)
            {
                // printing stars
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
