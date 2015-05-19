package com.bol.example

import groovy.transform.EqualsAndHashCode
import groovy.transform.Immutable

@Immutable
@EqualsAndHashCode(excludes = 'average')
class CalcStats {
    int minimum
    int maximum
    int count
    double average
}
