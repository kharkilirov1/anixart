package com.google.android.exoplayer2.source.dash.manifest;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class AdaptationSet {

    /* renamed from: a */
    public final int f12917a;

    /* renamed from: b */
    public final int f12918b;

    /* renamed from: c */
    public final List<Representation> f12919c;

    /* renamed from: d */
    public final List<Descriptor> f12920d;

    /* renamed from: e */
    public final List<Descriptor> f12921e;

    /* renamed from: f */
    public final List<Descriptor> f12922f;

    public AdaptationSet(int i2, int i3, List<Representation> list, List<Descriptor> list2, List<Descriptor> list3, List<Descriptor> list4) {
        this.f12917a = i2;
        this.f12918b = i3;
        this.f12919c = Collections.unmodifiableList(list);
        this.f12920d = Collections.unmodifiableList(list2);
        this.f12921e = Collections.unmodifiableList(list3);
        this.f12922f = Collections.unmodifiableList(list4);
    }
}
