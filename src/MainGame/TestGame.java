package MainGame;

public class TestGame {
    public static void main(String[] args)
    {
        System.out.println("This is a test driver!!!");
        String[] tempAccess;

        // West Hanger
        tempAccess = new String[]{"WEST", "EAST"};
        room WestHanger = new room("West Hanger", "Wrench", tempAccess);

        System.out.println(WestHanger);

        // East Hanger
        tempAccess = new String[]{"WEST", "EAST"};
        room EastHanger = new room("East Hanger", "NONE", tempAccess);

        System.out.println(EastHanger);

        // North Taxi
        tempAccess = new String[]{"WEST", "EAST","SOUTH"};
        room NorthTaxi = new room("North Taxi", "NONE", tempAccess);

        // North Runway
        tempAccess = new String[]{"WEST", "EAST","SOUTH"};
        room NorthRunway = new room("North Runway", "NONE", tempAccess);

        //Floor 1
        floor floor1 = new floor("FLOOR 1", 4);
        floor1.addRoom(WestHanger);
        floor1.addRoom(EastHanger);
        floor1.addRoom(NorthTaxi);
        floor1.addRoom(NorthRunway);

        System.out.println(floor1);
    }
}
