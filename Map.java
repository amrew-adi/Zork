
public class Map {
  //Creating 2d array "areas" of type Area
  Area[][] areas = new Area[3][3];
  
  //Variable to hold the current area
  Area location;
  
  //Coordinates for current location
  int x = 0, y = 0;
  
  //Must set all locations to type "Area" because 2d array is of type "Area"
  Area openField = new OpenField();
  Area blackHouse = new BlackHouse();
  Area mountains = new Mountains();
  Area travelersPath = new TravelersPath();
  Area village = new Village();
  Area swamp = new Swamp();
  Area villageShrine = new VillageShrine();
  Area denseForest = new DenseForest();
  Area cave = new Cave();
  
  public Map(){
    
    areas[0][0] = openField;
    areas[0][1] = blackHouse;
    areas[0][2] = mountains;
    areas[1][0] = swamp;
    areas[1][1] = village;
    areas[1][2] = travelersPath;
    areas[2][0] = cave;
    areas[2][1] = denseForest;
    areas[2][2] = villageShrine;
    
    //Setting location variable to current coordinates (default: x & y = 0, openField)
    location = areas[x][y];
  }
  
  public void updateLocation(){
    location = areas[x][y];
    //When location is changed, print description
    location.look();
  }
  
  public void goNorth(){
    if(y < 2){
      y++;
      updateLocation();
    }
    else{
      System.out.println("You cannot go any further north.");
    }
  }
  
  public void goSouth(){
    if(y > 0){
      y--;
      updateLocation();
    }
    else{
      System.out.println("You cannot go any further south.");
    }
  }
  
  public void goEast(){
    if(x < 2){
      x++;
      updateLocation();
    }
    else{
      System.out.println("You cannot go any further east.");
    }
    
  }
  
  public void goWest(){
    if(x > 0){
      x--;
      updateLocation();
    }
    else{
      System.out.println("You cannot go any further west.");
    }
  }
}



