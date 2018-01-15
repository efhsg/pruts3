package nl.studentsplus.pruts3.mock.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataProvider {

    public static HashMap<String, List<String>> getInfo() {

        HashMap<String, List<String>> headerDetails = new HashMap<String, List<String>>();
        List<String> childDetails1 = new ArrayList<>();
        childDetails1.add("Engels 4 uur");
        childDetails1.add("Duits 2 uur");
        childDetails1.add("Grieks 2 uur");

        List<String> childDetails2 = new ArrayList<>();
        childDetails2.add("Engels 4 uur");
        childDetails2.add("Duits 4 uur");
        childDetails2.add("Grieks 2 uur");

        List<String> childDetails3 = new ArrayList<>();
        childDetails3.add("Engels 2 uur");
        childDetails3.add("Duits 2 uur");

        headerDetails.put("december 2017", childDetails1);
        headerDetails.put("januari 2018", childDetails2);
        headerDetails.put("zebruari 2018", childDetails3);

        return headerDetails;

    }

}
