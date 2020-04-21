package UserData;

import CompanyPOJOs.CompanyProfile;
import FinancialRatioPOJOs.FinancialRatio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Instance {
    public HashMap<CompanyProfile, ArrayList<FinancialRatio>> watchlist = new HashMap<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instance instance = (Instance) o;
        return Objects.equals(watchlist, instance.watchlist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(watchlist);
    }

    /**
     * PK and foriegn key relationship happens when one column is shared
     * set a pk only if that column helps u identify every unique record
     *
     */




    public void addToWatchlist(CompanyProfile companyProfile, ArrayList<FinancialRatio> ratios) {
        watchlist.put(companyProfile, ratios);
    }

//    @Override
//    public String toString() {
//
//    }
}
