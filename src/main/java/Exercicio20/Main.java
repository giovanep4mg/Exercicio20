package Exercicio20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int anoFabricacao = 0;
        float valorVeiculo = 0.0f;
        float valorPorcentagem = 0.0F; 
        float valorDesconto = 0.0f;
        float valorApagar;

        int totalCarrosSemiNovos = 0;
        int totalCarros = 0;
        
        
        Scanner leitor = new Scanner(System.in);
        
        char desejaRepetir ='S';
        
        while (desejaRepetir == 'S' || desejaRepetir =='s' ){
            System.out.println("Digite o ano de fabricação do veiculo:" );
            anoFabricacao = leitor.nextInt();
            
            System.out.println("Digite o valor do veiculo:" );
            valorVeiculo = leitor.nextFloat();
            
            if(anoFabricacao <= 2000){
                valorPorcentagem = 0.12f;
            }else {
                valorPorcentagem = 0.07f;
                  totalCarrosSemiNovos++;
            }
            totalCarros++;
            
            valorDesconto = valorVeiculo * valorPorcentagem;
            valorApagar = valorVeiculo - valorDesconto;
            
            System.out.println("o valor do desconto é : " +valorDesconto);
            System.out.println("o valor a ser pago será de: "+valorApagar);
            
            System.out.println("Total de carros semi novos "
                    + "é : "+totalCarrosSemiNovos);
            
            System.out.println("Total de carros é :"+totalCarros);
            
            System.out.println("Deseja repetir ? S - sim / N - não. ");
            desejaRepetir = leitor.next().charAt(0);
            
            
            
            
        }
        
        
    }
    
}
