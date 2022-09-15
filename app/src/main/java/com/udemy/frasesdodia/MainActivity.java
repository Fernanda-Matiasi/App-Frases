package com.udemy.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view) {

        String[] frases = {
                "Neste momento, te desejo apenas uma coisa: que você seja muito feliz!",
                "Que o amor esteja presente do começo ao fim do seu dia!",
                "Tenha um bom dia, uma tarde produtiva e uma noite fantástica!",
                "A fé torna as coisas possíveis, não fáceis.",
                "A felicidade é uma forma de coragem!",
                "Não seja vítima das dificuldades, tente ultrapassá-las!",
                "Erros são as provas de que estamos tentando.",
                "A vida é muito curta para começar o dia com pedaços partidos de ontem.",
                "Um novo dia sempre revela uma nova força e um novo pensamento.",
                "Espere mais de você do que das outras pessoas. Tenha um dia produtivo e inspire as pessoas ao seu redor."
        };
        int number = new Random().nextInt(11);
        TextView text = findViewById(R.id.frase);
        text.setText(frases[number]);
    }


}