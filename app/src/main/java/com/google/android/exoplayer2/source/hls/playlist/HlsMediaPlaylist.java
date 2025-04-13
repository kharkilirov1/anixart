package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class HlsMediaPlaylist extends HlsPlaylist {

    /* renamed from: d */
    public final int f13295d;

    /* renamed from: e */
    public final long f13296e;

    /* renamed from: f */
    public final boolean f13297f;

    /* renamed from: g */
    public final boolean f13298g;

    /* renamed from: h */
    public final long f13299h;

    /* renamed from: i */
    public final boolean f13300i;

    /* renamed from: j */
    public final int f13301j;

    /* renamed from: k */
    public final long f13302k;

    /* renamed from: l */
    public final int f13303l;

    /* renamed from: m */
    public final long f13304m;

    /* renamed from: n */
    public final long f13305n;

    /* renamed from: o */
    public final boolean f13306o;

    /* renamed from: p */
    public final boolean f13307p;

    /* renamed from: q */
    @Nullable
    public final DrmInitData f13308q;

    /* renamed from: r */
    public final List<Segment> f13309r;

    /* renamed from: s */
    public final List<Part> f13310s;

    /* renamed from: t */
    public final Map<Uri, RenditionReport> f13311t;

    /* renamed from: u */
    public final long f13312u;

    /* renamed from: v */
    public final ServerControl f13313v;

    public static final class Part extends SegmentBase {

        /* renamed from: m */
        public final boolean f13314m;

        /* renamed from: n */
        public final boolean f13315n;

        public Part(String str, @Nullable Segment segment, long j2, int i2, long j3, @Nullable DrmInitData drmInitData, @Nullable String str2, @Nullable String str3, long j4, long j5, boolean z, boolean z2, boolean z3) {
            super(str, segment, j2, i2, j3, drmInitData, str2, str3, j4, j5, z, null);
            this.f13314m = z2;
            this.f13315n = z3;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlaylistType {
    }

    public static final class RenditionReport {

        /* renamed from: a */
        public final Uri f13316a;

        /* renamed from: b */
        public final long f13317b;

        /* renamed from: c */
        public final int f13318c;

        public RenditionReport(Uri uri, long j2, int i2) {
            this.f13316a = uri;
            this.f13317b = j2;
            this.f13318c = i2;
        }
    }

    public static class SegmentBase implements Comparable<Long> {

        /* renamed from: b */
        public final String f13321b;

        /* renamed from: c */
        @Nullable
        public final Segment f13322c;

        /* renamed from: d */
        public final long f13323d;

        /* renamed from: e */
        public final int f13324e;

        /* renamed from: f */
        public final long f13325f;

        /* renamed from: g */
        @Nullable
        public final DrmInitData f13326g;

        /* renamed from: h */
        @Nullable
        public final String f13327h;

        /* renamed from: i */
        @Nullable
        public final String f13328i;

        /* renamed from: j */
        public final long f13329j;

        /* renamed from: k */
        public final long f13330k;

        /* renamed from: l */
        public final boolean f13331l;

        public SegmentBase(String str, Segment segment, long j2, int i2, long j3, DrmInitData drmInitData, String str2, String str3, long j4, long j5, boolean z, C11201 c11201) {
            this.f13321b = str;
            this.f13322c = segment;
            this.f13323d = j2;
            this.f13324e = i2;
            this.f13325f = j3;
            this.f13326g = drmInitData;
            this.f13327h = str2;
            this.f13328i = str3;
            this.f13329j = j4;
            this.f13330k = j5;
            this.f13331l = z;
        }

        @Override // java.lang.Comparable
        public int compareTo(Long l2) {
            Long l3 = l2;
            if (this.f13325f > l3.longValue()) {
                return 1;
            }
            return this.f13325f < l3.longValue() ? -1 : 0;
        }
    }

    public static final class ServerControl {

        /* renamed from: a */
        public final long f13332a;

        /* renamed from: b */
        public final boolean f13333b;

        /* renamed from: c */
        public final long f13334c;

        /* renamed from: d */
        public final long f13335d;

        /* renamed from: e */
        public final boolean f13336e;

        public ServerControl(long j2, boolean z, long j3, long j4, boolean z2) {
            this.f13332a = j2;
            this.f13333b = z;
            this.f13334c = j3;
            this.f13335d = j4;
            this.f13336e = z2;
        }
    }

    public HlsMediaPlaylist(int i2, String str, List<String> list, long j2, boolean z, long j3, boolean z2, int i3, long j4, int i4, long j5, long j6, boolean z3, boolean z4, boolean z5, @Nullable DrmInitData drmInitData, List<Segment> list2, List<Part> list3, ServerControl serverControl, Map<Uri, RenditionReport> map) {
        super(str, list, z3);
        this.f13295d = i2;
        this.f13299h = j3;
        this.f13298g = z;
        this.f13300i = z2;
        this.f13301j = i3;
        this.f13302k = j4;
        this.f13303l = i4;
        this.f13304m = j5;
        this.f13305n = j6;
        this.f13306o = z4;
        this.f13307p = z5;
        this.f13308q = drmInitData;
        this.f13309r = ImmutableList.m11634y(list2);
        this.f13310s = ImmutableList.m11634y(list3);
        this.f13311t = ImmutableMap.m11649b(map);
        if (!list3.isEmpty()) {
            Part part = (Part) Iterables.m11700e(list3);
            this.f13312u = part.f13325f + part.f13323d;
        } else if (list2.isEmpty()) {
            this.f13312u = 0L;
        } else {
            Segment segment = (Segment) Iterables.m11700e(list2);
            this.f13312u = segment.f13325f + segment.f13323d;
        }
        this.f13296e = j2 != -9223372036854775807L ? j2 >= 0 ? Math.min(this.f13312u, j2) : Math.max(0L, this.f13312u + j2) : -9223372036854775807L;
        this.f13297f = j2 >= 0;
        this.f13313v = serverControl;
    }

    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    /* renamed from: a */
    public HlsPlaylist mo6751a(List list) {
        return this;
    }

    /* renamed from: b */
    public long m7150b() {
        return this.f13299h + this.f13312u;
    }

    public static final class Segment extends SegmentBase {

        /* renamed from: m */
        public final String f13319m;

        /* renamed from: n */
        public final List<Part> f13320n;

        public Segment(String str, long j2, long j3, @Nullable String str2, @Nullable String str3) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j2, j3, false, ImmutableList.m11627D());
        }

        public Segment(String str, @Nullable Segment segment, String str2, long j2, int i2, long j3, @Nullable DrmInitData drmInitData, @Nullable String str3, @Nullable String str4, long j4, long j5, boolean z, List<Part> list) {
            super(str, segment, j2, i2, j3, drmInitData, str3, str4, j4, j5, z, null);
            this.f13319m = str2;
            this.f13320n = ImmutableList.m11634y(list);
        }
    }
}
