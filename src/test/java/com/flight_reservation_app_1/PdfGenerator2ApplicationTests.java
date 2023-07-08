package com.flight_reservation_app_1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.flight_reservation_app_1.utillity.pdfgenerator;


@SpringBootTest
class PdfGenerator2ApplicationTests {

	@Test
	void contextLoads() {
		pdfgenerator pdf=new pdfgenerator();
		pdf.writeUsingIText();
		
	}
	

}
