package Arrays;

public class Arrays {
    public static void main(String[] args) {
        int ages [] = {10,20,30,40,50,60,70,80,90,100};
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }

        // Arrays default value
        // String = null
        // int, double , float , long, byte, short = 0
        // boolean = false
        // char = \u0000

        String[] names = new String[3]  ;
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        // Foreach loop
        String fruits [] = {"apple", "banana", "cherry"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Multidimensional Arrays
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }

        int[][] days = new int[12][]        ;
        for (int i = 0; i < days.length; i++) {
            days[i] = new int[31];
        }

    }
}
