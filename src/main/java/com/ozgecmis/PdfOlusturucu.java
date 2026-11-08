package com.ozgecmis;

import com.itextpdf.io.font.PdfEncodings;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.UnitValue;

import java.io.IOException;
import java.util.List;

public class PdfOlusturucu {

    public void pdfHazirla(Ozgecmis ozgecmis, String dosyaAdi) throws IOException {
        PdfWriter writer = new PdfWriter(dosyaAdi);
        PdfDocument pdf = new PdfDocument(writer);
        Document belge = new Document(pdf);

        belge.setMargins(32, 42, 35, 42);

        PdfFont font = PdfFontFactory.createFont(
                "src/main/resources/DejaVuSans.ttf",
                PdfEncodings.IDENTITY_H
        );
        PdfFont kalinFont = PdfFontFactory.createFont(
                "src/main/resources/DejaVuSans-Bold.ttf",
                PdfEncodings.IDENTITY_H
        );
        belge.setFont(font);

        KisiselBilgi kisi = ozgecmis.getKisiselBilgi();

        Table ustBolum = new Table(UnitValue.createPercentArray(new float[]{1, 2.4f}));
        ustBolum.setWidth(UnitValue.createPercentValue(100));

        try {
            ImageData fotoVerisi = ImageDataFactory.create("src/main/resources/profil.png");
            Image foto = new Image(fotoVerisi);
            foto.setWidth(95);
            foto.setHeight(110);
            ustBolum.addCell(new Cell().add(foto).setBorder(Border.NO_BORDER));
        } catch (Exception hata) {
            ustBolum.addCell(new Cell().add(new Paragraph("Fotoğraf yok"))
                    .setBorder(Border.NO_BORDER));
        }

        Cell bilgiHucre = new Cell().setBorder(Border.NO_BORDER).setPaddingLeft(12);
        bilgiHucre.add(new Paragraph(kisi.getAdSoyad())
                .setFont(kalinFont).setFontSize(21)
                .setFontColor(new DeviceRgb(31, 68, 91)));
        bilgiHucre.add(new Paragraph(kisi.getUnvan()).setFontSize(12));
        bilgiHucre.add(new Paragraph("E-posta: " + kisi.getEposta()).setFontSize(9));
        bilgiHucre.add(new Paragraph("Telefon: " + kisi.getTelefon()).setFontSize(9));
        bilgiHucre.add(new Paragraph("Şehir: " + kisi.getSehir()).setFontSize(9));
        ustBolum.addCell(bilgiHucre);
        belge.add(ustBolum);

        Table cizgi = new Table(1);
        cizgi.setWidth(UnitValue.createPercentValue(100));
        cizgi.addCell(new Cell().setHeight(3)
                .setBackgroundColor(new DeviceRgb(40, 105, 130))
                .setBorder(Border.NO_BORDER));
        belge.add(cizgi);

        baslikEkle(belge, kalinFont, "KISA PROFİL");
        belge.add(new Paragraph(ozgecmis.getProfil()).setFontSize(9.5f));

        baslikEkle(belge, kalinFont, "EĞİTİM");
        EgitimBilgisi egitim = ozgecmis.getEgitimBilgisi();
        belge.add(new Paragraph(egitim.getOkul()).setFont(kalinFont).setFontSize(11));
        belge.add(new Paragraph(egitim.getBolum() + " | " + egitim.getTarih())
                .setFontSize(9.5f));

        baslikEkle(belge, kalinFont, "İŞ DENEYİMLERİ");
        List<IsDeneyimi> liste = ozgecmis.getDeneyimler();

        for (IsDeneyimi deneyim : liste) {
            belge.add(new Paragraph(deneyim.getKurum())
                    .setFont(kalinFont).setFontSize(10.5f)
                    .setFontColor(new DeviceRgb(40, 85, 110)));
            belge.add(new Paragraph(deneyim.getPozisyon() + " | " + deneyim.getTarih())
                    .setFont(kalinFont).setFontSize(9));
            belge.add(new Paragraph(deneyim.getGorevAciklamasi())
                    .setFontSize(9).setMarginBottom(6));
        }

        baslikEkle(belge, kalinFont, "TEKNİK BECERİLER");
        belge.add(new Paragraph(String.join("  •  ", ozgecmis.getBeceriler()))
                .setFontSize(9.5f));

        belge.close();
    }

    private void baslikEkle(Document belge, PdfFont font, String baslik) {
        belge.add(new Paragraph(baslik)
                .setFont(font)
                .setFontSize(12)
                .setFontColor(new DeviceRgb(31, 68, 91))
                .setMarginTop(12)
                .setMarginBottom(5));
    }
}
