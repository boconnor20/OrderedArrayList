import java.util.*;
import java.io.*;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public boolean add(T element) {
      if (element == null) {
        throw new IllegalArgumentException("Your element is null");
      }
    super.add(element);
    return true;
  }
}
