package org.danzone.pitexample;

public class MyClass {

    public boolean myMethod(int a, boolean flag) {
        if (a > 0) {
            return true;
        }
        if (flag) {
            return true;
        }
        return false;
    }

	public static String foo(int i) {
  		if ( i >= 0 ) {
      		return "foo";
  		} else {
      		return "bar";
  		}
	}
}