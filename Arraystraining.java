import java.util.Arrays;

public class Arraystraining {
    public static void main(String[] args) {
        // char vowels[] = new char[5];

        // vowels[0] = 'a';
        // vowels[1] = 'e';
        // vowels[2] = 'i';
        // vowels[3] = 'o';
        // vowels[4] = 'u';

        char vowels[] = {'a', 'e', 'i', 'o', 'u'};

        // replace values in array
        // vowels[2] = 'x';

        // check array length
        // System.out.println(vowels.length);

        // sort an array
        // Arrays.sort(vowels);

        // search for array in value
        // array search only works on sorted arrays
        // int foundindex = Arrays.binarySearch(vowels, 'o');

        // System.out.println(foundindex);

        Arrays.fill(vowels, 'x');

        System.out.println(Arrays.toString(vowels));

    }
}
