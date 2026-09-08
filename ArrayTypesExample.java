public class ArrayTypesExample {
    public static void main(String[] args) {
        int[] oneD = {10, 20, 30, 40, 50};
        System.out.println("1D Array:");
        for (int i = 0; i < oneD.length; i++) {
            System.out.print(oneD[i] + " ");
        }
        int[][] twoD = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("\n\n2D Array:");
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
        int[][][] threeD = {       
            {
                {1, 2},
                {3, 4}
            },
            {
                {5, 6},
                {7, 8}
            }
        };

        System.out.println("\n3D Array:");
        for (int i = 0; i < threeD.length; i++) {
            for (int j = 0; j < threeD[i].length; j++) {
                for (int k = 0; k < threeD[i][j].length; k++) {
                    System.out.print(threeD[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}