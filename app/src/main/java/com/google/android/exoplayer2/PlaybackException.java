package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: classes.dex */
public class PlaybackException extends Exception implements Bundleable {

    /* renamed from: b */
    public final int f9926b;

    /* renamed from: c */
    public final long f9927c;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorCode {
    }

    static {
        C1026l c1026l = C1026l.f11811n;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PlaybackException(android.os.Bundle r8) {
        /*
            r7 = this;
            r0 = 2
            java.lang.String r0 = m5911b(r0)
            java.lang.String r0 = r8.getString(r0)
            r1 = 3
            java.lang.String r1 = m5911b(r1)
            java.lang.String r1 = r8.getString(r1)
            r2 = 4
            java.lang.String r2 = m5911b(r2)
            java.lang.String r2 = r8.getString(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            r4 = 0
            r5 = 0
            r6 = 1
            if (r3 != 0) goto L58
            java.lang.Class<com.google.android.exoplayer2.PlaybackException> r3 = com.google.android.exoplayer2.PlaybackException.class
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Throwable -> L53
            java.lang.Class r1 = java.lang.Class.forName(r1, r6, r3)     // Catch: java.lang.Throwable -> L53
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            boolean r3 = r3.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L53
            if (r3 == 0) goto L4b
            java.lang.Class[] r3 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L53
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r3[r5] = r4     // Catch: java.lang.Throwable -> L53
            java.lang.reflect.Constructor r1 = r1.getConstructor(r3)     // Catch: java.lang.Throwable -> L53
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L53
            r3[r5] = r2     // Catch: java.lang.Throwable -> L53
            java.lang.Object r1 = r1.newInstance(r3)     // Catch: java.lang.Throwable -> L53
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch: java.lang.Throwable -> L53
            r4 = r1
        L4b:
            if (r4 != 0) goto L58
            android.os.RemoteException r4 = new android.os.RemoteException
            r4.<init>(r2)
            goto L58
        L53:
            android.os.RemoteException r4 = new android.os.RemoteException
            r4.<init>(r2)
        L58:
            java.lang.String r1 = m5911b(r5)
            r2 = 1000(0x3e8, float:1.401E-42)
            int r1 = r8.getInt(r1, r2)
            java.lang.String r2 = m5911b(r6)
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r2 = r8.getLong(r2, r5)
            r7.<init>(r0, r4)
            r7.f9926b = r1
            r7.f9927c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.PlaybackException.<init>(android.os.Bundle):void");
    }

    /* renamed from: b */
    public static String m5911b(int i2) {
        return Integer.toString(i2, 36);
    }

    @CallSuper
    /* renamed from: a */
    public Bundle mo5679a() {
        Bundle bundle = new Bundle();
        bundle.putInt(m5911b(0), this.f9926b);
        bundle.putLong(m5911b(1), this.f9927c);
        bundle.putString(m5911b(2), getMessage());
        Throwable cause = getCause();
        if (cause != null) {
            bundle.putString(m5911b(3), cause.getClass().getName());
            bundle.putString(m5911b(4), cause.getMessage());
        }
        return bundle;
    }

    public PlaybackException(@Nullable String str, @Nullable Throwable th, int i2, long j2) {
        super(str, th);
        this.f9926b = i2;
        this.f9927c = j2;
    }
}
