/**
 * @author Brandon Ly
 */

class Plane {
    private int flightNumber;  // planes flight number
    public Plane link;  // next plane

    // constructor for a plane at the back of a queue
    public Plane(int flightNumber) {
        this.flightNumber = flightNumber;
        this.link = null;
    }

    // constructor for a plane to be put in a specific spot
    public Plane(int flightNumber, Plane nextPlane) {
        this.flightNumber = flightNumber;
        this.link = nextPlane;
    }

    // get the planes flight number
    public int getFlightNumber() {
        return flightNumber;
    }

    // set the planes flight number
    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }
}
