package com.example.myapplication;

import java.util.ArrayList;

public class DataSource {

//    public static ArrayList<Postingan> postingans = generateDummyPostingans();
//
//    private static ArrayList<Postingan> generateDummyPostingans() {
//        ArrayList<Postingan> postingans = new ArrayList<>();
//        postingans.add(new Postingan(R.drawable.burberry,"burberry", R.drawable.burberrypost, "knight in soap"));
//        postingans.add(new Postingan(R.drawable.coach,"coach", R.drawable.coachpost, "Made to Feel Good in"));
//        postingans.add(new Postingan(R.drawable.dior,"dior", R.drawable.diorpost, "new york's edition"));
//        postingans.add(new Postingan(R.drawable.gucci,"gucci", R.drawable.guccipost, "The Most Extensive"));
//        postingans.add(new Postingan(R.drawable.guess,"guess", R.drawable.guesspost, "Be you, Be somethinc"));
//        postingans.add(new Postingan(R.drawable.hermes,"hermes", R.drawable.hermespost, "Last chapter"));
//        postingans.add(new Postingan(R.drawable.polo,"polo", R.drawable.polopost, "Perfect coverage and long-lasting!"));
//        postingans.add(new Postingan(R.drawable.prada,"prada", R.drawable.pradapost, "Mother Knows Best"));
//        postingans.add(new Postingan(R.drawable.lv,"lv", R.drawable.lvpost, "Color the Life"));
//        postingans.add(new Postingan(R.drawable.crocs,"crocs", R.drawable.crocspost, "Grab it fast!"));
//        return postingans;
//    }
//
//    public static ArrayList<Story> stories = generateDummyStorys();
//
//    private static ArrayList<Story> generateDummyStorys() {
//        ArrayList<Story> stories = new ArrayList<>();
//        stories.add(new Story("burberry",R.drawable.burberry));
//        stories.add(new Story("coach",R.drawable.coach));
//        stories.add(new Story("dior", R.drawable.dior));
//        stories.add(new Story("gucci",R.drawable.gucci));
//        stories.add(new Story("guess",R.drawable.guess));
//        stories.add(new Story("hermes",R.drawable.hermes));
//        stories.add(new Story("polo",R.drawable.polo));
//        stories.add(new Story("prada",R.drawable.prada));
//        stories.add(new Story("lv",R.drawable.lv));
//        stories.add(new Story("crocs",R.drawable.crocs));
//        return stories;
//    }

    public static ArrayList<tes> newdata = generateDummyData();

    private  static ArrayList<tes> generateDummyData(){
        ArrayList <tes> newdata = new ArrayList<>();
        newdata.add(new tes("burberry","burberry","295K","300","new things",R.drawable.burberry,R.drawable.burberrypost,R.drawable.burberrystory));
        newdata.add(new tes("coach","coach","295K","300","new things",R.drawable.coach,R.drawable.coachpost,R.drawable.coachstory));
        newdata.add(new tes("dior","dior","295K","300","new things",R.drawable.dior ,R.drawable.diorpost,R.drawable.diorstory));
        newdata.add(new tes("gucci","gucci","295K","300","new things",R.drawable.gucci,R.drawable.guccipost,R.drawable.guccistory));
        newdata.add(new tes("guess","guess","295K","300","new things",R.drawable.guess,R.drawable.guesspost,R.drawable.guessstory));
        newdata.add(new tes("hermes","hermes","295K","300","new things",R.drawable.hermes,R.drawable.hermespost,R.drawable.hermesstory));
        newdata.add(new tes("polo","polo","295K","300","new things",R.drawable.polo,R.drawable.polopost,R.drawable.polostory));
        newdata.add(new tes("prada","prada","295K","300","new things",R.drawable.prada,R.drawable.pradapost,R.drawable.pradastory));
        newdata.add(new tes("lv","lv","295K","300","new things",R.drawable.lv,R.drawable.lvpost,R.drawable.lvstory));
        newdata.add(new tes("crocs","crocs","295K","300","new things",R.drawable.crocs,R.drawable.crocspost,R.drawable.crocsstory));
        return newdata;
    }
}
