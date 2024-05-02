package com.example.praktikum_4;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Instagram> instagrams = generateDummyInstagrams();

    private static ArrayList<Instagram> generateDummyInstagrams() {
        ArrayList<Instagram> instagrams1 = new ArrayList<>();
        instagrams1.add(new Instagram("burberry","Burberry"
                ,"You can’t eclipse #idol tonight "
                ,R.drawable.burberry,R.drawable.burberrypost));

        instagrams1.add(new Instagram("coach", "Coach"
                ,"A @petrafcollins appreciation post"
                ,R.drawable.coach,R.drawable.coachpost));

        instagrams1.add(new Instagram("crocs", "Crocs"
                ,"Shop the Crocs™ official website for casual shoes, sandals & more. Free Shipping on qualifying orders. "
                ,R.drawable.crocs, R.drawable.crocspost));

        instagrams1.add((new Instagram("dior","Dior"
                ,"Discover Christian Dior fashion, fragrance and accessories for Women and Men."
                ,R.drawable.dior,R.drawable.diorpost)));

        instagrams1.add(new Instagram("gucci", "Gucci"
                ,"From elevated white tees and relaxed denim to of-the-moment bags from Bottega Veneta and Khaite."
                ,R.drawable.gucci,R.drawable.guccipost));

        instagrams1.add(new Instagram("guess","Guess"
                ,"On my way to go find Kate"
                ,R.drawable.guess, R.drawable.guesspost));

        instagrams1.add(new Instagram("hermes","Hermes"
                , "Discover all the collections of Hermès, fashion accessories, scarves and ties, belts and ready-to-wear, perfumes, watches and jewelry."
                ,R.drawable.hermes,R.drawable.hermespost));

        instagrams1.add(new Instagram("LV","Louis Vuitton"
                ,"Evoking everyday elegance, Louis Vuitton’s shoulder and cross-body bags are imbued with the Maison’s emblematic style codes."
                ,R.drawable.lv, R.drawable.lvpost));

        instagrams1.add(new Instagram("polo", "Polo"
                ,"Shop Ralph Lauren's designer clothing for men, women, kids & babies, plus accessories and home furnishings. Free Shipping With an RL Account & Free Returns."
                ,R.drawable.polo, R.drawable.polopost));

        instagrams1.add(new Instagram("prada", "prada"
                ,"Visit PRADA official website to brows and buy online the latest collections of bags, clothes, accessories and much more."
                ,R.drawable.prada, R.drawable.pradapost));
        return instagrams1;
    }
}

