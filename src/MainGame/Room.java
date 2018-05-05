package MainGame;

public class Room {

    private String name;
    private String item;
    private String[] accessPoints;

    public Room(String name, String item, String[] accessPoints)
    {
        this.name = name;
        this.item = item;
        this.accessPoints = accessPoints;
    }

    public String getName()
    {
        return name;
    }
    public String toString()
    {
        System.out.print("Room name: " + name + "\nItem: " + item +  "\nAccess Point: ");
        for (int x = 0; x < accessPoints.length; x++)
        {
            System.out.print(accessPoints[x] + " ");
        }
        return "\n";
    }
}
