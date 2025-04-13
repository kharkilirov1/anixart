package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.Vn */
/* loaded from: classes2.dex */
public class C3704Vn extends AbstractC3604Rn {

    /* renamed from: b */
    @NonNull
    private final C3679Un f44357b;

    /* renamed from: c */
    @NonNull
    private final C3679Un f44358c;

    /* renamed from: d */
    private Comparator<Map.Entry<String, String>> f44359d;

    /* renamed from: com.yandex.metrica.impl.ob.Vn$a */
    public class a implements Comparator<Map.Entry<String, String>> {
        public a(C3704Vn c3704Vn) {
        }

        @Override // java.util.Comparator
        public int compare(Map.Entry<String, String> entry, Map.Entry<String, String> entry2) {
            String value = entry.getValue();
            String value2 = entry2.getValue();
            int length = C3509O2.m18658c(value).length;
            int length2 = C3509O2.m18658c(value2).length;
            if (length < length2) {
                return -1;
            }
            return length == length2 ? 0 : 1;
        }
    }

    public C3704Vn(int i2, int i3, int i4) {
        this(i2, new C3679Un(i3), new C3679Un(i4));
    }

    public C3704Vn(int i2, @NonNull C3679Un c3679Un, @NonNull C3679Un c3679Un2) {
        super(i2);
        this.f44359d = new a(this);
        this.f44357b = c3679Un;
        this.f44358c = c3679Un2;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3604Rn
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3580Qn<Map<String, String>, C3355Hn> mo19058a(@Nullable Map<String, String> map) {
        HashMap hashMap;
        int i2;
        int i3 = 0;
        if (map != null) {
            hashMap = new HashMap();
            Set<Map.Entry<String, String>> entrySet = map.entrySet();
            Map.Entry[] entryArr = (Map.Entry[]) entrySet.toArray(new Map.Entry[entrySet.size()]);
            Arrays.sort(entryArr, this.f44359d);
            int length = entryArr.length;
            i2 = 0;
            int i4 = 0;
            boolean z = false;
            int i5 = 0;
            while (i3 < length) {
                Map.Entry entry = entryArr[i3];
                C3580Qn<String, InterfaceC3305Fn> mo19058a = this.f44357b.mo19058a((String) entry.getKey());
                C3580Qn<String, InterfaceC3305Fn> mo19058a2 = this.f44358c.mo19058a((String) entry.getValue());
                int length2 = C3509O2.m18658c((String) entry.getKey()).length + C3509O2.m18658c((String) entry.getValue()).length;
                int length3 = C3509O2.m18658c(mo19058a.f43777a).length + C3509O2.m18658c(mo19058a2.f43777a).length;
                if (z || length3 + i5 > m19057a()) {
                    i4++;
                    i2 += length2;
                    z = true;
                } else {
                    i2 = mo19058a2.f43778b.mo18020a() + mo19058a.f43778b.mo18020a() + i2;
                    int length4 = C3509O2.m18658c(mo19058a.f43777a).length + C3509O2.m18658c(mo19058a2.f43777a).length + i5;
                    hashMap.put(mo19058a.f43777a, mo19058a2.f43777a);
                    i5 = length4;
                }
                i3++;
            }
            i3 = i4;
        } else {
            hashMap = null;
            i2 = 0;
        }
        return new C3580Qn<>(hashMap, new C3355Hn(i3, i2));
    }
}
