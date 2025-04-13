package com.yandex.metrica.impl.p023ob;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.yandex.metrica.impl.p023ob.C4403x;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.metrica.impl.ob.z2 */
/* loaded from: classes2.dex */
public class C4458z2 implements C4403x.b {

    /* renamed from: g */
    @Nullable
    @SuppressLint
    private static volatile C4458z2 f47082g;

    /* renamed from: a */
    @NonNull
    private final Context f47083a;

    /* renamed from: b */
    @Nullable
    private C4380w2 f47084b;

    /* renamed from: c */
    @NonNull
    private WeakReference<Activity> f47085c = new WeakReference<>(null);

    /* renamed from: d */
    @NonNull
    private final C3291F9 f47086d;

    /* renamed from: e */
    @NonNull
    private final C4406x2 f47087e;

    /* renamed from: f */
    private boolean f47088f;

    @VisibleForTesting
    public C4458z2(@NonNull Context context, @NonNull C3291F9 c3291f9, @NonNull C4406x2 c4406x2) {
        this.f47083a = context;
        this.f47086d = c3291f9;
        this.f47087e = c4406x2;
        this.f47084b = c3291f9.m18090r();
        this.f47088f = c3291f9.m18096w();
        C3755Y.m19410g().m19411a().m21123a(this);
    }

    @NonNull
    /* renamed from: a */
    public static C4458z2 m21284a(@NonNull Context context) {
        if (f47082g == null) {
            synchronized (C4458z2.class) {
                if (f47082g == null) {
                    f47082g = new C4458z2(context, new C3291F9(C3567Qa.m18783a(context).m18795c()), new C4406x2());
                }
            }
        }
        return f47082g;
    }

    /* renamed from: b */
    private void m21285b(@Nullable Context context) {
        C4380w2 m21138a;
        if (context == null || (m21138a = this.f47087e.m21138a(context)) == null || m21138a.equals(this.f47084b)) {
            return;
        }
        this.f47084b = m21138a;
        this.f47086d.m18043a(m21138a);
    }

    @Nullable
    @WorkerThread
    /* renamed from: a */
    public synchronized C4380w2 m21286a() {
        m21285b(this.f47085c.get());
        if (this.f47084b == null) {
            if (C3658U2.m19211a(30)) {
                if (!this.f47088f) {
                    m21285b(this.f47083a);
                    this.f47088f = true;
                    this.f47086d.m18098y();
                }
            } else {
                m21285b(this.f47083a);
            }
        }
        return this.f47084b;
    }

    @Override // com.yandex.metrica.impl.p023ob.C4403x.b
    @WorkerThread
    /* renamed from: a */
    public synchronized void mo21124a(@NonNull Activity activity) {
        this.f47085c = new WeakReference<>(activity);
        if (this.f47084b == null) {
            m21285b(activity);
        }
    }
}
