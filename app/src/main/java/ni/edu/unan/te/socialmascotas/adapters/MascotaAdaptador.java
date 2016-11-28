package ni.edu.unan.te.socialmascotas.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import ni.edu.unan.te.socialmascotas.vistas.Mascota;
import ni.edu.unan.te.socialmascotas.R;

/**
 * Created by Felipe on 13/11/2016.
 */

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder>
{
    ArrayList<Mascota> Mascotas;
     public MascotaAdaptador( ArrayList<Mascota> Mascotas )
     {
        this.Mascotas= Mascotas;
     }


    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.detallemascota, parent, false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MascotaViewHolder holder, int position)
    {
        final Mascota mascota = Mascotas.get(position);
        holder.ivFotoDetalle.setImageResource(mascota.getFoto());
        holder.tvNamePuppy.setText(mascota.getNombre());
        holder.tvLikesDetalle.setText(""+mascota.getLikes());
    }

    @Override
    public int getItemCount() {
        return Mascotas.size();
    }


    public static class MascotaViewHolder extends RecyclerView.ViewHolder
    {
        private ImageView ivFotoDetalle;
        private TextView tvNamePuppy;
        private TextView tvLikesDetalle;
        private ImageButton imgBtnLike;

        public MascotaViewHolder(View itemView)
        {
            super(itemView);
            ivFotoDetalle = (ImageView) itemView.findViewById(R.id.ivFotoDetalle);
            tvNamePuppy = (TextView) itemView.findViewById(R.id.TvNamePuppy);
            tvLikesDetalle = (TextView) itemView.findViewById(R.id.tvLikesDetalle);
            imgBtnLike = (ImageButton) itemView.findViewById(R.id.imgBoneLike);
            imgBtnLike.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), "Diste clic a "+ tvNamePuppy.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

}
