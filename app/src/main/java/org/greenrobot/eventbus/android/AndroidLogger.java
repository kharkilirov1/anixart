package org.greenrobot.eventbus.android;

import android.util.Log;
import java.util.logging.Level;
import org.greenrobot.eventbus.Logger;
import p000a.C0000a;

/* loaded from: classes3.dex */
public class AndroidLogger implements Logger {

    /* renamed from: b */
    public static final boolean f68879b;

    /* renamed from: a */
    public final String f68880a;

    static {
        boolean z;
        try {
            Class.forName("android.util.Log");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f68879b = z;
    }

    public AndroidLogger(String str) {
        this.f68880a = str;
    }

    @Override // org.greenrobot.eventbus.Logger
    /* renamed from: a */
    public void mo34641a(Level level, String str) {
        if (level != Level.OFF) {
            Log.println(m34655c(level), this.f68880a, str);
        }
    }

    @Override // org.greenrobot.eventbus.Logger
    /* renamed from: b */
    public void mo34642b(Level level, String str, Throwable th) {
        if (level != Level.OFF) {
            int m34655c = m34655c(level);
            String str2 = this.f68880a;
            StringBuilder m27x = C0000a.m27x(str, "\n");
            m27x.append(Log.getStackTraceString(th));
            Log.println(m34655c, str2, m27x.toString());
        }
    }

    /* renamed from: c */
    public final int m34655c(Level level) {
        int intValue = level.intValue();
        if (intValue < 800) {
            return intValue < 500 ? 2 : 3;
        }
        if (intValue < 900) {
            return 4;
        }
        return intValue < 1000 ? 5 : 6;
    }
}
