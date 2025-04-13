package com.google.android.exoplayer2.trackselection;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.primitives.Ints;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class TrackSelectionOverrides implements Bundleable {

    /* renamed from: c */
    public static final TrackSelectionOverrides f13973c = new TrackSelectionOverrides(ImmutableMap.m11650l());

    /* renamed from: d */
    public static final Bundleable.Creator<TrackSelectionOverrides> f13974d = C1136a.f14037d;

    /* renamed from: b */
    public final ImmutableMap<TrackGroup, TrackSelectionOverride> f13975b;

    public static final class Builder {

        /* renamed from: a */
        public final HashMap<TrackGroup, TrackSelectionOverride> f13976a = new HashMap<>();
    }

    public TrackSelectionOverrides(Map<TrackGroup, TrackSelectionOverride> map) {
        this.f13975b = ImmutableMap.m11649b(map);
    }

    @Override // com.google.android.exoplayer2.Bundleable
    /* renamed from: a */
    public Bundle mo5679a() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(Integer.toString(0, 36), BundleableUtil.m7525d(this.f13975b.values()));
        return bundle;
    }

    @Nullable
    /* renamed from: b */
    public TrackSelectionOverride m7328b(TrackGroup trackGroup) {
        return this.f13975b.get(trackGroup);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackSelectionOverrides.class != obj.getClass()) {
            return false;
        }
        return this.f13975b.equals(((TrackSelectionOverrides) obj).f13975b);
    }

    public int hashCode() {
        return this.f13975b.hashCode();
    }

    public static final class TrackSelectionOverride implements Bundleable {

        /* renamed from: d */
        public static final Bundleable.Creator<TrackSelectionOverride> f13977d = C1136a.f14038e;

        /* renamed from: b */
        public final TrackGroup f13978b;

        /* renamed from: c */
        public final ImmutableList<Integer> f13979c;

        public TrackSelectionOverride(TrackGroup trackGroup) {
            this.f13978b = trackGroup;
            ImmutableList.Builder builder = new ImmutableList.Builder();
            for (int i2 = 0; i2 < trackGroup.f12589b; i2++) {
                builder.m11640d(Integer.valueOf(i2));
            }
            this.f13979c = builder.m11641e();
        }

        /* renamed from: c */
        public static String m7329c(int i2) {
            return Integer.toString(i2, 36);
        }

        @Override // com.google.android.exoplayer2.Bundleable
        /* renamed from: a */
        public Bundle mo5679a() {
            Bundle bundle = new Bundle();
            bundle.putBundle(m7329c(0), this.f13978b.mo5679a());
            bundle.putIntArray(m7329c(1), Ints.m12085g(this.f13979c));
            return bundle;
        }

        /* renamed from: b */
        public int m7330b() {
            return MimeTypes.m7601i(this.f13978b.f12590c[0].f9659m);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || TrackSelectionOverride.class != obj.getClass()) {
                return false;
            }
            TrackSelectionOverride trackSelectionOverride = (TrackSelectionOverride) obj;
            return this.f13978b.equals(trackSelectionOverride.f13978b) && this.f13979c.equals(trackSelectionOverride.f13979c);
        }

        public int hashCode() {
            return (this.f13979c.hashCode() * 31) + this.f13978b.hashCode();
        }

        public TrackSelectionOverride(TrackGroup trackGroup, List<Integer> list) {
            if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= trackGroup.f12589b)) {
                throw new IndexOutOfBoundsException();
            }
            this.f13978b = trackGroup;
            this.f13979c = ImmutableList.m11634y(list);
        }
    }
}
