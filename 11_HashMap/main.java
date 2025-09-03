import java.util.*;
public class main {
  public static void HashMapMethods(){
    //Syntax
    HashMap <String,Integer> mp= new HashMap<>();
    //Adding elements
    mp.put("Akash",21);         //put->insrtion if key not exist
    mp.put("Yash",16);          //put->updation if key exists already
    mp.put("Lav",17);
    mp.put("Rishika",19);
    mp.put("Harry",18);

    //Getting value of a key from HashMap
    System.out.println(mp.get("Akash"));  // value if key exist
    System.out.println(mp.get("Dibya"));  //->null  if key not exist
    //Changing/Updating the value of a key in the hashmap
    mp.put("Akash", 25);
    System.out.println(mp.get("Akash"));
    //Removing a pair from the hashmap
    System.out.println(mp.remove("Akash")); //25
    System.out.println(mp.remove("Riya"));  //null
    //Checking if a key is in the hashmap
    System.out.println(mp.containsKey("Akash")); //false
    System.out.println(mp.containsKey("Yash"));//true
    //Adding a new key only if does not exists already
    //if(!mp.containsKey("Yash")) mp.put("Yash", 30);
      mp.putIfAbsent("Yashika", 30);  //will enter
      mp.putIfAbsent("Yash",16);//will not enter
     //Get all keys from hashmap
        System.out.println(mp.keySet());
      //Get all keys from hashmap
      System.out.println(mp.values());
      //Get all keys from hashmap
      System.out.println(mp.entrySet());
    // Traversing all the elements of hashMap
     for(String key: mp.keySet()){
      System.out.printf("Age of %s is %d\n",key,mp.get(key));
     }
     System.out.println();
     for(Map.Entry<String,Integer> e:mp.entrySet()){
      System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
     }
     System.out.println();
     for(var e:mp.entrySet()){
      System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
     }
  }
    public static void main(String[] args) {
      HashMapMethods();
    }

}
