package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Xh */
/* loaded from: classes2.dex */
public class C3748Xh {

    /* renamed from: a */
    @NonNull
    private final C3583R2 f44509a;

    /* renamed from: b */
    @NonNull
    private final C3723Wh f44510b;

    public C3748Xh(@NonNull C3723Wh c3723Wh) {
        this(c3723Wh, new C3583R2());
    }

    /* renamed from: a */
    public long m19393a(int i2) {
        return m19392a().optLong(String.valueOf(i2));
    }

    @VisibleForTesting
    public C3748Xh(@NonNull C3723Wh c3723Wh, @NonNull C3583R2 c3583r2) {
        this.f44510b = c3723Wh;
        this.f44509a = c3583r2;
    }

    /* renamed from: a */
    public void m19394a(int i2, long j2) {
        JSONObject m19392a = m19392a();
        try {
            m19392a.put(String.valueOf(i2), j2);
        } catch (Throwable unused) {
        }
        this.f44510b.m19362a(m19392a.toString());
    }

    /* renamed from: a */
    public void m19395a(long j2) {
        ArrayList arrayList = new ArrayList();
        JSONObject m19392a = m19392a();
        Iterator<String> keys = m19392a.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (this.f44509a.m18938b(m19392a.optLong(next), j2, C0000a.m14k("last socket open on ", next))) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m19392a.remove((String) it.next());
        }
        this.f44510b.m19362a(m19392a.toString());
    }

    @NonNull
    /* renamed from: a */
    private JSONObject m19392a() {
        JSONObject jSONObject = new JSONObject();
        String m19361a = this.f44510b.m19361a();
        if (TextUtils.isEmpty(m19361a)) {
            return jSONObject;
        }
        try {
            return new JSONObject(m19361a);
        } catch (Throwable unused) {
            return jSONObject;
        }
    }
}
