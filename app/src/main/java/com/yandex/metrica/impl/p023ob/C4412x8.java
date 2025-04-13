package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3515O8;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.x8 */
/* loaded from: classes2.dex */
public class C4412x8 {

    /* renamed from: a */
    @NonNull
    private final HashMap<String, List<String>> f46928a;

    public C4412x8() {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        this.f46928a = hashMap;
        hashMap.put("reports", C3515O8.d.f43549a);
        hashMap.put("sessions", C3515O8.e.f43551a);
        hashMap.put("preferences", C3515O8.c.f43548a);
        hashMap.put("binary_data", C3515O8.b.f43547a);
    }

    @NonNull
    /* renamed from: a */
    public HashMap<String, List<String>> m21141a() {
        return this.f46928a;
    }
}
