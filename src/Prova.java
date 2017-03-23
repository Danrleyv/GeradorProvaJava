
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 5724023
 * Sou gato
 */
public class Prova {
    private String nomeDisciplina;
    private int peso;
    private String local;
    private String data;
    
    public ArrayList<Questao> questoes = new ArrayList<Questao>();
    
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public String obtemDetalhes(){
        String cabecalho;
        cabecalho= "                        PROVA "+this.getNomeDisciplina()+"\n\nNome:________________________________________________________\nData: "+this.getData()+"   Local: "+this.getLocal()+"   Peso: "+this.getPeso()+"   Nota:___\n";
        return cabecalho;
    }
    
    public String obtemProvaImpressao(){
        String prova="";
        prova+=obtemDetalhes();
        prova+="\n\n";
        for(int i=0;i<questoes.size();i++){
            prova+="\nQuestao "+(i+questoes.size())+": "+questoes.get(i).retornaQuestao();
        }
        return prova;
    }
}
