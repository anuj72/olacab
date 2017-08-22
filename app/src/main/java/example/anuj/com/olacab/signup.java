package example.anuj.com.olacab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signup extends AppCompatActivity {
    private AutoCompleteTextView actv;
    String[] gender = {"MALE", "FEMALE"};
    private EditText e1, e2, e3,e4;
    private Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        actv = (AutoCompleteTextView) findViewById(R.id.autotextid);
        ArrayAdapter adapter = new ArrayAdapter(signup.this, android.R.layout.select_dialog_item, gender);
        actv.setThreshold(1);
        actv.setAdapter(adapter);
        e1 = (EditText) findViewById(R.id.editText2);
        e2 = (EditText) findViewById(R.id.editText3);
        e3 = (EditText) findViewById(R.id.editText4);
        e4=(EditText)findViewById(R.id.autotextid);
        b1=(Button)findViewById(R.id.button4);
        actv = (AutoCompleteTextView) findViewById(R.id.autotextid);

        String name = e1.getText().toString().trim();
        String email = e2.getText().toString().trim();
        String mobile = e3.getText().toString().trim();
        String gender = e4.getText().toString();
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String name = e1.getText().toString().trim();
                String email = e2.getText().toString().trim();

                String mobile = e3.getText().toString().trim();
                String gender = e4.getText().toString().trim();
                if (name.length() == 0)
                {
                    e1.requestFocus();
                    e1.setError("Field can not be Empty");
                }
                if (mobile.length() != 10)
                {
                    e3.requestFocus();
                    e3.setError("Mobile NO. is either empty or wrong");
                }
             if ( gender.length()==0)
                {

                   e4.requestFocus();
                    e4.setError("Wrong Gender");
                }

            if(email.isEmpty()|| !Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                    e2.requestFocus();
                    e2.setError("Enter a valid Email");
                }
    if((name.length() == 0)||(mobile.length() != 10)||( gender.length()==0)||((email.isEmpty()|| !Patterns.EMAIL_ADDRESS.matcher(email).matches())))
    {
        Toast.makeText(signup.this,"Registration Fail",Toast.LENGTH_SHORT).show();
    }
    else
    {
        Toast.makeText(signup.this,"Registering You",Toast.LENGTH_SHORT).show();
    }

            }
        });



    }

}
