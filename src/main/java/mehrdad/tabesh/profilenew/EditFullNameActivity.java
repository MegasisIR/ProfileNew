package mehrdad.tabesh.profilenew;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class EditFullNameActivity extends AppCompatActivity {
    private EditText fullNameEt;
    private Button saveBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_full_name);

        fullNameEt = findViewById(R.id.et_editFullName);
        fullNameEt.setText(getIntent().getStringExtra("name"));
        saveBtn = findViewById(R.id.btn_editName_save);
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fullNameEt.getText().length()>0){
                    Intent intent = new Intent();
                    intent.putExtra("name",fullNameEt.getText().toString());
                    setResult(Activity.RESULT_OK,intent);
                    finish();
                }
            }
        });

    }
}
