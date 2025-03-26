public class Sorting {
    
    public static void main(String[] args) {
        
        int array[] = {2,3,4,1,0,56,45,32,12,56};

        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i] > array[j]){
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }

        System.out.println("Array after sorting :");

        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
