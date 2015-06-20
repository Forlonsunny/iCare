package com.theoakteam.sunny_pc.oakicare.Sunny;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.theoakteam.sunny_pc.oakicare.Sunny.Module.Profile;
import com.theoakteam.sunny_pc.oakicare.Sunny.ProfileDabase.ProfileDataBase;
import com.theoakteam.sunny_pc.oakicare.R;

/**
 * Created by Sunny_PC on 6/10/2015.
 */
public class CreateiCareProfile extends Activity {
    EditText getTxt_pName,getTxt_pHeight,getTxt_pweight,getTxt_pBloodGroup;
    private ProfileDataBase mProfileDataBase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.createi_crea_profile_xml);


        intilizationOfViews();
        this.mProfileDataBase=new ProfileDataBase(this);

    }

    private void intilizationOfViews() {
        getTxt_pName=(EditText)findViewById(R.id.et_p_name);
        getTxt_pHeight=(EditText)findViewById(R.id.et_p_height);
        getTxt_pweight=(EditText)findViewById(R.id.et_p_weight);
        getTxt_pBloodGroup=(EditText)findViewById(R.id.et_p_bloodgroup);
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
            Intent intent = new Intent();
            intent.putExtra(MainActivity.EXTRA_ADDED_PROFILE, creatNewProflie);
            setResult(RESULT_OK, intent);
        }
        else
        {
            Toast.makeText(this,"You Must Fill all Requirement  ", Toast.LENGTH_LONG).show();
        }
        finish();
    }
}
