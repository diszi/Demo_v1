package d2.hu.demo_v1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView show_msg_text = findViewById(R.id.msg_text);
        Button button = findViewById(R.id.button_click);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { show_msg_text.setText("Hello World");
            }
        });
    }
}
