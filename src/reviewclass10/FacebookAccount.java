package reviewclass10;

public class FacebookAccount {

    private String email;
    private String password;

    public void resetPassword(){
        System.out.println("An email was "
        +"sent to your email Id"+email+
                "click on the link to reset");
    }

    public void setEmail(String email){
        if(email.contains("@")&&email.endsWith(".com")){
            this.email = email;
        }else{
            System.out.println("your email is not correct");
        }
    }

}
