package com.task1.thirdweekchallenge

//**                      **
//**      SINGLETON       **
//**                      **

public class DataStore private constructor(){

    init {
        println("Initialize account ... ")
    }

    private object Holder {val account = DataStore()}

    companion object {
        var fullName:String?="";
        var email:String?="";
        var phoneNumber:Int?=0;

        fun getInstance():DataStore {
            return Holder.account
        }

        init{
            println("Account(email='$email', fullName='$fullName', phoneNumber='$phoneNumber')")
        }

    }

}