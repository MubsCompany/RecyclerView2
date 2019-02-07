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
public class FirstFragment extends Fragment {

    RecyclerView first_rv;
    RecyclerView second_rv;
    RecyclerView third_rv;

    //first frag
    String[] firstNama = {"Google Plus", "Gmail", "Inbox", "Google Keep", "Google Drive"};
    int[] firstGambar = {R.drawable.googleplus, R.drawable.gmail, R.drawable.inbox, R.drawable.googlekeep, R.drawable.drive};

    //second frag
    String[] secondNama = {"Google Keep", "Google Drive", "Hangouts", "Chrome", "Google Maps"};
    int[] secondGambar = {R.drawable.googlekeep, R.drawable.drive, R.drawable.hangout, R.drawable.chrome, R.drawable.googlemaps};

    //third frag
    String[] thirdNama = {"Google Maps", "Chrome", "Google Photo", "Google Play", "Adwords"};
    int[] thirdGambar = {R.drawable.googlemaps, R.drawable.chrome, R.drawable.photos, R.drawable.googleplay,  R.drawable.adwords};

    FirstAdapter adapter;
    SecondAdapter adapterdua;
    ThirdAdapter adaptertiga;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        adapter = new FirstAdapter();
        adapterdua = new SecondAdapter();
        adaptertiga = new ThirdAdapter();

        // Inflate the layout for this fragment
        View lem = inflater.inflate( R.layout.fragment_first, container, false );

        first_rv = lem.findViewById( R.id.snap );
        second_rv = lem.findViewById( R.id.start );
        third_rv = lem.findViewById( R.id.end );

        first_rv.setLayoutManager( new LinearLayoutManager( getActivity(), LinearLayoutManager.HORIZONTAL, false ) );
        second_rv.setLayoutManager( new LinearLayoutManager( getActivity(), LinearLayoutManager.HORIZONTAL, false ) );
        third_rv.setLayoutManager( new LinearLayoutManager( getActivity(), LinearLayoutManager.HORIZONTAL, false ) );

        first_rv.setAdapter( adapter );
        second_rv.setAdapter( adapterdua );
        third_rv.setAdapter( adaptertiga );

        return lem;
    }

    private class FirstAdapter extends RecyclerView.Adapter<FirstAdapter.MyViewHolder> {

        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View v = LayoutInflater.from( viewGroup.getContext() ).inflate( R.layout.first_list, viewGroup, false );
            return new MyViewHolder( v );
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
            myViewHolder.firstText.setText( firstNama[i] );
            myViewHolder.firstImage.setImageResource( firstGambar[i] );
            myViewHolder.itemView.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            } );
        }

        @Override
        public int getItemCount() {
            return firstNama.length;
        }

        private class MyViewHolder extends RecyclerView.ViewHolder {

            ImageView firstImage;
            TextView firstText;

            public MyViewHolder(@NonNull View itemView) {
                super( itemView );

                firstImage = itemView.findViewById( R.id.first_img );
                firstText = itemView.findViewById( R.id.first_txt );
            }
        }
    }


    //Second Recycler View..........................................................................
    private class SecondAdapter extends RecyclerView.Adapter<SecondAdapter.MyViewHolderDua> {
        @NonNull
        @Override
        public MyViewHolderDua onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View vdua = LayoutInflater.from( viewGroup.getContext() ).inflate( R.layout.first_list, viewGroup, false );
            return new MyViewHolderDua( vdua );
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolderDua myViewHolderDua, int i) {
            myViewHolderDua.secondImage.setImageResource( secondGambar[i] );
            myViewHolderDua.secondTxt.setText( secondNama[i] );
            myViewHolderDua.itemView.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            } );
        }

        @Override
        public int getItemCount() {
            return secondNama.length;
        }

        private class MyViewHolderDua extends RecyclerView.ViewHolder {

            TextView secondTxt;
            ImageView secondImage;

            public MyViewHolderDua(@NonNull View itemView) {
                super( itemView );

                secondImage = itemView.findViewById( R.id.first_img );
                secondTxt = itemView.findViewById( R.id.first_txt );
            }
        }
    }

//third Recycler View...............................................................................
    private class ThirdAdapter extends RecyclerView.Adapter<MyViewHolderTiga> {
        @NonNull
        @Override
        public MyViewHolderTiga onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View vtiga = LayoutInflater.from( viewGroup.getContext() ).inflate( R.layout.first_list, viewGroup, false );
            return new MyViewHolderTiga( vtiga );
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolderTiga myViewHolderTiga, int i) {
            myViewHolderTiga.thirdImage.setImageResource( thirdGambar[i] );
            myViewHolderTiga.thirdTxt.setText( thirdNama[i] );
            myViewHolderTiga.itemView.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            } );
        }

        @Override
        public int getItemCount() {
            return thirdNama.length;
        }
    }

    private class MyViewHolderTiga extends RecyclerView.ViewHolder {

        ImageView thirdImage;
        TextView thirdTxt;

        public MyViewHolderTiga(@NonNull View itemView) {
            super( itemView );

            thirdImage = itemView.findViewById( R.id.first_img );
            thirdTxt = itemView.findViewById( R.id.first_txt );

        }
    }
}
