import java.util.Random;

public class ArrayThingy {
    public static void main(String[] args) {

        int[][] arrayList = new int[10][20];
        Random random = new Random();

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 20; j++){
                arrayList[i][j] = (random.nextInt(40) - 20);


                System.out.println("("+ i + "," + j + "); " + arrayList[i][j]);
            }

        }

    }

}