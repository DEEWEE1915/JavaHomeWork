package com.pb.shkabara.hw7;

public enum Size {
    XXS, XS, S, M, L;
    private String description;
    private int euroSize;

    public String getDescription(Size size) {
        switch (size) {
            case XXS:
                description = "Дитячий";
                break;
            case XS:
            case S:
            case M:
            case L:
                description = "Дорослий";
                break;
            default:
                description = "Унісекс";
                break;
        }

        return description;
    }

    public int getEuroSize(Size size) {
        switch (size) {
            case XXS:
                euroSize = 32;
                break;
            case XS:
                euroSize = 34;
                break;
            case S:
                euroSize = 36;
                break;
            case M:
                euroSize = 38;
                break;
            case L:
                euroSize = 40;
                break;
            default:
                euroSize = 0;
                break;
        }

        return euroSize;
    }
}
