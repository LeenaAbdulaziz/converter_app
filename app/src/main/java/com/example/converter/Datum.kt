package com.example.converter


    import com.google.gson.annotations.SerializedName

    class Datum {

        @SerializedName("date")
        var date: String? = null

        @SerializedName("eur")
        var eur: Cur? = null

        class Cur {

            @SerializedName("gbp")
            var gbp: String? = null

            @SerializedName("usd")
            var usd: String? = null

            @SerializedName("aud")
            var aud: String? = null

            @SerializedName("sar")
            var sar: String? = null

            @SerializedName("kwd")
            var kwd: String? = null

            @SerializedName("jpy")
            var jpy: String? = null

            @SerializedName("syp")
            var syp: String? = null

        }
    }

