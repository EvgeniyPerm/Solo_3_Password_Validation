import java.util.Scanner;

class Password {
    private String pass;
    public String special = "!@#$%&*";
    public String getPass(){
        return pass;
    }
    public void SetPass(String password){
        pass = password;
    }
    Password(String password){
        this.pass=password;
    }
    public boolean isStrong(){
        if (pass.length()<7) return false;
        int num = 0;
        int spec = 0;
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isDigit(pass.charAt(i))) {
                num++;
                continue;
            }
            if (special.contains(""+pass.charAt(i))) {
                spec++;
            }
        }
        if (num>=2 && spec>=2) return true;
        return false;

    }
}

public class Main {
    public static final String STRONG = "Strong";
    public static final String WEAK = "Weak";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Password passObj = new Password(scanner.nextLine());
        if (passObj.isStrong()){
            System.out.println(STRONG);
        }
        else System.out.println(WEAK);

    }
}