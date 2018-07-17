package com.knoldus;

public class Currency_Operation {

    public static Double Calculate(String CurrencyTo, Double Intermediate){

        Double Result;

        if("USD".equals(CurrencyTo))

            Result = Intermediate / 68.77;

        else if("AUD".equals(CurrencyTo))

            Result = Intermediate / 51.08;

        else if("DINAR".equals(CurrencyTo))

            Result = Intermediate / 180.95;

        else if("RUBLE".equals(CurrencyTo))

            Result = Intermediate / 34.78;

        else

            Result=0.0;

        return Result;

    }
}
