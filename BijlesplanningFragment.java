package nl.studentsplus.pruts3;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import nl.studentsplus.pruts3.adapters.BijlesplanningAdapter;
import nl.studentsplus.pruts3.mock.data.DataProvider;

public class BijlesplanningFragment extends Fragment {

    HashMap<String, List<String>> myHeader;
    List<String> myChild;
    ExpandableListView expandableListView;
    BijlesplanningAdapter bijlesplanningAdapter;

    public BijlesplanningFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myHeader = DataProvider.getInfo();
        myChild = new ArrayList<>(myHeader.keySet());

        View view = inflater.inflate(R.layout.fragment_bijlesplanning_list, null);
        NonScrollExpandableListView expandableListView = (NonScrollExpandableListView) view.findViewById(R.id.bijlesplanningLijst);
        expandableListView.setAdapter(new BijlesplanningAdapter(getActivity(), myHeader, myChild));

        return view;
    }

}
