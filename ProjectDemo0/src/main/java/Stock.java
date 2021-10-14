public class Stock extends Product implements ProductPricingServices{
    private String exchange, ticker;
    public Stock(String id) {
        super(id);
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public Stock(String id, String exchange, String ticker) {
        super(id);
        this.exchange = exchange;
        this.ticker = ticker;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
