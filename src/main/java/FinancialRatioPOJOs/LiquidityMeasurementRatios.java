package FinancialRatioPOJOs;

public class LiquidityMeasurementRatios extends FinancialRatio {
    private long currentRatio;
    private long quickRatio;
    private long cashRatio;
    private long daysOfSalesOutstanding;
    private long daysOfInventoryOutstanding;
    private long operatingCycle;
    private long daysOfPayablesOutstanding;
    private long cashConversionCycle;

    @Override
    public void populateStatistics(String companyCode) {

    }

    @Override
    public void updateMetrics() {

    }
















    public long getCurrentRatio() {
        return currentRatio;
    }

    public void setCurrentRatio(long currentRatio) {
        this.currentRatio = currentRatio;
    }

    public long getQuickRatio() {
        return quickRatio;
    }

    public void setQuickRatio(long quickRatio) {
        this.quickRatio = quickRatio;
    }

    public long getCashRatio() {
        return cashRatio;
    }

    public void setCashRatio(long cashRatio) {
        this.cashRatio = cashRatio;
    }

    public long getDaysOfSalesOutstanding() {
        return daysOfSalesOutstanding;
    }

    public void setDaysOfSalesOutstanding(long daysOfSalesOutstanding) {
        this.daysOfSalesOutstanding = daysOfSalesOutstanding;
    }

    public long getDaysOfInventoryOutstanding() {
        return daysOfInventoryOutstanding;
    }

    public void setDaysOfInventoryOutstanding(long daysOfInventoryOutstanding) {
        this.daysOfInventoryOutstanding = daysOfInventoryOutstanding;
    }

    public long getOperatingCycle() {
        return operatingCycle;
    }

    public void setOperatingCycle(long operatingCycle) {
        this.operatingCycle = operatingCycle;
    }

    public long getDaysOfPayablesOutstanding() {
        return daysOfPayablesOutstanding;
    }

    public void setDaysOfPayablesOutstanding(long daysOfPayablesOutstanding) {
        this.daysOfPayablesOutstanding = daysOfPayablesOutstanding;
    }

    public long getCashConversionCycle() {
        return cashConversionCycle;
    }

    public void setCashConversionCycle(long cashConversionCycle) {
        this.cashConversionCycle = cashConversionCycle;
    }

}
