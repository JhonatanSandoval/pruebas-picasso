package net.touchsf.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cargarImagen();

    }

    private void cargarImagen() {
        ImageView ivImagen = (ImageView) findViewById(R.id.ivImagen);
        Picasso.with(MainActivity.this)
                .load("https://image.freepik.com/iconos-gratis/logo-android_318-53348.jpg")
                .into(ivImagen);

    }

}
