package androidx.core.app;

import android.app.AlarmManager;
import android.app.PendingIntent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class AlarmManagerCompat {

    @RequiresApi
    public static class Api19Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m1554a(AlarmManager alarmManager, int i2, long j2, PendingIntent pendingIntent) {
            alarmManager.setExact(i2, j2, pendingIntent);
        }
    }

    @RequiresApi
    public static class Api21Impl {
        @DoNotInline
        /* renamed from: a */
        public static AlarmManager.AlarmClockInfo m1555a(long j2, PendingIntent pendingIntent) {
            return new AlarmManager.AlarmClockInfo(j2, pendingIntent);
        }

        @DoNotInline
        /* renamed from: b */
        public static void m1556b(AlarmManager alarmManager, Object obj, PendingIntent pendingIntent) {
            alarmManager.setAlarmClock((AlarmManager.AlarmClockInfo) obj, pendingIntent);
        }
    }

    @RequiresApi
    public static class Api23Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m1557a(AlarmManager alarmManager, int i2, long j2, PendingIntent pendingIntent) {
            alarmManager.setAndAllowWhileIdle(i2, j2, pendingIntent);
        }

        @DoNotInline
        /* renamed from: b */
        public static void m1558b(AlarmManager alarmManager, int i2, long j2, PendingIntent pendingIntent) {
            alarmManager.setExactAndAllowWhileIdle(i2, j2, pendingIntent);
        }
    }
}
