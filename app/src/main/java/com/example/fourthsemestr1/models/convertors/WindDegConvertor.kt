package com.example.fourthsemestr1.models.convertors

import com.example.fourthsemestr1.models.WindDeg

object WindDegConvertor {
    fun convertWindDeg(deg: Int): WindDeg {
        return when ((deg / 45 + 2* (deg%45) / 45) * 45 % 360) {
            0 -> WindDeg.N
            45 -> WindDeg.NE
            90 -> WindDeg.E
            135 -> WindDeg.SE
            180 -> WindDeg.S
            225 -> WindDeg.SW
            270 -> WindDeg.W
            else -> WindDeg.NW
        }
    }
}

