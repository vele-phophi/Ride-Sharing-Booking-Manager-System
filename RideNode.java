public class RideNode {
    RideRequest data;
    RideNode next;

    public RideNode(RideRequest data) {
        this.data = data;
        this.next = null;
    }
}
