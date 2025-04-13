package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Objects;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Ul */
/* loaded from: classes2.dex */
public class C3677Ul {

    /* renamed from: a */
    @NonNull
    private final InterfaceC3529Om f44189a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC3706W0 f44190b;

    /* renamed from: c */
    @NonNull
    private final C3178Al f44191c;

    /* renamed from: d */
    private final boolean f44192d;

    /* renamed from: e */
    private boolean f44193e;

    /* renamed from: f */
    private long f44194f;

    public C3677Ul(boolean z) {
        this(z, new C3504Nm(), C3524Oh.m18679a(), new C3178Al());
    }

    /* renamed from: a */
    public void m19255a() {
        long mo18643a = this.f44189a.mo18643a();
        InterfaceC3706W0 interfaceC3706W0 = this.f44190b;
        C3178Al c3178Al = this.f44191c;
        long j2 = mo18643a - this.f44194f;
        boolean z = this.f44192d;
        boolean z2 = this.f44193e;
        Objects.requireNonNull(c3178Al);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time_millis", j2).put("force", z).put("rescanned", z2);
        } catch (Throwable unused) {
        }
        interfaceC3706W0.reportEvent("ui_parsing_bridge_time", jSONObject.toString());
    }

    /* renamed from: b */
    public void m19257b() {
        this.f44194f = this.f44189a.mo18643a();
    }

    @VisibleForTesting
    public C3677Ul(boolean z, @NonNull InterfaceC3529Om interfaceC3529Om, @NonNull InterfaceC3706W0 interfaceC3706W0, @NonNull C3178Al c3178Al) {
        this.f44193e = false;
        this.f44192d = z;
        this.f44189a = interfaceC3529Om;
        this.f44190b = interfaceC3706W0;
        this.f44191c = c3178Al;
    }

    /* renamed from: a */
    public void m19256a(boolean z) {
        this.f44193e = z;
    }
}
