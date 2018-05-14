package MainGame;

public class floor {

    private String name;
    private room[] rooms;
    private String[] roomName;
    private int roomCount = 0;

    public floor(String name, int length)
    {
        this.name = name;
        rooms = new room[length];
        roomName = new String[length];
    }

    public void addRoom(room newRoom)
    {
        this.rooms[roomCount] = newRoom;
        roomName[roomCount] = newRoom.getName();
        roomCount++;
    }

    public String toString() {
        System.out.print("Room names in " + name + " are: ");
        for (int x = 0; x < rooms.length; x++)
        {
            if(x < rooms.length - 1)
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
