package androidx.tracing;

import android.annotation.SuppressLint;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class Trace {

    /* renamed from: a */
    public static long f6129a;

    /* renamed from: b */
    public static Method f6130b;

    @SuppressLint
    /* renamed from: a */
    public static boolean m4183a() {
        try {
            if (f6130b == null) {
                return android.os.Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f6130b == null) {
                f6129a = android.os.Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f6130b = android.os.Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f6130b.invoke(null, Long.valueOf(f6129a))).booleanValue();
        } catch (Exception e2) {
            if (!(e2 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
                return false;
            }
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }
}
