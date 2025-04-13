package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public class kq0 extends Exception implements InterfaceC5589pf {

    /* renamed from: a */
    public final int f52056a;

    /* renamed from: b */
    public final long f52057b;

    static {
        jp1 jp1Var = jp1.f51696g;
    }

    public kq0(Bundle bundle) {
        this(bundle.getString(m26175a(2)), m26176a(bundle), bundle.getInt(m26175a(0), 1000), bundle.getLong(m26175a(1), SystemClock.elapsedRealtime()));
    }

    @Nullable
    /* renamed from: a */
    private static Throwable m26176a(Bundle bundle) {
        String string = bundle.getString(Integer.toString(3, 36));
        String string2 = bundle.getString(Integer.toString(4, 36));
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, kq0.class.getClassLoader());
            Throwable th = Throwable.class.isAssignableFrom(cls) ? (Throwable) cls.getConstructor(String.class).newInstance(string2) : null;
            return th == null ? new RemoteException(string2) : th;
        } catch (Throwable unused) {
            return new RemoteException(string2);
        }
    }

    public kq0(@Nullable String str, @Nullable Throwable th, int i2, long j2) {
        super(str, th);
        this.f52056a = i2;
        this.f52057b = j2;
    }

    /* renamed from: a */
    public static String m26175a(int i2) {
        return Integer.toString(i2, 36);
    }
}
