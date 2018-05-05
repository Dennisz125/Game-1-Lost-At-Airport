package MainGame;

import java.util.Scanner;

public class Game {
    private void makeFloor1()
    {
        String[] tempAccess;
        // West Hanger
        tempAccess = new String[]{"WEST", "EAST"};
        Room WestHanger = new Room("West Hanger", "Wrench", tempAccess);

        // East Hanger
        tempAccess = new String[]{"WEST", "EAST"};
        Room EastHanger = new Room("East Hanger", "NONE", tempAccess);

        // North Taxi
        tempAccess = new String[]{"WEST", "EAST","SOUTH"};
        Room NorthTaxi = new Room("North Taxi", "NONE", tempAccess);

        // North Runway
        tempAccess = new String[]{"WEST", "EAST","SOUTH"};
        Room NorthRunway = new Room("North Runway", "NONE", tempAccess);

        //Floor 1
        Floor floor1 = new Floor("FLOOR 1", 4);
        floor1.addRoom(WestHanger);
        floor1.addRoom(EastHanger);
        floor1.addRoom(NorthTaxi);
        floor1.addRoom(NorthRunway);
    }
    private void makeFloor2()
    {
        String[] tempAccess;
        // Tower
        tempAccess = new String[]{"SOUTH"};
        Room Tower = new Room("Tower", "Radio", tempAccess);

        // Nothing
        tempAccess = new String[]{};
        Room Nothing = new Room("Nothing", "NONE", tempAccess);

        // North Middle Taxi
        tempAccess = new String[]{"WEST", "EAST","NORTH", "SOUTH"};
        Room NorthMiddleTaxi = new Room("North Middle Taxi", "NONE", tempAccess);

        // North Middle Runway
        tempAccess = new String[]{"WEST", "EAST","NORTH", "SOUTH"};
        Room NorthMiddleRunway = new Room("North Middle Runway", "NONE", tempAccess);

        //Floor 2
        Floor floor2 = new Floor("FLOOR 2", 4);
        floor2.addRoom(Tower);
        floor2.addRoom(Nothing);
        floor2.addRoom(NorthMiddleTaxi);
        floor2.addRoom(NorthMiddleRunway);
    }
    private void makeFloor3()
    {
        String[] tempAccess;
        // West Hall
        tempAccess = new String[]{"EAST", "NORTH"};
        Room WestHall = new Room("West Hall", "NONE", tempAccess);

        // East Hall
        tempAccess = new String[]{"WEST", "EAST", "SOUTH"};
        Room EastHall = new Room("East Hall", "NONE", tempAccess);

        // Middle Taxi
        tempAccess = new String[]{"WEST", "EAST","NORTH", "SOUTH"};
        Room MiddleTaxi = new Room("Middle Taxi", "NONE", tempAccess);

        // Middle Runway
        tempAccess = new String[]{"WEST", "EAST","NORTH", "SOUTH"};
        Room MiddleRunway = new Room("Middle Runway", "NONE", tempAccess);

        //Floor 3
        Floor floor3 = new Floor("FLOOR 3", 4);
        floor3.addRoom(WestHall);
        floor3.addRoom(EastHall);
        floor3.addRoom(MiddleTaxi);
        floor3.addRoom(MiddleRunway);
    }
    private void makeFloor4()
    {
        String[] tempAccess;
        // Nothing
        tempAccess = new String[]{};
        Room Nothing = new Room("Nothing", "NONE", tempAccess);

        // Passengers' Lounge
        tempAccess = new String[]{"NORTH", "SOUTH"};
        Room PassengersLounge = new Room("Passengers' Lounge", "NONE", tempAccess);

        // South Middle Taxi
        tempAccess = new String[]{"WEST", "EAST","NORTH", "SOUTH"};
        Room SouthMiddleTaxi = new Room("South Middle Taxi", "NONE", tempAccess);

        // South Middle Runway
        tempAccess = new String[]{"WEST", "EAST","NORTH", "SOUTH"};
        Room SouthMiddleRunway = new Room("South Middle Runway", "NONE", tempAccess);

        //Floor 5
        Floor floor4 = new Floor("FLOOR 4", 4);
        floor4.addRoom(Nothing);
        floor4.addRoom(PassengersLounge);
        floor4.addRoom(SouthMiddleTaxi);
        floor4.addRoom(SouthMiddleRunway);
    }
    private void makeFloor5()
    {
        String[] tempAccess;
        // Locked Gate
        tempAccess = new String[]{"EAST"};
        Room LockedGate = new Room("Locked Gate", "NONE", tempAccess);

        // Small Parking Lot
        tempAccess = new String[]{"WEST", "EAST", "NORTH"};
        Room SmallParkingLot = new Room("Small Parking Lot", "NONE", tempAccess);

        // South Taxi
        tempAccess = new String[]{"WEST", "EAST","NORTH"};
        Room SouthTaxi = new Room("South Taxi", "NONE", tempAccess);

        // South Runway
        tempAccess = new String[]{"WEST", "EAST","NORTH"};
        Room SouthRunway = new Room("South Runway", "NONE", tempAccess);

        //Floor 5
        Floor floor5 = new Floor("FLOOR 5", 4);
        floor5.addRoom(LockedGate);
        floor5.addRoom(SmallParkingLot);
        floor5.addRoom(SouthTaxi);
        floor5.addRoom(SouthRunway);
    }
    public static void main(String[] args)
    {
        Game mainGame = new Game();
        System.out.println("Hello, there should be a story");
        mainGame.makeFloor1();
        mainGame.makeFloor2();
        mainGame.makeFloor3();
        mainGame.makeFloor4();
        mainGame.makeFloor5();

        Scanner input = new Scanner(System.in);


        System.out.print("This is end of the game");
    }
}
