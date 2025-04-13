package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import org.json.JSONObject;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Le */
/* loaded from: classes2.dex */
public class C3446Le implements InterfaceC3282F0 {

    /* renamed from: a */
    @Nullable
    public final String f43331a;

    /* renamed from: b */
    @NonNull
    public final JSONObject f43332b;

    /* renamed from: c */
    public final boolean f43333c;

    /* renamed from: d */
    public final boolean f43334d;

    /* renamed from: e */
    @NonNull
    public final EnumC3257E0 f43335e;

    public C3446Le(@Nullable String str, @NonNull JSONObject jSONObject, boolean z, boolean z2, @NonNull EnumC3257E0 enumC3257E0) {
        this.f43331a = str;
        this.f43332b = jSONObject;
        this.f43333c = z;
        this.f43334d = z2;
        this.f43335e = enumC3257E0;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3282F0
    @NonNull
    /* renamed from: a */
    public EnumC3257E0 mo18022a() {
        return this.f43335e;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("PreloadInfoState{trackingId='");
        C0576a.m4100A(m24u, this.f43331a, '\'', ", additionalParameters=");
        m24u.append(this.f43332b);
        m24u.append(", wasSet=");
        m24u.append(this.f43333c);
        m24u.append(", autoTrackingEnabled=");
        m24u.append(this.f43334d);
        m24u.append(", source=");
        m24u.append(this.f43335e);
        m24u.append('}');
        return m24u.toString();
    }
}
