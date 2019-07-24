package com.example.fragmenttest;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class FragmentA extends Fragment {
    View view;
    String string;
    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         view=inflater.inflate(R.layout.fragmenta,container,false);
Bundle b=getArguments();
if(b!=null)
{
    String data=b.getString("data");
    TextView textView=view.findViewById(R.id.tv_fragment_a);
    EditText editText=view.findViewById(R.id.et_fragmenta);
    textView.setText(data);
}
view.findViewById(R.id.button_fragmenta).setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view1) {
        FregmentSameScreen  fregmentSameScreen= (FregmentSameScreen) getActivity();
        EditText editText=view.findViewById(R.id.et_fragmenta);
        string=editText.getText().toString();
        fregmentSameScreen.dataRecivedFromA(string, 'A');
    }
});
        return view;
    }


}
