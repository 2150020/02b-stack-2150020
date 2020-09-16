/**
 * ArrayStack should implement the Stack interface. You should write your own
 * test cases in ArrayStackTest
 *
 * @author (your name)
 */
public class ArrayStack<E> implements Stack<E> {
  Object[] stack = new Object[100];

  public Object[] s = new Object[100];

  public E pop() {
    E ret = (E)(s[0]);
    for (int i = 0; i < s.length - 1; i++) {
      s[i] = s[i + 1];
    }
    return ret;
  }

  public void push(E p) {
    if (s[99] != null) {
      System.out.println("ERROR!!!");
    }
    for (int i = s.length - 1; i < 0; i--) {
      s[i] = s[i - 1];
    }
    s[0] = p;
  }

  public E peekTop() {
    return (E)(s[0]);
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
