package atvsCinco.centralAvisos;

import java.util.Scanner;

public class Prin {
    public static void enviarAviso(Aviso aviso, String mensagem, String destino) {
        aviso.enviar(mensagem, destino);
        System.out.println(aviso.status());
    }

    public static void main(String[] args) {
        int resposta;
        boolean enviarNovamente = true;
        String destino;

        Scanner input = new Scanner(System.in);

        while (enviarNovamente) {
            System.out.println("Qual a mensagem que gostaria de enviar:");
            String mensagem = input.nextLine();

            System.out.println("Qual o destino?");
            destino = input.nextLine();


            System.out.println("Como deseja enviar: 1 = Email, 2 = Push, 3 = Sms");
            int tipoEnvio = input.nextInt();
            input.nextLine();

            switch (tipoEnvio) {
                case 1:
                    EmailAviso aviso = new EmailAviso();
                    Prin.enviarAviso(aviso, mensagem, destino);
                    break;
                case 2:
                    PushAviso aviso2 = new PushAviso();
                    Prin.enviarAviso(aviso2, mensagem, destino);
                    break;
                case 3:
                    SmsAviso aviso3 = new SmsAviso();
                    Prin.enviarAviso(aviso3, mensagem, destino);
                    break;
                default:
                    System.out.println("Tipo invalido");
                    break;
            }


            System.out.println("Deseja enviar uma nova mensagem? 1 = Sim, 2 = Não");
            resposta = input.nextInt();
            input.nextLine();

            if (resposta == 2) {
                System.out.println("Saindo...");
                enviarNovamente = false;
            }
        }
    }


}
