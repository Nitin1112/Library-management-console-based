package Model;

public class UserModel{

    private String name;
    private String phone;

    public UserModel(String name,String phone){
        this.name =name;
        this.phone =phone;
    }

    public String getName(){
        return name;
    }
    public String getPhone(){
        return phone;
    }
}