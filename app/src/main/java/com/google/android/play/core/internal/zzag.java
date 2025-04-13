package com.google.android.play.core.internal;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import java.util.IllegalFormatException;
import java.util.Locale;
import p000a.C0000a;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class zzag {

    /* renamed from: a */
    public final String f20094a;

    public zzag(String str) {
        StringBuilder m4120s = C0576a.m4120s(39, "UID: [", Process.myUid(), "]  PID: [", Process.myPid());
        m4120s.append("] ");
        String valueOf = String.valueOf(m4120s.toString());
        this.f20094a = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
    }

    /* renamed from: f */
    public static String m10833f(String str, String str2, @Nullable Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e2) {
                String valueOf = String.valueOf(str2);
                Log.e("PlayCore", valueOf.length() != 0 ? "Unable to format ".concat(valueOf) : new String("Unable to format "), e2);
                String join = TextUtils.join(", ", objArr);
                str2 = C0000a.m22s(new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(join).length()), str2, " [", join, "]");
            }
        }
        return C0000a.m21r(new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length()), str, " : ", str2);
    }

    /* renamed from: a */
    public final int m10834a(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", m10833f(this.f20094a, str, objArr));
        }
        return 0;
    }

    /* renamed from: b */
    public final int m10835b(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m10833f(this.f20094a, str, objArr));
        }
        return 0;
    }

    /* renamed from: c */
    public final int m10836c(Throwable th, String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m10833f(this.f20094a, str, objArr), th);
        }
        return 0;
    }

    /* renamed from: d */
    public final int m10837d(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", m10833f(this.f20094a, str, objArr));
        }
        return 0;
    }

    /* renamed from: e */
    public final int m10838e(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", m10833f(this.f20094a, str, objArr));
        }
        return 0;
    }
}
