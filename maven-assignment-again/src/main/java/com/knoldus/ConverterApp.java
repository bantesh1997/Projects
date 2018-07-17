package com.knoldus;
import java.util.*;
public class ConverterApp {

    public static void main(String[] args){

        String currencyFrom;

        String CurrencyTo;

        Double Amount, Intermediate = 0.0;

        Scanner sc = new Scanner(System.in);

        System
                .out
                .println("These are countryCodes \n AUD \n DINAR \n INR \n RUBLE \n USD");

        System.out.println("Enter code of currencyFrom");

        currencyFrom = sc.nextLine();

        System.out.println("Enter code of CurrencyTo");

        CurrencyTo = sc.nextLine();

        System.out.println("Enter Amount in "+ currencyFrom);

        Amount = sc.nextDouble();

        if("INR".equals(currencyFrom))

            Intermediate = Amount;

        else if("USD".equals(currencyFrom))

            Intermediate = Amount*68.77;

        else if("AUD".equals(currencyFrom))

            Intermediate = Amount*51.08;

        else if("DINAR".equals(currencyFrom))

            Intermediate = Amount*180.95;

        else if("RUBLE".equals(currencyFrom))

            Intermediate = Amount*34.78;
        else
        {
            System.out.println("Enter valid countryCode");

            return ;
        }

        if(!"INR".equals(CurrencyTo))

            Intermediate = Currency_Operation.Calculate(CurrencyTo,Intermediate);

        Intermediate = Math.round(Intermediate * 100.0) /100.0;

        System.out.println(Intermediate);
    }
}
