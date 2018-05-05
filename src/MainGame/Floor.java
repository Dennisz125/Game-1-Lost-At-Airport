package MainGame;

public class Floor {

    private String name;
    private Room[] Rooms;
    private String[] roomName;
    private int roomCount = 0;

    public Floor(String name, int length)
    {
        this.name = name;
        Rooms = new Room[length];
        roomName = new String[length];
    }

    public void addRoom(Room newRoom)
    {
        this.Rooms[roomCount] = newRoom;
        roomName[roomCount] = newRoom.getName();
        roomCount++;
    }

    public String toString() {
        System.out.print("Room names in " + name + " are: ");
        for (int x = 0; x < Rooms.length; x++)
        {
            if(x < Rooms.length - 1)
            {
                System.out.print(roomName[x] + ", ");
            }
            else
            {
                System.out.print(roomName[x]);
            }
        }
        return "";
    }
}
