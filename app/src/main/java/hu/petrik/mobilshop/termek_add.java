package hu.petrik.mobilshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class termek_add extends AppCompatActivity {
    private EditText nevEditText;
    private EditText mennyEditText;
    private EditText arEditText;
    private EditText katEditText;
    private Button backButton;
    private Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_termek_add);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(termek_add.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    public void init(){
        nevEditText = findViewById(R.id.nevET);
        mennyEditText = findViewById(R.id.mennyET);
        arEditText = findViewById(R.id.arET);
        katEditText = findViewById(R.id.katET);
        backButton = findViewById(R.id.backButton);
        addButton = findViewById(R.id.addButton);

    }
}