package com.google.firebase.firestore.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000a.C0000a;

/* loaded from: classes2.dex */
public final class ResourcePath extends BasePath<ResourcePath> {

    /* renamed from: c */
    public static final ResourcePath f22877c = new ResourcePath(Collections.emptyList());

    public ResourcePath(List<String> list) {
        super(list);
    }

    /* renamed from: l */
    public static ResourcePath m12452l(List<String> list) {
        return list.isEmpty() ? f22877c : new ResourcePath(list);
    }

    /* renamed from: m */
    public static ResourcePath m12453m(String str) {
        if (str.contains("//")) {
            throw new IllegalArgumentException(C0000a.m16m("Invalid path (", str, "). Paths must not contain // in them."));
        }
        String[] split = str.split("/");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            if (!str2.isEmpty()) {
                arrayList.add(str2);
            }
        }
        return new ResourcePath(arrayList);
    }

    @Override // com.google.firebase.firestore.model.BasePath
    /* renamed from: b */
    public String mo12428b() {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < this.f22843b.size(); i2++) {
            if (i2 > 0) {
                sb.append("/");
            }
            sb.append(this.f22843b.get(i2));
        }
        return sb.toString();
    }

    @Override // com.google.firebase.firestore.model.BasePath
    /* renamed from: d */
    public ResourcePath mo12430d(List list) {
        return new ResourcePath(list);
    }
}
