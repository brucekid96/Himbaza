package com.example.himbaza;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.example.himbaza.MainActivity;

import java.util.ArrayList;
import java.util.List;

public class NoteActivity extends AppCompatActivity {

    private List<Cantique> cantiqueList;
    private Cantique cant;
    private TextView title;
    private TextView auteur;
    private TextView contenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cantique);




        Intent intent = getIntent();
        cant = intent.getParcelableExtra(Cantique.Cantique_EXTRA);


        title = findViewById(R.id.title);
        auteur = findViewById(R.id.line_bible);
        contenu = findViewById(R.id.cantique_song);
        title.setText(cant.getmTitle());
        auteur.setText(cant.getmAuteur());
        contenu.setText(cant.getmContenu());

    }
}
