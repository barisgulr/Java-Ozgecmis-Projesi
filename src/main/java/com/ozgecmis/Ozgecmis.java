package com.ozgecmis;

import java.util.List;

public class Ozgecmis {
    private KisiselBilgi kisiselBilgi;
    private EgitimBilgisi egitimBilgisi;
    private List<IsDeneyimi> deneyimler;
    private List<String> beceriler;
    private String profil;

    public Ozgecmis(KisiselBilgi kisiselBilgi, EgitimBilgisi egitimBilgisi,
                    List<IsDeneyimi> deneyimler, List<String> beceriler,
                    String profil) {
        this.kisiselBilgi = kisiselBilgi;
        this.egitimBilgisi = egitimBilgisi;
        this.deneyimler = deneyimler;
        this.beceriler = beceriler;
        this.profil = profil;
    }

    public KisiselBilgi getKisiselBilgi() { return kisiselBilgi; }
    public EgitimBilgisi getEgitimBilgisi() { return egitimBilgisi; }
    public List<IsDeneyimi> getDeneyimler() { return deneyimler; }
    public List<String> getBeceriler() { return beceriler; }
    public String getProfil() { return profil; }
}
