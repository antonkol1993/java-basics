package com.point.hw.papa;


import com.point.hw.papa.technique.AbstractTechnique;
import com.point.hw.papa.technique.MobilePhone;
import com.point.hw.papa.technique.Monitor;
import com.point.hw.papa.technique.TV;

import java.util.ArrayList;
import java.util.List;

public class TechniqueUtils {
    /**
     * Technique
     */

    private static final List<MobilePhone> mobilePhoneList;

    static {
        MobilePhone iPhone15 = new MobilePhone("iPhone15", 3307, 40, 6.1,
                16_000_000, 3349);
        MobilePhone iPhone14 = new MobilePhone("iPhone14", 2450, 40, 6.1,
                16_000_000, 2789);
        MobilePhone iPhone15Pro = new MobilePhone("iPhone15Pro", 4045, 40, 6.1,
                16_000_000, 3274);
        MobilePhone samsungGalaxyS23 = new MobilePhone("samsungGalaxyS23", 2200, 40,
                6.1, 16_000_000, 3900);
        MobilePhone samsungGalaxyS23Ultra = new MobilePhone("samsungGalaxyS23Ultra", 3150, 40,
                6.1, 16_000_000, 5000);

        mobilePhoneList = List.of(
                iPhone15,
                iPhone14,
                iPhone15Pro,
                samsungGalaxyS23,
                samsungGalaxyS23Ultra
        );
    }

    private static final List<Monitor> monitorList;

    static {
        Monitor monitorMSIOptixMAG275R2 = new Monitor("MSI Optix MAG275R2", 1000, 110,
                27, 30_000_000);
        Monitor monitorAOC27V5C = new Monitor("AOC 27V5C", 1000, 98,
                27, 27_000_000);
        Monitor monitorASRockPG27FF1A = new Monitor("ASRock PG27FF1A", 1000, 100,
                27, 29_000_000);
        Monitor monitorLGUltraGear27GN600B = new Monitor("LG UltraGear 27GN600-B", 1000,
                120, 27, 32_000_000);
        Monitor monitorMSIG2712 = new Monitor("MSI G2712", 1000, 115, 27,
                35_000_000);

        monitorList = List.of(
                monitorMSIOptixMAG275R2,
                monitorAOC27V5C,
                monitorASRockPG27FF1A,
                monitorLGUltraGear27GN600B,
                monitorMSIG2712
        );
    }

    private static final List<TV> tVList;

    static {
        TV tvXiaomiTVQ255 = new TV("Xiaomi TV Q2 55", 1000, 180, 55, 40_000_000);
        TV tvSamsungOLED4KS90C = new TV("Samsung OLED 4K S90C", 1000, 195, 65, 55_000_000);
        TV tvYandexTVWithAlisa = new TV("Яндекс ТВ с Алисой 50", 1000, 178, 50, 31_000_000);
        TV tvBlaupunkt55UW5000T = new TV("Blaupunkt 55UW5000T", 1000, 168, 55, 39_000_000);
        TV tvLGC3OLED65C3RLA = new TV("LG C3 OLED65C3RLA", 99999, 190, 65, 37_000_000);

        tVList = List.of(
                tvXiaomiTVQ255,
                tvSamsungOLED4KS90C,
                tvYandexTVWithAlisa,
                tvBlaupunkt55UW5000T,
                tvLGC3OLED65C3RLA
        );
    }


    public static List<MobilePhone> mobilePhoneList() {
        return mobilePhoneList;
    }

    public static List<Monitor> monitorList() {
        return monitorList;
    }

    public static List<TV> TVList() {
        return tVList;
    }

    public static List<AbstractTechnique> allTechniqueList() {
        List<AbstractTechnique> allTechniqueList = new ArrayList<>();
        allTechniqueList.addAll(mobilePhoneList);
        allTechniqueList.addAll(monitorList);
        allTechniqueList.addAll(tVList);

        return allTechniqueList;
    }


}
