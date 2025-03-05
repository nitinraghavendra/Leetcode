package bs;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target

public class smallest_among_largest{
    public static void main(String[] args) {
        char[] letters = {'a','a','y','y','y'};
        System.out.println(nextGreatestLetter(letters,  'z'));

    }

    
        public static char nextGreatestLetter(char[] letters, char target) {
            int l = 0 ;
            int h = letters.length -1;
            while(l <=h){
                int mid = (l+h)/2;
                
                if(letters[mid] > target){
                    h = mid -1;
                }
                if(letters[mid] < target){
                    l = mid +1;
                }
                if(letters[mid] == target){
                    l = mid +1;
                    h = mid -1;
                    if(l > letters.length -1){
                            return letters[0];
                        }
                    while(letters[l] == target  ){
                        l++;
                        if(l > letters.length -1){
                            return letters[0];
                        }
                    }
                }
                
            }if(l > letters.length -1){
                return letters[0];
            }
            return letters[l];
        }
    }
