//https://www.codewars.com/kata/53f40dff5f9d31b813000774/train/java
public class SecretDetective {

  public String recoverSecret(char[][] triplets) {
    String secret = "";
    for( var triplet: triplets) {
      String x = Character.toString(triplet[0]);
      String y = Character.toString(triplet[1]);
      String z = Character.toString(triplet[2]);
      
      if (!secret.contains(x)) {
        secret = x + secret;
      }
      if (!secret.contains(y)) {
        secret = secret.substring(0, secret.indexOf(x) + 1) + y + secret.substring(secret.indexOf(x) + 1);
      }
      if (secret.contains(y) && secret.indexOf(y) < secret.indexOf(x) ) {
        secret = secret.substring(0, secret.indexOf(y)) + secret.substring(secret.indexOf(y) + 1);
        secret = secret.substring(0, secret.indexOf(x) + 1) + y + secret.substring(secret.indexOf(x) + 1);
      }
      if (!secret.contains(z)) {
        secret = secret.substring(0, secret.indexOf(y) + 1) + z + secret.substring(secret.indexOf(y) + 1);
      }
      if (secret.contains(z) && secret.indexOf(z) < secret.indexOf(y) ) {
        secret = secret.substring(0, secret.indexOf(z)) + secret.substring(secret.indexOf(z) + 1);
        secret = secret.substring(0, secret.indexOf(y) + 1) + z + secret.substring(secret.indexOf(y) + 1);
      }
      System.out.println(secret);
    }
    
    return secret;
  }
  
}