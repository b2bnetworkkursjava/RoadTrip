package pl.b2bnetwork;

import pl.b2bnetwork.util.RoadTripUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RoadTripUtil util = new RoadTripUtil();
        System.out.println(util.countRoadTripWhichAreUnderConstruction());
        System.out.println(util.isAnyRoadUnderConstruction());

        if(true) {
            System.out.println("cokolwiek");

            System.out.println("po ifie");
        }
    }
}
