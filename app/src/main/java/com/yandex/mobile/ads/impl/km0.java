package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class km0 {

    /* renamed from: a */
    public final int f52032a;

    /* renamed from: b */
    public final byte[] f52033b;

    /* renamed from: c */
    @Nullable
    public final Map<String, String> f52034c;

    /* renamed from: d */
    @Nullable
    public final List<C5049ey> f52035d;

    /* renamed from: e */
    public final boolean f52036e;

    @Deprecated
    public km0(int i2, byte[] bArr, @Nullable Map map, boolean z) {
        this(i2, bArr, map, m26165a((Map<String, String>) map), z);
    }

    @Nullable
    /* renamed from: a */
    private static Map<String, String> m26166a(@Nullable List<C5049ey> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (C5049ey c5049ey : list) {
            treeMap.put(c5049ey.m24278a(), c5049ey.m24279b());
        }
        return treeMap;
    }

    public km0(int i2, byte[] bArr, boolean z, long j2, @Nullable List<C5049ey> list) {
        this(i2, bArr, m26166a(list), list, z);
    }

    @Deprecated
    public km0(int i2, byte[] bArr, @Nullable Map map) {
        this(i2, bArr, map, true);
    }

    @Deprecated
    public km0(byte[] bArr, @Nullable Map<String, String> map) {
        this(DatastoreTestTrace.DatastoreAction.ACTION_ID_FIELD_NUMBER, bArr, map, false);
    }

    private km0(int i2, byte[] bArr, @Nullable Map map, @Nullable List list, boolean z) {
        this.f52032a = i2;
        this.f52033b = bArr;
        this.f52034c = map;
        if (list == null) {
            this.f52035d = null;
        } else {
            this.f52035d = Collections.unmodifiableList(list);
        }
        this.f52036e = z;
    }

    @Nullable
    /* renamed from: a */
    private static List<C5049ey> m26165a(@Nullable Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new C5049ey(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }
}
