package engtelecom.poo;

public class Email {

    private String email;

    public Email(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return email;
    }

    public boolean isValid(){
        String eR = "^[\\w−\\+]+(\\.[\\w]+)∗@[\\w−]+(\\.[\\w]+)∗(\\.[a−z]{2,})$";

        return this.email.matches(eR);

    }

    

}