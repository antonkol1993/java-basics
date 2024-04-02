package com.point.hw.papa.technique.test.types;

public class ScreenProps {

    private Long colors;
    private Integer ppi;
    private DimensionType dimensionType;
    private Boolean isSensor;
    private Boolean alwaysOn;

    public ScreenProps(Long colors, Integer ppi, DimensionType dimensionType, Boolean isSensor, Boolean alwaysOn) {
        this.colors = colors;
        this.ppi = ppi;
        this.dimensionType = dimensionType;
        this.isSensor = isSensor;
        this.alwaysOn = alwaysOn;
    }

    public Long getColors() {
        return colors;
    }

    public Integer getPpi() {
        return ppi;
    }

    public DimensionType getDimensionType() {
        return dimensionType;
    }

    public Boolean getSensor() {
        return isSensor;
    }

    public Boolean getAlwaysOn() {
        return alwaysOn;
    }
}
