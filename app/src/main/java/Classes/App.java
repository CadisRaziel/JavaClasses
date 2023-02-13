package Classes;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Pessoa objetoPessoa = new Pessoa(70.0f, 1.69f);

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o peso da pessoa");
        objetoPessoa.setPeso(leitor.nextFloat());

        System.out.print("Digite a altura da pessoa");
        objetoPessoa.setAltura(leitor.nextFloat());

        System.out.print("IMC = " + objetoPessoa.calcularIMC());

    }
}
