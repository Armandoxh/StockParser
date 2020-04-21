package CompanyPOJOs;

import FinancialRatioPOJOs.FinancialRatio;
import JsonParsing.CompanyDeSerializer;

import java.io.IOException;
import java.util.HashMap;

public class CompanyProfile {

    private String symbol;
    private String companyName;
    private String description;
    private String sector;
    private String CEO;
    private String industry;
    private String url;

//    private HashMap<String,FinancialRatio> financialRatios;

    //entry point for creating a profile for a company
    //input is already validated by the time it arrives here

    public CompanyProfile(String companySymbol){
        this.symbol = companySymbol;
    }

    public void populateCompanyData () throws IOException {
    }

    /*
    Getters and Setters
     */

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getCEO() {
        return CEO;
    }

    public void setCEO(String CEO) {
        this.CEO = CEO;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
