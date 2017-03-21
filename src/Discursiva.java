/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 5724023
 */
public class Discursiva extends Questao {
    private String criterioCorrecao;

    public String getCriterioCorrecao() {
        return criterioCorrecao;
    }

    public void setCriterioCorrecao(String criterioCorrecao) {
        this.criterioCorrecao = criterioCorrecao;
    }
    
    public String retornaQuestao(){
        String questao="";
        questao += this.getPergunta()+"\n"+this.getCriterioCorrecao()+"(Peso "+this.getPeso()+")\n\n\n\n\n";
        return questao;
    }
}
