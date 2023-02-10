public class Author {

    private String name;
    private String email;
    private String gender;


    public Author(String name){
        this.name = name;
        this.email = "";
        this.gender = "";
    }

    public Author(String name, String email, String gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public String getGender(){
        return this.gender;
    }
    public void show(){
        System.out.println("Author[name:  " + this.name + ", email:  " + this.email + ", gender: " + this.gender + "]");
    }



}