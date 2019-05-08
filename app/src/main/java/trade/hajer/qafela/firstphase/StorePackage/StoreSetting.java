package trade.hajer.qafela.firstphase.StorePackage;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.HashMap;
import java.util.Map;

import trade.hajer.qafela.R;

public class StoreSetting extends AppCompatActivity {
    private EditText store_title, ten_words, location;
    private Button change_store_image_button;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private FirebaseRecyclerAdapter adapter;
    private ImageView store_image;
    private Button save_settings;
    private StorageReference storageReference;
    private static final int GALLERY_INTENT= 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_setting);
        store_title = findViewById(R.id.store_title_set);
        ten_words = findViewById(R.id.ten_words_set);
        change_store_image_button = findViewById(R.id.chane_store_button);
        recyclerView = findViewById(R.id.home_cells);
        location=findViewById(R.id.location_store_set);
        store_image=findViewById(R.id.store_image_set);
        save_settings=findViewById(R.id.save_setting);
        storageReference= FirebaseStorage.getInstance().getReference();

        change_store_image_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Intent.ACTION_PICK );
                intent.setType("image/*");
                startActivityForResult(intent, GALLERY_INTENT);
            }
        });

        save_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference().child("posts").push();
                Map<String, Object> map = new HashMap<>();
                map.put("storeinfo", databaseReference.getKey());
                map.put("storetitle", store_title.getText().toString());
                map.put("tenwords", ten_words.getText().toString());
                map.put("location", location.getText().toString());


                databaseReference.setValue(map);

            }
        });
    }
}
