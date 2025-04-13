package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.c7 */
/* loaded from: classes2.dex */
public class RunnableC3865c7 implements Runnable {

    /* renamed from: a */
    @NonNull
    private final File f44868a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC3678Um<File> f44869b;

    /* renamed from: c */
    @NonNull
    private final C3881cn f44870c;

    public RunnableC3865c7(@NonNull Context context, @NonNull File file, @NonNull InterfaceC3678Um<File> interfaceC3678Um) {
        this(file, interfaceC3678Um, C3881cn.m19686a(context));
    }

    @Override // java.lang.Runnable
    public void run() {
        File[] listFiles;
        if (this.f44868a.exists() && this.f44868a.isDirectory() && (listFiles = this.f44868a.listFiles()) != null) {
            for (File file : listFiles) {
                C3829an m19687a = this.f44870c.m19687a(file.getName());
                try {
                    m19687a.m19590a();
                    this.f44869b.mo17875b(file);
                } catch (Throwable unused) {
                }
                m19687a.m19592c();
            }
        }
    }

    @VisibleForTesting
    public RunnableC3865c7(@NonNull File file, @NonNull InterfaceC3678Um<File> interfaceC3678Um, @NonNull C3881cn c3881cn) {
        this.f44868a = file;
        this.f44869b = interfaceC3678Um;
        this.f44870c = c3881cn;
    }
}
