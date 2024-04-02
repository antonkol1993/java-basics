package com.point.hw.papa.technique;

import collections.finalle.transaction.BigDecimal;

public class Comparator implements java.util.Comparator<BigDecimal> {


    @Override
    public int compare(BigDecimal o1, BigDecimal o2) {
        return o1.getAmount() -  o2.getAmount();
    }
}
