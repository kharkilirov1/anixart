package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.YandexMetrica;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.T3 */
/* loaded from: classes2.dex */
public class C3634T3 {

    /* renamed from: a */
    @Nullable
    private final C3659U3 f44058a;

    /* renamed from: b */
    @NonNull
    private final CounterConfiguration f44059b;

    public C3634T3(@NonNull Bundle bundle) {
        this.f44058a = C3659U3.m19220a(bundle);
        CounterConfiguration counterConfiguration = null;
        if (bundle != null) {
            try {
                counterConfiguration = (CounterConfiguration) bundle.getParcelable("COUNTER_CFG_OBJ");
            } catch (Throwable unused) {
            }
        }
        counterConfiguration = counterConfiguration == null ? new CounterConfiguration() : counterConfiguration;
        synchronized (counterConfiguration) {
            if (bundle != null) {
                if (bundle.getInt("CFG_DISPATCH_PERIOD") != 0) {
                    int i2 = bundle.getInt("CFG_DISPATCH_PERIOD");
                    synchronized (counterConfiguration) {
                        counterConfiguration.f42234b.put("CFG_DISPATCH_PERIOD", Integer.valueOf(i2));
                    }
                }
                if (bundle.getInt("CFG_SESSION_TIMEOUT") != 0) {
                    int i3 = bundle.getInt("CFG_SESSION_TIMEOUT");
                    synchronized (counterConfiguration) {
                        counterConfiguration.f42234b.put("CFG_SESSION_TIMEOUT", Integer.valueOf(i3));
                    }
                }
                if (bundle.getInt("CFG_MAX_REPORTS_COUNT") != 0) {
                    int i4 = bundle.getInt("CFG_MAX_REPORTS_COUNT");
                    synchronized (counterConfiguration) {
                        counterConfiguration.f42234b.put("CFG_MAX_REPORTS_COUNT", Integer.valueOf(i4 <= 0 ? Integer.MAX_VALUE : i4));
                    }
                }
                if (bundle.getString("CFG_API_KEY") != null && !"-1".equals(bundle.getString("CFG_API_KEY"))) {
                    String string = bundle.getString("CFG_API_KEY");
                    synchronized (counterConfiguration) {
                        counterConfiguration.f42234b.put("CFG_API_KEY", string);
                    }
                }
            }
        }
        this.f44059b = counterConfiguration;
    }

    @NonNull
    /* renamed from: a */
    public C3659U3 m19135a() {
        return this.f44058a;
    }

    @NonNull
    /* renamed from: b */
    public CounterConfiguration m19136b() {
        return this.f44059b;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("ClientConfiguration{mProcessConfiguration=");
        m24u.append(this.f44058a);
        m24u.append(", mCounterConfiguration=");
        m24u.append(this.f44059b);
        m24u.append('}');
        return m24u.toString();
    }

    /* renamed from: a */
    public static boolean m19134a(@Nullable C3634T3 c3634t3, @NonNull Context context) {
        return (c3634t3.f44058a != null && context.getPackageName().equals(c3634t3.f44058a.m19232f()) && c3634t3.f44058a.m19235i() == YandexMetrica.getLibraryApiLevel()) ? false : true;
    }

    public C3634T3(@NonNull C3659U3 c3659u3, @NonNull CounterConfiguration counterConfiguration) {
        this.f44058a = c3659u3;
        this.f44059b = counterConfiguration;
    }
}
