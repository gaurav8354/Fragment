package com.example.fragmenttest;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentB extends Fragment {
    Button button;
    TextView textView;
    EditText editText;
    View view1;
    @Nullable
    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragmentb,container,false);
        Bundle bundle=getArguments();
        if(bundle!=null)
        {
            TextView textView=view.findViewById(R.id.tv_fragment_b);
            textView.setText(bundle.getString("data"));
        }
         view1=inflater.inflate(R.layout.fragmenta,container,false);
         button=view.findViewById(R.id.button_fragmentb);
         textView=view.findViewById(R.id.tv_fragment_b);
         editText=view.findViewById(R.id.et_fragmentb);
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if(!editText.getText().toString().isEmpty())
                 {
                    //communicator.respond(editText.getText().toString(),0);
                     Bundle bundle=new Bundle();
                     bundle.putString("123",editText.getText().toString());
                     FregmentSameScreen fregmentSameScreen= (FregmentSameScreen) getActivity();
                     fregmentSameScreen.dataRecivedFromA(editText.getText().toString(),'B');
                 }
                 else
                 {
                     editText.setError("please enter");
                 }
             }
         });



        return view;
    }



}
