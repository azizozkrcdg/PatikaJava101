public class Main {
    public static void main(String[] args) {
        String[][] arr = new String[5][3];

        for (int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j < arr[i].length; j++){
                if (i == 0 || i == 2){
                    arr[i][j] = " * ";
                }else if (i == 4){
                    arr[i][j] = " * ";
                }else if (j == 0){
                    arr[i][j] = " * ";
                }else {
                    arr[i][j] = "  ";
                }
            }
        }
        for (String[] row : arr){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j < arr[i].length; j++){
                if (i == 0 || i == 2){
                    arr[i][j] = " * ";
                }else if (i == 4){
                    arr[i][j] = " * ";
                }else if (j == 0){
                    arr[i][j] = " * ";
                }else if (i == 3 && j == 2){
                    arr[i][j] = "    * ";
                }else {
                    arr[i][j] = "  ";
                }

                if (i == 3 && j == 0){
                    arr[i][j] = " ";
                }
            }
        }
        for (String[] row : arr){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
