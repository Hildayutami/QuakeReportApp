package com.hld.quakereportapp.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.hld.quakereportapp.Adapter.EarthquakeAdapter;
import com.hld.quakereportapp.Model.EarthquakeModel;
import com.hld.quakereportapp.R;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earthquake);

        // Create a fake list of earthquake locations.
        ArrayList<EarthquakeModel> earthquakes = new ArrayList<>();
        earthquakes.add(new EarthquakeModel("7,2","San Francisco","feb 2, 2016"));
        earthquakes.add(new EarthquakeModel("6,2","London","feb 2, 2016"));
        earthquakes.add(new EarthquakeModel("4,2","Tokyo","feb 2, 2016"));
        earthquakes.add(new EarthquakeModel("5,2","Mexico City","feb 2, 2016"));
        earthquakes.add(new EarthquakeModel("3,2","Moscow","feb 2, 2016"));
        earthquakes.add(new EarthquakeModel("5,2","Rio de Janeiro","feb 2, 2016"));
        earthquakes.add(new EarthquakeModel("9,2","Paris","feb 2, 2016"));

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        EarthquakeAdapter adapter = new EarthquakeAdapter(this, earthquakes);

        earthquakeListView.setAdapter(adapter);
    }
}
