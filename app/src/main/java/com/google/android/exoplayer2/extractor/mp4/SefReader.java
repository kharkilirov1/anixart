package com.google.android.exoplayer2.extractor.mp4;

import com.google.common.base.Splitter;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class SefReader {

    /* renamed from: d */
    public static final Splitter f11274d = Splitter.m11204a(':');

    /* renamed from: e */
    public static final Splitter f11275e = Splitter.m11204a('*');

    /* renamed from: a */
    public final List<DataReference> f11276a = new ArrayList();

    /* renamed from: b */
    public int f11277b = 0;

    /* renamed from: c */
    public int f11278c;

    public static final class DataReference {

        /* renamed from: a */
        public final long f11279a;

        /* renamed from: b */
        public final int f11280b;

        public DataReference(int i2, long j2, int i3) {
            this.f11279a = j2;
            this.f11280b = i3;
        }
    }
}
