package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.yandex.metrica.impl.p023ob.C3548Pg;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.Ig */
/* loaded from: classes2.dex */
public class C3373Ig {

    /* renamed from: a */
    @NonNull
    private final Context f43126a;

    /* renamed from: b */
    @Nullable
    private Cursor f43127b;

    public C3373Ig(@NonNull Context context) {
        this.f43126a = context;
    }

    @WorkerThread
    /* renamed from: a */
    public void m18317a(@NonNull InterfaceC3747Xg interfaceC3747Xg) {
        try {
            try {
                FutureTask futureTask = new FutureTask(new CallableC3348Hg(this));
                C3532P0.m18696i().m18716s().m21315a(futureTask).start();
                C3298Fg c3298Fg = (C3298Fg) futureTask.get(5L, TimeUnit.SECONDS);
                C3658U2.m19207a(this.f43127b);
                ((C3548Pg.a) interfaceC3747Xg).mo18757a(c3298Fg);
            } finally {
                C3658U2.m19207a(this.f43127b);
            }
        } catch (Throwable unused) {
            C3523Og c3523Og = C3523Og.this;
            C3523Og.m18673a(c3523Og, null, C3523Og.m18675c(c3523Og));
        }
    }
}
