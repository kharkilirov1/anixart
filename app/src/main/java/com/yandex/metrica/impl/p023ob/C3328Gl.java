package com.yandex.metrica.impl.p023ob;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Gl */
/* loaded from: classes2.dex */
class C3328Gl {

    /* renamed from: a */
    @Nullable
    private C4269rl f43016a;

    /* renamed from: a */
    public void m18178a(@NonNull C4321tl c4321tl, @NonNull View view, @NonNull InterfaceC4035il interfaceC4035il) {
        C4269rl m20846b = c4321tl.m20846b(null, view, 0);
        this.f43016a = m20846b;
        if (m20846b != null) {
            m18176a(c4321tl, m20846b, view, 1, interfaceC4035il);
        }
    }

    @NonNull
    /* renamed from: a */
    public JSONObject m18177a(@NonNull C3428Kl c3428Kl, @NonNull C3853bl c3853bl, int i2) {
        C4269rl c4269rl = this.f43016a;
        JSONObject jSONObject = c4269rl != null ? c4269rl.m20667a(c3428Kl, c3853bl, i2, 0).f46316c : null;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    /* renamed from: a */
    private void m18176a(@NonNull C4321tl c4321tl, @NonNull C4269rl c4269rl, @NonNull View view, int i2, @NonNull InterfaceC4035il interfaceC4035il) {
        ArrayList arrayList = (ArrayList) c4321tl.m20844a(view, i2);
        if (arrayList.size() == 0) {
            interfaceC4035il.mo18926a(c4269rl.m20666a());
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view2 = (View) it.next();
            C4269rl m20846b = c4321tl.m20846b(c4269rl.m20666a(), view2, i2);
            if (m20846b != null) {
                c4269rl.m20668a(m20846b);
                m18176a(c4321tl, m20846b, view2, i2 + 1, interfaceC4035il);
            }
        }
    }
}
