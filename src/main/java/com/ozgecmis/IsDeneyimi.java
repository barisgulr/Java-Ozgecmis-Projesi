package com.ozgecmis;


public class IsDeneyimi {
    private String kurum;
    private String pozisyon;
    private String tarih;
    private String gorevAciklamasi;

    public IsDeneyimi(String kurum, String pozisyon, String tarih,
                      String gorevAciklamasi) {
        this.kurum = kurum;
        this.pozisyon = pozisyon;
        this.tarih = tarih;
        this.gorevAciklamasi = gorevAciklamasi;
    }

    public String getKurum() { return kurum; }
    public String getPozisyon() { return pozisyon; }
    public String getTarih() { return tarih; }
    public String getGorevAciklamasi() { return gorevAciklamasi; }
}
