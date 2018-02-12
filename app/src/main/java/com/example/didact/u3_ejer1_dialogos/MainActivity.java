package com.example.didact.u3_ejer1_dialogos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNombre;
    Spinner spYear;
    ListView lvEstudios;
    TextView tvEstudios;
    CheckBox cbTerminos;
    Button btnComprobar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = (EditText)findViewById(R.id.etNombre);
        spYear = (Spinner) findViewById(R.id.spYear);
        lvEstudios = (ListView) findViewById(R.id.lvEstudios);
        tvEstudios = (TextView) findViewById(R.id.tvEstudios);
        cbTerminos = (CheckBox) findViewById(R.id.cbTerminos);
        btnComprobar = (Button) findViewById(R.id.btnComprobar);

        //Datos a mostrar en el ListView
        String [] estudios = {"ESO", "Grado Medio", "Grado Superior", "Licenciatura"};

        //Crear el Adaptador
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,estudios);

        //Añadir el adaptador al ListView
        lvEstudios.setAdapter(adaptador);

        //Añadir el mensaje en un evento click
        lvEstudios.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String estudios_selecionados = parent.getItemAtPosition(position).toString();
                tvEstudios.setText(estudios_selecionados);

            }
        });


    }//FIN onCreate







}//FIN MainActivity
