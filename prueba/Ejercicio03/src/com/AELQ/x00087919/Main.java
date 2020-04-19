package com.AELQ.x00087919;

import java.util.Scanner;

public class Main {

  public static void main(String [] args){
      Scanner in = new Scanner(System.in);
      int num;

      recursion recu = new recursion();
      System.out.print("Digite un numero: ");
      num = in.nextInt();

      recu.recursiva(num);
  }
}
