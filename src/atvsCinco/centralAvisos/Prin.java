package atvsCinco.centralAvisos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Prin {
    public static void enviarAviso(Aviso aviso, String mensagem, String destino) {
        aviso.enviar(mensagem, destino);
        System.out.println(aviso.status());
    }

    public static void main(String[] args) {
        boolean enviarNovamente = true;
        Scanner input = new Scanner(System.in);

        Map<Integer, Aviso> tiposAviso = new HashMap<>();
        tiposAviso.put(1, new EmailAviso());
        tiposAviso.put(2, new PushAviso());
        tiposAviso.put(3, new SmsAviso());


        while (enviarNovamente) {
            System.out.println("Qual a mensagem que gostaria de enviar:");
            String mensagem = input.nextLine();

            System.out.println("Qual o destino?");
            String destino = input.nextLine();

            System.out.println("Como deseja enviar: 1 = Email, 2 = Push, 3 = Sms");
            int tipoEnvio = input.nextInt();
            input.nextLine();

            Aviso aviso = tiposAviso.get(tipoEnvio);

            if (aviso != null) {
                enviarAviso(aviso, mensagem, destino);
            } else {
                System.out.println("Tipo inválido!");
            }

            System.out.println("Deseja enviar uma nova mensagem? 1 = Sim, 2 = Não");
            int resposta = input.nextInt();
            input.nextLine();

            if (resposta == 2) {
                System.out.println("Saindo...");
                enviarNovamente = false;
            }
        }
    }
}
