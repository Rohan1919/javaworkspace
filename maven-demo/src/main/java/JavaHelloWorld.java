import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;





public class JavaHelloWorld {
	public static void main(String[] args) {
		Document document=new  Document();
		try {
		  PdfWriter writer=PdfWriter.getInstance(document,new FileOutputStream("A HelloWorld.pdf"));
		  document.open();
		  document.add(new Paragraph("hello world pdf document"));
		  document.close();
		  writer.close();
		}catch(DocumentException e) {
			System.out.println(e);
		}catch(FileNotFoundException fe) {
			fe.printStackTrace();
		}
	}

}
