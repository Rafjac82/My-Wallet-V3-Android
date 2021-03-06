package piuk.blockchain.androidcore.data.charts.models

import info.blockchain.wallet.prices.data.PriceDatum

/**
 * A simple class for mapping [PriceDatum] objects where the price is non-null to a convenient,
 * non-null object. Passing a [PriceDatum] where the price is null will cause an exception to be
 * thrown.
 */
class ChartDatumDto(priceDatum: PriceDatum) {

    val timestamp: Long = priceDatum.timestamp
    val price: Double = priceDatum.price!!
}