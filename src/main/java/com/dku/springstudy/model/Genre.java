package com.dku.springstudy.model;

public enum Genre {

    LANGUAGE, MUSIC, IDE;

    public static boolean isExistGenre(String target) {

        for (Genre genres : Genre.values()) {
            if(target.equals(genres.toString())) {
                return true;
            }
        }

        return false;
    }
}