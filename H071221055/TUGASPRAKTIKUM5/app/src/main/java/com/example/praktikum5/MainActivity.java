package com.example.praktikum5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;


import android.os.Bundle;
import android.widget.ImageView;

import com.example.praktikum5.fragment.HomeFragment;
import com.example.praktikum5.fragment.PostinganFragment;
import com.example.praktikum5.fragment.ProfileFragment;
import com.example.praktikum5.fragment.SearchFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ImageView iv_home = findViewById(R.id.IV_Home);
        ImageView iv_search = findViewById(R.id.IV_Search);
        ImageView iv_posting = findViewById(R.id.IV_Post);
        ImageView iv_profile = findViewById(R.id.IV_Profile);


        //Membuat objek FragmentManager yang digunakan untuk mengelola fragmen dalam aktivitas, dengan memanggil metode getSupportFragmentManager().
        FragmentManager fragmentManager = getSupportFragmentManager();

        // Membuat objek HomeFragment, yang akan ditampilkan di dalam aktivitas.
        HomeFragment homeFragment = new HomeFragment();

        //Mencari fragmen yang sudah ada dalam FragmentManager dengan tag yang sesuai dengan nama kelas HomeFragment.
        Fragment fragment = fragmentManager.findFragmentByTag(HomeFragment.class.getSimpleName());

        //Memeriksa apakah fragmen yang ditemukan bukan merupakan instance dari HomeFragment
        if (!(fragment instanceof HomeFragment)){
            fragmentManager
                    .beginTransaction() //Memulai transaksi untuk memanipulasi fragmen.
                    .add(R.id.frame_container, homeFragment) //Menambahkan homeFragment ke dalam container dengan id frame_container, yang merupakan sebuah FrameLayout di dalam layout activity_main.xml.
                    .commit(); //mengirim agar dieksekusi fragmentmanager
        }

        iv_posting.setOnClickListener(v -> {
            PostinganFragment postinganFragment = new PostinganFragment();
            Fragment f = fragmentManager.findFragmentByTag(PostinganFragment.class.getSimpleName());
            if (!(f instanceof PostinganFragment)){
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_container, postinganFragment)
                        .addToBackStack(null)
                        .commit();
            }

        });

        iv_profile.setOnClickListener(v -> {
            ProfileFragment profileFragment = new ProfileFragment();
            Fragment p = fragmentManager.findFragmentByTag(ProfileFragment.class.getSimpleName());
            if (!(p instanceof PostinganFragment)){
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_container, profileFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });

        iv_home.setOnClickListener(v -> {
            HomeFragment homeFragment1 = new HomeFragment();
            Fragment h = fragmentManager.findFragmentByTag(HomeFragment.class.getSimpleName());
            if (!(h instanceof PostinganFragment)){
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_container, homeFragment1)
                        .addToBackStack(null)
                        .commit();
            }
        });

        iv_search.setOnClickListener(v -> {
            SearchFragment searchFragment = new SearchFragment();
            Fragment s = fragmentManager.findFragmentByTag(SearchFragment.class.getSimpleName());
            if (!(s instanceof PostinganFragment)){
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.frame_container, searchFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
}