//Maura Godfrey
// Feb 5 2016
// cse 002
// Cyclometer program
// cyclometer records time elapsed in seconds and number of rotations of the front wheel

// for two trips print
    // A. number of minutes per trip
    // B. number of counts for trip
    // C. distance of each trip
    // D. distance of both trips combined

public class Cyclometer {
    //main method required for every Java program
    public static void main(String[] args) {
        //input data
        int secsTrip1=480; // # of seconds of first trip
        int secsTrip2=3220; // # of seconds of second trip
        int countsTrip1=156; // # of counts for first trip
        int countsTrip2=9037; // # of counts for second trip
        
        //intermediate variables and output data
        double wheelDiameter=27.0, // wheel diameter in inches
        PI=3.14159, //pi- to be used to calculate circumference of wheel
        feetPerMile=5280, // used to convert distance of trip to miles
        inchesPerFoot=12, //used to convert inches to feet
        secondsPerMinute=60; // used to convert seconsd to minutes
        double distanceTrip1, distanceTrip2, totalDistance; // declaring that when the distances are calculated they will be doubles
        
        //Parts A and B
        System.out.println("Trip 1 took "+
            (secsTrip1/secondsPerMinute)+" minutes and had "+
            countsTrip1+" counts.");
        
        System.out.println("Trip 2 took "+
            (secsTrip2/secondsPerMinute)+" minutes and had "+
            countsTrip2+" counts.");
        //things in quotes need to be on the same line
        
        // Parts C and D
        //run calculations and store values
        distanceTrip1=countsTrip1*wheelDiameter*PI; //distance in inches per count since circumference= PI*diameter
        distanceTrip1/=inchesPerFoot*feetPerMile; //converts distanceTrip 1 to miles
        distanceTrip2=countsTrip2*wheelDiameter*PI;
        distanceTrip2/=inchesPerFoot*feetPerMile;  // same as above for trip 2
        totalDistance=distanceTrip1+distanceTrip2;
        
        //printing the data
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
        
        
        
    } //end of main method
} //end of class