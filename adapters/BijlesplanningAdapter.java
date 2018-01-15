package nl.studentsplus.pruts3.adapters;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

import nl.studentsplus.pruts3.R;

public class BijlesplanningAdapter extends BaseExpandableListAdapter {
    private Context ctx;

    private HashMap<String, List<String>> childTitles;
    private List<String> headerTitles;

    public BijlesplanningAdapter(Context ctx, HashMap<String, List<String>> childTitles, List<String> headerTitles) {
        this.ctx = ctx;
        this.childTitles = childTitles;
        this.headerTitles = headerTitles;
    }

    @Override
    public int getGroupCount() {
        Log.i("stplus", "getGroupCount: " + this.headerTitles);
        return headerTitles.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return childTitles.get(headerTitles.get(i)).size();
    }

    @Override
    public Object getGroup(int i) {
        return headerTitles.get(i);
    }

    @Override
    public Object getChild(int i, int i1) {
        return childTitles.get(headerTitles.get(i)).get(i1);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View convertView, ViewGroup viewGroup) {
        String title = (String) this.getGroup(i);
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) this.ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.fragment_bijlesplanning_header, null);
        }
        TextView txt = (TextView) convertView.findViewById(R.id.headerText);
        txt.setTypeface(null, Typeface.BOLD);
        txt.setText(title);
        return convertView;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View convertView, ViewGroup viewGroup) {
        String title = (String) this.getChild(i, i1);
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) this.ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.fragment_bijlesplanning_child, null);
        }
        TextView txt = (TextView) convertView.findViewById(R.id.bijlesplanningChild);
        txt.setText(title);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }


}
