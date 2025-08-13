/**
 * A product class with name, price, and quantity attributes. It also has a 
 * method to print out the product details.
 * 
 * <p> This class could be used in an inventory system or to simulate part of a
 * retail store. Call {@code printProduct to print the product details in name,
 * price, quantity format. </p>
 * 
 * 
 * @author Adam McCarthy
 * @version 1.0
 */
public class Product {
    /*
    The name of the product.
    */
    private String initialName;
    /*
    The price of the product.
    */
    private double initialPrice;
    /*
    The quantity of the product in stock.
    */
    private int initialQuantity;
    
    /**
    Construct a new Product object
    
    @param  initialName     The name of the product
    @param  initialPrice    The price of the product
    @param  iniitalQuantity The quantity of the prouduct in stock
    */
    public Product(String initialName, double initialPrice, int initialQuantity){
        this.initialName = initialName;
        this.initialPrice = initialPrice;
        this.initialQuantity = initialQuantity;
    }
    
    /**
    Prints out all the details of the product
    */
    public void printProduct() {
        System.out.println(initialName+", price: "+initialPrice
                +", "+initialQuantity+"pcs");
    }
}
