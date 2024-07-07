public class arrays{
    public static void main(String args[]){
        //One-D array
        System.out.println("One-d array:");
        int[] oneDArray = new int[5];

        //Assigning values to array elements
        for(int i=0; i<oneDArray.length; i++){
            oneDArray[i] = i+1;
        }

        //Displaying values of array elements
        for(int i=0; i<oneDArray.length; i++){
            System.out.println("Value at index "+i+" : "+oneDArray[i]);
        }

        //2D array
        System.out.println("two-d array:");
        int[][] twoDArray = new int[3][4];

        //Assigning values to array elements
        for(int i=0; i<twoDArray.length; i++){
            for(int j=0; j<twoDArray[i].length; j++){
                twoDArray[i][j] = i+j+1;
            }
        }

        //Displaying values of array elements
        for(int i=0; i<twoDArray.length; i++){
            for(int j=0; j<twoDArray[i].length; j++){
                System.out.println("Value at index ["+i+"]["+j+"] : "+twoDArray[i][j]);
            }
        }

        //Jagged array
        System.out.println("jagged array:");
        int[][] jaggedArray = new int[3][];

        //Assigning values to array elements
        for(int i=0; i<jaggedArray.length; i++){
            jaggedArray[i] = new int[i+1];
            for(int j=0; j<jaggedArray[i].length; j++){
                jaggedArray[i][j] = i+j+1;
            }
        }
        //Displaying values of array elements
        for(int i=0; i<jaggedArray.length; i++){
            for(int j=0; j<jaggedArray[i].length; j++){
                System.out.println("Value at index ["+i+"]["+j+"] : "+jaggedArray[i][j]);
            }
        }

    }
}