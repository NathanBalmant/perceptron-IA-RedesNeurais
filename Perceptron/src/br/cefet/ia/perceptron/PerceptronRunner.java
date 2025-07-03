package br.cefet.ia.perceptron;

public class PerceptronRunner {

   static double [][][] portaAnd = new double[][][]{
        {{0, 0}, {0}},
        {{0, 1}, {0}},
        {{1, 0}, {0}},
        {{1, 1}, {1}}
    };

    static double[][][] portaOR = {
    {{0, 0}, {0}},
    {{0, 1}, {1}},
    {{1, 0}, {1}},
    {{1, 1}, {1}}
    };

    static double[][][] portaXOR = {
    {{0, 0}, {0}},
    {{0, 1}, {1}},
    {{1, 0}, {1}},
    {{1, 1}, {0}}
    };

    static double[][][] robo = {
    {{0, 0, 0}, {1, 1}},
    {{0, 0, 1}, {0, 1}},
    {{0, 1, 0}, {1, 0}},
    {{0, 1, 1}, {0, 1}},
    {{1, 0, 0}, {1, 0}},
    {{1, 0, 1}, {1, 0}},
    {{1, 1, 0}, {1, 0}},
    {{1, 1, 1}, {1, 0}}
    };


    public static void main(String[] args) {
        Perceptron rna = new Perceptron(2, 1); // ou (3, 2) para o robô
                                                                       
        for (int e = 1; e < 10001; e++) {
            double erro_epoca_aprox = 0;
           
            for (int a = 0; a < portaAnd.length ; a++) { // troque por portaOR, portaXOR ou robo
                double [][] amostra = portaAnd[a]; // troque por portaOR, portaXOR ou robo
                double [] x_in = amostra[0];
                double [] y = amostra[1];

                double []o = rna.treinar(x_in, y);

                // soma dos erros
                double erro_amostra_aprox = 0;
                for (int i = 0; i < y.length; i++) {
                    erro_amostra_aprox +=  Math.abs(y[i]-o[i]);   
                }

                erro_epoca_aprox += erro_amostra_aprox;
            }
             System.out.println("Epoca: "+e +" Erro aproximado: "+erro_epoca_aprox);
            
        }
        
    }

}
