package com.example.android_assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    private RadioGroup mRadioGroup;
    private Switch  mSwitch;
    private CheckBox mCheckBox;
    private ImageView mImageView;
    private ImageButton mImageButton;
    private Button refresh_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageButton=findViewById(R.id.imageButton);
        mImageView=findViewById(R.id.imageView);
        mCheckBox=findViewById(R.id.imagebuttonShow);
        mRadioGroup=findViewById(R.id.clickImage_rg);
        refresh_button=findViewById(R.id.refresh_button);
        mSwitch=findViewById(R.id.image_visible_switch);
    }
    public void onRefreshButtonPressed(View view)
    {
        if(mCheckBox.isChecked())
        {
            mImageButton.setVisibility(view.VISIBLE);
        }
        else
        {
            mImageButton.setVisibility(view.INVISIBLE);
        }
        int Id=mRadioGroup.getCheckedRadioButtonId();
        if(Id==R.id.Enable)
        {
            mImageButton.setClickable(true);
        }
        else
            mImageButton.setClickable(false);
        if(mSwitch.isChecked())
        {
            mImageView.setVisibility(view.VISIBLE);
        }
        else
            mImageView.setVisibility(view.INVISIBLE);
    }
}
