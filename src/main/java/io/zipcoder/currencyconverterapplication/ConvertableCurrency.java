package io.zipcoder.currencyconverterapplication;

import io.zipcoder.currencyconverterapplication.currencies.AustralianDollar;

public interface ConvertableCurrency {

    default Double convert(CurrencyType currencyType) {
        return currencyType.getRate() / this.getType().getRate();
    }

    CurrencyType getType();
}
