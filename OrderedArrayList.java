import java.util.*;
import java.io.*;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  private int helper(T value){
    for(int i = 0; i < super.size(); i ++){
      if(value.compareTo(super.get(i)) < 0){
        int index = i;
        return index;
      }
    }
    return super.size();
  }

  public boolean add(T element) {
      if (element == null) {
        throw new IllegalArgumentException("Your element is null");
      }
    super.add(element);//need to find index
    return true;
  }

  public void add(int index, T element) {
  if (element == null) {
    throw new IllegalArgumentException("Your element is null");
  }
    super.add(index, element);
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

public OrderedArrayList() {
  super();
}

public OrderedArrayList(T startingCapacity) {
  super();
  if (startingCapacity == null) {
      throw new IllegalArgumentException("The initial capacity cannot be null");
  }
  }
}
