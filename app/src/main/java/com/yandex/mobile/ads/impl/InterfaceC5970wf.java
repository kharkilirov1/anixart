package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import java.io.File;
import java.io.IOException;

/* renamed from: com.yandex.mobile.ads.impl.wf */
/* loaded from: classes3.dex */
public interface InterfaceC5970wf {

    /* renamed from: com.yandex.mobile.ads.impl.wf$a */
    public static class a extends IOException {
        public a(String str) {
            super(str);
        }

        public a(Throwable th) {
            super(th);
        }

        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.wf$b */
    public interface b {
        /* renamed from: a */
        void mo29188a(C5284jg c5284jg);

        /* renamed from: a */
        void mo29190a(InterfaceC5970wf interfaceC5970wf, C5284jg c5284jg);

        /* renamed from: a */
        void mo29191a(InterfaceC5970wf interfaceC5970wf, C5284jg c5284jg, C5284jg c5284jg2);
    }

    /* renamed from: a */
    long mo22698a();

    @WorkerThread
    /* renamed from: a */
    File mo22699a(String str, long j2, long j3) throws a;

    @WorkerThread
    /* renamed from: a */
    void mo22700a(C5284jg c5284jg);

    @WorkerThread
    /* renamed from: a */
    void mo22701a(File file, long j2) throws a;

    @WorkerThread
    /* renamed from: a */
    void mo22702a(String str);

    @WorkerThread
    /* renamed from: a */
    void mo22703a(String str, C5643qk c5643qk) throws a;

    /* renamed from: b */
    long mo22704b(String str, long j2, long j3);

    /* renamed from: b */
    C5349kn mo22705b(String str);

    /* renamed from: b */
    void mo22706b(C5284jg c5284jg);

    @Nullable
    @WorkerThread
    /* renamed from: c */
    C5284jg mo22707c(String str, long j2, long j3) throws a;

    /* renamed from: d */
    long mo22708d(String str, long j2, long j3);

    @WorkerThread
    /* renamed from: e */
    C5284jg mo22709e(String str, long j2, long j3) throws InterruptedException, a;
}
