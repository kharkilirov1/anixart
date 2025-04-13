package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@Deprecated
/* loaded from: classes.dex */
public final class TraceCompat {

    @RequiresApi
    public static class Api18Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m1971a(String str) {
            Trace.beginSection(str);
        }

        @DoNotInline
        /* renamed from: b */
        public static void m1972b() {
            Trace.endSection();
        }
    }

    @RequiresApi
    public static class Api29Impl {
        @DoNotInline
        /* renamed from: a */
        public static void m1973a(String str, int i2) {
            Trace.beginAsyncSection(str, i2);
        }

        @DoNotInline
        /* renamed from: b */
        public static void m1974b(String str, int i2) {
            Trace.endAsyncSection(str, i2);
        }

        @DoNotInline
        /* renamed from: c */
        public static boolean m1975c() {
            return Trace.isEnabled();
        }

        @DoNotInline
        /* renamed from: d */
        public static void m1976d(String str, long j2) {
            Trace.setCounter(str, j2);
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e2) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e2);
            }
        }
    }

    /* renamed from: a */
    public static void m1969a(@NonNull String str) {
        Api18Impl.m1971a(str);
    }

    /* renamed from: b */
    public static void m1970b() {
        Api18Impl.m1972b();
    }
}
