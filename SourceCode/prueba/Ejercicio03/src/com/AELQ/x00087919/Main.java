package com.AELQ.x00087919;

import java.util.Scanner;

public class Main {

  public static void main(String [] args){
      Scanner in = new Scanner(System.in);
      int num;

      recursion recu = new recursion();
      DonPendejoFuncioná pendejo = new DonPendejoFuncioná(1,1,2.5);
      System.out.println(pendejo.getCacaFunciona());
      System.out.print("Digite un numero: ");
      num = in.nextInt();

      recu.recursiva(num);
  }
}
