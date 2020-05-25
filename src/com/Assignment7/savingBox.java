package com.Assignment7;

public class savingBox {
    public static int callerCounter=0;



    public static void main(String [] args){
      AddAmount AA = new AddAmount();
        callerCounter++;
      System.out.println(AA.getBalance());
      AddAmount bb = new AddAmount(200);
        callerCounter++;
      System.out.println(bb.getAmount());
      System.out.println(callerCounter);


    }
}
