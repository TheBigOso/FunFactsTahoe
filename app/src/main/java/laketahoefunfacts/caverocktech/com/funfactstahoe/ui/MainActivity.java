package laketahoefunfacts.caverocktech.com.funfactstahoe.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import laketahoefunfacts.caverocktech.com.funfactstahoe.Sections.AnimalsActivity;
import laketahoefunfacts.caverocktech.com.funfactstahoe.Sections.GeneralActivity;
import laketahoefunfacts.caverocktech.com.funfactstahoe.Sections.HistoryActivity;
import laketahoefunfacts.caverocktech.com.funfactstahoe.Sections.PlacesActivity;
import laketahoefunfacts.caverocktech.com.funfactstahoe.Sections.PlantsActivity;
import laketahoefunfacts.caverocktech.com.funfactstahoe.R;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    public ListView mListView;


    String[] facts = {

            "General",
            "History",
            "Plants",
            "Animals",
            "Places"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, facts);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(this);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch( position )
        {
            case 0:
                Intent newActivity = new Intent(this, GeneralActivity.class);
                startActivity(newActivity);
                break;
            case 1:
                newActivity = new Intent(this, HistoryActivity.class);
                startActivity(newActivity);
                break;
            case 2:
                newActivity = new Intent(this, PlantsActivity.class);
                startActivity(newActivity);
                break;
            case 3:  newActivity = new Intent(this, AnimalsActivity.class);
                startActivity(newActivity);
                break;
            case 4: newActivity = new Intent(this, PlacesActivity.class);
                startActivity(newActivity);
                break;
        }
    }
}
