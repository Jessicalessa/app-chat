package com.univesp.appchat.ui.login;


import android.app.Activity;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.univesp.appchat.R;
import com.univesp.appchat.databinding.ActivityFormcadastroBinding;
import com.univesp.appchat.databinding.ActivityMainBinding;
import com.univesp.appchat.ui.login.LoginViewModel;
import com.univesp.appchat.ui.login.LoginViewModelFactory;
import com.univesp.appchat.databinding.ActivityFormloginBinding;

class LoginActivity extends AppCompatActivity {

    private TextView text_tela_de_cadastro;

    private LoginViewModel loginViewModel;
    private ActivityFormloginBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();
        IniciarComponentes();
        text_tela_de_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this,ActivityFormcadastroBinding.class);
                startActivity(intent);
            }
        });

    }

    private void IniciarComponentes(){
        text_tela_de_cadastro=findViewById(R.id.text_tela_cadastro);
    }

}