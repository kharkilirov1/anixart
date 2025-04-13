package com.google.android.exoplayer2.source.dash.manifest;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class Period {

    /* renamed from: a */
    @Nullable
    public final String f12961a;

    /* renamed from: b */
    public final long f12962b;

    /* renamed from: c */
    public final List<AdaptationSet> f12963c;

    /* renamed from: d */
    public final List<EventStream> f12964d;

    public Period(@Nullable String str, long j2, List<AdaptationSet> list, List<EventStream> list2) {
        this.f12961a = str;
        this.f12962b = j2;
        this.f12963c = Collections.unmodifiableList(list);
        this.f12964d = Collections.unmodifiableList(list2);
    }

    public Period(@Nullable String str, long j2, List<AdaptationSet> list, List<EventStream> list2, @Nullable Descriptor descriptor) {
        this.f12961a = str;
        this.f12962b = j2;
        this.f12963c = Collections.unmodifiableList(list);
        this.f12964d = Collections.unmodifiableList(list2);
    }
}
