package io.horizontalsystems.bankwallet.entities

import android.arch.persistence.room.Entity
import java.util.*

@Entity(primaryKeys = ["coinCode", "currencyCode"])
data class Rate(var coinCode: String,
                var currencyCode: String,
                var value: Double,
                var timestamp: Long = 0) {

    val expired: Boolean
        get() {
            val diff = (Date().time / 1000) - timestamp
            return diff > 60 * 10
        }
}
