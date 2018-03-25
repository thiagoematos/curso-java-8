package _02_lambda_basico.prints._02;

import java.util.Collection;

public class Rh {

    public static void aplicarDissidio(Collection<Funcionario> funcionarios,
                                       double porcentagemDeAumento) {
        // Pré-Lambda
        for (Funcionario funcionario : funcionarios) {
            funcionario.aumentarSalario(porcentagemDeAumento);
        }

        // Lambda
        funcionarios
                .stream()
                .parallel()
                .forEach(funcionario -> funcionario.aumentarSalario(porcentagemDeAumento));
    }

}
