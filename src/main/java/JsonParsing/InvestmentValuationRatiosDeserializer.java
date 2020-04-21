package JsonParsing;


import CompanyPOJOs.CompanyProfile;
import FinancialRatioPOJOs.InvestmentValuationRatios;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class InvestmentValuationRatiosDeserializer extends StdDeserializer<InvestmentValuationRatios> {
    ObjectMapper om = new ObjectMapper();
    CompanyProfile value;
    private String symbol;

    public InvestmentValuationRatiosDeserializer(){
        this(null);
    }
    public InvestmentValuationRatiosDeserializer(Class<?> vc) {
        super(vc);
    }

    public InvestmentValuationRatios create(String symbol) throws IOException {
        this.symbol = symbol;
        SimpleModule module =
                new SimpleModule("InvestmentValuationRatiosDeserializer",
                        new Version(1, 0, 0, null, null, null));
        module.addDeserializer(InvestmentValuationRatios.class, new InvestmentValuationRatiosDeserializer());
        om.registerModule(module);
        return om.readValue(new URL("https://financialmodelingprep.com/api/v3/financial-ratios/" + symbol), InvestmentValuationRatios.class);
    }


    @Override
    public InvestmentValuationRatios deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {

        ObjectCodec codec = p.getCodec();
        JsonNode node = codec.readTree(p);

        JsonNode investmentValuationNode = node
                .get("ratios")
                .get(0)  //'0' responding to the most recent financial ratio metrics, updated annualy
                .get("investmentValuationRatios");

        return populateData(investmentValuationNode);

    }


    public InvestmentValuationRatios populateData(JsonNode ivn){

         return new InvestmentValuationRatios(
                 this.symbol,
                 ivn.get("priceBookValueRatio").asDouble(),
                 ivn.get("priceToSalesRatio").asDouble(),
                 ivn.get("priceEarningsRatio").asDouble(),
                 ivn.get("receivablesTurnover").asDouble(),
                 ivn.get("priceToFreeCashFlowsRatio").asDouble(),
                 ivn.get("priceToOperatingCashFlowsRatio").asDouble(),
                 ivn.get("priceCashFlowRatio").asDouble(),
                 ivn.get("priceEarningsToGrowthRatio").asDouble(),
                 ivn.get("priceSalesRatio").asDouble(),
                 ivn.get("dividendYield").asDouble(),
                 ivn.get("enterpriseValueMultiple").asDouble(),
                 ivn.get("priceFairValue").asDouble());
    }






    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

}
