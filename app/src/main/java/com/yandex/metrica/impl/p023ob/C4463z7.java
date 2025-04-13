package com.yandex.metrica.impl.p023ob;

import java.nio.charset.Charset;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.metrica.impl.ob.z7 */
/* loaded from: classes2.dex */
public final class C4463z7 implements InterfaceC3920ea<Map<String, ? extends String>, C3422Kf[]> {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    /* renamed from: a */
    public Map<String, ? extends String> mo17817a(C3422Kf[] c3422KfArr) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    /* renamed from: b */
    public /* bridge */ /* synthetic */ C3422Kf[] mo17818b(Map<String, ? extends String> map) {
        return m21292a((Map<String, String>) map);
    }

    @NotNull
    /* renamed from: a */
    public C3422Kf[] m21292a(@NotNull Map<String, String> map) {
        int size = map.size();
        C3422Kf[] c3422KfArr = new C3422Kf[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            c3422KfArr[i3] = new C3422Kf();
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            C3422Kf c3422Kf = c3422KfArr[i2];
            String key = entry.getKey();
            Charset charset = Charsets.f66855b;
            Objects.requireNonNull(key, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = key.getBytes(charset);
            Intrinsics.m32178g(bytes, "(this as java.lang.String).getBytes(charset)");
            c3422Kf.f43280b = bytes;
            C3422Kf c3422Kf2 = c3422KfArr[i2];
            String value = entry.getValue();
            Objects.requireNonNull(value, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes2 = value.getBytes(charset);
            Intrinsics.m32178g(bytes2, "(this as java.lang.String).getBytes(charset)");
            c3422Kf2.f43281c = bytes2;
            i2++;
        }
        return c3422KfArr;
    }
}
