import java.util.*;
/**
 * ArrayStack should implement the Stack interface. You should write your own
 * test cases in ArrayStackTest
 *
 * @author (your name)
 */
public class ArrayStack<E> implements Stack<E> {

  public Object[] s = new Object[100];

  public E pop() {
    E ret = null;
    if (isEmpty()) {
      throw new StackException();
    } 
    else {
      ret = (E) (s[0]);
      for (int i = 0; i < s.length - 1; i++) {
        s[i] = s[i + 1];
      }
    }
    return ret;
  }

  public void push(E p) {
    if (s[s.length-1] != null) {
      Object[] n = new Object[s.length+1];
      for(int i=0; i<s.length;i++){
        n[i] = s[i];
      }
    }
    for (int i = s.length - 1; i > 0; i--) {
      s[i] = s[i - 1];
    }
    s[0] = p;
  }

  public E peekTop() {
    if(isEmpty()){
      throw new StackException();
    }
    else{
    return (E) (s[0]);
    }
  }

  public boolean isEmpty() {
    for (int i = 0; i < s.length; i++) {
      if (s[i] != null) {
        return false;
      }
    }
    return true;
  }
}
