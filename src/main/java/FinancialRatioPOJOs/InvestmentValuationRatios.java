package FinancialRatioPOJOs;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * What is behavior that every subclass shares
 *
 */
public class InvestmentValuationRatios extends FinancialRatio {


    private double priceBookValueRatio;
    private double priceToSalesRatio;
    private double priceEarningsRatio;
    private double receivablesTurnover;
    private double priceToFreeCashFlowsRatio;
    private double priceToOperatingCashFlowsRatio;
    private double priceCashFlowRatio;
    private double priceEarningsToGrowthRatio;
    private double priceSalesRatio;
    private double dividendYield;
    private double enterpriseValueMultiple;
    private double priceFairValue;

    public InvestmentValuationRatios(String symbol,
                                     double priceBookValueRatio,
                                     double priceToSalesRatio,
                                     double priceEarningsRatio,
                                     double receivablesTurnover,
                                     double priceToFreeCashFlowsRatio,
                                     double priceToOperatingCashFlowsRatio,
                                     double priceCashFlowRatio,
                                     double priceEarningsToGrowthRatio,
                                     double priceSalesRatio,
                                     double dividendYield,
                                     double enterpriseValueMultiple,
                                     double priceFairValue) {

        this.priceBookValueRatio = priceBookValueRatio;
        this.priceToSalesRatio = priceToSalesRatio;
        this.priceEarningsRatio = priceEarningsRatio;
        this.receivablesTurnover = receivablesTurnover;
        this.priceToFreeCashFlowsRatio = priceToFreeCashFlowsRatio;
        this.priceToOperatingCashFlowsRatio = priceToOperatingCashFlowsRatio;
        this.priceCashFlowRatio = priceCashFlowRatio;
        this.priceEarningsToGrowthRatio = priceEarningsToGrowthRatio;
        this.priceSalesRatio = priceSalesRatio;
        this.dividendYield = dividendYield;
        this.enterpriseValueMultiple = enterpriseValueMultiple;
        this.priceFairValue = priceFairValue;
    }





    public void print(){
        System.out.println(this.dividendYield +"'\n' "+ this.enterpriseValueMultiple +""+ this.priceCashFlowRatio);
    }
    @Override
    public void populateStatistics(String companyCode) {

    }

    @Override
    public void updateMetrics() {

    }



























    public double getPriceBookValueRatio() {
        return priceBookValueRatio;
    }

    public void setPriceBookValueRatio(double priceBookValueRatio) {
        this.priceBookValueRatio = priceBookValueRatio;
    }

    public double getPriceToSalesRatio() {
        return priceToSalesRatio;
    }

    public void setPriceToSalesRatio(double priceToSalesRatio) {
        this.priceToSalesRatio = priceToSalesRatio;
    }

    public double getPriceEarningsRatio() {
        return priceEarningsRatio;
    }

    public void setPriceEarningsRatio(double priceEarningsRatio) {
        this.priceEarningsRatio = priceEarningsRatio;
    }

    public double getReceivablesTurnover() {
        return receivablesTurnover;
    }

    public void setReceivablesTurnover(double receivablesTurnover) {
        this.receivablesTurnover = receivablesTurnover;
    }

    public double getPriceToFreeCashFlowsRatio() {
        return priceToFreeCashFlowsRatio;
    }

    public void setPriceToFreeCashFlowsRatio(double priceToFreeCashFlowsRatio) {
        this.priceToFreeCashFlowsRatio = priceToFreeCashFlowsRatio;
    }

    public double getPriceToOperatingCashFlowsRatio() {
        return priceToOperatingCashFlowsRatio;
    }

    public void setPriceToOperatingCashFlowsRatio(double priceToOperatingCashFlowsRatio) {
        this.priceToOperatingCashFlowsRatio = priceToOperatingCashFlowsRatio;
    }

    public double getPriceCashFlowRatio() {
        return priceCashFlowRatio;
    }

    public void setPriceCashFlowRatio(double priceCashFlowRatio) {
        this.priceCashFlowRatio = priceCashFlowRatio;
    }

    public double getPriceEarningsToGrowthRatio() {
        return priceEarningsToGrowthRatio;
    }

    public void setPriceEarningsToGrowthRatio(double priceEarningsToGrowthRatio) {
        this.priceEarningsToGrowthRatio = priceEarningsToGrowthRatio;
    }

    public double getPriceSalesRatio() {
        return priceSalesRatio;
    }

    public void setPriceSalesRatio(double priceSalesRatio) {
        this.priceSalesRatio = priceSalesRatio;
    }

    public double getDividendYield() {
        return dividendYield;
    }

    public void setDividendYield(double dividendYield) {
        this.dividendYield = dividendYield;
    }

    public double getEnterpriseValueMultiple() {
        return enterpriseValueMultiple;
    }

    public void setEnterpriseValueMultiple(double enterpriseValueMultiple) {
        this.enterpriseValueMultiple = enterpriseValueMultiple;
    }

    public double getPriceFairValue() {
        return priceFairValue;
    }

    public void setPriceFairValue(double priceFairValue) {
        this.priceFairValue = priceFairValue;
    }


}