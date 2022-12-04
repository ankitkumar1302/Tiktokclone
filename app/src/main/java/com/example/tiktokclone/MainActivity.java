package com.example.tiktokclone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.tiktokclone.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    ArrayList<Model> arrayList = new ArrayList<>();
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        this.getTheme().applyStyle(R.style.FullScreen,false);

        arrayList.add(new Model( "android.resource://" + getPackageName() + "/" + R.raw.a,R.drawable.man,"Ankit"));
        arrayList.add(new Model( "android.resource://" + getPackageName() + "/" + R.raw.b,R.drawable.man,"Ankit"));
        arrayList.add(new Model( "android.resource://" + getPackageName() + "/" + R.raw.c,R.drawable.man,"Ankit"));
        arrayList.add(new Model( "android.resource://" + getPackageName() + "/" + R.raw.d,R.drawable.man,"Ankit"));
        arrayList.add(new Model( "android.resource://" + getPackageName() + "/" + R.raw.e,R.drawable.man,"Ankit"));
        arrayList.add(new Model( "android.resource://" + getPackageName() + "/" + R.raw.happybirthday,R.drawable.man,"Ankit"));
        arrayList.add(new Model( "android.resource://" + getPackageName() + "/" + R.raw.passwordcrackingtechinques,R.drawable.man,"Ankit"));
        arrayList.add(new Model( "android.resource://" + getPackageName() + "/" + R.raw.toolsfordeveloper,R.drawable.man,"Ankit"));
        adapter = new Adapter(MainActivity.this,arrayList);
        binding.Vpg2.setAdapter(adapter);

    }
}