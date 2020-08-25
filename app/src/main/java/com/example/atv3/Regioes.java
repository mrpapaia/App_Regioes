package com.example.atv3;

public class Regioes {

    private String regiaoGeoeconomica;
    private String qtsEstados;
    private String gentilico;
    private String area;
    private String populacao;
    private String densidade;
    private String indicadores;
    private String pib;
    private String pibPerCapita;
    private Integer mapa;
    private String idh;

    public Regioes(String regiaoGeoeconomica, String qtsEstados, String gentilico, String area, String populacao, String densidade, String pib, String pibPerCapita, String idh, Integer mapa) {
        this.regiaoGeoeconomica = regiaoGeoeconomica;
        this.qtsEstados = qtsEstados;
        this.gentilico = gentilico;
        this.area = area;
        this.populacao = populacao;
        this.densidade = densidade;

        this.pib = pib;
        this.pibPerCapita = pibPerCapita;
        this.idh = idh;
        this.mapa = mapa;
    }

    public static final Regioes getNortedeste() {

        return new Regioes("Amazônia e Nordeste",
                "Nove estados",
                "nordestense ou nordestino",
                "1 554 291,744 km² 2013",
                "56 560 081 hab. 2015",
                "36,39 hab./km²", "R$ 722 809 000 mil 2013",
                "R$ 11 044 59 2012", " 0 710 alto 2017", R.drawable.nordeste);
    }

    public static final Regioes getBrasil() {

        return new Regioes("Amazônia, Nordeste e Centro-Sul",
                "Vinte e sete estados",
                "brasileiro",
                "8 515 767,049[2] km²",
                "210 147 125 hab. 2019",
                "23,8 hab./km² ", "US$ 2,141 trilhão",
                "US$ 10 309", "0,761", R.drawable.mapa_brasil);
    }

    public static final Regioes getNorte() {

        return new Regioes("Amazônia e Centro-Sul",
                "Sete estados",
                "nortista ou norteiro",
                "3 853 676,948 km² 2010",
                "18 430 980 hab. 2019",
                "4,78 hab./km²",
                "R$ 337,2 bilhões 2016",
                "R$ 19 043,20 2016",
                "0 730 alto 2017", R.drawable.norte);
    }

    public static final Regioes getCentroOeste() {

        return new Regioes("Centro-Sul e Amazônia",
                "Tres estados",
                "centro-oestino",
                "1 606 403,506 km² 2010",
                "16 085 885 hab. 2018",
                "10,01 hab./km²",
                "R$ 542 632 bilhões 2014",
                "R$ 35 653,48 2014",
                "0 789 alto 2017", R.drawable.centro);
    }

    public static final Regioes getSul() {

        return new Regioes("Centro-Sul",
                "Tres estados",
                "suleiro, sulino ou sulista",
                "576 774,31 km² 2010",
                "29 016 114 hab. 2014",
                "50,31 hab./km²",
                "R$ 672 049 milhões 2011",
                "R$ 24 382 2011",
                "0 798 alto 2017", R.drawable.sul);
    }

    public static final Regioes getSuldeste() {

        return new Regioes("Centro-Sul e Nordeste",
                "Quatro estados",
                "sudestino",
                "924 620,678 km² 2010",
                "87 711 946 hab. 2018",
                "94,86 hab./km²",
                "R$ 2 295 690 milhões 2011",
                "R$ 28 350,39 2011",
                "0 794 alto 2017", R.drawable.sudeste);
    }


    public String getRegiaoGeoeconomica() {
        return regiaoGeoeconomica;
    }

    public void setRegiaoGeoeconomica(String regiaoGeoeconomica) {
        this.regiaoGeoeconomica = regiaoGeoeconomica;
    }

    public String getQtsEstados() {
        return qtsEstados;
    }

    public void setQtsEstados(String qtsEstados) {
        this.qtsEstados = qtsEstados;
    }

    public String getGentilico() {
        return gentilico;
    }

    public void setGentilico(String gentilico) {
        this.gentilico = gentilico;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPopulacao() {
        return populacao;
    }

    public void setPopulacao(String populacao) {
        this.populacao = populacao;
    }

    public String getDensidade() {
        return densidade;
    }

    public void setDensidade(String densidade) {
        this.densidade = densidade;
    }


    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public String getPibPerCapita() {
        return pibPerCapita;
    }

    public void setPibPerCapita(String pibPerCapita) {
        this.pibPerCapita = pibPerCapita;
    }

    public String getIdh() {
        return idh;
    }

    public void setIdh(String idh) {
        this.idh = idh;
    }

    public Integer getMapa() {
        return mapa;
    }

    public void setMapa(Integer mapa) {
        this.mapa = mapa;
    }
}
