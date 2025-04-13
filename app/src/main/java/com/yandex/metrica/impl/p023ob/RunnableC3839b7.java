package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.b7 */
/* loaded from: classes2.dex */
public class RunnableC3839b7<Output> implements Runnable {

    /* renamed from: a */
    @NonNull
    private final File f44805a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC3703Vm<File, Output> f44806b;

    /* renamed from: c */
    @NonNull
    private final InterfaceC3678Um<File> f44807c;

    /* renamed from: d */
    @NonNull
    private final InterfaceC3678Um<Output> f44808d;

    public RunnableC3839b7(@NonNull File file, @NonNull InterfaceC3703Vm<File, Output> interfaceC3703Vm, @NonNull InterfaceC3678Um<File> interfaceC3678Um, @NonNull InterfaceC3678Um<Output> interfaceC3678Um2) {
        this.f44805a = file;
        this.f44806b = interfaceC3703Vm;
        this.f44807c = interfaceC3678Um;
        this.f44808d = interfaceC3678Um2;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f44805a.exists()) {
            try {
                Output mo17917a = this.f44806b.mo17917a(this.f44805a);
                if (mo17917a != null) {
                    this.f44808d.mo17875b(mo17917a);
                }
            } catch (Throwable unused) {
            }
            this.f44807c.mo17875b(this.f44805a);
        }
    }
}
