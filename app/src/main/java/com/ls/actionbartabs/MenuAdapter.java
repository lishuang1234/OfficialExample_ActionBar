package com.ls.actionbartabs;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by ls on 2015/1/3 0003.
 */
public class MenuAdapter extends BaseAdapter {
    private Activity activity;

    public MenuAdapter(Activity activity) {
        this.activity = activity;
    }


    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = activity.getLayoutInflater().inflate(R.layout.item_list, parent, false);
        }
        return convertView;
    }
}
