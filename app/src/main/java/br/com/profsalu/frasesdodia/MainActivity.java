package br.com.profsalu.frasesdodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> frases = new ArrayList<>();
    Button botao;
    TextView texto;
    Random random = new Random();
    Boolean primeiroClick = false;
    int a,b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        carregarComponentes();
        frases();
        sortearFrases();
    }

    private void carregarComponentes(){
        botao = (Button) findViewById(R.id.botao_btn);
        texto = (TextView) findViewById(R.id.frases_txt);
    }

    private void frases(){
        frases.add("\"Só sei que nada sei, e o fato de saber isso, me coloca em vantagem sobre aqueles que acham que sabem alguma coisa.\"");
        frases.add("\"Daria tudo que sei pela metade do que ignoro.\"");
        frases.add("\"Eu não sei o que quero ser, mas sei muito bem o que não quero me tornar.\"");
        frases.add("\"Sofro calado por coisas que eu nem sei se um dia irão acontecer.\"");
        frases.add("\"Para conhecermos os amigos é necessário passar pelo sucesso e pela desgraça. No sucesso, verificamos a quantidade e, na desgraça, a qualidade.\"");
        frases.add("\"Sábio é aquele que conhece os limites da própria ignorância.\"");
        frases.add("\"A esperança é o sonho do homem acordado.\"");
        frases.add("\"O que ouço, sei;\n" +
                    "O que vejo, lembro;\n" +
                    "E o que faço, sei.\"");
        frases.add("\"É melhor corrigir os seus próprios erros do que corrigir os outros.\"");
        frases.add("\"A felicidade de sua vida depende da qualidade de seus pensamentos.\"");
    }

    private void sortearFrases(){
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random sorteia = new Random();
                texto.setText(frases.get(sorteia.nextInt(frases.size())));
            }
        });
    }
}
