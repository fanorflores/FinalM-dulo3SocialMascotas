package ni.edu.unan.te.socialmascotas.vistas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

import ni.edu.unan.te.socialmascotas.R;
import ni.edu.unan.te.socialmascotas.adapters.MascotaAdaptador;

public class Main2Activity extends AppCompatActivity {

    private ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar action_bar = (Toolbar) findViewById(R.id.action_bar);
        setSupportActionBar(action_bar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("5 Favoritas");
        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager linearLayoutManager =  new LinearLayoutManager(getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(linearLayoutManager);

        inicializarMascotas();
        inicializarAdaptador();

    }

    public void inicializarAdaptador()
    {
        MascotaAdaptador mascotaAdaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(mascotaAdaptador);
    }

    public void inicializarMascotas()
    {
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.pluto,"Puppy 1", 5));
        mascotas.add(new Mascota(R.drawable.pluto3,"Puppy 3", 4));
        mascotas.add(new Mascota(R.drawable.pluto5,"Puppy 5", 6));
        mascotas.add(new Mascota(R.drawable.pluto6,"Puppy 6", 5));
        mascotas.add(new Mascota(R.drawable.pluto7,"Puppy 7", 6));


    }
}
