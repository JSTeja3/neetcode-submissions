class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[0]-a[0]);
        Deque<Double> carFleet = new ArrayDeque<>();
        for(int i=0; i<position.length; i++){
            pq.offer(new int[]{position[i], speed[i]});
        }
        while(!pq.isEmpty()){
            int[] car = pq.poll();
            double t = (double)(target-car[0])/car[1];
            if(carFleet.isEmpty() || carFleet.peek()<t){
                carFleet.push(t);
            }
        }
        return carFleet.size();
    }
}
