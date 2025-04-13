package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Gh */
/* loaded from: classes2.dex */
public class C3324Gh {

    /* renamed from: a */
    @NonNull
    private final C3566Q9 f43010a;

    /* renamed from: b */
    @NonNull
    private final C3299Fh f43011b;

    /* renamed from: c */
    @NonNull
    private final InterfaceC3706W0 f43012c;

    public C3324Gh(@NonNull C3566Q9 c3566q9) {
        this(c3566q9, new C3299Fh(), C3524Oh.m18679a());
    }

    /* renamed from: a */
    public void m18171a() {
        InterfaceC3706W0 interfaceC3706W0 = this.f43012c;
        C3299Fh c3299Fh = this.f43011b;
        List<C3349Hh> list = ((C3274Eh) this.f43010a.m18782b()).f42810a;
        Objects.requireNonNull(c3299Fh);
        ArrayList arrayList = new ArrayList();
        for (C3349Hh c3349Hh : list) {
            ArrayList arrayList2 = new ArrayList(c3349Hh.f43058b.size());
            for (String str : c3349Hh.f43058b) {
                if (C3184B2.m17879a(str)) {
                    arrayList2.add(str);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(new C3349Hh(c3349Hh.f43057a, arrayList2));
            }
        }
        JSONObject jSONObject = new JSONObject();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3349Hh c3349Hh2 = (C3349Hh) it.next();
            try {
                jSONObject.put(c3349Hh2.f43057a, new JSONObject().put("classes", new JSONArray((Collection) c3349Hh2.f43058b)));
            } catch (Throwable unused) {
            }
        }
        interfaceC3706W0.reportEvent("sdk_list", jSONObject.toString());
    }

    public C3324Gh(@NonNull C3566Q9 c3566q9, @NonNull C3299Fh c3299Fh, @NonNull InterfaceC3706W0 interfaceC3706W0) {
        this.f43010a = c3566q9;
        this.f43011b = c3299Fh;
        this.f43012c = interfaceC3706W0;
    }
}
