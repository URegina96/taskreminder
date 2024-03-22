package com.example.taskreminder.notifications

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class NotificationReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if(intent.action == "TASK_NOTIFICATION") {
            val taskId = intent.getIntExtra("task_id", -1)
            if(taskId != -1) {
                // Отправка уведомления
                // Здесь можно использовать NotificationManager для создания и отображения уведомления
                Toast.makeText(context, "Уведомление для задачи с ID $taskId", Toast.LENGTH_SHORT).show()
            }
        }
    }
}