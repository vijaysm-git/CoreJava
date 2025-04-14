package BinarySearch;

public class SmallestLetters {
    public static void main(String[] args) {
        char[] letters = {'a','b','c','d'};
        char target = 'c';

        SmallestLetters obj = new SmallestLetters();
        char result = obj.nextGreatestLetter(letters,target);


        System.out.println(result);
    }

    public char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;


        while (start <= end) {
            int mid = start + (end - start) / 2;


            if (target < letters[mid]) {
                end = mid - 1;
            }else {
                    start = mid + 1;
                }
            }

        return letters[start % letters.length];

    }
}
