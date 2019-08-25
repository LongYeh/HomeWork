package com.train

import java.util.*

fun main() {
    val user=TicketKot()
    user.getTicket()
    user.getReturnTicket()
    user.getOneWayTicket()
    user.showAll()
}

class TicketKot(){
    private var ticketKot=0
    private var returnTicketKot=0
    private var oneWayTicketKot=0



    fun getTicket(): Int {
        val scanner = Scanner(System.`in`);
        print("enter number of ticket: ");
        ticketKot=scanner.nextInt();
        return ticketKot
    }

    fun getReturnTicket():Int{
        val scanner=Scanner(System.`in`);
        print("how many round-trip: ");
        returnTicketKot=scanner.nextInt();
        return  returnTicketKot
    }

    fun getOneWayTicket():Int{
        oneWayTicketKot=ticketKot-returnTicketKot
        return oneWayTicketKot
    }

    fun showAll(){
        println("ticket:$ticketKot")
        println("round-trip:$returnTicketKot")
        println("one-way:$oneWayTicketKot")
        var price=1000*oneWayTicketKot+1800*returnTicketKot
        println("price=$price")
    }


}