package com.essejose.demornavigationbar.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.essejose.demornavigationbar.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FormularioFragment extends Fragment  implements View.OnClickListener {

    private EditText value1;

    private EditText value2;

    private TextView resultado;

    private Button button_soma, button_subtrair, button_dividir, button_multiplicar;

    private  int result;
    private  int v1;
    private  int v2;


    public FormularioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View itemView = inflater.inflate(R.layout.fragment_formulario, container, false);

        value1 = (EditText) itemView.findViewById(R.id.valor1);
        value2 = (EditText) itemView.findViewById(R.id.valor2);
        resultado = (TextView) itemView.findViewById(R.id.resultado);
        button_soma = (Button) itemView.findViewById(R.id.btnsoma);
        button_dividir = (Button) itemView.findViewById(R.id.btndivisao);
        button_subtrair = (Button) itemView.findViewById(R.id.btnsub);
        button_multiplicar = (Button) itemView.findViewById(R.id.btnmultiplicao);


        button_soma.setOnClickListener(this);
        button_dividir.setOnClickListener(this);
        button_subtrair.setOnClickListener(this);
        button_multiplicar.setOnClickListener(this);

        return itemView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnsoma:
                soma();
                break;
            case R.id.btndivisao:
                dividir();
                break;
            case R.id.btnsub:
                subtrair();
                break;
            case R.id.btnmultiplicao:
                multiplicar();
                break;
            default:
                break;
        }
    }

    public void soma(){
        v1 = Integer.parseInt(value1.getText().toString());
        v2 = Integer.parseInt(value2.getText().toString());

        result = v1 + v2;
        resultado.setText(String.valueOf(result));

    }

    public void dividir(){
        v1 = Integer.parseInt(value1.getText().toString());
        v2 = Integer.parseInt(value2.getText().toString());

        result = v1 / v2;
        resultado.setText(String.valueOf(result));

    }

    public void subtrair(){
        v1 = Integer.parseInt(value1.getText().toString());
        v2 = Integer.parseInt(value2.getText().toString());

        result = v1 - v2;
        resultado.setText(String.valueOf(result));

    }

    public void multiplicar(){
        v1 = Integer.parseInt(value1.getText().toString());
        v2 = Integer.parseInt(value2.getText().toString());

        result = v1 * v2;
        resultado.setText(String.valueOf(result));

    }

}
