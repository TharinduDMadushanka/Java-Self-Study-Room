package Encapsulation.write_only_field;

class SecureVault {
    // Private field
    private String secretCode;

    // Public setter for secretCode (no getter)
    public void setSecretCode(String secretCode) {
        this.secretCode = secretCode;
    }
}

public class Main {
    public static void main(String[] args) {
        SecureVault vault = new SecureVault();
        vault.setSecretCode("12345");

        // No way to retrieve the secret code
    }
}
