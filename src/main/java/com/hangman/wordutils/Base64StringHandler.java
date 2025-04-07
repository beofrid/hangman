package com.hangman.wordutils;

import java.util.Base64;

public class Base64StringHandler {
   
  public String encodeString(String encoded) {
      String encodedString = Base64.getEncoder().encodeToString(encoded.getBytes());
      return encodedString;
    }

    public String decodeString (String encoded){
      
      byte[] decodedBytes = Base64.getDecoder().decode(encoded);
      return new String(decodedBytes);

    }


  
}
