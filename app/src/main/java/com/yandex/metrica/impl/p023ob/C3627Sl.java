package com.yandex.metrica.impl.p023ob;

import android.app.Activity;
import androidx.annotation.NonNull;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Sl */
/* loaded from: classes2.dex */
public class C3627Sl {

    /* renamed from: a */
    @NonNull
    private final InterfaceC4113ll f44024a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC4061jl f44025b;

    /* renamed from: c */
    @NonNull
    private final InterfaceC4087kl f44026c;

    /* renamed from: d */
    @NonNull
    private final InterfaceC4009hl f44027d;

    /* renamed from: e */
    @NonNull
    private final String f44028e;

    public C3627Sl(@NonNull InterfaceC4113ll interfaceC4113ll, @NonNull InterfaceC4061jl interfaceC4061jl, @NonNull InterfaceC4087kl interfaceC4087kl, @NonNull InterfaceC4009hl interfaceC4009hl, @NonNull String str) {
        this.f44024a = interfaceC4113ll;
        this.f44025b = interfaceC4061jl;
        this.f44026c = interfaceC4087kl;
        this.f44027d = interfaceC4009hl;
        this.f44028e = str;
    }

    @NonNull
    /* renamed from: a */
    public JSONObject m19107a(@NonNull Activity activity, @NonNull C3328Gl c3328Gl, @NonNull C3428Kl c3428Kl, @NonNull C3853bl c3853bl, long j2) {
        JSONObject mo18642a = this.f44024a.mo18642a(activity, j2);
        try {
            this.f44026c.mo18598a(mo18642a, new JSONObject(), this.f44028e);
            this.f44026c.mo18598a(mo18642a, this.f44025b.mo19055a(c3328Gl, c3428Kl, c3853bl, (mo18642a.toString().getBytes().length + (this.f44027d.mo18175a(new JSONObject()).toString().getBytes().length - 2)) - 2), this.f44028e);
        } catch (Throwable unused) {
        }
        return mo18642a;
    }
}
