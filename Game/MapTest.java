package Game;

import static org.junit.Assert.*;
import org.junit.Test;

import Coords.Pixel;
import Geom.Point3D;

public class MapTest {
	Point3D UpperLeft = new Point3D(35.202342, 32.105814, 641);
	Point3D BottomRight = new Point3D(35.211784,32.101954,0);
	Map test = new Map("C:\\Users\\InnaPC\\Documents\\OOP_3\\Ex3\\Ariel1.png", UpperLeft, BottomRight);
	Point3D gpsCicar = new Point3D(35.207501,32.102461, 0);
	
	@Test
	public void testconvertToPixel() {
		 Point3D gps = new Point3D(35.2035022,32.1045513, 10);	
		 Pixel pixel = (Pixel) Map.convertToPixel(gps);
		 assertEquals("176.08203770403733,210.01383433944707,0.0", pixel.toString());
	}
	
	@Test
	public void testConvertToPolar() {
		Point3D pixel = new Point3D(733, 546, 0);
		Point3D gps = Map.convertToPolar(pixel);
		assertEquals("35.20717171807969,32.109096803737636,641.0", gps.toString());
	}
	
	
	@Test
	public void testDistancePXtoMeter() {
		 Point3D px1 = new Point3D(733, 546, 0);
		 Point3D px2 = new Point3D(667, 466, 0);
		 Point3D d = Map.vector3Dmeter(px1, px2);
		 assertEquals("-48.355593040434464,-43.70325520978214,0.0", d.toString());
	}
	
	@Test
	public void testDistanceMeterPX() {
		 Point3D px1 = new Point3D(733, 546, 0);
		 Point3D px2 = new Point3D(667, 466, 0);
		 double d = Map.vectorMeter(px1, px2);
		 assertEquals("6329658.714649292", d+"");
	}
}
