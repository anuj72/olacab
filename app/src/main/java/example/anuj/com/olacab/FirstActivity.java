package example.anuj.com.olacab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    private Button b1,b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }
 public void  click1(View v) {

     Intent i =new Intent(this,login.class);
     startActivity(i);

 }
    public void  click2(View v) {

        Intent i =new Intent(this,signup.class);
        startActivity(i);

    }


}
