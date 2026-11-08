package com.ozgecmis;


public class KisiselBilgi {
    private String adSoyad;
    private String unvan;
    private String eposta;
    private String telefon;
    private String sehir;

    public KisiselBilgi(String adSoyad, String unvan, String eposta,
                        String telefon, String sehir) {
        this.adSoyad = adSoyad;
        this.unvan = unvan;
        this.eposta = eposta;
        this.telefon = telefon;
        this.sehir = sehir;
    }

    public String getAdSoyad() { return adSoyad; }
    public String getUnvan() { return unvan; }
    public String getEposta() { return eposta; }
    public String getTelefon() { return telefon; }
    public String getSehir() { return sehir; }
}
