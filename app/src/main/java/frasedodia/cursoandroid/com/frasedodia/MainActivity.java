package frasedodia.cursoandroid.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    private String[] frases= {
            "So close don't matter how far!",
            "we can be, watta we can be!",
            "A man must do watta a man must do!",
            "we do what we must!",
            "All is broken can be reforged!"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = (TextView) findViewById(R.id.textoNovafraseId);
        botaoNovaFrase = (Button) findViewById(R.id.botaonovafraseId);

        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Random randomico = new Random();
                int numero = randomico.nextInt(frases.length);

                textoNovaFrase.setText(frases[ numero ]);
            }
        });
    }
}
