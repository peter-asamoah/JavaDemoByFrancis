public class Future extends Product{
    private String exchange, ContractCode;
    private int month,year;

    public Future(String id, String exchange, String contractCode, int month, int year) {
        super(id);
        this.exchange = exchange;
        ContractCode = contractCode;
        this.month = month;
        this.year = year;
    }


    @Override
    public double getPrice() {
        return 0;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getContractCode() {
        return ContractCode;
    }

    public void setContractCode(String contractCode) {
        ContractCode = contractCode;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
