package com.example.recyclerview2;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ThirdFragment extends Fragment {

    String[] arraynama_third = {"Lorem", "Ipsum", "Dolor", "Sit Amet", "Consectetur", "Adipiscing Elit", "Sed do eiusmod"};
//    int[] arraygambar_third = {};

    RecyclerView rvThird;
    ThirdAdapter adaptertiga;

    public ThirdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View inflate = inflater.inflate( R.layout.fragment_third, container, false );


        adaptertiga = new ThirdAdapter();

        rvThird = inflate.findViewById( R.id.third_list );

        rvThird.setLayoutManager( new LinearLayoutManager( getActivity(), LinearLayoutManager.VERTICAL, false ) );

        rvThird.setAdapter( adaptertiga );

        // Inflate the layout for this fragment
        return inflate;
    }

    private class ThirdAdapter extends RecyclerView.Adapter<MyViewHolder> {
        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View v = LayoutInflater.from(viewGroup.getContext()).inflate( R.layout.third_list, viewGroup, false );

            return new MyViewHolder( v );
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
            myViewHolder.tvKu.setText( arraynama_third[i] );
            myViewHolder.itemView.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            } );
//myViewHolder.imgtiga.setImageResource( arraygambar_third[i] );
        }

        @Override
        public int getItemCount() {
            return arraynama_third.length;
        }
    }

    private class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvKu;

        public MyViewHolder(@NonNull View itemView) {
            super( itemView );

            tvKu = itemView.findViewById( R.id.thirdlist );
        }
    }
}
