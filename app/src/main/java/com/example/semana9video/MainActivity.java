package com.example.semana9video;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = findViewById(R.id.videoView);

        // Establece la ubicación del video en res/raw (o res/assets)
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video;

        // Configura el controlador de medios para controlar la reproducción
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);

        // Establece el controlador de medios en el VideoView
        videoView.setMediaController(mediaController);

        // Establece la ruta del video y comienza la reproducción
        videoView.setVideoURI(Uri.parse(videoPath));
        videoView.start();
    }
}