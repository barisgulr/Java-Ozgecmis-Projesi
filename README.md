# Java PDF Özgeçmiş Uygulaması

Java ile kişisel bilgiler, eğitim, üç örnek iş deneyimi ve beceriler kullanılarak PDF özgeçmiş oluşturan basit bir konsol uygulamasıdır.

## Kullanılan teknolojiler
- Java 17
- Maven
- iText 8.0.5
- IntelliJ IDEA

## IntelliJ IDEA ile açma
1. ZIP dosyasını bir klasöre çıkartın.
2. IntelliJ IDEA'yı açın ve **File > Open** seçin.
3. `JavaCV_Ornekten_Farkli` klasörünü açın.
4. Maven bağımlılıklarının indirilmesini bekleyin.
5. `src/main/java/com/ozgecmis/Main.java` dosyasını açın.
6. `main` metodunun yanındaki yeşil çalıştırma simgesine basın.
7. Proje ana klasöründe `Ozgecmis.pdf` dosyası oluşur.

## Kişisel bilgileri değiştirme
Örnek ad, e-posta, telefon, eğitim ve deneyim bilgileri `Main.java` dosyasındadır. Kendi bilgilerinle değiştirin. Fotoğrafı `src/main/resources/profil.png` dosyasının yerine koyabilirsiniz. Fotoğrafın dosya adını `profil.png` olarak koruyun.

Örnekteki kişi ve üç iş deneyimi kurgusaldır. Gerçek bir özgeçmişte yalnızca doğru bilgileri kullanın.

## Sınıfların görevleri
- `Main`: Örnek bilgileri oluşturur ve PDF işlemini başlatır.
- `KisiselBilgi`: İletişim ve tanıtım bilgilerini tutar.
- `EgitimBilgisi`: Okul, bölüm ve tarih bilgilerini tutar.
- `IsDeneyimi`: Bir iş deneyimini temsil eder.
- `Ozgecmis`: Diğer bilgi nesnelerini bir araya getirir.
- `PdfOlusturucu`: Bilgileri PDF belgesine aktarır.

## GitHub
Projeyi GitHub'da yeni bir **Public** repository içerisine yükleyin. Ödev sistemine ZIP yerine repository bağlantısını gönderin.
