import java.util.ArrayList;

public class Area {
  String name;
  String description;
  ArrayList<Item> itemsInArea = new ArrayList<>();
  
  
  public Item removeItem(String item){
    //Temporary item to be added to inventory when picked up
    boolean contained = false;
    Item temp = null;
    for(int i = 0; i < itemsInArea.size(); i++){
      //Checking if item requested is in the area (arraylist itemsInArea)
      if(itemsInArea.get(i).name.toLowerCase().equals(item)) {
        temp = itemsInArea.get(i);
        itemsInArea.remove(i);
        contained = true;
      }
    }
    
    if(!contained){
      System.out.println("There is no such item in this area.");
    }
    return temp;
  }
  
  public void addItem(Item itemToAdd){
    itemsInArea.add(itemToAdd);
  }
  
  public void look(){
    System.out.println(description);
    System.out.println("Items in area:");
    if(itemsInArea.size() == 0){
      System.out.println("There are no items in this area.");
    }
    else {
      for (int i = 0; i < itemsInArea.size(); i++) {
        System.out.println(itemsInArea.get(i).name);
      }
    }
  }
  
}

class OpenField extends Area{
  
  Item sledgeHammer = new Sledgehammer();
  Item dagger = new Dagger();
  
  public OpenField(){
    name = "Open Field";
    description = "You find yourself in a vast, open field. " +
      "The faint sounds of birdsong can be heard in the distance." +
      "\nTo the north is a black house and to the east lies a swamp.";
    itemsInArea.add(sledgeHammer);
    itemsInArea.add(dagger);
  }
}

class BlackHouse extends Area{
  
  Item journal = new Journal();
  Item pie = new Pie();
  Item greaves = new Greaves();
  
  public BlackHouse(){
    name = "Black House";
    description = "In the black house, a torn up rug of intricately woven patterns lies in front of you." +
      "There are deep indents in the walls and scratch marks on the floors." +
      "\nTo the north are mountains and to the east is a village.";
    itemsInArea.add(journal);
    itemsInArea.add(pie);
    itemsInArea.add(greaves);
  }
}

class Mountains extends Area{
  
  Item chestplate = new Chestplate();
  
  public Mountains(){
    name = "Mountains";
    description = "Towering mountains block your path. The land around you is a dreary, ravaged sight." +
      " What could have happened here?" +
      "\nTo the south is a black house and to the east is a traveler's path.";
    itemsInArea.add(chestplate);
  }
}

class TravelersPath extends Area{
  
  public TravelersPath(){
    name = "Traveler's Path";
    description = "A long, winding path stretches out before you." +
      "\nA rusted post with two signs indicates the following: to the west are mountains, to the south is a village " +
      "and to the east is a village shrine";
  }
}

class Village extends Area{
  public Village(){
    name = "Village";
    description = "You enter a small, quaint village. A seemingly loquacious villager is standing nearby" +
      "\nMaybe he has something to say." +
      "\nThe community board reads: Welcome to Torigoth Village. To the north is the traveler's path," +
      "\nTo the west is a black house, to the south is a swamp, to the east is a dense forest.";
  }
}

class Swamp extends Area{
  
  Item helm = new Helm();
  
  public Swamp(){
    name = "Swamp";
    description = "An expansive marshland extends for several hundred meters. The sound of cicadas echoes through the swamp." +
      "\nTo the north is a village, to the west is an open field and to the east is a cave.";
    itemsInArea.add(helm);
  }
}

class VillageShrine extends Area{
  public VillageShrine(){
    name = "Village Shrine";
    description = "Ornate wooden pillars envelop a stone pedestal, before which an old man is kneeling." +
      "\nThis man seems to be the village elder. You should probably address him as such." +
      "\nTo your west is a traveler's path and to the south is a dense forest.";
  }
}

class DenseForest extends Area{
  
  Item mushroom = new Mushroom();
  Item acorn = new Acorn();
  
  public DenseForest(){
    name = "Dense Forest";
    description = "Soaring trees of many different types permeate the forest." +
      "\nBroken branches litter the area. It would appear as if something tore through the forest..." +
      "\nFlora doesn't seem to flourish here, but some wildflowers and shrubs can be seen." +
      "\nTo the north is a village shrine, to the west is a village and to the south is a cave.";
    itemsInArea.add(mushroom);
    itemsInArea.add(acorn);
  }
}

class Cave extends Area{
  
  public Cave() {
    name = "Cave";
    description = "An immense boulder blocks the entrance to the cave. Perhaps a tool of some sort could be used to" +
      " break it.";
    
  }
}