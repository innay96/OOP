package GIS;

import static org.junit.Assert.*;

import org.junit.Test;

class GISelementTest {

		@Test
		public void test() {
			GISelement ge = new GISelement("40:65:a3:35:4c:c4,Efrat,[WPA-PSK-CCMP+TKIP][WPA2-PSK-CCMP+TKIP][ESS],2017-12-03 10:49:00,1,-75,32.17218268,34.81446402,13.65040889,6,WIFI");
			assertEquals("the UTC of this metaData is: 1489315740000,32.17218268,34.81446402,13.65040889" , ge.toString());
		}

}
