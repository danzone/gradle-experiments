package org.danzone.pitexample;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {

  @Test
  public void testMe() {
    //Yes, this should be multiple test cases...
    MyClass sut = new MyClass();
    assertTrue(sut.myMethod(1, true));
    assertTrue(sut.myMethod(2, true));
    assertTrue(sut.myMethod(1, false));
    assertTrue(sut.myMethod(2, false));
    assertFalse(sut.myMethod(0, false));
  }


  @Test
  public void shouldReturnFooWhenGiven1() {
    MyClass sut = new MyClass();
     assertEquals("foo", sut.foo(1));
  }

  @Test
  public void shouldReturnBarWhenGivenMinus1() {
    MyClass sut = new MyClass();
    assertEquals("bar", sut.foo(-1));
  }  
}