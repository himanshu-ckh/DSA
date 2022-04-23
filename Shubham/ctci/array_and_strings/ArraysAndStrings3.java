package ctci.array_and_strings;

/*
    Urlify a string
    "Mr John Smith    ", 13
    "Mr John  %20Smith"
           ^ ^
    "Mr John  %20Smith"
           ^^
           il
    "a b   ", 3
    "a b%20", 3

 */
public class ArraysAndStrings3 {
    /**
     * This method is brute force because it uses extra space
     * Time: O(n)
     * Space: O(n)
     */
    public static char[] urlifyBruteforce(char[] str, int trueLength) {
        char[] res = new char[str.length];

        int j = 0;
        for (int i = 0; i < trueLength; i++) {
            char current = str[i];
            if (current == ' ') {
                res[j] = '%';
                res[j+1] = '2';
                res[j+2] = '0';
                j = j+3;
            } else {
                res[j] = current;
                j++;
            }
        }

        return res;
    }

    /**
     * This method doesnt use extra space and does in place
     * Time: O(n)
     * Space: O(1)
     */
    public static char[] urlify(char[] str, int trueLength) { //"Mr John Smith    ", 13
        int spaces = 0;
        for (int i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                spaces++;
            }
        }

        int lastValidIndex = trueLength + (spaces*2);

        for (int i = trueLength - 1; i >= 0; i--) {
            if (str[i] != ' ') {
                str[lastValidIndex-1] = str[i];
                lastValidIndex--;
            } else {
                str[lastValidIndex-1] = '0';
                str[lastValidIndex-2] = '2';
                str[lastValidIndex-3] = '%';
                lastValidIndex = lastValidIndex - 3;
            }
        }

        return str;
    }

    public static void main(String[] args) {
        System.out.println(urlifyBruteforce(new char[]{'M', 'r', ' ', 'J', 'o', 'h', 'n', ' ', 'S', 'm', 'i', 't', 'h', ' ', ' ', ' ', ' '}, 13));
        System.out.println(urlify(new char[]{'M', 'r', ' ', 'J', 'o', 'h', 'n', ' ', 'S', 'm', 'i', 't', 'h', ' ', ' ', ' ', ' '}, 13));

    }

}
