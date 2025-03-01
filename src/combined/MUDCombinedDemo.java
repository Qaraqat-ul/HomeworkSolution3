package combined;

import builder.SimpleDungeonBuilder;
import builder.Dungeon;
import prototype.Room;
import prototype.NPC;

public class MUDCombinedDemo {
    public static void main(String[] args) {
        
        Room originalRoom = new Room("Entrance", "A dark and scary entrance");
        Room treasureRoom = new Room("Treasure Room", "A hidden chamber full of gold");
        
        Dungeon dungeon = new SimpleDungeonBuilder()
            .setDungeonName("Mystery Dungeon")
            .addRoom(originalRoom)
            .addRoom(treasureRoom)
            .addNPC(new NPC("Goblin", "Enemy"))
            .addNPC(new NPC("Dragon", "Boss"))
            .build();

        
        Room clonedRoom1 = originalRoom.clone();
        Room clonedRoom2 = originalRoom.clone();
        clonedRoom1 = new Room(clonedRoom1.getName() + " Clone #1", clonedRoom1.getDescription());
        clonedRoom2 = new Room(clonedRoom2.getName() + " Clone #2", clonedRoom2.getDescription());

        
        dungeon = new SimpleDungeonBuilder()
            .setDungeonName(dungeon.getName())
            .addRoom(originalRoom)
            .addRoom(clonedRoom1)
            .addRoom(clonedRoom2)
            .addRoom(treasureRoom)
            .addNPC(new NPC("Goblin", "Enemy"))
            .addNPC(new NPC("Dragon", "Boss"))
            .build();

        
        System.out.println(dungeon);
    }
}
