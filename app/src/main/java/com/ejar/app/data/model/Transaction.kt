package com.ejar.app.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Transaction(
    val id: String = "",
    val userId: String = "",
    val amount: Long = 0L,
    val type: TransactionType = TransactionType.OTHER,
    val description: String = "",
    // تم التعديل: القيمة الافتراضية null ليتم تعيينها عند الإنشاء الفعلي
    val timestamp: Long? = null,
    val referenceId: String = ""
) : Parcelable {
    val isCredit: Boolean get() = amount > 0
    fun getFormattedAmount(): String = "${if (isCredit) "+" else ""}%,d قرش".format(amount)
}

enum class TransactionType {
    SIGNUP_BONUS, MINING_REWARD, PROPERTY_POST_REWARD, REVEAL_CONTACT_FEE,
    GOLDEN_AD_FEE, BOOST_FEE, TRANSFER_IN, TRANSFER_OUT, PURCHASE_PACKAGE, OTHER
}
