/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 5724023
 */
abstract class Questao {
    private String Pergunta;
    private double peso;

    /**
     * @return the Pergunta
     */
    public String getPergunta() {
        return Pergunta;
    }

    /**
     * @param Pergunta the Pergunta to set
     */
    public void setPergunta(String Pergunta) {
        this.Pergunta = Pergunta;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }
}
