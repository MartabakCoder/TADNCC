package com.martabak.ta_dncc

import android.content.Context

class Datasource(val context: Context) {
    fun getAnimeList(): Array<String> {
        val titles = arrayOf("Tate no Yuusha no Nariagari Season 2",
            "Kaguya-sama wa Kokurasetai: Ultra Romantic", "Jujutsu Kaisen 0 Movie", "Shingeki no Kyojin: The Final Season Part 2",
            "Karakai Jouzu no Takagi-san 3", "Kimetsu no Yaiba: Yuukaku-hen")

        return titles
    }
    fun getAnimeDesc(): Array<String> {
        val details = arrayOf("Second season of Tate no Yuusha no Nariagari.",
        "Third season of Kaguya-sama wa Kokurasetai: Tensai-tachi no Renai Zunousen.","Yuuta Okkotsu is haunted. Ever since his childhood friend Rika died in a traffic accident, her ghost has stuck with him.",
        "Second part of Shingeki no Kyojin: The Final Season.","Third season of Karakai Jouzu Takagi-san."," Kimetsu no Yaiba: Yuukaku-henTanjirou, Zenitsu, and Inosuke, aided by the Sound Hashira Tengen Uzui, ...")
        return details
    }
    fun getAnimeImage(): IntArray {
        val images = intArrayOf(R.drawable.android_image_1,
            R.drawable.android_image_2, R.drawable.android_image_3,
            R.drawable.android_image_4, R.drawable.android_image_5,
            R.drawable.android_image_6)
        return images
    }
}