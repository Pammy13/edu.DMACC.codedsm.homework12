package dmacc.codedsm.eduHW16;

//public class Homework16 {
//    private String name;
//    private int address;
//
//    public Homework16( String name, int address ) {
//        this.name = name;
//        this.address = address;
//    }
//}

import com.sun.xml.internal.ws.api.pipe.Engine;

        import java.sql.Driver;

public class Vehicle{
    private Driver driver;
    private Seat[] seatArray;
}

public class Car extends Vehicle{
    private Engine engine;
    private Door[] doors;
}