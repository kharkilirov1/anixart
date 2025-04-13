package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.yandex.metrica.C3130i;
import com.yandex.metrica.C4483l;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.l2 */
/* loaded from: classes2.dex */
public class C4094l2 implements InterfaceC3731X0 {

    /* renamed from: a */
    @NonNull
    private Context f45847a;

    /* renamed from: b */
    @NonNull
    private C3659U3 f45848b;

    /* renamed from: c */
    @NonNull
    private C4146n2 f45849c;

    /* renamed from: d */
    @NonNull
    private Handler f45850d;

    /* renamed from: e */
    @NonNull
    private C3375Ii f45851e;

    /* renamed from: f */
    private Map<String, InterfaceC3706W0> f45852f;

    /* renamed from: g */
    private final InterfaceC4350uo<String> f45853g;

    /* renamed from: h */
    private final List<String> f45854h;

    public C4094l2(@NonNull Context context, @NonNull C3659U3 c3659u3, @NonNull C4146n2 c4146n2, @NonNull Handler handler, @NonNull C3375Ii c3375Ii) {
        HashMap hashMap = new HashMap();
        this.f45852f = hashMap;
        this.f45853g = new C4272ro(new C4402wo(hashMap));
        this.f45854h = Arrays.asList("20799a27-fa80-4b36-b2db-0f8141f24180", "0e5e9c33-f8c3-4568-86c5-2e4f57523f72");
        this.f45847a = context;
        this.f45848b = c3659u3;
        this.f45849c = c4146n2;
        this.f45850d = handler;
        this.f45851e = c3375Ii;
    }

    @NonNull
    @WorkerThread
    /* renamed from: a */
    public C4275s1 m20315a(@NonNull C4483l c4483l, boolean z, @NonNull C3291F9 c3291f9) {
        this.f45853g.mo18360a(c4483l.apiKey);
        Context context = this.f45847a;
        C3659U3 c3659u3 = this.f45848b;
        C4275s1 c4275s1 = new C4275s1(context, c3659u3, c4483l, this.f45849c, new C3588R7(context, c3659u3), this.f45851e, new C3608S2(this, "20799a27-fa80-4b36-b2db-0f8141f24180"), new C3608S2(this, "0e5e9c33-f8c3-4568-86c5-2e4f57523f72"), c3291f9, new C3223Cg(), C3755Y.m19410g(), new C3407K0(context));
        m20314a(c4275s1);
        if (z) {
            c4275s1.f43161i.m20438c(c4275s1.f43154b);
        }
        Map<String, String> map = c4483l.f47174h;
        if (!C3658U2.m19218b(map)) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key)) {
                    c4275s1.f43161i.m20427a(key, value, c4275s1.f43154b);
                } else if (c4275s1.f43155c.m21337c()) {
                    c4275s1.f43155c.m21336c("Invalid App Environment (key,value) pair: (%s,%s).", key, value);
                }
            }
        }
        c4275s1.m18349a(c4483l.errorEnvironment);
        c4275s1.m18359f();
        this.f45849c.m20423a(c4275s1);
        this.f45852f.put(c4483l.apiKey, c4275s1);
        return c4275s1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.yandex.metrica.impl.ob.W0] */
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3731X0
    @NonNull
    /* renamed from: b */
    public synchronized InterfaceC3706W0 mo18638b(@NonNull C3130i c3130i) {
        C4327u1 c4327u1;
        InterfaceC3706W0 interfaceC3706W0 = this.f45852f.get(c3130i.apiKey);
        c4327u1 = interfaceC3706W0;
        if (interfaceC3706W0 == 0) {
            if (!this.f45854h.contains(c3130i.apiKey)) {
                this.f45851e.m18334g();
            }
            C4327u1 c4327u12 = new C4327u1(this.f45847a, this.f45848b, c3130i, this.f45849c);
            m20314a(c4327u12);
            c4327u12.m18359f();
            this.f45852f.put(c3130i.apiKey, c4327u12);
            c4327u1 = c4327u12;
        }
        return c4327u1;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3756Y0
    @NonNull
    /* renamed from: b */
    public InterfaceC3731X0 mo18639b() {
        return this;
    }

    /* renamed from: c */
    public synchronized void m20316c(@NonNull C3130i c3130i) {
        if (this.f45852f.containsKey(c3130i.apiKey)) {
            C3379Im m21313b = AbstractC4478zm.m21313b(c3130i.apiKey);
            if (m21313b.m21337c()) {
                m21313b.m21336c("Reporter with apiKey=%s already exists.", c3130i.apiKey);
            }
        } else {
            mo18638b(c3130i);
            Log.i("AppMetrica", "Activate reporter with APIKey " + C3658U2.m19199a(c3130i.apiKey));
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3731X0
    @NonNull
    /* renamed from: a */
    public synchronized InterfaceC3833b1 mo18637a(@NonNull C4483l c4483l) {
        InterfaceC3833b1 interfaceC3833b1;
        InterfaceC3833b1 interfaceC3833b12 = (InterfaceC3706W0) this.f45852f.get(c4483l.apiKey);
        interfaceC3833b1 = interfaceC3833b12;
        if (interfaceC3833b12 == null) {
            C4092l0 c4092l0 = new C4092l0(this.f45847a, this.f45848b, c4483l, this.f45849c);
            m20314a(c4092l0);
            c4092l0.m18349a(c4483l.errorEnvironment);
            c4092l0.m18359f();
            interfaceC3833b1 = c4092l0;
        }
        return interfaceC3833b1;
    }

    /* renamed from: a */
    private void m20314a(@NonNull AbstractC3381J abstractC3381J) {
        abstractC3381J.m18345a(new C4093l1(this.f45850d, abstractC3381J));
        abstractC3381J.f43154b.m20219a(this.f45851e);
    }
}
