package com.yandex.metrica.impl.p023ob;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.wn */
/* loaded from: classes2.dex */
public class ThreadFactoryC4401wn implements ThreadFactory {

    /* renamed from: b */
    private static final AtomicInteger f46902b = new AtomicInteger(0);

    /* renamed from: a */
    private final String f46903a;

    public ThreadFactoryC4401wn(String str) {
        this.f46903a = str;
    }

    /* renamed from: a */
    private String m21118a() {
        StringBuilder m27x = C0000a.m27x(this.f46903a, "-");
        m27x.append(f46902b.incrementAndGet());
        return m27x.toString();
    }

    /* renamed from: c */
    public static int m21120c() {
        return f46902b.incrementAndGet();
    }

    /* renamed from: b */
    public HandlerThreadC4349un m21121b() {
        return new HandlerThreadC4349un(m21118a());
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new C4375vn(runnable, m21118a());
    }

    /* renamed from: a */
    public static C4375vn m21117a(String str, Runnable runnable) {
        return new C4375vn(runnable, new ThreadFactoryC4401wn(str).m21118a());
    }

    /* renamed from: a */
    public static String m21119a(String str) {
        StringBuilder m27x = C0000a.m27x(str, "-");
        m27x.append(f46902b.incrementAndGet());
        return m27x.toString();
    }
}
