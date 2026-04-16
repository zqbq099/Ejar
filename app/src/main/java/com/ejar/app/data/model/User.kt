package com.ejar.app.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val userId: String = "",
    val name: String = "",
    val phone: String = "",
    val avatarUrl: String = "",
    val rank: String = "ساعي مبتدئ",
    val rankLevel: String = "L1",
    val balance: Long = 0L,
    val miningRate: Int = 10,
    val isAdmin: Boolean = false,
    val isBlocked: Boolean = false,
    val fcmToken: String = "",
    val createdAt: Long = System.currentTimeMillis()
) : Parcelable {
    fun canAfford(amount: Long): Boolean = balance >= amount
    fun getFormattedBalance(): String = "%,d قرش".format(balance)
}
