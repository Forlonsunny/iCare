package com.theoakteam.sunny_pc.oakicare.Sunny;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.theoakteam.sunny_pc.oakicare.Sunny.Module.Profile;
import com.theoakteam.sunny_pc.oakicare.Sunny.ProfileDabase.ProfileDataBase;
import com.theoakteam.sunny_pc.oakicare.R;

/**
 * Created by Mobile App Develop on 17-6-15.
 */
public class ProfileDetails extends Activity {
    EditText getTxt_pName,getTxt_pHeight,getTxt_pweight,getTxt_pBloodGroup;
    private ProfileDataBase mProfileDataBase;
    private  Profile mProfile;
    private Button upButton;
    String flag;
    long eMid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.createi_crea_profile_xml);


        intilizationOfViews();


        Intent mEIntent = getIntent();
        flag = mEIntent.getStringExtra("id");
        if (flag != null) {
            eMid = Long.parseLong(flag);
            upButton.setText("Update");

            mProfileDataBase = new ProfileDataBase(this);
            mProfile = mProfileDataBase.getAllProfilesById(eMid);
            getTxt_pName.setText(mProfile.getmName());
            getTxt_pHeight.setText(mProfile.getmHeigh());
            getTxt_pweight.setText(mProfile.getmWeight());
            getTxt_pBloodGroup.setText(mProfile.getmBlood());



        }
    }

    private void intilizationOfViews() {
        getTxt_pName=(EditText)findViewById(R.id.et_p_name);
        getTxt_pHeight=(EditText)findViewById(R.id.et_p_height);
        getTxt_pweight=(EditText)findViewById(R.id.et_p_weight);
        getTxt_pBloodGroup=(EditText)findViewById(R.id.et_p_bloodgroup);
        upButton=(Button)findViewById(R.id.addProfileBt);
    }
    public void AddbtAction(View view){
        Editable prName=getTxt_pName.getText();
        Editable prHeight=getTxt_pHeight.getText();
        Editable prWeight=getTxt_pweight.getText();
        Editable prBloodgropup=getTxt_pBloodGroup.getText();
        if(!TextUtils.isEmpty(prName) && !TextUtils.isEmpty(prHeight) && !TextUtils.isEmpty(prWeight) &&
                !TextUtils.isEmpty(prBloodgropup) )
        {
            Profile creatNewProflie=mProfileDataBase.creatNewProflie(prName.toString(),prHeight.toString(),prWeight.toString(),prBloodgropup.toString());

        }
        else
        {
            Toast.makeText(this, "You Must Fill all Requirement  ", Toast.LENGTH_LONG).show();
        }
        finish();
    }
}
