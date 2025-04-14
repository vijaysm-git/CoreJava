package BinarySearch;

public class SmallestLetters {
    public char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;


        while (start <= end) {
            int mid = start + (end - start) / 2;


            if (target < letters[mid]) {
                end = mid - 1;

                elseif {
                    start = mid + 1;
                }
        else{
                    return mid;
                }
            }
        }

    } return start;

    }
}
