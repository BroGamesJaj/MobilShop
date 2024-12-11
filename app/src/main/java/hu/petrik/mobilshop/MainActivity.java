package hu.petrik.mobilshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private Button hozzaadButton;
    private static ArrayList<Mobil> mobilok;
    private ListView listView;
    private MobilAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        init();
        hozzaadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, termek_add.class);
                startActivity(intent);
                finish();
            }
        });

    }

    public void init(){
        hozzaadButton = findViewById(R.id.hozzaadButton);
        mobilok = new ArrayList<>();
        listView = findViewById(R.id.listView);
        adapter = new MobilAdapter(mobilok, this);
        listView.setAdapter(adapter);
    }

    public void loadMobil(RetrofitApiService apiService) {

        apiService.getAllMobil().enqueue(new Callback<List<Mobil>>() {
            @Override
            public void onResponse(Call<List<Mobil>> call, Response<List<Mobil>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    mobilok.clear();
                    mobilok.addAll(response.body());
                    adapter.notifyDataSetChanged();
                } else {
                    Toast.makeText(MainActivity.this, "Fail to load the people list", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<Mobil>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error loading the people list", Toast.LENGTH_SHORT).show();
            }
        });
    }
}