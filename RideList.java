import java.util.ArrayList;

public class RideList {
    private RideNode head;

    public void insertAtEnd(RideRequest ride) {
        RideNode newNode = new RideNode(ride);
        if (head == null) {
            head = newNode;
        } else {
            RideNode current = head;
            while (current.next != null) current = current.next;
            current.next = newNode;
        }
    }

    public void deleteById(int id) {
        if (head == null) return;
        if (head.data.getRideId() == id) {
            head = head.next;
            return;
        }
        RideNode current = head;
        while (current.next != null && current.next.data.getRideId() != id) {
            current = current.next;
        }
        if (current.next != null) current.next = current.next.next;
    }

    public RideRequest searchById(int id) {
        RideNode current = head;
        while (current != null) {
            if (current.data.getRideId() == id) return current.data;
            current = current.next;
        }
        return null;
    }

    public void displayAll() {
        RideNode current = head;
        while (current != null) {
            current.data.display();
            current = current.next;
        }
    }

    public void sortByFare() {
        ArrayList<RideRequest> rides = new ArrayList<>();
        RideNode current = head;
        while (current != null) {
            rides.add(current.data);
            current = current.next;
        }

        for (int i = 1; i < rides.size(); i++) {
            RideRequest key = rides.get(i);
            int j = i - 1;
            while (j >= 0 && rides.get(j).getFare() > key.getFare()) {
                rides.set(j + 1, rides.get(j));
                j--;
            }
            rides.set(j + 1, key);
        }

        for (RideRequest ride : rides) {
            ride.display();
        }
    }

    public void printReverse(RideNode node) {
        if (node == null) return;
        printReverse(node.next);
        node.data.display();
    }

    public float totalFare(RideNode node) {
        if (node == null) return 0;
        return node.data.getFare() + totalFare(node.next);
    }

    public RideNode getHead() {
        return head;
    }
}

