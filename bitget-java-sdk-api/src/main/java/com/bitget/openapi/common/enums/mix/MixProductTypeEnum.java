package com.bitget.openapi.common.enums.mix;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MixProductTypeEnum {


    UMCBL("umcbl"),
    DMCBL("dmcbl"),
    SUMCBL("sumcbl"),
    SDMCBL("sdmcbl"),
    ;
    ;

    private final String code;

}