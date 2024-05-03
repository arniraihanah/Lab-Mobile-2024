package com.example.praktikum5;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Instagram> instagrams =generateDummyInstagram();

    private static ArrayList<Instagram> generateDummyInstagram() {
        ArrayList<Instagram> instagrams1 = new ArrayList<>();
        instagrams1.add(new Instagram("coach", "Coach Official", "Find your perfect destination with this limited time offer of our Bombshell Isle Bundle and save up to 41%."
                ,R.drawable.coach, R.drawable.coachpost));

        instagrams1.add(new Instagram("dior", "Dior Official", " a fusion of lightweight comfort and chic sophistication!"
                ,R.drawable.dior, R.drawable.diorpost));

        instagrams1.add(new Instagram("hermes", "Hermes Official", "Bolder Superstar with amped-up comfort. Classic details, reworked proportions, ready to dress up or down."
                ,R.drawable.hermes, R.drawable.hermespost));

        instagrams1.add(new Instagram("louis vuitton", "Louis Vuitton Official", "Explore Louis Vuitton's handbags for women blending innovation, elegance & style."
                ,R.drawable.lv, R.drawable.lvpost));

        instagrams1.add(new Instagram("Polo", "Polo Official", "Shop Ralph Lauren's designer clothing for men, women, kids & babies, plus accessories and home furnishings. "
                ,R.drawable.polo, R.drawable.polopost));

        return instagrams1;

    }

}

