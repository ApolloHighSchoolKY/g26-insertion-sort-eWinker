public class AInsertionSort
{

    public static void main(String[] args)
    {
    	Integer myNumbers[] = {0, 15, 6, 8, 2, 37};
        int temp =0;
        for(int i=0; i<myNumbers.length; i++){
            for(int k=0; k<myNumbers.length-i-1; k++){
                if(myNumbers[k]>myNumbers[k+1]){
                   temp = myNumbers[k+1];
                   myNumbers[k+1] = myNumbers[k];
                   myNumbers[k]=temp;
                }
            }
        }
    

        for (int i = 0; i < myNumbers.length; i++) {
        System.out.print(myNumbers[i] + " ");
        }
    }
}
