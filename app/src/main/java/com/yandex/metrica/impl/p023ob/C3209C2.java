package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.CounterConfiguration;

/* renamed from: com.yandex.metrica.impl.ob.C2 */
/* loaded from: classes2.dex */
public class C3209C2 {

    /* renamed from: a */
    @NonNull
    private final String f42652a;

    /* renamed from: b */
    @NonNull
    private final Context f42653b;

    /* renamed from: c */
    @Nullable
    private final CounterConfiguration.EnumC3079b f42654c;

    /* renamed from: d */
    @NonNull
    private final C3259E2 f42655d;

    public C3209C2(@NonNull String str, @NonNull Context context, @NonNull CounterConfiguration.EnumC3079b enumC3079b, @NonNull C3259E2 c3259e2) {
        this.f42652a = str;
        this.f42653b = context;
        int ordinal = enumC3079b.ordinal();
        if (ordinal == 0) {
            this.f42654c = CounterConfiguration.EnumC3079b.SELF_DIAGNOSTIC_MAIN;
        } else if (ordinal != 1) {
            this.f42654c = null;
        } else {
            this.f42654c = CounterConfiguration.EnumC3079b.SELF_DIAGNOSTIC_MANUAL;
        }
        this.f42655d = c3259e2;
    }

    /* renamed from: a */
    public void m17916a(@NonNull C4066k0 c4066k0) {
        if (this.f42654c != null) {
            try {
                String str = this.f42652a;
                CounterConfiguration counterConfiguration = new CounterConfiguration();
                synchronized (counterConfiguration) {
                    synchronized (counterConfiguration) {
                        counterConfiguration.f42234b.put("CFG_API_KEY", str);
                    }
                    counterConfiguration.m17755f(this.f42654c);
                    this.f42655d.m17996a(c4066k0.m20196b(new C4068k2(new C3659U3(this.f42653b, (ResultReceiver) null), counterConfiguration, null).m20222c()));
                }
                counterConfiguration.m17755f(this.f42654c);
                this.f42655d.m17996a(c4066k0.m20196b(new C4068k2(new C3659U3(this.f42653b, (ResultReceiver) null), counterConfiguration, null).m20222c()));
            } catch (Throwable unused) {
            }
        }
    }
}
