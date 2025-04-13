package com.yandex.metrica.push.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.push.impl.O0 */
/* loaded from: classes2.dex */
public class C4540O0 {

    /* renamed from: a */
    @NonNull
    private final Map<String, a> f47305a = new HashMap();

    /* renamed from: com.yandex.metrica.push.impl.O0$a */
    public interface a {
        @NonNull
        /* renamed from: a */
        String mo21465a(@NonNull String str);

        @NonNull
        /* renamed from: a */
        List<String> mo21466a();
    }

    public C4540O0(@Nullable String str, @Nullable String str2) {
    }

    @NonNull
    /* renamed from: a */
    public C4540O0 m21463a(@NonNull a aVar) {
        Iterator<String> it = aVar.mo21466a().iterator();
        while (it.hasNext()) {
            this.f47305a.put(it.next(), aVar);
        }
        return this;
    }

    @NonNull
    /* renamed from: a */
    public String m21464a(@NonNull String str) {
        for (Map.Entry<String, a> entry : this.f47305a.entrySet()) {
            String format = String.format("%s%s%s", "[{]", entry.getKey(), "[}]");
            if (str.matches(String.format(".*%s.*", format))) {
                str = str.replaceAll(format, entry.getValue().mo21465a(entry.getKey()));
            }
        }
        return str;
    }
}
