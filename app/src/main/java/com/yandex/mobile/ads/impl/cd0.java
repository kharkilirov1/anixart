package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.mediation.base.C6164a;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class cd0<T extends C6164a> {

    /* renamed from: a */
    private final ed0 f49210a;

    public cd0(@NonNull ed0 ed0Var) {
        this.f49210a = ed0Var;
    }

    @Nullable
    /* renamed from: a */
    public final T m23226a(@NonNull Context context, @NonNull qd0 qd0Var, @NonNull Class<T> cls) {
        T t = null;
        try {
            String m27676c = qd0Var.m27676c();
            Object m29277a = vu0.m29277a(Class.forName(m27676c), new Object[0]);
            T cast = cls.cast(m29277a);
            if (cast != null) {
                return cast;
            }
            try {
                m23225a(context, qd0Var, m29277a == null ? String.format("Instantiation failed for %s", m27676c) : String.format("Cast from %s to %s is failed", m29277a.getClass().getName(), cls.getName()));
                return cast;
            } catch (ClassCastException e2) {
                e = e2;
                t = cast;
                HashMap hashMap = new HashMap();
                hashMap.put("reason", "does_not_conform_to_protocol");
                n60.m26808a(e, e.getMessage(), new Object[0]);
                hashMap.put("description", String.format("%s %s", e.getClass().getName(), e.getMessage()));
                this.f49210a.m24119a(context, qd0Var, hashMap);
                return t;
            } catch (Exception e3) {
                e = e3;
                t = cast;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("reason", "could_not_create_adapter");
                n60.m26808a(e, e.getMessage(), new Object[0]);
                hashMap2.put("description", String.format("%s %s", e.getClass().getName(), e.getMessage()));
                this.f49210a.m24119a(context, qd0Var, hashMap2);
                return t;
            }
        } catch (ClassCastException e4) {
            e = e4;
        } catch (Exception e5) {
            e = e5;
        }
    }

    /* renamed from: a */
    private void m23225a(@NonNull Context context, @NonNull qd0 qd0Var, @NonNull String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", "could_not_create_adapter");
        hashMap.put("description", str);
        this.f49210a.m24119a(context, qd0Var, hashMap);
    }
}
