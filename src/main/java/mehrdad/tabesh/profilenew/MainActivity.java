package mehrdad.tabesh.profilenew;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView fullNameTv;
    private Button editProfileBtn, viewWebSiteBtn, saveInformationBtn;
    private CheckBox androidDevelopmentCb, deepLearningCh, uiDesignCh;
    private RadioGroup radioGroup;
    private RadioButton ghachsaranRb, tehranRb, shirazRb;

    public static final int REQUEST_CODE = 1412;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setIds
        fullNameTv = findViewById(R.id.tv_main_fullName);
        editProfileBtn = findViewById(R.id.btn_main_editProfile);
        viewWebSiteBtn = findViewById(R.id.btn_main_viewWebsite);
        saveInformationBtn = findViewById(R.id.btn_main_save);
        androidDevelopmentCb = findViewById(R.id.checkBox_main_androidDevelopment);
        deepLearningCh = findViewById(R.id.checkBox_main_deepLearning);
        uiDesignCh = findViewById(R.id.checkBox_main_uiDesign);
        radioGroup = findViewById(R.id.radio_group_cities);

        ghachsaranRb = findViewById(R.id.rb_main_yasoj);
        tehranRb = findViewById(R.id.rb_main_tehran);
        shirazRb = findViewById(R.id.rb_main_fars);


        androidDevelopmentCb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            }
        });


        uiDesignCh.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            }
        });


        deepLearningCh.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            }
        });


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_main_fars:
                        Toast.makeText(group.getContext(), "shiraz checked", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

/*******************************************Intents************************************************************/
        viewWebSiteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://7learn.ac"));
                startActivity(intent);
            }
        });

        editProfileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, EditFullNameActivity.class);
                intent.putExtra("name", fullNameTv.getText().toString().length()>0?fullNameTv.getText().toString():"");
                startActivityForResult(intent, REQUEST_CODE);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (data != null && RESULT_OK == resultCode && requestCode == REQUEST_CODE){
            fullNameTv.setText(data.getStringExtra("name"));
        }
    }
}
