package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.dash.DashSegmentIndex;
import com.google.android.exoplayer2.source.dash.manifest.SegmentBase;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class Representation {

    /* renamed from: a */
    public final Format f12974a;

    /* renamed from: b */
    public final ImmutableList<BaseUrl> f12975b;

    /* renamed from: c */
    public final long f12976c;

    /* renamed from: d */
    public final List<Descriptor> f12977d;

    /* renamed from: e */
    public final List<Descriptor> f12978e;

    /* renamed from: f */
    public final List<Descriptor> f12979f;

    /* renamed from: g */
    public final RangedUri f12980g;

    public static class MultiSegmentRepresentation extends Representation implements DashSegmentIndex {

        /* renamed from: h */
        @VisibleForTesting
        public final SegmentBase.MultiSegmentBase f12981h;

        public MultiSegmentRepresentation(long j2, Format format, List<BaseUrl> list, SegmentBase.MultiSegmentBase multiSegmentBase, @Nullable List<Descriptor> list2, List<Descriptor> list3, List<Descriptor> list4) {
            super(j2, format, list, multiSegmentBase, list2, list3, list4, null);
            this.f12981h = multiSegmentBase;
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        /* renamed from: a */
        public long mo7014a(long j2) {
            return this.f12981h.m7078g(j2);
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        /* renamed from: b */
        public long mo7015b(long j2, long j3) {
            return this.f12981h.m7076e(j2, j3);
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        /* renamed from: c */
        public long mo7016c(long j2, long j3) {
            return this.f12981h.m7074c(j2, j3);
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        /* renamed from: d */
        public long mo7017d(long j2, long j3) {
            SegmentBase.MultiSegmentBase multiSegmentBase = this.f12981h;
            if (multiSegmentBase.f12990f != null) {
                return -9223372036854775807L;
            }
            long m7073b = multiSegmentBase.m7073b(j2, j3) + multiSegmentBase.m7074c(j2, j3);
            return (multiSegmentBase.m7076e(m7073b, j2) + multiSegmentBase.m7078g(m7073b)) - multiSegmentBase.f12993i;
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        /* renamed from: e */
        public RangedUri mo7018e(long j2) {
            return this.f12981h.mo7079h(this, j2);
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        /* renamed from: f */
        public long mo7019f(long j2, long j3) {
            return this.f12981h.m7077f(j2, j3);
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        /* renamed from: g */
        public boolean mo7020g() {
            return this.f12981h.mo7080i();
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        /* renamed from: h */
        public long mo7021h() {
            return this.f12981h.f12988d;
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        /* renamed from: i */
        public long mo7022i(long j2) {
            return this.f12981h.mo7075d(j2);
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        /* renamed from: j */
        public long mo7023j(long j2, long j3) {
            return this.f12981h.m7073b(j2, j3);
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
        @Nullable
        /* renamed from: k */
        public String mo7069k() {
            return null;
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
        /* renamed from: l */
        public DashSegmentIndex mo7070l() {
            return this;
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
        @Nullable
        /* renamed from: m */
        public RangedUri mo7071m() {
            return null;
        }
    }

    public static class SingleSegmentRepresentation extends Representation {

        /* renamed from: h */
        @Nullable
        public final String f12982h;

        /* renamed from: i */
        @Nullable
        public final RangedUri f12983i;

        /* renamed from: j */
        @Nullable
        public final SingleSegmentIndex f12984j;

        public SingleSegmentRepresentation(long j2, Format format, List<BaseUrl> list, SegmentBase.SingleSegmentBase singleSegmentBase, @Nullable List<Descriptor> list2, List<Descriptor> list3, List<Descriptor> list4, @Nullable String str, long j3) {
            super(j2, format, list, singleSegmentBase, list2, list3, list4, null);
            Uri.parse(list.get(0).f12923a);
            long j4 = singleSegmentBase.f13001e;
            RangedUri rangedUri = j4 <= 0 ? null : new RangedUri(null, singleSegmentBase.f13000d, j4);
            this.f12983i = rangedUri;
            this.f12982h = str;
            this.f12984j = rangedUri == null ? new SingleSegmentIndex(new RangedUri(null, 0L, j3)) : null;
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
        @Nullable
        /* renamed from: k */
        public String mo7069k() {
            return this.f12982h;
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
        @Nullable
        /* renamed from: l */
        public DashSegmentIndex mo7070l() {
            return this.f12984j;
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
        @Nullable
        /* renamed from: m */
        public RangedUri mo7071m() {
            return this.f12983i;
        }
    }

    public Representation(long j2, Format format, List list, SegmentBase segmentBase, List list2, List list3, List list4, C11041 c11041) {
        Assertions.m7513a(!list.isEmpty());
        this.f12974a = format;
        this.f12975b = ImmutableList.m11634y(list);
        this.f12977d = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f12978e = list3;
        this.f12979f = list4;
        this.f12980g = segmentBase.mo7072a(this);
        this.f12976c = Util.m7723V(segmentBase.f12987c, 1000000L, segmentBase.f12986b);
    }

    @Nullable
    /* renamed from: k */
    public abstract String mo7069k();

    @Nullable
    /* renamed from: l */
    public abstract DashSegmentIndex mo7070l();

    @Nullable
    /* renamed from: m */
    public abstract RangedUri mo7071m();
}
