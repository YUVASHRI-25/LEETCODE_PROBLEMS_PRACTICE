class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        
        int index = -1;

        for(int i = 0; i < capacity.length; i++) {

            if(capacity[i] >= itemSize) {

                if(index == -1 || capacity[i] < capacity[index]) {
                    index = i;
                }

            }
        }

        return index;
    }
}