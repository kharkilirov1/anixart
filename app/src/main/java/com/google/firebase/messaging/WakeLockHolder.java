package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.gms.stats.WakeLock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class WakeLockHolder {

    /* renamed from: a */
    public static final long f23353a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    public static final Object f23354b = new Object();

    /* renamed from: c */
    @GuardedBy
    public static WakeLock f23355c;

    /* renamed from: a */
    public static ComponentName m12707a(@NonNull Context context, @NonNull Intent intent) {
        synchronized (f23354b) {
            if (f23355c == null) {
                WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                f23355c = wakeLock;
                synchronized (wakeLock.f17223a) {
                    wakeLock.f17229g = true;
                }
            }
            boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
            intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!booleanExtra) {
                f23355c.m9690a(f23353a);
            }
            return startService;
        }
    }
}
