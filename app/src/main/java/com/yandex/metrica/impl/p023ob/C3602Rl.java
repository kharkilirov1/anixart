package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3727Wl;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Rl */
/* loaded from: classes2.dex */
public class C3602Rl implements InterfaceC4061jl {

    /* renamed from: a */
    @NonNull
    private final List<C3727Wl> f43975a;

    public C3602Rl(@NonNull List<C3727Wl> list) {
        this.f43975a = list;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4061jl
    @NonNull
    /* renamed from: a */
    public Object mo19055a(@NonNull C3328Gl c3328Gl, @NonNull C3428Kl c3428Kl, @NonNull C3853bl c3853bl, int i2) {
        JSONArray jSONArray = new JSONArray();
        if (this.f43975a.isEmpty()) {
            return jSONArray;
        }
        for (C3727Wl c3727Wl : this.f43975a) {
            C3727Wl.b mo18016a = c3727Wl.mo18016a(c3853bl);
            int i3 = 0;
            if ((c3428Kl.f43290f || c3727Wl.mo18018a()) && (mo18016a == null || !c3428Kl.f43293i)) {
                JSONObject m19367a = c3727Wl.m19367a(c3428Kl, mo18016a);
                int length = m19367a.toString().getBytes().length + 1;
                int length2 = jSONArray.length();
                if (i2 + length <= c3428Kl.f43298n && length2 < c3428Kl.f43297m) {
                    jSONArray.put(m19367a);
                    i3 = length;
                }
            }
            i2 += i3;
        }
        return jSONArray;
    }
}
