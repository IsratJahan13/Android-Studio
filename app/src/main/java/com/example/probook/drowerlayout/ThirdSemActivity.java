package com.example.probook.drowerlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

public class ThirdSemActivity extends AppCompatActivity {
    private ListView listView;
    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_sem);

        listView = findViewById(R.id.thirdListViewId);
        String[] bookList_3 = getResources().getStringArray(R.array.book_list_3);

        final ArrayAdapter<String> adapter = new ArrayAdapter<>(ThirdSemActivity.this,R.layout.sample_view,R.id.sampleTextViewId,bookList_3);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Intent intent = new Intent(ThirdSemActivity.this,BookActivity.class);
                startActivity(intent);

            }
        });

        searchView = findViewById(R.id.searchViewId);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
    }
}
