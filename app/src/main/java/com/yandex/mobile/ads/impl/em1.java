package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class em1 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d */
    @SuppressLint
    private static em1 f50016d = new em1();

    /* renamed from: a */
    private boolean f50017a;

    /* renamed from: b */
    private boolean f50018b;

    /* renamed from: c */
    private InterfaceC5036a f50019c;

    /* renamed from: com.yandex.mobile.ads.impl.em1$a */
    public interface InterfaceC5036a {
    }

    private em1() {
    }

    /* renamed from: a */
    public static em1 m24209a() {
        return f50016d;
    }

    /* renamed from: a */
    public final void m24210a(@NonNull Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* renamed from: a */
    public final void m24211a(InterfaceC5036a interfaceC5036a) {
        this.f50019c = interfaceC5036a;
    }

    /* renamed from: b */
    public final void m24212b() {
        this.f50017a = true;
        this.f50018b = false;
        Iterator<tl1> it = ul1.m29042a().m29044b().iterator();
        while (it.hasNext()) {
            it.next().m28682i().m28892a(true);
        }
    }

    /* renamed from: c */
    public final void m24213c() {
        this.f50017a = false;
        this.f50018b = false;
        this.f50019c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f50018b) {
            this.f50018b = false;
            if (this.f50017a) {
                Iterator<tl1> it = ul1.m29042a().m29044b().iterator();
                while (it.hasNext()) {
                    it.next().m28682i().m28892a(true);
                }
                if (this.f50019c != null) {
                    Objects.requireNonNull(x71.m29694g());
                    x71.m29688a();
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        View m28678e;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        boolean z = false;
        boolean z2 = runningAppProcessInfo.importance != 100;
        boolean z3 = true;
        for (tl1 tl1Var : ul1.m29042a().m29046c()) {
            if (tl1Var.m28679f() && (m28678e = tl1Var.m28678e()) != null && m28678e.hasWindowFocus()) {
                z3 = false;
            }
        }
        if (z2 && z3) {
            z = true;
        }
        if (this.f50018b != z) {
            this.f50018b = z;
            if (this.f50017a) {
                boolean z4 = !z;
                Iterator<tl1> it = ul1.m29042a().m29044b().iterator();
                while (it.hasNext()) {
                    it.next().m28682i().m28892a(z4);
                }
                if (this.f50019c != null) {
                    if (z4) {
                        Objects.requireNonNull(x71.m29694g());
                        x71.m29688a();
                    } else {
                        Objects.requireNonNull(x71.m29694g());
                        x71.m29690c();
                    }
                }
            }
        }
    }
}
