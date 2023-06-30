/**
 * created by James on 6/30/23
 **/
public class TwoDArray {

    /*
    Declaring 2D Array
        int arr[max_rows][max_columns]

    Mapping 2d Array to 1D arrays
        1. Row Major Ordering
        2. Column Major Ordering
     */

    //Declaration
    int[][] twoD = new int[5][5];

    //Row Major Ordering
    public void rowOrdering(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.println(array[i][j]);
            }
        }
    }
    //Column Major Ordering
    public void columnOrdering(int[][] array){
        int rows = array.length;
        int columns = array[0].length;
        int[] mappedArray = new int[rows * columns];
        int index = 0;

        for(int col = 0; col < columns; col++){
            for(int row = 0; row< rows; row++){
                mappedArray[index] = array[row][col];
                index++;
            }
        }

        //Display
        for(int element : mappedArray){
            System.out.println(element + " ");
        }
    }
}
