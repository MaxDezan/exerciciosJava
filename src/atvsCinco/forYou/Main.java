package atvsCinco.forYou;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Midia> fy = new ArrayList<>();

        fy.add(new Reels("Why do coins have ridges?", "DiddenBludOhio67", "https://123", 12));
        fy.add(new Tiktok("O que este diddy blud esta fazendo na calculadora", "67noitescomEpstein", "https://123",24));
        fy.add(new Podcast("Mulher lesbica vs homem machista", "spotniks", "https://123", 120));

        fy.sort(Comparator.comparingInt(Midia::duracao));

        for (Midia midia : fy){
            midia.reproduzir();
        }
    }
}
