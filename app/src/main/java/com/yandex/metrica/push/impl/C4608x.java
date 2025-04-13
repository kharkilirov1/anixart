package com.yandex.metrica.push.impl;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.yandex.metrica.push.common.utils.TrackersHub;
import com.yandex.metrica.push.core.notification.EnumC4501d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.push.impl.x */
/* loaded from: classes2.dex */
public class C4608x implements InterfaceC4511A {

    /* renamed from: a */
    @NonNull
    private final Map<EnumC4501d, InterfaceC4612z> f47585a = new HashMap();

    /* renamed from: com.yandex.metrica.push.impl.x$a */
    public class a extends HashMap<String, Object> {

        /* renamed from: a */
        public final /* synthetic */ C4594q f47586a;

        public a(C4608x c4608x, C4594q c4594q) {
            this.f47586a = c4594q;
            put("actionType", c4594q.f47464e);
            put("pushId", c4594q.f47461b);
        }
    }

    /* renamed from: a */
    public void m21740a(@NonNull Context context, @NonNull Intent intent) {
        C4594q c4594q = (C4594q) intent.getParcelableExtra("com.yandex.metrica.push.extra.ACTION_INFO");
        if (c4594q == null) {
            TrackersHub.getInstance().reportEvent("No action info for DefaultNotificationActionProcessor");
            return;
        }
        InterfaceC4612z interfaceC4612z = this.f47585a.get(c4594q.f47464e);
        if (interfaceC4612z != null) {
            interfaceC4612z.mo21418a(context, intent);
        } else {
            TrackersHub.getInstance().reportEvent("No strategy", new a(this, c4594q));
        }
    }

    /* renamed from: b */
    public void m21742b(@NonNull InterfaceC4612z interfaceC4612z) {
        this.f47585a.put(EnumC4501d.CLEAR, interfaceC4612z);
    }

    /* renamed from: c */
    public void m21743c(@NonNull InterfaceC4612z interfaceC4612z) {
        this.f47585a.put(EnumC4501d.INLINE_ACTION, interfaceC4612z);
    }

    /* renamed from: d */
    public void m21744d(@NonNull InterfaceC4612z interfaceC4612z) {
        this.f47585a.put(EnumC4501d.CLICK, interfaceC4612z);
    }

    /* renamed from: a */
    public void m21741a(@NonNull InterfaceC4612z interfaceC4612z) {
        this.f47585a.put(EnumC4501d.ADDITIONAL_ACTION, interfaceC4612z);
    }
}
