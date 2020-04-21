import CompanyPOJOs.CompanyProfile;
import FinancialRatioPOJOs.FinancialRatio;
import FinancialRatioPOJOs.InvestmentValuationRatios;
import JsonParsing.CompanyDeSerializer;
import JsonParsing.InvestmentValuationRatiosDeserializer;
import UserData.Instance;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {


        Instance instance1 = new Instance();  //user makes an account with my service
        //user is prompted for a company they are interested in watching, they select APPLE
        ArrayList<FinancialRatio> ratios = new ArrayList<>();

        CompanyDeSerializer cd = new CompanyDeSerializer();
        CompanyProfile aapl = cd.create("AAPL"); //immutable

        InvestmentValuationRatiosDeserializer de = new InvestmentValuationRatiosDeserializer();
        InvestmentValuationRatios es = de.create("AAPL");
        ratios.add(es);
        System.out.println(es.getPriceBookValueRatio());
        System.out.println(es.getPriceSalesRatio());
        System.out.println(aapl.getCEO());

        instance1.watchlist.put(aapl,ratios);

    }
}
