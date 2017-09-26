package com.apps.madnan.ftrainfragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class FirstFragment extends Fragment {

    @BindView(R.id.nameET)
    EditText nameET;
    @BindView(R.id.ageET)
    EditText ageET;

    String name;
    int age;


    ArrayList<String> arrayList = new ArrayList<String>();

    public FirstFragment() {

    }


    public static FirstFragment newInstance() {
        return new FirstFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_first, container, false);
        ButterKnife.bind(this,view);
        return view;
    }

    @OnClick(R.id.addB)
    public void addClick(){

        name = nameET.getText().toString();
        age = Integer.parseInt(ageET.getText().toString());
        arrayList.add(name + ":" + age);

        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.attach(SecondFragment.newInstance(arrayList));
        transaction.commit();

    }
}
