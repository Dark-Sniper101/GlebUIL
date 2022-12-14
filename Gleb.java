import java.util.*;
import java.awt.geom.Ellipse2D;
import java.io.*;

public class Gleb{
  
  public static HashMap<String, Integer> map = new HashMap<>();
  public static HashMap<Integer, String> Map = new HashMap<>();
  
  public static void main(String[] args) throws FileNotFoundException{
    Scanner in;
    in = new Scanner(new File("gleb.dat"));
    configMap();
    String[] music;
    while(in.hasNextLine()){
      String text = in.nextLine();
      music = text.split(" ");
      int place = map.get(music[0]);
      System.out.print(music[0]);
      for(int i = 1; i < music.length; i++){
        int currentInt = Integer.parseInt(music[i]);
        if(currentInt<0)
          place += currentInt+1;
        else
          place += currentInt-1;
        music[i] = ""+Map.get(place);
        System.out.print(" "+music[i]);
      }
      System.out.println("");
    }
  }  

  public static void configMap(){
    map.put("A0", 0);
    map.put("B0", 1);
    
    map.put("C1", 2);
    map.put("D1", 3);
    map.put("E1", 4);
    map.put("F1", 5);
    map.put("G1", 6);
    map.put("A1", 7);
    map.put("B1", 8);
    
    map.put("C2", 9);
    map.put("D2", 10);
    map.put("E2", 11);
    map.put("F2", 12);
    map.put("G2", 13);
    map.put("A2", 14);
    map.put("B2", 15);

    map.put("C3", 16);
    map.put("D3", 17);
    map.put("E3", 18);
    map.put("F3", 19);
    map.put("G3", 20);
    map.put("A3", 21);
    map.put("B3", 22);

    map.put("C4", 23);
    map.put("D4", 24);
    map.put("E4", 25);
    map.put("F4", 26);
    map.put("G4", 27);
    map.put("A4", 28);
    map.put("B4", 29);

    map.put("C5", 30);
    map.put("D5", 31);
    map.put("E5", 32);
    map.put("F5", 33);
    map.put("G5", 34);
    map.put("A5", 35);
    map.put("B5", 36);

    map.put("C6", 37);
    map.put("D6", 38);
    map.put("E6", 39);
    map.put("F6", 40);
    map.put("G6", 41);
    map.put("A6", 42);
    map.put("B6", 43);

    map.put("C7", 44);
    map.put("D7", 45);
    map.put("E7", 46);
    map.put("F7", 47);
    map.put("G7", 48);
    map.put("A7", 49);
    map.put("B7", 50);

    map.put("C8", 51);

    
    for(Map.Entry<String, Integer> entry : map.entrySet()){
      Map.put(entry.getValue(), entry.getKey());
    }
  }
}