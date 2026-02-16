class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] ls=new int[n];
        for(int[] booking:bookings){
            int firstFlight=booking[0];
            int lastFlight=booking[1];
            int noOfSeats=booking[2];
            ls[firstFlight-1]=ls[firstFlight-1]+noOfSeats;
            if(lastFlight<n){
            ls[lastFlight]=ls[lastFlight]-noOfSeats;
            }
        }
         for (int i = 1; i < n; i++) {
            ls[i] += ls[i - 1];
        }
        return ls;
    }
}