package com.mycompany.cenaflix.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "podcast")
public class Podcast {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String produtor;
    private String nomeEpisodio;
    private int nEpisodio;
    private String duracao;
    private String url;

    public Podcast() {
    }

    public Podcast(int id, String produtor, String nomeEpisodio, int nEpisodio, String duracao, String url) {
        this.id = id;
        this.produtor = produtor;
        this.nomeEpisodio = nomeEpisodio;
        this.nEpisodio = nEpisodio;
        this.duracao = duracao;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public String getNomeEpisodio() {
        return nomeEpisodio;
    }

    public void setNomeEpisodio(String nomeEpisodio) {
        this.nomeEpisodio = nomeEpisodio;
    }

    public int getnEpisodio() {
        return nEpisodio;
    }

    public void setnEpisodio(int nEpisodio) {
        this.nEpisodio = nEpisodio;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
