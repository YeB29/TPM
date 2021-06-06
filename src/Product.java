import java.time.LocalDate;
import java.util.Observable;

public class Product extends Observable {
        private int productID;
        private String productName;
        private Double productWeight;
        private LocalDate expirationDate;

        public Product(int productID,String productName,Double productWeight, LocalDate expirationDate){
            this.productID = productID;
            this.productName = productName;
            this.productWeight = productWeight;
            this.expirationDate = expirationDate;
        }

     //   public Double turnoverRate(){
       //     return ((Warehouse.totalProduct()/0.75)*365);
       // }
    private void turnoverRate(int price){
       Double rate =  ((Warehouse.totalProduct(((int) product))/price)*365);
        setChanged ();
        notifyObservers (rate);
        }

        public int getProductID() {
            return productID;
        }

        public String getProductName() {
            return productName;
        }

        public Double getProductWeight() {
            return productWeight;
        }

        public LocalDate getExpirationDate() {
            return expirationDate;
        }


    }
