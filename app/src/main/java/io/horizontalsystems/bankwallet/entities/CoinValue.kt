package io.horizontalsystems.bankwallet.entities

import io.horizontalsystems.bankwallet.modules.transactions.CoinCode

data class CoinValue(val coinCode: CoinCode, val value: Double) {

    override fun equals(other: Any?): Boolean {
        if (other is CoinValue) {
            return coinCode == other.coinCode && value == other.value

        }

        return super.equals(other)
    }

    override fun hashCode(): Int {
        var result = coinCode.hashCode()
        result = 31 * result + value.hashCode()
        return result
    }

}
