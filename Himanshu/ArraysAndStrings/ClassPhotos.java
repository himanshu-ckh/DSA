package Himanshu.ctcci.ArraysAndString;
import java.util.*;

//https://www.algoexpert.io/questions/Class%20Photos
public class ClassPhotos {


    class Program {

        public boolean classPhotos(
                ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
            // Write your code here.
            Collections.sort(redShirtHeights);
            Collections.sort(blueShirtHeights);

            if(redShirtHeights.get(0) > blueShirtHeights.get(0)) {
                for(int i=0; i<redShirtHeights.size(); i++) {
                    if(redShirtHeights.get(i) <= blueShirtHeights.get(i)) {
                        return false;
                    }
                }
            }
            else if(redShirtHeights.get(0) < blueShirtHeights.get(0)) {
                for(int i=0; i<blueShirtHeights.size(); i++) {
                    if(redShirtHeights.get(i) >= blueShirtHeights.get(i)) {
                        return false;
                    }
                }
            }
            else if(redShirtHeights.get(0) == blueShirtHeights.get(0)) {
                return false;
            }
            return true;
        }
    }

}
