package org.tensorflow.lite.examples.detection;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import org.tensorflow.lite.examples.detection.env.Utils;

public class Abecedario extends AppCompatActivity {
    private Bitmap sourceBitmap;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abecedario);
        imageView = findViewById(R.id.abecedarioView);

        this.sourceBitmap = Utils.getBitmapFromAsset(Abecedario.this, "abecedario.png");
        this.imageView.setImageBitmap(sourceBitmap);
    }

    public void onClickVolverAbecedario(View v) {
        try {
            finish();
        }
        catch(Exception e) {
            //  Block of code to handle errors
        }

    }
}
