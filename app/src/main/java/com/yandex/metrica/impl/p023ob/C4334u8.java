package com.yandex.metrica.impl.p023ob;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.p023ob.C3265E8;
import com.yandex.metrica.impl.p023ob.C3515O8;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.u8 */
/* loaded from: classes2.dex */
public class C4334u8 {

    /* renamed from: a */
    @NonNull
    private final C4360v8 f46592a;

    /* renamed from: b */
    @NonNull
    private final C4412x8 f46593b;

    /* renamed from: c */
    @NonNull
    private final C3265E8.b f46594c;

    public C4334u8(@NonNull C4360v8 c4360v8, @NonNull C4412x8 c4412x8, @NonNull C3265E8.b bVar) {
        this.f46592a = c4360v8;
        this.f46593b = c4412x8;
        this.f46594c = bVar;
    }

    /* renamed from: a */
    public C3265E8 m20870a() {
        HashMap hashMap = new HashMap();
        hashMap.put("binary_data", C3515O8.b.f43547a);
        return this.f46594c.m18005a("auto_inapp", this.f46592a.m20926a(), this.f46592a.m20927b(), new SparseArray<>(), new C3315G8("auto_inapp", hashMap));
    }

    /* renamed from: b */
    public C3265E8 m20871b() {
        HashMap hashMap = new HashMap();
        hashMap.put("preferences", C3515O8.c.f43548a);
        return this.f46594c.m18005a("client storage", this.f46592a.m20928c(), this.f46592a.m20929d(), new SparseArray<>(), new C3315G8("metrica.db", hashMap));
    }

    /* renamed from: c */
    public C3265E8 m20872c() {
        return this.f46594c.m18005a("main", this.f46592a.m20930e(), this.f46592a.m20931f(), this.f46592a.m20937l(), new C3315G8("main", this.f46593b.m21141a()));
    }

    /* renamed from: d */
    public C3265E8 m20873d() {
        HashMap hashMap = new HashMap();
        hashMap.put("preferences", C3515O8.c.f43548a);
        return this.f46594c.m18005a("metrica_multiprocess.db", this.f46592a.m20932g(), this.f46592a.m20933h(), new SparseArray<>(), new C3315G8("metrica_multiprocess.db", hashMap));
    }

    /* renamed from: e */
    public C3265E8 m20874e() {
        HashMap hashMap = new HashMap();
        List<String> list = C3515O8.c.f43548a;
        hashMap.put("preferences", list);
        hashMap.put("binary_data", C3515O8.b.f43547a);
        hashMap.put("startup", list);
        List<String> list2 = C3515O8.a.f43542a;
        hashMap.put("l_dat", list2);
        hashMap.put("lbs_dat", list2);
        return this.f46594c.m18005a("metrica.db", this.f46592a.m20934i(), this.f46592a.m20935j(), this.f46592a.m20936k(), new C3315G8("metrica.db", hashMap));
    }
}
