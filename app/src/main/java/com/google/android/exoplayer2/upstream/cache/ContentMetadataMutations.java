package com.google.android.exoplayer2.upstream.cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class ContentMetadataMutations {

    /* renamed from: a */
    public final Map<String, Object> f14598a = new HashMap();

    /* renamed from: b */
    public final List<String> f14599b = new ArrayList();

    /* renamed from: a */
    public static ContentMetadataMutations m7509a(ContentMetadataMutations contentMetadataMutations, long j2) {
        Long valueOf = Long.valueOf(j2);
        Map<String, Object> map = contentMetadataMutations.f14598a;
        Objects.requireNonNull(valueOf);
        map.put("exo_len", valueOf);
        contentMetadataMutations.f14599b.remove("exo_len");
        return contentMetadataMutations;
    }
}
