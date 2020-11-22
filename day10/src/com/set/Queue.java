package com.set;
import java.util.concurrent.LinkedBlockingQueue;
public class Queue {
   public static void main(String[] args) {
      LinkedBlockingQueue<String> lbQueue = new LinkedBlockingQueue<String>();
      lbQueue.add("Amy");
      lbQueue.add("John");
      lbQueue.add("May");
      lbQueue.add("Harry");
      lbQueue.add("Anne");
      System.out.println("The elements in LinkedBlockingQueue are: " + lbQueue);
   }
}