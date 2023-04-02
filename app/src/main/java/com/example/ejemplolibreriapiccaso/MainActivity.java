package com.example.ejemplolibreriapiccaso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

        import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
//declaor lo que ocupo

    //donde se ven las imagenes
    ImageView imagenes;

    //lo botones que mostraran las imagenes
    Button btnimg1, btnimg2, btnimg3, btnimg4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //referimos las variables a los objetos

        imagenes = findViewById(R.id.Visuaizador);
        btnimg1 = findViewById(R.id.IMG1);
        btnimg2 = findViewById(R.id.IMG2);
        btnimg3 = findViewById(R.id.IMG3);
        btnimg4 =findViewById(R.id.IMG4);

        btnimg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Picasso.get().load(R.drawable.bacend).resize(512,512).centerCrop().into(imagenes);
            }
        });

        btnimg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Picasso.get().load(R.drawable.kali).resize(512,512).centerCrop().into(imagenes);
            }
        });

        btnimg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Picasso.get().load(R.drawable.me_quema).resize(512,512).centerCrop().into(imagenes);
            }
        });
    btnimg4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Picasso.get().load(R.drawable.me_duele).into(imagenes);
        }
    });

    }
}