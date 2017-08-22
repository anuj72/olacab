package example.anuj.com.olacab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    private EditText e1;
    private Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }
    public void OnClick(View v){
        e1=(EditText)findViewById(R.id.editText);
        String mobile = e1.getText().toString().trim();

        if (mobile.length() != 10)
        {
            e1.requestFocus();
            e1.setError("Mobile NO. is either empty or wrong");
        }
        else
        {
            Toast.makeText(login.this,"wait",Toast.LENGTH_SHORT).show();
            Intent i =new Intent(login.this,PhoneAuthActivity.class);
            i.putExtra("mob",mobile);
            startActivity(i);

        }


    }

}
