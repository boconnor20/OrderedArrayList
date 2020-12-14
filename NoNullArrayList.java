import java.util.*;
import java.io.*;
public class NoNullArrayList<T> extends ArrayList<T>{
  public void add(int index, T element){
      try{
        if(element==null){
          throw new IllegalArgumentException("Element is null");
        }
        super.add(index,element);
      }catch(IllegalArgumentException e){
        throw new IllegalArgumentException("Element is null");
      }
    }
}
