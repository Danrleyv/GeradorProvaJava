/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 5724023
 */
public class Objetiva extends Questao{
    private String opcoes[] = new String[5];
    private int resposta;

    public int getResposta() {
        return resposta;
    }

    public void setResposta(int resposta) {
        this.resposta = resposta;
    }
    
    /**
     * @return the opcoes
     */
    public String[] getOpcoes() {
        return opcoes;
    }

    /**
     * @param opcoes the opcoes to set
     */
    public void setOpcoes(String[] opcoes) {
        this.opcoes = opcoes;
    }
    
    public String retornaQuestao(){
        String questao="";
        questao+=this.getPergunta()+"(Peso "+this.getPeso()+")\n";
        for(int j=0;j<5;j++){
            switch(j){
                case 0: questao+="a)";
                        break;
                case 1: questao+="b)";
                        break;
                case 2: questao+="c)";
                        break;
                case 3: questao+="d)";
                        break;
                case 4: questao+="e)";
                        break;
            }
            questao+=this.getOpcoes()[j]+"\n\n";
        }
        return questao;
    }
}
