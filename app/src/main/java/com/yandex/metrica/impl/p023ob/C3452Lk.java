package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Lk */
/* loaded from: classes2.dex */
public class C3452Lk {

    /* renamed from: a */
    @NonNull
    private final LinkedList<JSONObject> f43352a;

    /* renamed from: b */
    @NonNull
    private final C3291F9 f43353b;

    /* renamed from: c */
    @NonNull
    private final LinkedList<String> f43354c;

    /* renamed from: d */
    @NonNull
    private final InterfaceC4009hl f43355d;

    /* renamed from: e */
    private int f43356e;

    public C3452Lk(int i2, @NonNull C3291F9 c3291f9) {
        this(i2, c3291f9, new C3327Gk());
    }

    /* renamed from: a */
    public void m18516a(@NonNull JSONObject jSONObject) {
        if (this.f43352a.size() == this.f43356e) {
            this.f43352a.removeLast();
            this.f43354c.removeLast();
        }
        String jSONObject2 = jSONObject.toString();
        this.f43352a.addFirst(jSONObject);
        this.f43354c.addFirst(jSONObject2);
        if (this.f43354c.isEmpty()) {
            return;
        }
        this.f43353b.m18042a(this.f43354c);
    }

    @NonNull
    /* renamed from: b */
    public List<JSONObject> m18517b() {
        return this.f43352a;
    }

    @VisibleForTesting
    public C3452Lk(int i2, @NonNull C3291F9 c3291f9, @NonNull InterfaceC4009hl interfaceC4009hl) {
        this.f43352a = new LinkedList<>();
        this.f43354c = new LinkedList<>();
        this.f43356e = i2;
        this.f43353b = c3291f9;
        this.f43355d = interfaceC4009hl;
        m18514a(c3291f9);
    }

    /* renamed from: a */
    private void m18514a(@NonNull C3291F9 c3291f9) {
        List<String> m18065g = c3291f9.m18065g();
        for (int max = Math.max(0, m18065g.size() - this.f43356e); max < m18065g.size(); max++) {
            String str = m18065g.get(max);
            try {
                this.f43352a.addLast(new JSONObject(str));
                this.f43354c.addLast(str);
            } catch (Throwable unused) {
            }
        }
    }

    @NonNull
    /* renamed from: a */
    public JSONObject m18515a() {
        return this.f43355d.mo18175a(new JSONArray((Collection) this.f43352a));
    }
}
