class ContainsDuplicateInAnArray {
    public boolean containsDuplicate(int[] nums) {

        //Create a set in java
        /*
        Functions are -
        1. .contains() -> To find the numbers if it is present in the hashset
        2. add() ->  To add an element in the hashset
         */
        Set<Integer> hset = new HashSet<Integer> ();
        for(int i=0; i<nums.length; i++) {
            if(hset.contains(nums[i])) {
                return true;
            }
            else {
                hset.add(nums[i]);
            }
        }
        return false;
    }
}