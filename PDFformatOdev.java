package pdf.com;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("unused")
public class PDFformatOdev {
    private static final Logger logger = LoggerFactory.getLogger(PDFformatOdev.class);

    public static void main(String[] args) {
        String pdfPath = "Özgeçmiş.pdf"; 
        String imagePath = "file:///C:/Users/ozcan/Desktop/indir.jpg"; 
        try {
           
            ImageData imageData = ImageDataFactory.create(imagePath);
            Image image = new Image(imageData);
            image.setWidth(100);  
            image.setHeight(100);  
        
            
            
            PdfWriter writer = new PdfWriter(pdfPath);
            PdfDocument pdfDocument = new PdfDocument(writer);
            Document document = new Document(pdfDocument);
            

          
            document.add(image); 
            document.add(new Paragraph("Özgeçmiş").setBold());
            document.add(new Paragraph("Adı: İrem ÖZCAN"));
            document.add(new Paragraph("E-posta: "));
            document.add(new Paragraph("Telefon: "));
            document.add(new Paragraph("Lise Eğitimi: Mustafa Elmas Arıcı Anadolu Lisesi mezunu (2021)"));
            document.add(new Paragraph("Üniversite Eğitimi: Trakya Üniversitesi, Bilgisayar Mühendisliği"));
            document.add(new Paragraph("Sertifikalar:"));
            document.add(new Paragraph(" - Git Eğitimi Sertifikası, Techcareer (2024)"));
            document.add(new Paragraph(" - Java Eğitimi Sertifikası, Techcareer (2024)"));
            document.add(new Paragraph(" - Başlangıç Seviye Java Sertifikası, BTK Academy (2023)"));
            document.add(new Paragraph(" - Makine Öğrenmesi Sertifikası, Cumhurbaşkanlığı Dijital Dönüşüm Ofisi (2023)"));
            document.add(new Paragraph(" - Veri Bilimi ve Makine Öğrenimi, BTK Academy (2023)"));
            document.add(new Paragraph(" - Java Programlama Kursu, Udemy (2022)"));
            document.add(new Paragraph("İş Deneyimi:"));
            document.add(new Paragraph(" - Yazılım Stajyeri, LOGO Yazılım (2024)"));
            document.add(new Paragraph(" - Founding Backend Team Lead, Roadmape (Ağu 2023 - Mar 2024)"));
            document.add(new Paragraph(" - Junior Backend Java Geliştirici, Fibabanka (2026 - 2027)"));
            document.add(new Paragraph(" - Senior Backend Java Geliştirici, Akbank (2027 - Halen)"));
            document.add(new Paragraph("Yetenekler:"));
            document.add(new Paragraph(" - Java, Python, C, C++, Flutter, SQL, Dart"));
           
            document.close();
            logger.info("PDF oluşturuldu: " + pdfPath);
        } catch (Exception e) {
            logger.error("Hata yakalandı!");
        }
    }
}
