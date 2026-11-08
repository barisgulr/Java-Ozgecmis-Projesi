package com.ozgecmis;


public class EgitimBilgisi {
    private String okul;
    private String bolum;
    private String tarih;

    public EgitimBilgisi(String okul, String bolum, String tarih) {
        this.okul = okul;
        this.bolum = bolum;
        this.tarih = tarih;
    }

    public String getOkul() { return okul; }
    public String getBolum() { return bolum; }
    public String getTarih() { return tarih; }
}
