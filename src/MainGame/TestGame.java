package MainGame;

public class TestGame {
    public static void main(String[] args)
    {
        System.out.println("This is a test driver!!!");
        String[] tempAccess;

        // West Hangar
        tempAccess = new String[]{"WEST", "EAST"};
        Room westHangar = new Room("West Hangar", "Wrench", tempAccess);

        System.out.println(westHangar);

        // East Hangar
        tempAccess = new String[]{"WEST", "EAST"};
        Room EastHangar = new Room("East Hangar", "NONE", tempAccess);

        System.out.println(EastHangar);

        // North Taxi
        tempAccess = new String[]{"WEST", "EAST","SOUTH"};
        Room NorthTaxi = new Room("North Taxi", "NONE", tempAccess);

        // North Runway
        tempAccess = new String[]{"WEST", "EAST","SOUTH"};
        Room NorthRunway = new Room("North Runway", "NONE", tempAccess);

        //Floor 1
        Floor floor1 = new Floor("FLOOR 1", 4);
        floor1.addRoom(westHangar);
        floor1.addRoom(EastHangar);
        floor1.addRoom(NorthTaxi);
        floor1.addRoom(NorthRunway);

        System.out.println(floor1);
    }
}
