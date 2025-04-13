package com.yandex.metrica.impl.p023ob;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

@SuppressLint
/* renamed from: com.yandex.metrica.impl.ob.Nk */
/* loaded from: classes2.dex */
class C3502Nk implements InterfaceC3880cm {

    /* renamed from: a */
    @NonNull
    private final InterfaceC3706W0 f43520a;

    /* renamed from: b */
    @NonNull
    private final C3178Al f43521b;

    /* renamed from: c */
    @NonNull
    private final InterfaceC3529Om f43522c;

    /* renamed from: d */
    private Map<Long, Long> f43523d;

    public C3502Nk() {
        this(C3524Oh.m18679a(), new C3178Al(), new C3504Nm());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3880cm
    /* renamed from: a */
    public synchronized void mo18640a(@NonNull Activity activity, long j2) {
        this.f43523d.put(Long.valueOf(j2), Long.valueOf(this.f43522c.mo18643a()));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3880cm
    /* renamed from: a */
    public void mo18641a(@NonNull Activity activity, boolean z) {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3828am
    /* renamed from: a */
    public void mo18238a(@NonNull Throwable th, @NonNull C3854bm c3854bm) {
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3828am
    /* renamed from: a */
    public boolean mo18239a(@NonNull C3378Il c3378Il) {
        return false;
    }

    @VisibleForTesting
    public C3502Nk(@NonNull InterfaceC3706W0 interfaceC3706W0, @NonNull C3178Al c3178Al, @NonNull InterfaceC3529Om interfaceC3529Om) {
        this.f43523d = new HashMap();
        this.f43520a = interfaceC3706W0;
        this.f43521b = c3178Al;
        this.f43522c = interfaceC3529Om;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3828am
    /* renamed from: a */
    public synchronized void mo18237a(long j2, @NonNull Activity activity, @NonNull C3328Gl c3328Gl, @NonNull List<C3727Wl> list, @NonNull C3378Il c3378Il, @NonNull C3879cl c3879cl) {
        long mo18643a = this.f43522c.mo18643a();
        Long l2 = this.f43523d.get(Long.valueOf(j2));
        if (l2 != null) {
            this.f43523d.remove(Long.valueOf(j2));
            InterfaceC3706W0 interfaceC3706W0 = this.f43520a;
            C3178Al c3178Al = this.f43521b;
            long longValue = mo18643a - l2.longValue();
            Objects.requireNonNull(c3178Al);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("time_millis", longValue);
            } catch (Throwable unused) {
            }
            interfaceC3706W0.reportEvent("ui_parsing_time", jSONObject.toString());
        } else {
            this.f43520a.reportError("ui_parsing_diagnostics", new IllegalStateException("Unexpected situation: no start time"));
        }
    }
}
