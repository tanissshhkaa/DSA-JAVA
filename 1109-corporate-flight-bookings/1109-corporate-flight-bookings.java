class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] ls=new int[n];
        for(int[] booking:bookings){
            int firstFlight=booking[0];
            int lastFlight=booking[1];
            int noOfSeats=booking[2];
            for(int i=firstFlight-1; i<=lastFlight-1;i++){
                ls[i]=ls[i]+noOfSeats;
            }
        }
        return ls;
    }
}