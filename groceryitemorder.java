public class groceryitemorder {
    public String name;
    public double price;
    public int quantity;
    public groceryitemorder(String name,double price)
    {
        this.name=name;
        this.price=price;
    }
    public double getcost()
    {
        return price*quantity;
    }
    public void setQuantity(int x)
    {
        this.quantity=x;
    }

}
