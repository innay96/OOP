package Geom;

import static org.junit.Assert.*;

import org.junit.Test;

class GeomElementTest {


		@Test
		public void testGeomElement() {
			GeomElement ge = new GeomElement("3.2, 5.2, 6.2");
			assertEquals("3.2,5.2,6.2" , ge.getPoint3D());
		}

}
