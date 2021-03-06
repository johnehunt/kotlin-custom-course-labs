package com.jjh.android.lib

/**
 * Super class of all types of products in the shop
 */
abstract class Product(val title: String,
                       override val price: Double): Sales {

    override var salesDiscount: Double = 0.0

    var numberHeld = 0
        get() {
            return field
        }
        set(value) {
            if (value >= 0) {
                field = value
            }
        }

    override fun toString(): String {
        return "title='$title', price=$price, salesDiscount=$salesDiscount"
    }

}