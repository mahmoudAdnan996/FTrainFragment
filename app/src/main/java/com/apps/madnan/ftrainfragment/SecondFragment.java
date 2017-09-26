package com.apps.madnan.ftrainfragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class SecondFragment extends Fragment {

    @BindView(R.id.dataRV)
    RecyclerView dataRec;

    List<Info> list = new ArrayList<>();
    MyAdapter myAdapter;

    public SecondFragment() {

    }

    public static SecondFragment newInstance(ArrayList<String> arrayList) {

        SecondFragment fragment = new SecondFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

            list = (List<Info>) getArguments().getSerializable("data");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_second, container, false);
        ButterKnife.bind(this, view);

        myAdapter = new MyAdapter(list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
//        dataRec.setLayoutManager(layoutManager);

//        dataRec.setAdapter(myAdapter);


        return view;
    }

}
