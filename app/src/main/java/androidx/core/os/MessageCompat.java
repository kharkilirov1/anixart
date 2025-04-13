package androidx.core.os;

import android.os.Message;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class MessageCompat {

    @RequiresApi
    public static class Api22Impl {
        @DoNotInline
        /* renamed from: a */
        public static boolean m1963a(Message message) {
            return message.isAsynchronous();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m1964b(Message message, boolean z) {
            message.setAsynchronous(z);
        }
    }
}
