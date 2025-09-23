public class RideRequest {
    private int rideId;
    private String passengerName;
    private String pickupLocation;
    private String dropoffLocation;
    private float fare;

    //Parametarized constructor
    public RideRequest(int rideId, String passengerName, String pickupLocation, String dropoffLocation, float fare) {
        this.rideId = rideId;
        this.passengerName = passengerName;
        this.pickupLocation = pickupLocation;
        this.dropoffLocation = dropoffLocation;
        this.fare = fare;
    }

    //Getters
    public int getRideId() { 
        return rideId;
     }

    public String getPassengerName() { 
        return passengerName; 
    }

    public String getPickupLocation() {
         return pickupLocation;
         }

    public String getDropoffLocation() {
         return dropoffLocation;
         }

    public float getFare() {
         return fare; 
        }

        //Setters
        public void setRideId(int rideId) {
           this.rideId = rideId;
      }

        public void setPassengerName(String passengerName) {
          this.passengerName = passengerName;
     }

        public void setPickupLocation(String pickupLocation) {
         this.pickupLocation = pickupLocation;
     }

       public void setDropoffLocation(String dropoffLocation) {
          this.dropoffLocation = dropoffLocation;
     }

       public void setFare(float fare) {
          this.fare = fare;
       }


        //Method to display ride details
    public void display() {
        System.out.println("Ride ID: " + rideId);
        System.out.println("Passenger: " + passengerName);
        System.out.println("From: " + pickupLocation + " To: " + dropoffLocation);
        System.out.println("Fare: R" + fare);
        System.out.println("-----------------------------");
    }
}
