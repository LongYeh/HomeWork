package com.train;

import java.util.Scanner;

public class Ticket {

    int ticket,returnTicket,oneWayTicket;
    int total=0;

    public void getTicket(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how much ticket you want: ");
        ticket=sc.nextInt();
        System.out.println("ticket : "+ticket);
    }

    public void getReturnTicket(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how much returnTicket :");
        returnTicket=sc.nextInt();
        System.out.println("returnTicket :"+returnTicket);
    }

    public void getOneWayTicket(){
        oneWayTicket=ticket-returnTicket;
        System.out.println("oneWayTicket: "+oneWayTicket);
    }

    public void getPrice(){
       int price=1000*oneWayTicket+1800*returnTicket;
        System.out.println("price="+price);

    }

    public void showAll(){
        getTicket();
        getReturnTicket();
        getOneWayTicket();
        getPrice();
    }



}
