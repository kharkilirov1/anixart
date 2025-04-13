package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.qk */
/* loaded from: classes3.dex */
public final class C5643qk {

    /* renamed from: a */
    private final HashMap f54068a = new HashMap();

    /* renamed from: b */
    private final ArrayList f54069b = new ArrayList();

    /* renamed from: a */
    public static void m27743a(C5643qk c5643qk, long j2) {
        Long valueOf = Long.valueOf(j2);
        HashMap hashMap = c5643qk.f54068a;
        Objects.requireNonNull(valueOf);
        hashMap.put("exo_len", valueOf);
        c5643qk.f54069b.remove("exo_len");
    }

    /* renamed from: b */
    public final List<String> m27746b() {
        return Collections.unmodifiableList(new ArrayList(this.f54069b));
    }

    /* renamed from: a */
    public static void m27744a(C5643qk c5643qk, @Nullable Uri uri) {
        if (uri == null) {
            c5643qk.f54069b.add("exo_redir");
            c5643qk.f54068a.remove("exo_redir");
            return;
        }
        String uri2 = uri.toString();
        HashMap hashMap = c5643qk.f54068a;
        Objects.requireNonNull(uri2);
        hashMap.put("exo_redir", uri2);
        c5643qk.f54069b.remove("exo_redir");
    }

    /* renamed from: a */
    public final Map<String, Object> m27745a() {
        HashMap hashMap = new HashMap(this.f54068a);
        for (Map.Entry entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
