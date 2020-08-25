package com.example.atv3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Estados implements Serializable {
    private String nome;
    private String capital;
    private String população;
    private Integer bandeira;
    private Integer mapa;

    public static final List<Estados> getEstados() {
        List<Estados> estados = new ArrayList<>();
        estados.add(new Estados("Acre", "Rio Branco", "881 935 habitantes", R.drawable.bandeira_acre, R.drawable.mapa_acre));
        estados.add(new Estados("Alagoas", "Maceió", "3 337 357  habitantes", R.drawable.bandeira_alagoas, R.drawable.mapa_alagoas));
        estados.add(new Estados("Amapá", "Macapá", "845 731 habitantes", R.drawable.bandeira_amapa, R.drawable.mapa_amapa));
        estados.add(new Estados("Amazonas", "Manaus", "4 144 597 habitantes", R.drawable.bandeira_amazonas, R.drawable.mapa_amazonas));
        estados.add(new Estados("Bahia", "Salvador", "14 873 064 habitantes", R.drawable.bandeira_bahia, R.drawable.mapa_bahia));
        estados.add(new Estados("Ceará", "Fortaleza", "9 132 078 habitantes", R.drawable.bandeira_ceara, R.drawable.mapa_ceara));
        estados.add(new Estados("Dristrito Federal", "Brasília", "3 015 268 habitantes", R.drawable.bandeira_brasilia, R.drawable.mapa_distrito_federal));
        estados.add(new Estados("Espírito Santo", "Vitoria", "4 018 650 habitantes", R.drawable.bandeira_espiritosanto, R.drawable.mapa_espirito_santo));
        estados.add(new Estados("Goias", "Goiania", "7 018 354 habitantes", R.drawable.bandeira_goias, R.drawable.mapa_goias));
        estados.add(new Estados("Maranhão", "São Luis", "7 075 181 habitantes", R.drawable.bandeira_maranhao, R.drawable.mapa_maranhao));
        estados.add(new Estados("Mato Grosso", "Cuibá", "3 484 466 habitantes", R.drawable.bandeira_matogrosso, R.drawable.mapa_mato_grosso));
        estados.add(new Estados("Mato Grosso do Sul", "Campo Grande", "2 778 986 habitantes", R.drawable.bandeira_matogrossodosul, R.drawable.mapa_mato_grosso_sul));
        estados.add(new Estados("Minas Gerais", "Belo Horizonte", "21 168 791 habitantes", R.drawable.bandeira_minasgerais, R.drawable.mapa_minas_gerais));
        estados.add(new Estados("Pará", "Belém", "8 602 865 habitantes", R.drawable.bandeira_para, R.drawable.mapa_para));
        estados.add(new Estados("Paraíba", "João Pessoa", "4 018 127 habitantes", R.drawable.bandeira_paraiba, R.drawable.mapa_paraiba));
        estados.add(new Estados("Paraná", "Coritiba", "11 433 957 habitantes", R.drawable.bandeira_parana, R.drawable.mapa_parana));
        estados.add(new Estados("Pernambuco", "Recife", "9 557 071 habitantes", R.drawable.bandeira_pernambuco, R.drawable.mapa_pernanbuco));
        estados.add(new Estados("Piauí", "Teresina", "3 273 227 habitantes", R.drawable.bandeira_piaui, R.drawable.mapa_piaui));
        estados.add(new Estados("Rio de Janeiro", "Rio de Janeiro", "17 264 943 habitantes", R.drawable.bandeira_riodejaneiro, R.drawable.mapa_rio_de_janeiro));
        estados.add(new Estados("Rio Grande do Norte", "Natal", "3 506 853 habitantes", R.drawable.bandeira_riograndedonorte, R.drawable.mapa_rio_grande_do_norte));
        estados.add(new Estados("Rio Grande do Sul", "Porto Alegre", "11 377 239 habitantes", R.drawable.bandeira_riograndedosul, R.drawable.mapa_rio_grande_do_sul));
        estados.add(new Estados("Rondônia", "Porto Velho", "1 77 225 habitantes", R.drawable.bandeira_rondonia, R.drawable.mapa_rondonia));
        estados.add(new Estados("Roraima", "Boa Vista", "605 761 habitantes", R.drawable.bandeira_roraima, R.drawable.mapa_roraima));
        estados.add(new Estados("Santa Catariana", "Florianópolis", "7 164 788 habitantes", R.drawable.bandeira_santacatarina, R.drawable.mapa_santa_catarina));
        estados.add(new Estados("São Paulo", "São Paulo", "45 919 049 habitantes", R.drawable.bandeira_saopaulo, R.drawable.mapa_sao_paulo));
        estados.add(new Estados("Sergipe", "Aracaju", "2 298 696 habitantes", R.drawable.bandeira_sergipe, R.drawable.mapa_sergipe));
        estados.add(new Estados("Tocantins", "Palmas", "1 57 866 habitantes", R.drawable.bandeira_tocantins, R.drawable.mapa_tocantins));

        return estados;
    }

    public static final List<Estados> getEstadosNordeste() {
        List<Estados> estados = new ArrayList<>();

        estados.add(new Estados("Alagoas", "Maceió", "3 337 357  habitantes", R.drawable.bandeira_alagoas, R.drawable.mapa_alagoas));
        estados.add(new Estados("Bahia", "Salvador", "14 873 064 habitantes", R.drawable.bandeira_bahia, R.drawable.mapa_bahia));
        estados.add(new Estados("Ceará", "Fortaleza", "9 132 078 habitantes", R.drawable.bandeira_ceara, R.drawable.mapa_ceara));
        estados.add(new Estados("Maranhão", "São Luis", "7 075 181 habitantes", R.drawable.bandeira_maranhao, R.drawable.mapa_maranhao));
        estados.add(new Estados("Paraíba", "João Pessoa", "4 018 127 habitantes", R.drawable.bandeira_paraiba, R.drawable.mapa_paraiba));
        estados.add(new Estados("Pernambuco", "Recife", "9 557 071 habitantes", R.drawable.bandeira_pernambuco, R.drawable.mapa_pernanbuco));
        estados.add(new Estados("Piauí", "Teresina", "3 273 227 habitantes", R.drawable.bandeira_piaui, R.drawable.mapa_piaui));
        estados.add(new Estados("Rio Grande do Norte", "Natal", "3 506 853 habitantes", R.drawable.bandeira_riograndedonorte, R.drawable.mapa_rio_grande_do_norte));
        estados.add(new Estados("Sergipe", "Aracaju", "2 298 696 habitantes", R.drawable.bandeira_sergipe, R.drawable.mapa_sergipe));

        return estados;
    }

    public static final List<Estados> getEstadosNorte() {
        List<Estados> estados = new ArrayList<>();
        estados.add(new Estados("Acre", "Rio Branco", "881 935 habitantes", R.drawable.bandeira_acre, R.drawable.mapa_acre));
        estados.add(new Estados("Amazonas", "Manaus", "4 144 597 habitantes", R.drawable.bandeira_amazonas, R.drawable.mapa_amazonas));
        estados.add(new Estados("Amapá", "Macapá", "845 731 habitantes", R.drawable.bandeira_amapa, R.drawable.mapa_amapa));
        estados.add(new Estados("Tocantins", "Palmas", "1 57 866 habitantes", R.drawable.bandeira_tocantins, R.drawable.mapa_tocantins));
        estados.add(new Estados("Rondônia", "Porto Velho", "1 77 225 habitantes", R.drawable.bandeira_rondonia, R.drawable.mapa_rondonia));
        estados.add(new Estados("Roraima", "Boa Vista", "605 761 habitantes", R.drawable.bandeira_roraima, R.drawable.mapa_roraima));
        estados.add(new Estados("Pará", "Belém", "8 602 865 habitantes", R.drawable.bandeira_para, R.drawable.mapa_para));

        return estados;
    }

    public static final List<Estados> getEstadosCentroOeste() {
        List<Estados> estados = new ArrayList<>();
        estados.add(new Estados("Goias", "Goiania", "7 018 354 habitantes", R.drawable.bandeira_goias, R.drawable.mapa_goias));
        estados.add(new Estados("Mato Grosso", "Cuibá", "3 484 466 habitantes", R.drawable.bandeira_matogrosso, R.drawable.mapa_mato_grosso));
        estados.add(new Estados("Mato Grosso do Sul", "Campo Grande", "2 778 986 habitantes", R.drawable.bandeira_matogrossodosul, R.drawable.mapa_mato_grosso_sul));
        estados.add(new Estados("Dristrito Federal", "Brasília", "3 015 268 habitantes", R.drawable.bandeira_brasilia, R.drawable.mapa_distrito_federal));

        return estados;
    }

    public static final List<Estados> getEstadosSudeste() {
        List<Estados> estados = new ArrayList<>();
        estados.add(new Estados("Minas Gerais", "Belo Horizonte", "21 168 791 habitantes", R.drawable.bandeira_minasgerais, R.drawable.mapa_minas_gerais));
        estados.add(new Estados("São Paulo", "São Paulo", "45 919 049 habitantes", R.drawable.bandeira_saopaulo, R.drawable.mapa_sao_paulo));
        estados.add(new Estados("Rio de Janeiro", "Rio de Janeiro", "17 264 943 habitantes", R.drawable.bandeira_riodejaneiro, R.drawable.mapa_rio_de_janeiro));
        estados.add(new Estados("Espírito Santo", "Vitoria", "4 018 650 habitantes", R.drawable.bandeira_espiritosanto, R.drawable.mapa_espirito_santo));


        return estados;
    }

    public static final List<Estados> getEstadosSul() {
        List<Estados> estados = new ArrayList<>();
        estados.add(new Estados("Rio Grande do Sul", "Porto Alegre", "11 377 239 habitantes", R.drawable.bandeira_riograndedosul, R.drawable.mapa_rio_grande_do_sul));
        estados.add(new Estados("Santa Catariana", "Florianópolis", "7 164 788 habitantes", R.drawable.bandeira_santacatarina, R.drawable.mapa_santa_catarina));
        estados.add(new Estados("Paraná", "Coritiba", "11 433 957 habitantes", R.drawable.bandeira_parana, R.drawable.mapa_parana));

        return estados;
    }

    public Estados(String nome, String capital, String população, Integer bandeira, Integer mapa) {
        this.nome = nome;
        this.capital = capital;
        this.população = população;
        this.bandeira = bandeira;
        this.mapa = mapa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getPopulação() {
        return população;
    }

    public void setPopulação(String população) {
        this.população = população;
    }

    public Integer getBandeira() {
        return bandeira;
    }

    public void setBandeira(Integer bandeira) {
        this.bandeira = bandeira;
    }

    public Integer getMapa() {
        return mapa;
    }

    public void setMapa(Integer mapa) {
        this.mapa = mapa;
    }


    @Override
    public String toString() {
        return nome;
    }
}
