import java.util.*;
import java.io.*;
public class NoNullArrayList<T> extends ArrayList<T>{
  public void add(int index, T element){
      try{
        if(element==null){
          throw new IllegalArgumentException("Element is null");
        }
        super.add(index,element);
      }
      catch(IllegalArgumentException e){
        throw new IllegalArgumentException("Element is null");
      }
    }
    public boolean add(T element){
      if (element == null) {
        throw new IllegalArgumentException("Element is null");
      }
      super.add(element);
      return true;
    }
    public T set (int index, T element) {
    if (element == null) {
      throw new IllegalArgumentException("Element is null");
    }
    T old = super.get(index);
    super.remove(index);
    super.add(index, element);
    return old;
  }
  public NoNullArrayList() {
    super();
  }

  public NoNullArrayList(T startingCapacity) {
    super();
    if (startingCapacity == null) {
        throw new IllegalArgumentException("The initial capacity cannot be null");
    }
  }

}
