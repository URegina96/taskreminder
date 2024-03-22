import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.SystemClock
import com.example.taskreminder.room.Task

fun scheduleNotification(task: Task, context: Context) {
    val alarmManager = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager
    val notificationIntent = Intent(context, com.example.taskreminder.notifications.NotificationReceiver::class.java).apply {
        putExtra("task_id", task.id)
        action = "TASK_NOTIFICATION"
    }
    val pendingIntent = PendingIntent.getBroadcast(context, task.id, notificationIntent, PendingIntent.FLAG_UPDATE_CURRENT)

    // Определяем время для отправки уведомления
    val triggerTime = SystemClock.elapsedRealtime() + task.time // Указать время выполнения задачи

    alarmManager.setExact(AlarmManager.ELAPSED_REALTIME_WAKEUP, triggerTime, pendingIntent)
}