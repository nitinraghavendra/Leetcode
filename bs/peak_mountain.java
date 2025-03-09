package bs;
class peakIndexInMountainArray{
   int peakIndexInMountainArray(int[] arr) {
    int l = 0;
    int h = arr.length-1;
    while(l <=h){
        int mid = (l+h)/2;
        
        if(arr[mid+1] < arr[mid] &&  arr[mid]> arr[mid-1]){
            return mid;

        }
        
        if( arr[mid]>arr[mid-1]){
            l = mid+1;

        }
        
        if( arr[mid]<arr[mid-1]){
            h = mid;

        }
    
}
    return 0;

    }
}