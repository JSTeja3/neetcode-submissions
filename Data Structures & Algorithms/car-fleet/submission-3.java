class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[0]-a[0]);
        //Deque<Double> carFleet = new ArrayDeque<>();
        int fleets = 1;
        for(int i=0; i<position.length; i++){
            pq.offer(new int[]{position[i], speed[i]});
        }
        int[] temp = pq.poll();
        double prevTime = (double)(target-temp[0])/temp[1];
        while(!pq.isEmpty()){
            temp = pq.poll();
            double currTime = (double)(target-temp[0])/temp[1];
            if(prevTime<currTime){
                fleets++;
                prevTime = currTime;
            }
        }
        return fleets;
    }
}
