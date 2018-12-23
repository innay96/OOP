package GIS;

import static org.junit.Assert.*;

import org.junit.Test;

class GISlayerTest {

		@Test
		public void testGISlayer() {
			GISelement ge = new GISelement("40:65:a3:35:4c:c4,Efrat,[WPA-PSK-CCMP+TKIP][WPA2-PSK-CCMP+TKIP][ESS],12/1/2017 10:49,1,-75,32.17218268,34.81446402,13.65040889,6,WIFI");
			GISlayer gl = new GISlayer();
			gl.add(ge);
			assertEquals("[40:65:a3:35:4c:c4, 12/1/2017 10:49],32.17218268,34.81446402,13.65040889", gl.toString());
		}


}
