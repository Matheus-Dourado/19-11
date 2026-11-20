package br.com.etecia.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuPrincipal extends AppCompatActivity {
    Button btnAvanca,btnConfiguracoes,bntSobre,btnProdutos,btnVendas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.menu_principal_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnConfiguracoes = findViewById(R.id.btnConfiguracoes);
        btnAvanca = findViewById(R.id.btnAvanca);
        bntSobre = findViewById(R.id.btnSobre);
        btnProdutos = findViewById(R.id.btnProdutos);
        btnVendas = findViewById(R.id.btnVendas);


        btnAvanca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), LoginActivity.class ));
                finish();
            }
        });
        btnConfiguracoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)  {
                startActivity(new Intent(getApplicationContext(), ConfiguracoesActivity.class ));
                finish();
            }
        });
        bntSobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)  {
                startActivity(new Intent(getApplicationContext(), SobreActivity.class ));
                finish();
            }
        });
        btnProdutos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)  {
                startActivity(new Intent(getApplicationContext(), ProdutosActivity.class ));
                finish();
            }
        });
        btnVendas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)  {
                startActivity(new Intent(getApplicationContext(), VendasActivity.class ));
                finish();
            }
        });
    }
}