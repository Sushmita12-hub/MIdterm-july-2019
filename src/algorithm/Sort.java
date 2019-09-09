package algorithm;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

            for (int j = 1; j <list.length ; j++) {
                int key = array[j];
                int i = j - 1;
                while ((i > -1) && (array[i] > key)) {
                    array[i + 1] = array[i];
                    i--;
                }
                array[i + 1] = key;
            }
            final long endTime = System.currentTimeMillis();
            final long executionTime = endTime - startTime;
            this.executionTime = executionTime;
            return list;
        }


        public int[] bubbleSort(int [] array){
            final long startTime = System.currentTimeMillis();
            int [] list = array;
            //implement here
            int n = array.length;
            for (int i = 0; i < n-1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
            final long endTime = System.currentTimeMillis();
            final long executionTime = endTime - startTime;
            this.executionTime = executionTime;

            return list;
        }









    

    public int [] mergeSort(int [] array,int low,int high){

        final long startTime = System.currentTimeMillis();
        int[] list = array;

        if(low < high) {
            int middle = (low + high)/2;
            mergeSort(array, low, middle);
            mergeSort(array, middle+1, high);
            mergeHalves(array, low, middle, high);
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }




    public void mergeHalves(int[] array, int low, int middle, int high) {
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = middle + 1;
        int k = 0;

        while(left <= middle && right <= high) {
            if(array[left] < array[right]) {
                temp[k] = array[left];
                left++;
            } else {
                temp[k] = array[right];
                right++;
            }
            k++;
        }
        if(left <= middle) {
            while(left <= middle) {
                temp[k] = array[left];
                left++;
                k++;
            }
        } else if(right <= high) {
            while(right <= high) {
                temp[k] = array[right];
                right++;
                k++;
            }
        }
        for(int i = 0; i < temp.length; i++) {
            array[low + i] = temp[i];
        }
    }

//    e = executionTime;
//        return list;
//    }







//    public int[] quickSort(int[] array, int low, int high) {          // quick sort
//        final long startTime = System.currentTimeMillis();
//        int[] list = array;
//        //implement here
//        if (low < high) {
//            int next = partition (array, low, high);
//            quickSort(array, low, next - 1);
//            quickSort(array, next + 1, high);
//        }
//        final long endTime = System.currentTimeMillis();
//        final long executionTime = endTime - startTime;
//        this.executionTime = executionTime;
//        return list;
//    }
//
//
//
//    public int[] heapSort(int[] array) {                           //heap sort
//        final long startTime = System.currentTimeMillis();
//        int[] list = array;
//        //implement here
//        for (int i = array.length - 1; i >= 1; i--) {
//            int temp = array[0];
//            array[0] = array[i];
//            array[i] = temp;
//            heapify(array, i, 0);
//        }
//        final long endTime = System.currentTimeMillis();
//        final long executionTime = endTime - startTime;
//        this.executionTim
//
//
//    ;



    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
