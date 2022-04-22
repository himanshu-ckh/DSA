import java.util.*;

class GenerateDocument {

    public boolean generateDocument(String characters, String document) {
        // Write your code here.
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0; i<characters.length(); i++) {
            if(map.containsKey(characters.charAt(i))) {
                map.put(characters.charAt(i), map.get(characters.charAt(i)) + 1);
            }
            else {
                map.put(characters.charAt(i), 1);
            }
        }

        for(int j=0; j<document.length(); j++) {
            if(map.containsKey(document.charAt(j)) == false) {
                return false;
            }
            else {
                if(map.get(document.charAt(j)) <= 0) {
                    return false;
                }
                map.put(document.charAt(j), map.get(document.charAt(j)) - 1);
            }
        }
        return true;
    }
}
