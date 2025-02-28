//Find Numbers with Even Number of Digits and output the noof them 
public class evendigits {
    public static void main(String[] args) {
        int[] arr = {15 , 22 ,3423,5 ,35456,25,267,23,12,3};
        System.out.println(evendigits(arr));
    }

    public static int evendigits(int[] arr){
        
        int digitcount = 0 ;
        for(int i = 0 ; i < arr.length; i++){
            int count = 0 ;
            int temp = arr[i];
            while(temp>0){
                temp = temp/10;
                count++;
                
            }
            if(count%2==0){
                digitcount++;

            }

        }



        return digitcount;

    }



}