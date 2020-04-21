package FinancialRatioPOJOs;

import ProjectInterfaces.Updateable;

public abstract class FinancialRatio implements Updateable {



    private String companySymbol;

    public abstract void populateStatistics(String companyCode);

    public String getCompanySymbol() {
        return companySymbol;
    }

    public void setCompanySymbol(String companySymbol) {
        this.companySymbol = companySymbol;
    }
}

