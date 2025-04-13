package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import com.yandex.metrica.YandexMetricaDefaultValues;
import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.S */
/* loaded from: classes2.dex */
public class C3605S extends C4066k0 {

    /* renamed from: q */
    private HashMap<a, Integer> f43977q;

    /* renamed from: r */
    private InterfaceC3555Pn<String> f43978r;

    /* renamed from: s */
    private InterfaceC3555Pn<String> f43979s;

    /* renamed from: t */
    private InterfaceC3555Pn<String> f43980t;

    /* renamed from: u */
    private InterfaceC3555Pn<byte[]> f43981u;

    /* renamed from: v */
    private InterfaceC3555Pn<String> f43982v;

    /* renamed from: w */
    private InterfaceC3555Pn<String> f43983w;

    /* renamed from: com.yandex.metrica.impl.ob.S$a */
    public enum a {
        NAME,
        VALUE,
        USER_INFO
    }

    @VisibleForTesting
    public C3605S(@NonNull C3379Im c3379Im) {
        this.f43977q = new HashMap<>();
        m19060a(c3379Im);
    }

    /* renamed from: g */
    private String m19062g(@Nullable String str) {
        String mo17985a = this.f43978r.mo17985a(str);
        m19061a(str, mo17985a, a.NAME);
        return mo17985a;
    }

    /* renamed from: h */
    private String m19063h(String str) {
        String mo17985a = this.f43979s.mo17985a(str);
        m19061a(str, mo17985a, a.VALUE);
        return mo17985a;
    }

    /* renamed from: r */
    public static C4066k0 m19064r() {
        C4066k0 c4066k0 = new C4066k0();
        c4066k0.f45524e = EnumC4067k1.EVENT_TYPE_SEND_USER_PROFILE.m20218b();
        return c4066k0;
    }

    /* renamed from: t */
    private void m19065t() {
        this.f45527h = 0;
        for (Integer num : this.f43977q.values()) {
            this.f45527h = num.intValue() + this.f45527h;
        }
    }

    /* renamed from: a */
    public C3605S m19066a(@NonNull HashMap<a, Integer> hashMap) {
        this.f43977q = hashMap;
        return this;
    }

    @Override // com.yandex.metrica.impl.p023ob.C4066k0
    /* renamed from: b */
    public C4066k0 mo19068b(String str) {
        String mo17985a = this.f43978r.mo17985a(str);
        m19061a(str, mo17985a, a.NAME);
        this.f45520a = mo17985a;
        return this;
    }

    @Override // com.yandex.metrica.impl.p023ob.C4066k0
    @NonNull
    /* renamed from: d */
    public C4066k0 mo19069d(@Nullable String str) {
        return super.mo19069d(this.f43982v.mo17985a(str));
    }

    @Override // com.yandex.metrica.impl.p023ob.C4066k0
    /* renamed from: e */
    public C4066k0 mo19070e(String str) {
        String mo17985a = this.f43983w.mo17985a(str);
        m19061a(str, mo17985a, a.USER_INFO);
        return super.mo19070e(mo17985a);
    }

    @Override // com.yandex.metrica.impl.p023ob.C4066k0
    /* renamed from: f */
    public C4066k0 mo19071f(String str) {
        String mo17985a = this.f43979s.mo17985a(str);
        m19061a(str, mo17985a, a.VALUE);
        this.f45521b = mo17985a;
        return this;
    }

    /* renamed from: i */
    public C3605S m19072i(@NonNull String str) {
        String mo17985a = this.f43980t.mo17985a(str);
        m19061a(str, mo17985a, a.VALUE);
        this.f45521b = mo17985a;
        return this;
    }

    @NonNull
    /* renamed from: s */
    public HashMap<a, Integer> m19073s() {
        return this.f43977q;
    }

    /* renamed from: a */
    private void m19060a(@NonNull C3379Im c3379Im) {
        this.f43978r = new C3505Nn(1000, "event name", c3379Im);
        this.f43979s = new C3480Mn(245760, "event value", c3379Im);
        this.f43980t = new C3480Mn(1024000, "event extended value", c3379Im);
        this.f43981u = new C3255Dn(245760, "event value bytes", c3379Im);
        this.f43982v = new C3505Nn(DatastoreTestTrace.DatastoreAction.ACTION_ID_FIELD_NUMBER, "user profile id", c3379Im);
        this.f43983w = new C3505Nn(YandexMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND, "UserInfo", c3379Im);
    }

    public C3605S(String str, String str2, int i2, @NonNull C3379Im c3379Im) {
        this(str, str2, i2, 0, c3379Im);
    }

    public C3605S(String str, String str2, int i2, int i3, @NonNull C3379Im c3379Im) {
        this.f43977q = new HashMap<>();
        m19060a(c3379Im);
        this.f45521b = m19063h(str);
        this.f45520a = m19062g(str2);
        this.f45524e = i2;
        this.f45525f = i3;
    }

    /* renamed from: a */
    private void m19061a(@Nullable String str, @Nullable String str2, a aVar) {
        if (C4013i.m20036a(str, str2)) {
            this.f43977q.put(aVar, Integer.valueOf(C3509O2.m18658c(str).length - C3509O2.m18658c(str2).length));
        } else {
            this.f43977q.remove(aVar);
        }
        m19065t();
    }

    public C3605S(byte[] bArr, @Nullable String str, int i2, @NonNull C3379Im c3379Im) {
        this.f43977q = new HashMap<>();
        m19060a(c3379Im);
        mo19067a(bArr);
        this.f45520a = m19062g(str);
        this.f45524e = i2;
    }

    @Override // com.yandex.metrica.impl.p023ob.C4066k0
    /* renamed from: a */
    public final C4066k0 mo19067a(@Nullable byte[] bArr) {
        byte[] mo17985a = this.f43981u.mo17985a(bArr);
        a aVar = a.VALUE;
        if (bArr.length != mo17985a.length) {
            this.f43977q.put(aVar, Integer.valueOf(bArr.length - mo17985a.length));
        } else {
            this.f43977q.remove(aVar);
        }
        m19065t();
        return super.mo19067a(mo17985a);
    }

    @NonNull
    /* renamed from: a */
    public static C4066k0 m19059a(@Nullable String str, @NonNull C3379Im c3379Im) {
        C3605S c3605s = new C3605S(c3379Im);
        c3605s.f45524e = EnumC4067k1.EVENT_TYPE_SET_USER_PROFILE_ID.m20218b();
        return super.mo19069d(c3605s.f43982v.mo17985a(str));
    }
}
