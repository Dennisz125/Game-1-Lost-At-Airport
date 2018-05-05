# Game-1-Lost-At-Airport
This is Java version of my old Python, text-based game.

Story:
    You fly a plane, plane got engine problem, you made emergency landing on abandoned airport, very far away from civilisation, you must
find something to help you to get back to civilisation.

Compass:
     N
     ^
W <--|--> E
     v
     S

Map layout(top-down view):
Key:
'|' = Room's border
'<' = Player can go left of the room
'>' = "       "   " right "  "   "
'^' = "       "   " up(north) "  "   "
'V' = "       "   " down(south) "  "   "

West Hanger  >|< East Hanger          >|< Taxi North          V>|<V Runway North V              FLOOR 1
--------------|------------------------|                        |
V Tower      V| Nothing                |^V Taxi Middle North V^>|<^V Runway Middle North V^     FLOOR 2
              |------------------------|                        |
^ West Hall ^>|<V East Hall          V>|<^V Taxi Middle      V^>|<^V Runway Middle V^           FLOOR 3
--------------|                        |                        |
Nothing       |^V Passengers' Lounge V^|^V Taxi Middle South V^>|<^V Runway Middle South V^     FLOOR 4
--------------|                        |                        |
Locked Gate  >|<^ Small Parking Lot  ^>|<^ Taxi South         ^>|<^ Runway South ^              FLOOR 5

ROOM 1                ROOM 2                ROOM 3                      ROOM 4