package com.jorge.noplanetb;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class BSplash extends AppCompatActivity {


    ImageView imagenLogo;
    TextView txtTitulo;
    TextView txtDescripcion;


    @RequiresApi(api = Build.VERSION_CODES.O)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        imagenLogo = findViewById(R.id.ImagenSplash);
        txtDescripcion = findViewById(R.id.txtDescripcion);
        txtTitulo = (TextView) findViewById(R.id.txtTitulo);

        getSupportActionBar().hide();


        //Typeface myFont = Typeface.createFromAsset(getAssets(), "bromello.otf");
        //txtTitulo.setTypeface(myFont);

        //Typeface typeface = getResources().getFont(R.font.bromello);
       // txtTitulo.setTypeface(typeface);

        Animation anima = AnimationUtils.loadAnimation(this, R.anim.animuno);
        Animation mytextanim = AnimationUtils.loadAnimation(this,R.anim.animdos);

        imagenLogo.startAnimation(anima);

        txtTitulo.startAnimation(mytextanim);
        txtDescripcion.startAnimation(mytextanim);

        abrirApp(true);


    }

    private void abrirApp(boolean b) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(BSplash
                        .this, BLogin.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}
