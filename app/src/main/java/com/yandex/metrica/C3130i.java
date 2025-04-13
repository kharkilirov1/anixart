package com.yandex.metrica;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.ReporterConfig;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.i */
/* loaded from: classes2.dex */
public class C3130i extends ReporterConfig {

    /* renamed from: a */
    @Nullable
    public final Integer f42476a;

    /* renamed from: b */
    @Nullable
    public final Integer f42477b;

    /* renamed from: c */
    public final Map<String, String> f42478c;

    /* renamed from: com.yandex.metrica.i$a */
    public static class a {

        /* renamed from: a */
        public ReporterConfig.Builder f42479a;

        /* renamed from: b */
        public Integer f42480b;

        /* renamed from: c */
        public Integer f42481c;

        /* renamed from: d */
        public LinkedHashMap<String, String> f42482d = new LinkedHashMap<>();

        public a(String str) {
            this.f42479a = ReporterConfig.newConfigBuilder(str);
        }
    }

    public C3130i(@NonNull a aVar) {
        super(aVar.f42479a);
        this.f42477b = aVar.f42480b;
        this.f42476a = aVar.f42481c;
        LinkedHashMap<String, String> linkedHashMap = aVar.f42482d;
        this.f42478c = linkedHashMap == null ? null : Collections.unmodifiableMap(linkedHashMap);
    }

    public C3130i(ReporterConfig reporterConfig) {
        super(reporterConfig);
        if (reporterConfig instanceof C3130i) {
            C3130i c3130i = (C3130i) reporterConfig;
            this.f42476a = c3130i.f42476a;
            this.f42477b = c3130i.f42477b;
            this.f42478c = c3130i.f42478c;
            return;
        }
        this.f42476a = null;
        this.f42477b = null;
        this.f42478c = null;
    }
}
