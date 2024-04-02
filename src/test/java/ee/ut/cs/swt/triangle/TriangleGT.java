package ee.ut.cs.swt.triangle;

import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleGT {

	@Test(timeout = 4000)
	public void testIsEquilateral0() throws Throwable {
	    Triangle triangle0 = new Triangle(0, (-1141), (-1141));
	    boolean boolean0 = triangle0.isEquilateral();
	    assertFalse(boolean0);
	    assertEquals("0,-1141,-1141", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsClassify() throws Throwable {
	    Triangle triangle0 = new Triangle(1, 1, 516);
	    String string0 = triangle0.classify();
	    assertEquals(518, triangle0.getPerimeter());
	    assertEquals("isossceles", string0);
	}

	@Test(timeout = 4000)
	public void testIsEquilateral1() throws Throwable {
	    Triangle triangle0 = new Triangle((-2544), 1049, 522);
	    boolean boolean0 = triangle0.isEquilateral();
	    assertEquals("-2544,1049,522", triangle0.getSideLengths());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testGetArea() throws Throwable {
	    Triangle triangle0 = new Triangle(1, 1, 1);
	    triangle0.setSideLengths(3, 3, 3378);
	    double double0 = triangle0.getArea();
	    assertEquals("isossceles", triangle0.classify());
	    assertEquals(31170.443821030203, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testIsRightAngledReturningTrue() throws Throwable {
	    Triangle triangle0 = new Triangle((-1), (-1), 1);
	    triangle0.setSideLengths(0, 2452, 2452);
	    boolean boolean0 = triangle0.isRightAngled();
	    assertEquals(4904, triangle0.getPerimeter());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testSetSideLengthsReturningTriangleWhereGetAreaIsZero() throws Throwable {
	    Triangle triangle0 = new Triangle(1, 1, 1);
	    triangle0.setSideLengths(1, 1, 1);
	    assertEquals("equilateral", triangle0.classify());
	}

	@Test(timeout = 4000)
	public void testGetPerimeter() throws Throwable {
	    Triangle triangle0 = new Triangle(2, 2, 2);
	    triangle0.setSideLengths(0, 0, 0);
	    int int0 = triangle0.getPerimeter();
	    assertEquals("0,0,0", triangle0.getSideLengths());
	    assertEquals(0, int0);
	}

	@Test(timeout = 4000)
	public void testIsImpossibleReturningFalse() throws Throwable {
	    Triangle triangle0 = new Triangle(1, 1, 423);
	    boolean boolean0 = triangle0.isImpossible();
	    assertEquals("isossceles", triangle0.classify());
	    assertEquals(425, triangle0.getPerimeter());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsGetArea() throws Throwable {
	    Triangle triangle0 = new Triangle((-4), (-4), (-4));
	    double double0 = triangle0.getArea();
	    assertEquals((-1.0), double0, 0.01);
	    assertEquals("-4,-4,-4", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testIsRightAngledReturningFalse() throws Throwable {
	    Triangle triangle0 = new Triangle(173, 173, 173);
	    boolean boolean0 = triangle0.isRightAngled();
	    assertFalse(boolean0);
	    assertEquals(12835.049824601383, triangle0.getArea(), 0.01);
	}

	@Test(timeout = 4000)
	public void testIsRightAngled() throws Throwable {
	    Triangle triangle0 = new Triangle((-1), (-1), 1);
	    triangle0.setSideLengths(0, 2452, 2452);
	    boolean boolean0 = triangle0.isRightAngled();
	    assertEquals(4904, triangle0.getPerimeter());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsGetPerimeter() throws Throwable {
	    Triangle triangle0 = new Triangle(5181, (-108), 5181);
	    int int0 = triangle0.getPerimeter();
	    assertEquals(10254, int0);
	}

	@Test(timeout = 4000)
	public void testIsImpossible1() throws Throwable {
	    Triangle triangle0 = new Triangle(2791, 0, 1752);
	    boolean boolean0 = triangle0.isImpossible();
	    assertTrue(boolean0);
	    assertEquals("2791,0,1752", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testIsImpossible2() throws Throwable {
	    Triangle triangle0 = new Triangle(173, 173, (-1175));
	    boolean boolean0 = triangle0.isImpossible();
	    assertEquals("173,173,-1175", triangle0.getSideLengths());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsIsIsosceles() throws Throwable {
	    Triangle triangle0 = new Triangle(2027, (-3499), 2);
	    boolean boolean0 = triangle0.isIsosceles();
	    assertFalse(boolean0);
	    assertEquals((-1470), triangle0.getPerimeter());
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsIsRightAngled() throws Throwable {
	    Triangle triangle0 = new Triangle(173, 173, 173);
	    boolean boolean0 = triangle0.isRightAngled();
	    assertFalse(boolean0);
	    assertEquals(12835.049824601383, triangle0.getArea(), 0.01);
	}

	@Test(timeout = 4000)
	public void testGetPerimeterReturningNegative() throws Throwable {
	    Triangle triangle0 = new Triangle(0, (-1), (-1));
	    int int0 = triangle0.getPerimeter();
	    assertEquals((-2), int0);
	}

	@Test(timeout = 4000)
	public void testGetPerimeterReturningPositive() throws Throwable {
	    Triangle triangle0 = new Triangle(5181, (-108), 5181);
	    int int0 = triangle0.getPerimeter();
	    assertEquals(10254, int0);
	}

	@Test(timeout = 4000)
	public void testGetAreaReturningNegative() throws Throwable {
	    Triangle triangle0 = new Triangle((-4), (-4), (-4));
	    double double0 = triangle0.getArea();
	    assertEquals((-1.0), double0, 0.01);
	    assertEquals("-4,-4,-4", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testIsIsoscelesAndSetSideLengths() throws Throwable {
	    Triangle triangle0 = new Triangle(0, (-1), (-1));
	    triangle0.setSideLengths(2466, 1, 2768);
	    boolean boolean0 = triangle0.isIsosceles();
	    assertFalse(triangle0.isImpossible());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testGetPerimeterReturningZero() throws Throwable {
	    Triangle triangle0 = new Triangle(2, 2, 2);
	    triangle0.setSideLengths(0, 0, 0);
	    int int0 = triangle0.getPerimeter();
	    assertEquals("0,0,0", triangle0.getSideLengths());
	    assertEquals(0, int0);
	}

	@Test(timeout = 4000)
	public void testIsScalene() throws Throwable {
	    Triangle triangle0 = new Triangle(1, 1, 1);
	    triangle0.setSideLengths(3, 4899, 1);
	    boolean boolean0 = triangle0.isScalene();
	    assertFalse(triangle0.isIsosceles());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsIsoscelesReturningTrue() throws Throwable {
	    Triangle triangle0 = new Triangle(1, 1, (-682));
	    boolean boolean0 = triangle0.isIsosceles();
	    assertTrue(boolean0);
	    assertEquals("1,1,-682", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testIsScalene0() throws Throwable {
	    Triangle triangle0 = new Triangle(173, 166, 173);
	    boolean boolean0 = triangle0.isScalene();
	    assertEquals(12598.514198110823, triangle0.getArea(), 0.01);
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsScalene1() throws Throwable {
	    Triangle triangle0 = new Triangle(0, (-1), (-1));
	    boolean boolean0 = triangle0.isScalene();
	    assertFalse(boolean0);
	    assertEquals("0,-1,-1", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testIsScalene2() throws Throwable {
	    Triangle triangle0 = new Triangle(181, 181, 181);
	    boolean boolean0 = triangle0.isScalene();
	    assertFalse(boolean0);
	    assertEquals(14055.568291606, triangle0.getArea(), 0.01);
	}

	@Test(timeout = 4000)
	public void testGetAreaReturningPositive() throws Throwable {
	    Triangle triangle0 = new Triangle(1, 1, 1);
	    triangle0.setSideLengths(3, 3, 3378);
	    double double0 = triangle0.getArea();
	    assertEquals("isossceles", triangle0.classify());
	    assertEquals(31170.443821030203, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testIsImpossible0() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 1);
	    boolean boolean0 = triangle0.isImpossible();
	    assertTrue(boolean0);
	    assertEquals(1, triangle0.getPerimeter());
	}

	@Test(timeout = 4000)
	public void testSetSideLengthsReturningTriangleWhereGetPerimeterIsNegative() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    triangle0.setSideLengths((-3744), 181, 181);
	    boolean boolean0 = triangle0.isIsosceles();
	    assertEquals("-3744,181,181", triangle0.getSideLengths());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsIsEquilateral() throws Throwable {
	    Triangle triangle0 = new Triangle(0, (-1141), (-1141));
	    boolean boolean0 = triangle0.isEquilateral();
	    assertFalse(boolean0);
	    assertEquals("0,-1141,-1141", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsGetSideLengths() throws Throwable {
	    Triangle triangle0 = new Triangle((-2544), 1049, 522);
	    String string0 = triangle0.getSideLengths();
	    assertEquals("-2544,1049,522", string0);
	}

	@Test(timeout = 4000)
	public void testClassify0() throws Throwable {
	    Triangle triangle0 = new Triangle(1, 1, 516);
	    String string0 = triangle0.classify();
	    assertEquals(518, triangle0.getPerimeter());
	    assertEquals("isossceles", string0);
	}

	@Test(timeout = 4000)
	public void testClassify1() throws Throwable {
	    Triangle triangle0 = new Triangle(732, 732, 732);
	    String string0 = triangle0.classify();
	    assertEquals("equilateral", string0);
	}

	@Test(timeout = 4000)
	public void testClassifyAndSetSideLengths() throws Throwable {
	    Triangle triangle0 = new Triangle(0, (-1), (-1));
	    Triangle triangle1 = triangle0.setSideLengths(2466, 1, 2768);
	    String string0 = triangle1.classify();
	    assertEquals(5235, triangle0.getPerimeter());
	    assertEquals("scalene", string0);
	}

	@Test(timeout = 4000)
	public void testSetSideLengthsReturningTriangleWhereIsEquilateralIsTrue() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    triangle0.setSideLengths(0, 3129, 0);
	    boolean boolean0 = triangle0.isIsosceles();
	    assertEquals(3129, triangle0.getPerimeter());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsIsScalene() throws Throwable {
	    Triangle triangle0 = new Triangle(173, 166, 173);
	    boolean boolean0 = triangle0.isScalene();
	    assertEquals(12598.514198110823, triangle0.getArea(), 0.01);
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testClassify2() throws Throwable {
	    Triangle triangle0 = new Triangle(5, (-2126), (-2126));
	    String string0 = triangle0.classify();
	    assertEquals("impossible", string0);
	    assertEquals("5,-2126,-2126", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testClassify3() throws Throwable {
	    Triangle triangle0 = new Triangle(5, 72, 5);
	    String string0 = triangle0.classify();
	    assertEquals("scalene", string0);
	    assertEquals(82, triangle0.getPerimeter());
	}

	@Test(timeout = 4000)
	public void testIsScaleneAndSetSideLengths0() throws Throwable {
	    Triangle triangle0 = new Triangle(1, 1, 1);
	    triangle0.setSideLengths(3, 4899, 1);
	    boolean boolean0 = triangle0.isScalene();
	    assertFalse(triangle0.isIsosceles());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsScaleneAndSetSideLengths1() throws Throwable {
	    Triangle triangle0 = new Triangle(0, (-1), (-1));
	    Triangle triangle1 = triangle0.setSideLengths(2466, 1, 2768);
	    boolean boolean0 = triangle1.isScalene();
	    assertEquals("scalene", triangle0.classify());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsIsImpossible() throws Throwable {
	    Triangle triangle0 = new Triangle(1, 1, 423);
	    boolean boolean0 = triangle0.isImpossible();
	    assertEquals("isossceles", triangle0.classify());
	    assertEquals(425, triangle0.getPerimeter());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testGetAreaReturningZero() throws Throwable {
	    Triangle triangle0 = new Triangle(1, 1, 1);
	    double double0 = triangle0.getArea();
	    assertEquals(3, triangle0.getPerimeter());
	    assertEquals(0.0, double0, 0.01);
	}

	@Test(timeout = 4000)
	public void testSetSideLengthsWithZeroAndIsScalene() throws Throwable {
	    Triangle triangle0 = new Triangle(1, 1, 1);
	    triangle0.setSideLengths(0, 1, 3);
	    boolean boolean0 = triangle0.isScalene();
	    assertEquals("0,1,3", triangle0.getSideLengths());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testClassify() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    triangle0.setSideLengths(3129, 192, 0);
	    triangle0.classify();
	    assertFalse(triangle0.isIsosceles());
	}

	@Test(timeout = 4000)
	public void testIsEquilateralReturningTrue() throws Throwable {
	    Triangle triangle0 = new Triangle(181, 181, 181);
	    boolean boolean0 = triangle0.isEquilateral();
	    assertTrue(boolean0);
	    assertEquals("181,181,181", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testIsIsosceles() throws Throwable {
	    Triangle triangle0 = new Triangle(2027, (-3499), 2);
	    boolean boolean0 = triangle0.isIsosceles();
	    assertFalse(boolean0);
	    assertEquals((-1470), triangle0.getPerimeter());
	}

	@Test(timeout = 4000)
	public void testSetSideLengthsWithZeroAndClassify() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 0, 0);
	    triangle0.setSideLengths(3129, 192, 0);
	    triangle0.classify();
	    assertFalse(triangle0.isIsosceles());
	}

	@Test(timeout = 4000)
	public void testSetSideLengthsReturningTriangleWhereIsIsoscelesIsTrueAndTriangleWhereIsScaleneIsFalse() throws Throwable {
	    Triangle triangle0 = new Triangle((-2544), 1049, 522);
	    triangle0.setSideLengths(2041, 2041, 1924);
	    triangle0.classify();
	    assertEquals("2041,2041,1924", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testGetSideLengths() throws Throwable {
	    Triangle triangle0 = new Triangle((-2544), 1049, 522);
	    String string0 = triangle0.getSideLengths();
	    assertEquals("-2544,1049,522", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesTriangleAndCallsSetSideLengths() throws Throwable {
	    Triangle triangle0 = new Triangle(1, 1, 1);
	    triangle0.setSideLengths(1, 1, 1);
	    assertEquals("equilateral", triangle0.classify());
	}

}