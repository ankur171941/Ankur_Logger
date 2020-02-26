package com.epam.Interest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class DrivingClass  {
    public static final Logger logger = LogManager.getLogger(DrivingClass.class);
   public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
       logger.info("Please Enter the Principal in rupees");
       int p = sc.nextInt();
       logger.info(p);
       logger.info("Please Enter the rate of interest");
       int r = sc.nextInt();
       logger.info(r);
       logger.info("Please Enter the time period");
       int t = sc.nextInt();
       logger.info(t);
       CompoundInterest simpleInterest = new CompoundInterest(p,r,t);
       //System.out.println(simpleInterest.interest());
       logger.info("Total Interest Amount is:"+simpleInterest.interest());


   }


}
