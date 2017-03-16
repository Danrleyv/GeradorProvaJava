/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author 5724023
 */
public class Principal {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String lixo="";
        Prova m1 = new Prova();
        
        System.out.print("Informe a disciplina: ");
        m1.setNomeDisciplina(s.nextLine());
        System.out.print("\nInforme o peso: ");
        m1.setPeso(s.nextInt());
        lixo=s.nextLine();
        System.out.print("\nInforme o local: ");
        m1.setLocal(s.nextLine());
        System.out.print("\nInforme a data da prova: ");
        m1.setData(s.nextLine());
        
        System.out.print("\nQuantas questoes discursivas? ");
        m1.qtdDiscursivas=s.nextInt();
        lixo=s.nextLine();
        if(m1.qtdDiscursivas>0){
            for(int i=0;i<m1.qtdDiscursivas;i++){
                System.out.print("\nInforme o enunciado da questao "+(i+1)+": ");
                m1.questoesDiscursivas[i].setPergunta(s.nextLine());
                System.out.print("\nInforme os criterios de avaliacao da questao "+(i+1)+": ");
                m1.questoesDiscursivas[i].setCriterioCorrecao(s.nextLine());
                System.out.print("\nInforme o peso da questao "+(i+1)+": ");
                m1.questoesDiscursivas[i].setPeso(s.nextDouble());
                lixo=s.nextLine();
            }
        }
        
        System.out.print("\nQuantas questoes objetivas? ");
        m1.qtdObjetivas=s.nextInt();
        lixo=s.nextLine();
        if(m1.qtdObjetivas>0){
            char x='a';
            String c[]=new String[10];
            for(int i=0;i<m1.qtdObjetivas;i++){
                System.out.print("\nInforme o enunciado da questao "+(i+1)+": ");
                m1.questoesObjetivas[i].setPergunta(s.nextLine());
                for(int j=0;j<5;j++){
                    switch(j){
                        case 0: x='a';
                            break;
                        case 1: x='b';
                            break;
                        case 2: x='c';
                            break;
                        case 3: x='d';
                            break;
                        case 4: x='e';
                            break;
                    }
                    lixo=s.nextLine();
                    System.out.print("\nInforme a alternativa "+x+": ");
                    c[j]=s.nextLine();
                }
                m1.questoesObjetivas[i].setOpcoes(c);
                System.out.print("\nInforme a alternativa correta:(entre 1 e 5) ");
                m1.questoesObjetivas[i].setResposta(s.nextInt());
                lixo=s.nextLine();
                System.out.print("\nInforme o peso da questao "+(i+1)+": ");
                m1.questoesDiscursivas[i].setPeso(s.nextDouble());
                lixo=s.nextLine();
            }
        }
        
        System.out.print(m1.obtemProvaImpressao());
    }
}
