package com.ozgecmis;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        KisiselBilgi kisi = new KisiselBilgi(
                "Barış Güler",
                "Yazılım Mühendisliği Öğrencisi",
                "barisguler1485@hotmail.com",
                "0555 555 55 55",
                "Bursa, Türkiye"
        );

        EgitimBilgisi egitim = new EgitimBilgisi(
                "Kırklareli Üniversitesi",
                "Yazılım Mühendisliği",
                "2025 - Devam ediyor"
        );

        IsDeneyimi is1 = new IsDeneyimi(
                "Güler Bilişim",
                "Stajyer Yazılım Geliştirici",
                "Haziran 2024 - Ağustos 2024",
                "Java ile yazılmış küçük uygulamaları inceledim. "
                        + "Test çalışmalarına katıldım ve kod düzenlemelerine destek verdim."
        );

        IsDeneyimi is2 = new IsDeneyimi(
                "Güler Teknoloji",
                "Yazılım Destek Asistanı",
                "Şubat 2025 - Mayıs 2025",
                "Kullanıcı hatalarını takip ettim. Veritabanı kayıtlarının "
                        + "kontrol edilmesi ve raporlanması çalışmalarında görev aldım."
        );

        IsDeneyimi is3 = new IsDeneyimi(
                "Güler Dijital",
                "Junior Java Geliştirici",
                "Haziran 2025 - Eylül 2025",
                "Basit Java modülleri geliştirdim. Ekip toplantılarına katılarak "
                        + "görevlerin planlanmasına ve dokümantasyona yardımcı oldum."
        );

        List<IsDeneyimi> deneyimler = Arrays.asList(is1, is2, is3);
        List<String> beceriler = Arrays.asList(
                "Java", "OOP", "SQL", "HTML/CSS", "Git", "Problem çözme"
        );

        Ozgecmis cv = new Ozgecmis(
                kisi,
                egitim,
                deneyimler,
                beceriler,
                "Yazılım geliştirme alanında kendini geliştirmeyi hedefleyen bir "
                        + "öğrenciyim. Java programlama dili ve nesne yönelimli "
                        + "programlama konularıyla ilgileniyorum. Yeni bilgiler "
                        + "öğrenmeye, takım çalışmalarına katılmaya ve öğrendiklerimi "
                        + "küçük projeler üzerinde uygulamaya istekliyim."
        );

        PdfOlusturucu olusturucu = new PdfOlusturucu();

        try {
            olusturucu.pdfHazirla(cv, "Ozgecmis.pdf");
            System.out.println("Özgeçmiş PDF dosyası oluşturuldu.");
        } catch (IOException hata) {
            System.out.println("PDF oluşturulamadı: " + hata.getMessage());
        }
    }
}
