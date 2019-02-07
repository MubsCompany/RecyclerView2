package com.example.recyclerview2;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {

    RecyclerView rvlayoutdua;

    String[] arrayJenis = {"MacBook core i5 (8/12GB/MacOs HightSierra)","MacBook Air core i5 (8/12GB/MacOs El Capitan2)","MacBook Air core i5 (8/12GB/MacOs El Capitan)","MacBook Air core i5 (8/12GB/MacOs Mojave)","MacBook core i5 (8/12GB/MacOs HightSierra)","MacBook Air core i5 (8/12GB/MacOs Sierra)"};
    String[] arraysSpesifikasi = {"15 inch, Rose, 1.7kg","13 inch, White, 1.35 kg","13 inch, Rose, 1.35 kg","13 inch, Gold, 1.35 kg","15 inch, Black, 1.7 kg","13 inch, Silver, 1.35 kg"};
    int[] arrayGambar = {R.drawable.rosegoldmacbook,R.drawable.macairsil,R.drawable.macrose,R.drawable.macairgold,R.drawable.macblack,R.drawable.mac_air_silver};

    LayoutduaAdapter adapter;

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View glue = inflater.inflate( R.layout.fragment_second, container, false );

        adapter = new LayoutduaAdapter();

        rvlayoutdua = glue.findViewById( R.id.layout_listdua );

rvlayoutdua.setLayoutManager( new LinearLayoutManager( getActivity(),LinearLayoutManager.VERTICAL,false ) );
rvlayoutdua.setAdapter( adapter );

        // Inflate the layout for this fragment
        return glue;
    }

    private class LayoutduaAdapter extends RecyclerView.Adapter<MyViewHolder> {
        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View v = LayoutInflater.from( viewGroup.getContext() ).inflate( R.layout.list_layoutdua,viewGroup,false );

            return new MyViewHolder( v );
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
myViewHolder.txtJenis.setText( arrayJenis[i] );
myViewHolder.gambar.setImageResource( arrayGambar[i] );
myViewHolder.txtspesifikasi.setText( arraysSpesifikasi[i] );
myViewHolder.itemView.setOnClickListener( new View.OnClickListener() {
    @Override
    public void onClick(View v) {

    }
} );
        }

        @Override
        public int getItemCount() {
            return arrayJenis.length;
        }
    }

    private class MyViewHolder extends RecyclerView.ViewHolder {

        TextView txtJenis;
        ImageView gambar;
        TextView txtspesifikasi;

        public MyViewHolder(@NonNull View itemView) {
            super( itemView );

txtJenis = itemView.findViewById( R.id.txt_layoutdua_a );
txtspesifikasi = itemView.findViewById( R.id.txt_layoutdua_b );
gambar = itemView.findViewById( R.id.img_layoutdua );
        }
    }
}
