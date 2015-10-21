package laketahoefunfacts.caverocktech.com.funfactstahoe.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import laketahoefunfacts.caverocktech.com.funfactstahoe.R;

public class MainActivity extends AppCompatActivity {
    private EditText mNameField;
    private Button mStartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStartButton = (Button)findViewById(R.id.startButton);

        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startStory();
            }
        });
    }
    private void startStory(){
        Intent intent = new Intent(this, FactActivity.class);
        startActivity(intent);
    }
}
