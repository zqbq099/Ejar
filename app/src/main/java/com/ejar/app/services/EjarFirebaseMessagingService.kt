package com.ejar.app.services

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class EjarFirebaseMessagingService : FirebaseMessagingService() {
    override fun onMessageReceived(message: RemoteMessage) {
        super.onMessageReceived(message)
        // سيتم معالجة الإشعارات لاحقاً
    }

    override fun onNewToken(token: String) {
        super.onNewToken(token)
        // سيتم تحديث FCM Token في Firestore لاحقاً
    }
}
