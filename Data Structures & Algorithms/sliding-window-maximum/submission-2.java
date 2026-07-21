class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] maxList = new int[n-k+1];
        Deque<Integer> queue = new ArrayDeque<>();
        int p1=0; 
        int p2=0;
        int l=0;
        while(p2<n){
            while(!queue.isEmpty() && (nums[p2]>nums[queue.peekLast()])){
                queue.removeLast();
            }
            queue.addLast(p2);
            if(p2>=k-1){
                maxList[l++]=nums[queue.peekFirst()];
                p1++;
                if(p1>queue.peekFirst()){
                    queue.removeFirst();
                }
            }
            p2++;
        }
        return maxList;
    }
}
