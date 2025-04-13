package com.google.android.gms.dynamite;

import android.os.Looper;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public final class zzb {

    /* renamed from: a */
    @Nullable
    @GuardedBy
    public static volatile ClassLoader f15972a;

    /* renamed from: b */
    @Nullable
    @GuardedBy
    public static volatile Thread f15973b;

    @Nullable
    /* renamed from: a */
    public static synchronized ClassLoader m8296a() {
        ClassLoader classLoader;
        synchronized (zzb.class) {
            if (f15972a == null) {
                f15972a = m8297b();
            }
            classLoader = f15972a;
        }
        return classLoader;
    }

    @Nullable
    /* renamed from: b */
    public static synchronized ClassLoader m8297b() {
        synchronized (zzb.class) {
            ClassLoader classLoader = null;
            if (f15973b == null) {
                f15973b = m8298c();
                if (f15973b == null) {
                    return null;
                }
            }
            synchronized (f15973b) {
                try {
                    classLoader = f15973b.getContextClassLoader();
                } catch (SecurityException e2) {
                    String valueOf = String.valueOf(e2.getMessage());
                    Log.w("DynamiteLoaderV2CL", valueOf.length() != 0 ? "Failed to get thread context classloader ".concat(valueOf) : new String("Failed to get thread context classloader "));
                }
            }
            return classLoader;
        }
    }

    @Nullable
    /* renamed from: c */
    public static synchronized Thread m8298c() {
        SecurityException e2;
        Thread thread;
        Thread thread2;
        ThreadGroup threadGroup;
        synchronized (zzb.class) {
            ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup2 == null) {
                return null;
            }
            synchronized (Void.class) {
                try {
                    int activeGroupCount = threadGroup2.activeGroupCount();
                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                    threadGroup2.enumerate(threadGroupArr);
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= activeGroupCount) {
                            threadGroup = null;
                            break;
                        }
                        threadGroup = threadGroupArr[i3];
                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                            break;
                        }
                        i3++;
                    }
                    if (threadGroup == null) {
                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                    }
                    int activeCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[activeCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (i2 >= activeCount) {
                            thread2 = null;
                            break;
                        }
                        thread2 = threadArr[i2];
                        if ("GmsDynamite".equals(thread2.getName())) {
                            break;
                        }
                        i2++;
                    }
                } catch (SecurityException e3) {
                    e2 = e3;
                    thread = null;
                }
                if (thread2 == null) {
                    try {
                        thread = new zza(threadGroup);
                        try {
                            thread.setContextClassLoader(null);
                            thread.start();
                        } catch (SecurityException e4) {
                            e2 = e4;
                            String valueOf = String.valueOf(e2.getMessage());
                            Log.w("DynamiteLoaderV2CL", valueOf.length() != 0 ? "Failed to enumerate thread/threadgroup ".concat(valueOf) : new String("Failed to enumerate thread/threadgroup "));
                            thread2 = thread;
                            return thread2;
                        }
                    } catch (SecurityException e5) {
                        e2 = e5;
                        thread = thread2;
                    }
                    thread2 = thread;
                }
            }
            return thread2;
        }
    }
}
