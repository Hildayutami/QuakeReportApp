package com.hld.quakereportapp.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.hld.quakereportapp.Model.EarthquakeModel;
import com.hld.quakereportapp.R;

import java.util.List;

/**
 * Created by hilda on 25/01/2017.
 */

public class EarthquakeAdapter extends ArrayAdapter<EarthquakeModel> {

    public EarthquakeAdapter(Context context, List<EarthquakeModel> earthquakes) {
        super(context, 0, earthquakes);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }

        EarthquakeModel earthquakeModel = getItem(position);

        TextView magnitude = (TextView) listItemView.findViewById(R.id.magnitude);
        magnitude.setText(earthquakeModel.getmMagnitude());

        TextView location = (TextView) listItemView.findViewById(R.id.location);
        location.setText(earthquakeModel.getmLocation());

        TextView date = (TextView) listItemView.findViewById(R.id.date);
        date.setText(earthquakeModel.getmDate());

        return listItemView;
    }
}
