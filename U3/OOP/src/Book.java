public class Book {

    private String name;
    private Author auth;
    private double[] priceInDifferentStores;

    public static double sum_min = 0.0;


    public Book(String name, Author auth, double[] price){
        this.name = name;
        this.auth = auth;
        this.priceInDifferentStores = price;
        this.sum_min += this.minimumPrice();
    }

    public Book(String nameb, double[] price, String namea, String email, String gender){
        this.name = nameb;
        this.priceInDifferentStores = price;
        this.auth = new Author(namea, email, gender);
        this.sum_min = this.sum_min;
    }


    public double minimumPrice(){
        double min = 0;
        int i;
        for (i = 0; i < this.priceInDifferentStores.length; i++){
            if (i == 0){
                min = this.priceInDifferentStores[i];
            }else if (this.priceInDifferentStores[i] < min){
                min = this.priceInDifferentStores[i];
            }
        }
        return min;
    }

    public void printAuthorInfo(){
        this.auth.show();
    }


    public String toString(){
        String s = "[Book: name: " + this.name + ", [Author: name: " + this.auth.getName() + ", email: " + this.auth.getEmail() + ", gender: "
                + this.auth.getGender() + "], price in different stores: [ ";

        for (int i=0; i<priceInDifferentStores.length; i++){
            s = s + priceInDifferentStores[i] + " ";
        }

        s = s + "]]";
        return s;
    }

}