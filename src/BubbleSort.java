


public class BubbleSort {

    public static void main(String[] args){
        int[] sortArray = {1, 3, 5, 2, 8, 4,  15, 32, 28};

        for (int i=1; i<sortArray.length; i++){
            for (int j=0; j<sortArray.length; j++){
                if (sortArray[j] > sortArray[i]){
                    int tmp = sortArray[i];
                    sortArray[i] = sortArray[j];
                    sortArray[j] = tmp;
                }
            }
        }
        for(int i=0; i<sortArray.length; i++) {
            System.out.print(sortArray[i]+ " ");
        }


    }

}
