package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    // Programa pricipal
    public static void main(String[] args) {
        selecaoCandidatos();
    }

    // Metodo de seleção do candidato
    static void selecaoCandidatos(){
        String [] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto","Monica","Fabrício"};

        int candidatoSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while(candidatoSelecionados < 5  && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato "+candidato+" solicitou este valor de salário: "+salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato "+ candidato+"foi selecionado para a vaga");
                candidatoSelecionados++;
            }
            candidatosAtual++;
        }
    }

    // Metodo para definir o valor pretendido pelo candidato
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1500,2500);
    }

    // Metodo para analise do candidato
    static void analisarCadidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
