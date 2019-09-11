import java.util.Arrays;

public class main {

    public static void main(String[] args) {

        int[] replacement = new int[5];
        for (int i = 0; i < replacement.length; i++) {
            replacement[i] = (int) (Math.random() * 2);
        }
        System.out.println(Arrays.toString(replacement));
        for (int i = 0; i < replacement.length; i++) {
            if (replacement[i] == 0) {
                replacement[i] = 1;
            } else {
                replacement[i] = 0;

            }

        }
        System.out.println(Arrays.toString(replacement));

        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = i * 3;

        }
        System.out.println(Arrays.toString(arr));

        int[] division = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(division));
        for (int i = 0; i < division.length; i++) {
            if (division[i] < 6) {
                division[i] = division[i] * 2;

            }
        }
        System.out.println(Arrays.toString(division));

        int[][] arr2 = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr2[i][i]=1;
                System.out.print("\t" + arr2[i][j]);
            }
            System.out.println();
        }

    }
}
