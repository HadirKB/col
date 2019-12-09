package com.example.colocation.ui.add_offer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.example.colocation.R;

public class AddOfferFragment extends Fragment {

    private AddOfferViewModel addOfferViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        addOfferViewModel =
                ViewModelProviders.of(this).get(AddOfferViewModel.class);
        View root = inflater.inflate(R.layout.fragment_add_offer, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        addOfferViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}