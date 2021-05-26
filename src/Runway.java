/**
 * @author Brandon Ly
 */

public class Runway {
    public Plane head;

    public Runway() {
    }

    public Runway(Plane head) {
        this.head = head;
    }

    // iterates through the queue and prints flight numbers
    public void print() {
        // break out if empty loop
        if (this.head == null) {
            System.out.println("Can not print an empty queue. \n\n");
            return;
        }
        // otherwise loop through and print
        for (Plane temp = head; temp != null; temp = temp.link) {
            System.out.print("[" + temp.getFlightNumber() + "]-->");
        }
    }

    public void addToQueue(Plane plane) {
        // if no planes in queue
        if (this.head == null) {
            // set plane to head
            this.head = plane;
            return;
        }
        // if only one plane in queue
        else if (head.link == null) {
            // set next to the plane and quit
            head.link = plane;
            return;
        }

        // iterate to the end of the list
        Plane temp = head;  // temp var
        while (temp.link != null) {
            temp = temp.link;
        }

        // set last nodes link to the plane
        temp.link = plane;
    }
}
