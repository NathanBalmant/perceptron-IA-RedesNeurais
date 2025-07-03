package br.cefet.ia.perceptron;

import java.util.Random;

public class Perceptron {
    private int qtde_entrada;
    private int qtde_saida; //neuronio

    private double [][] pesos;

    public Perceptron (int qtde_entrada, int qtde_saida){
        this.qtde_entrada = qtde_entrada;
        this.qtde_saida = qtde_saida;
        this.pesos = new double[qtde_entrada+1][qtde_saida];
        //gerar valores aleatorios para pesos de -0,3 a 0,3
        Random random = new Random();

    for (int i = 0; i <= qtde_entrada; i++) {
        for (int j = 0; j < qtde_saida; j++) {
            pesos[i][j] = -0.3 + (0.6 * random.nextDouble());
        }
}

    }

    public double[] treinar (double []x_in,double []y){
        double []x = new double[x_in.length+1];
        x[0] = 1;
        for (int i =0;i<x_in.length; i++){
            x[i+1] = x_in[i];

        }
        double []u = new double[y.length];
        double []o = new double[y.length];

        for(int j = 0; j < u.length; j++){

            for (int i = 0; i < x.length; i++){
                u[j] = u[j] + x[i] * this.pesos[i][j];
            }
            o[j] = 1/(1+Math.exp(-u[j]));
        }

        double [][] deltaPeso = new double[qtde_entrada+1][qtde_saida];


        double ni = 0.3;
        for(int j = 0; j < u.length; j++){

            for (int i = 0; i < x.length; i++){
                deltaPeso[i][j] = ni * (y[j] - o[j]) * x[i];
                this.pesos[i][j] += deltaPeso[i][j];
                
            }
            
        }
        return o;

    }
}
