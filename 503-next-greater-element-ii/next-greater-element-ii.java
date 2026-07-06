class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {

            ans[i] = -1;

            for (int j = 1; j < n; j++) {

                int index = (i + j) % n;

                if (nums[index] > nums[i]) {
                    ans[i] = nums[index];
                    break;
                }
            }
        }

        return ans;
    }
}
/*int n=nums.length;
int[] res=new int[n];
Arrays.fill(res,-1);
Stack<Integer>stack=new Stack();
for(int i=0;i<2*n;i++)
{
  while(!stack.empty()&& nums[stack.peek()]<nums[i%n])
    res[stack.pop()]=nums[i%n];
  stack.push(i%n);
}
return res
*/