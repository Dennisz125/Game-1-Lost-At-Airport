package MainGame;

import java.util.Scanner;

public class Game {
    private void makeFloor1()
    {
        String[] tempAccess;
        // West Hanger
        tempAccess = new String[]{"WEST", "EAST"};
        room WestHanger = new room("West Hanger", "Wrench", tempAccess);

        // East Hanger
        tempAccess = new String[]{"WEST", "EAST"};
        room EastHanger = new room("East Hanger", "NONE", tempAccess);

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
    }
    private void makeFloor2()
    {
        String[] tempAccess;
        // Tower
        tempAccess = new String[]{"SOUTH"};
        room Tower = new room("Tower", "Radio", tempAccess);

        // Nothing
        tempAccess = new String[]{};
        room Nothing = new room("Nothing", "NONE", tempAccess);

        // North Middle Taxi
        tempAccess = new String[]{"WEST", "EAST","NORTH", "SOUTH"};
        room NorthMiddleTaxi = new room("North Middle Taxi", "NONE", tempAccess);

        // North Middle Runway
        tempAccess = new String[]{"WEST", "EAST","NORTH", "SOUTH"};
        room NorthMiddleRunway = new room("North Middle Runway", "NONE", tempAccess);

        //Floor 2
        floor floor2 = new floor("FLOOR 2", 4);
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
        room WestHall = new room("West Hall", "NONE", tempAccess);

        // East Hall
        tempAccess = new String[]{"WEST", "EAST", "SOUTH"};
        room EastHall = new room("East Hall", "NONE", tempAccess);

        // Middle Taxi
        tempAccess = new String[]{"WEST", "EAST","NORTH", "SOUTH"};
        room MiddleTaxi = new room("Middle Taxi", "NONE", tempAccess);

        // Middle Runway
        tempAccess = new String[]{"WEST", "EAST","NORTH", "SOUTH"};
        room MiddleRunway = new room("Middle Runway", "NONE", tempAccess);

        //Floor 3
        floor floor3 = new floor("FLOOR 3", 4);
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
        room Nothing = new room("Nothing", "NONE", tempAccess);

        // Passengers' Lounge
        tempAccess = new String[]{"NORTH", "SOUTH"};
        room PassengersLounge = new room("Passengers' Lounge", "NONE", tempAccess);

        // South Middle Taxi
        tempAccess = new String[]{"WEST", "EAST","NORTH", "SOUTH"};
        room SouthMiddleTaxi = new room("South Middle Taxi", "NONE", tempAccess);

        // South Middle Runway
        tempAccess = new String[]{"WEST", "EAST","NORTH", "SOUTH"};
        room SouthMiddleRunway = new room("South Middle Runway", "NONE", tempAccess);

        //Floor 5
        floor floor4 = new floor("FLOOR 4", 4);
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
        room LockedGate = new room("Locked Gate", "NONE", tempAccess);

        // Small Parking Lot
        tempAccess = new String[]{"WEST", "EAST", "NORTH"};
        room SmallParkingLot = new room("Small Parking Lot", "NONE", tempAccess);

        // South Taxi
        tempAccess = new String[]{"WEST", "EAST","NORTH"};
        room SouthTaxi = new room("South Taxi", "NONE", tempAccess);

        // South Runway
        tempAccess = new String[]{"WEST", "EAST","NORTH"};
        room SouthRunway = new room("South Runway", "NONE", tempAccess);

        //Floor 5
        floor floor5 = new floor("FLOOR 5", 4);
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
