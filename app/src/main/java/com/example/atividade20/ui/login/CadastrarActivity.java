package com.example.atividade20.ui.login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.atividade20.R;

public class CadastrarActivity extends AppCompatActivity {
    EditText usuario;
    EditText senhas;
    Button cadastrar;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastrar);
        usuario = (EditText) findViewById(R.id.editusuario);
        senhas = (EditText) findViewById(R.id.editsenhas);
        cadastrar = (Button) findViewById(R.id.editcadastrar);

        cadastrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (!usuario.getText().toString().isEmpty()&& !senhas.getText().toString().isEmpty()) {
                    Toast.makeText(CadastrarActivity.this, "Usuário Cadastrado", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(CadastrarActivity.this, "Usuário não Cadastrado", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}



