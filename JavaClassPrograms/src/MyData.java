public class MyData {
    private  String name="Shiv";
    private String lastName="Patil";
    private String occupation="Dev";
public void setNewName(String newName){
    if(!newName.equals("")){
        //Name is not empty
        name=newName;
    }
} public String getName(){
    return name;
    }
MyData(){
}
}