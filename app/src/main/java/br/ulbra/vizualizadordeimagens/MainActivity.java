package br.ulbra.vizualizadordeimagens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    ImageView imgfoto;
    Button btfoto1, btfoto2;
    TextView txtinformacao, txtTitulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgfoto = (ImageView) findViewById(R.id.imgfoto);
        txtTitulo = (TextView) findViewById(R.id.txtTitulo);
        txtinformacao = (TextView) findViewById(R.id.txtinformacao);
//        btfoto1 = (Button) findViewById(R.id.btfoto1);
//        btfoto2 = (Button) findViewById(R.id.btfoto2);
        Switch switch1 = (Switch) findViewById(R.id.switch1);
//        btfoto1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View arg0) {
//                imgfoto.setImageResource(R.drawable.foto1);
//                txtinformacao.setText("Foto 1");
//            }
//        });
//        btfoto2.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View arg0) {
//                imgfoto.setImageResource(R.drawable.foto2);
//                txtinformacao.setText("Foto 2");
//
//            }
//        });
        Switch sw = (Switch) findViewById(R.id.switch1);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    imgfoto.setImageResource(R.drawable.foto2);
                    txtinformacao.setText("Gato magro!");
                    txtTitulo.setText("Engorde o gato");
                } else {
                    imgfoto.setImageResource(R.drawable.foto1);
                    txtinformacao.setText("Gato gordo!");
                    txtTitulo.setText("Emagreça o gato");

                }
            }
        });
    }
}
