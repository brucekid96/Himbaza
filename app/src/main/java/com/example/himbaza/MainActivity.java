package com.example.himbaza;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Adapter;
import android.widget.ArrayAdapter;

import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private adapter adapter;
      private List<Cantique> cantiqueList;
    private Context mContext;
   private com.example.himbaza.adapter.OnItemListener OnitemListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView =findViewById(R.id.recyclerview);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        cantiqueList = new ArrayList<>(SampleData.getSampleCantique());

        adapter = new adapter(SampleData.getSampleCantique(),this,OnitemListener);
        mRecyclerView.setAdapter(adapter);

    }

    public void updateSearchResults(String searchQuery) {
        if(cantiqueList != null) { // Only update search results if the contact accounts have been loaded
            List<Cantique> searchResults = new ArrayList<>();

            for (Cantique cantique : cantiqueList) {
                // Check that the contact's display name contains the search query in a case-insensitive
                // manner
                if (cantique.getmTitle().toLowerCase().contains(searchQuery.toLowerCase()) ||
                    cantique.getmAuteur().toLowerCase().contains(searchQuery.toLowerCase()) ||
                    cantique.getmContenu().toLowerCase().contains(searchQuery.toLowerCase())) {
                    searchResults.add(cantique);
                }
            }

            adapter.setCantiqueList(searchResults);
        }
    }
    public interface OnItemListener{

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my_menu, menu);
        MenuItem menuItem = menu.findItem(R.id.menu_item_search);
        SearchView searchView =(SearchView) menuItem.getActionView();
        searchView.requestFocus();
        searchView.setImeOptions(EditorInfo.IME_ACTION_DONE);
        searchView.setQueryHint("search");

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                updateSearchResults(newText);
                return false;
            }
        });
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.menu_item_search) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    


}
