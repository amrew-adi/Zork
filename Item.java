
public class Item {
  String name;
  String description;
  //Creating boolean to check if item is edible or not
  boolean edible;
}

//Subclasses that contain name and description
class Apple extends Item{
  public Apple(){
    name = "Apple";
    description = "A round fruit of a brilliant crimson tint. You could recover some health with this.";
    edible = true;
  }
}

class Dagger extends Item{
  public Dagger(){
    name = "Dagger";
    description = "A small knife with a pointed and edged blade, typically used as a weapon." +
      "\nAttack Boost: +2";
    edible = false;
  }
}

class Sledgehammer extends Item{
  public Sledgehammer(){
    name = "Sledgehammer";
    description = "A large, heavy hammer used for jobs such as breaking rocks. You can carry this with ease thanks to" +
      "\nthe power granted to you by the elder.";
    edible = false;
  }
}

class Journal extends Item{
  public Journal(){
    name = "Journal";
    description = "The journal reads:" +
      "\nJune 24, 942 A.D.," +
      "\n\n\tIt has been over two whole days since I have spoken with another person. I have been stolen away" +
      "\nin my house, cowering in fear of the beast. I can still hear the shrieks. The neighbours... I don't" +
      "\nthink any of them made it. Tybalt, Frederick, all of them... from whence did this foul wretch come?" +
      "\nWhat have we done to deserve such wicked chastisement? Eleanor, my love, I don't think I'll return" +
      "\nin time for our daughter's birthday. I'm sorry, Eleanor, I'm so, so sorry. Oh god. I hear the beast's" +
      "\napproaching footsteps pounding. It's scratching on the door as I write this. Gods, oh heavens, why?" +
      "\nIt's here. Eleanor, hel--" +
      "\n\nThe rest of the page is stained with blood...";
    edible = false;
  }
}

class Pie extends Item{
  public Pie(){
    name = "Pie";
    description = "A delectable pastry. Not freshly baked, but tasty nonetheless. You could recover some health with this.";
    edible = true;
  }
}

class Greaves extends Item{
  public Greaves(){
    name = "Greaves";
    description = "A piece of armour used for protection of the legs." +
      "\nDefence Boost: +2";
    edible = false;
  }
}

class Helm extends Item{
  public Helm() {
    name = "Helm";
    description = "A piece of armour used for protection of the head." +
      "\nDefence Boost: +1";
    edible = false;
  }
}

class Chestplate extends Item {
  public Chestplate() {
    name = "Chestplate";
    description = "A piece of armour used for the protection of the torso." +
      "\nDefence Boost: +3";
    edible = false;
  }
}

class Mushroom extends Item{
  public Mushroom(){
    name = "Mushroom";
    description = "A short fungus found growing by the side of a tree. You could recover some health with this.";
    edible = true;
  }
}

class Acorn extends Item{
  public Acorn(){
    name = "Acorn";
    description = "A smooth, oval-shaped nut. You could recover some health with this.";
    edible = true;
  }
}

class Rapier extends Item{
  public Rapier(){
    name = "Rapier";
    description = "A thin, sharp-pointed sword. You feel immense power holding this weapon." +
      "\nAttack Boost: +4";
    edible = false;
  }
}