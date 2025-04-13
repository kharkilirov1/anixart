package com.yandex.metrica.impl.p023ob;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Bi */
/* loaded from: classes2.dex */
public class C3200Bi {

    /* renamed from: a */
    @Nullable
    public final String f42629a;

    /* renamed from: b */
    @Nullable
    public final String f42630b;

    /* renamed from: c */
    @Nullable
    public final String f42631c;

    /* renamed from: d */
    @NonNull
    public final List<Pair<String, String>> f42632d;

    /* renamed from: e */
    @Nullable
    public final Long f42633e;

    /* renamed from: f */
    @NonNull
    public final List<a> f42634f;

    /* renamed from: com.yandex.metrica.impl.ob.Bi$a */
    public enum a {
        WIFI,
        CELL
    }

    public C3200Bi(@Nullable String str, @Nullable String str2, @Nullable String str3, @NonNull List<Pair<String, String>> list, @Nullable Long l2, @NonNull List<a> list2) {
        this.f42629a = str;
        this.f42630b = str2;
        this.f42631c = str3;
        this.f42632d = Collections.unmodifiableList(list);
        this.f42633e = l2;
        this.f42634f = list2;
    }
}
