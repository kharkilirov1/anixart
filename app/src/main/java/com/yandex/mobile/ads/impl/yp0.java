package com.yandex.mobile.ads.impl;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class yp0 extends BroadcastReceiver {

    /* renamed from: d */
    private static volatile yp0 f56904d;

    /* renamed from: e */
    private static final Object f56905e = new Object();

    /* renamed from: c */
    private WeakHashMap<InterfaceC6087a, Object> f56908c = new WeakHashMap<>();

    /* renamed from: b */
    private int f56907b = 3;

    /* renamed from: a */
    private boolean f56906a = false;

    /* renamed from: com.yandex.mobile.ads.impl.yp0$a */
    public interface InterfaceC6087a {
        /* renamed from: a */
        void mo21796a(@NonNull Intent intent);
    }

    private yp0() {
    }

    /* renamed from: a */
    public static yp0 m29957a() {
        if (f56904d == null) {
            synchronized (f56905e) {
                if (f56904d == null) {
                    f56904d = new yp0();
                }
            }
        }
        return f56904d;
    }

    /* renamed from: b */
    public final synchronized void m29960b(Context context, InterfaceC6087a interfaceC6087a) {
        if (context != null) {
            this.f56908c.remove(interfaceC6087a);
            try {
                if (this.f56906a && this.f56908c.isEmpty()) {
                    context.getApplicationContext().unregisterReceiver(this);
                    this.f56906a = false;
                    n60.m26811d("Phone state tracker was unregistered", new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        if (intent != null) {
            n60.m26811d("Phone state has changed, action: %s", intent.getAction());
            String action = intent.getAction();
            if ("android.intent.action.SCREEN_OFF".equals(action)) {
                this.f56907b = 2;
            } else if ("android.intent.action.USER_PRESENT".equals(action)) {
                this.f56907b = 3;
            } else if ("android.intent.action.SCREEN_ON".equals(action)) {
                this.f56907b = 1;
            }
            n60.m26811d(um1.m29049a("handleIntent(), intent.getAction() = ", action), new Object[0]);
            synchronized (this) {
                Iterator<InterfaceC6087a> it = this.f56908c.keySet().iterator();
                while (it.hasNext()) {
                    it.next().mo21796a(intent);
                }
            }
        }
    }

    /* renamed from: b */
    public final synchronized boolean m29961b(Context context) {
        boolean isInteractive;
        synchronized (this) {
            isInteractive = ((PowerManager) context.getSystemService("power")).isInteractive();
        }
        cz0 m29824a = xz0.m29823b().m29824a(context);
        if (m29824a == null || !m29824a.m23576O()) {
            return isInteractive && !m29958a(context);
        }
        return isInteractive;
    }

    /* renamed from: a */
    public final synchronized void m29959a(Context context, InterfaceC6087a interfaceC6087a) {
        if (context != null) {
            try {
                this.f56908c.put(interfaceC6087a, null);
                if (!this.f56906a) {
                    Context applicationContext = context.getApplicationContext();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    intentFilter.addAction("android.intent.action.SCREEN_OFF");
                    intentFilter.addAction("android.intent.action.USER_PRESENT");
                    applicationContext.registerReceiver(this, intentFilter);
                    this.f56906a = true;
                    n60.m26811d("Phone state tracker was registered", new Object[0]);
                }
            } catch (Exception unused) {
                m29960b(context, interfaceC6087a);
            }
        }
    }

    /* renamed from: a */
    private synchronized boolean m29958a(Context context) {
        boolean z;
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        if (keyguardManager != null) {
            z = keyguardManager.isKeyguardLocked();
        } else {
            z = this.f56907b == 2;
        }
        return z;
    }
}
