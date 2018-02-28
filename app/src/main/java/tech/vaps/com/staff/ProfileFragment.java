package tech.vaps.com.staff;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {


    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_profile, container, false);

        ImageView img_pic = (ImageView) v.findViewById(R.id.img_pic);

        //    ImageView img_pic1 = (ImageView) findViewById(R.id.img_pic1);

        // Image loading
        Glide.with(this)
                .load("https://bdcampusstrg.blob.core.windows.net/files/5/EmployeeProfilePics/f7c4794e-f6d5-4ea7-8f93-9527e3e9dba6.jpg")
                .into(img_pic);


        return v;
    }

}
