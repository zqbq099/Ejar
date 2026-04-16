package com.ejar.app.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Property(
    val id: String = "",
    val title: String = "",
    val description: String = "",
    val price: Double = 0.0,
    val currency: String = "ر.ي",
    val city: String = "",
    val neighborhood: String = "",
    val address: String = "",
    val lat: Double = 0.0,
    val lng: Double = 0.0,
    val rooms: Int = 0,
    val bathrooms: Int = 0,
    val area: Int = 0,
    val images: List<String> = emptyList(),
    val ownerId: String = "",
    val ownerPhone: String = "",
    val status: PropertyStatus = PropertyStatus.ACTIVE,
    val views: Int = 0,
    val likes: Int = 0,
    val isGolden: Boolean = false,
    val type: PropertyType = PropertyType.APT,
    val createdAt: Long = System.currentTimeMillis(),
    val revealCount: Int = 0,
    val shareCount: Int = 0
) : Parcelable {
    fun getFullLocation(): String = "$neighborhood, $city"
    fun getFormattedPrice(): String = when (currency) {
        "ر.ي" -> "%,.0f ر.ي".format(price)
        "USD" -> "%,.0f $".format(price)
        else -> "%,.0f %s".format(price, currency)
    }
}

enum class PropertyStatus { ACTIVE, ARCHIVED, HIBERNATED }
enum class PropertyType { VILLA, APT, OFFICE, LAND }
