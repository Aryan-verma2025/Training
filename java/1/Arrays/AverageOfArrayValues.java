class AverageOfArrayValues{
    public static void main(String[] args) {

        int array[] = {3,4,5,6,7,1,2,3,98,34};
        int len = array.length;
        int sum =0;

        for(int i=0;i<len;i++){
            sum += array[i];
        }

        float avg = sum/len;

        System.out.println("The average is : "+avg);

    }
}