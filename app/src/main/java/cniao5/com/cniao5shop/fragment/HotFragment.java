package cniao5.com.cniao5shop.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import cniao5.com.cniao5shop.R;
/**
 * Created by Ivan on 15/9/22.
 */
public class HotFragment extends Fragment{


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_hot,container,false);

        return view ;

    }

}
