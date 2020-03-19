package app.b;

import app.a.ClassA;

/**
 *
 * @author MSS
 */
public class ClassC {

  public void explore() {
    ClassA objectA = new ClassA();
    objectA.method1();
    objectA.method2();
    objectA.method3();
    objectA.method4();

    System.out.println(objectA.var1);
    System.out.println(objectA.var2);
    System.out.println(objectA.var3);
    System.out.println(objectA.var4);
  }
}
