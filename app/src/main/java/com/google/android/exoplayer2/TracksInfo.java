package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class TracksInfo implements Bundleable {

    /* renamed from: c */
    public static final TracksInfo f10081c = new TracksInfo(ImmutableList.m11627D());

    /* renamed from: b */
    public final ImmutableList<TrackGroupInfo> f10082b;

    public static final class TrackGroupInfo implements Bundleable {

        /* renamed from: f */
        public static final Bundleable.Creator<TrackGroupInfo> f10083f = C1026l.f11818u;

        /* renamed from: b */
        public final TrackGroup f10084b;

        /* renamed from: c */
        public final int[] f10085c;

        /* renamed from: d */
        public final int f10086d;

        /* renamed from: e */
        public final boolean[] f10087e;

        public TrackGroupInfo(TrackGroup trackGroup, int[] iArr, int i2, boolean[] zArr) {
            int i3 = trackGroup.f12589b;
            Assertions.m7513a(i3 == iArr.length && i3 == zArr.length);
            this.f10084b = trackGroup;
            this.f10085c = (int[]) iArr.clone();
            this.f10086d = i2;
            this.f10087e = (boolean[]) zArr.clone();
        }

        /* renamed from: b */
        public static String m6008b(int i2) {
            return Integer.toString(i2, 36);
        }

        @Override // com.google.android.exoplayer2.Bundleable
        /* renamed from: a */
        public Bundle mo5679a() {
            Bundle bundle = new Bundle();
            bundle.putBundle(m6008b(0), this.f10084b.mo5679a());
            bundle.putIntArray(m6008b(1), this.f10085c);
            bundle.putInt(m6008b(2), this.f10086d);
            bundle.putBooleanArray(m6008b(3), this.f10087e);
            return bundle;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || TrackGroupInfo.class != obj.getClass()) {
                return false;
            }
            TrackGroupInfo trackGroupInfo = (TrackGroupInfo) obj;
            return this.f10086d == trackGroupInfo.f10086d && this.f10084b.equals(trackGroupInfo.f10084b) && Arrays.equals(this.f10085c, trackGroupInfo.f10085c) && Arrays.equals(this.f10087e, trackGroupInfo.f10087e);
        }

        public int hashCode() {
            return Arrays.hashCode(this.f10087e) + ((((Arrays.hashCode(this.f10085c) + (this.f10084b.hashCode() * 31)) * 31) + this.f10086d) * 31);
        }
    }

    public TracksInfo(List<TrackGroupInfo> list) {
        this.f10082b = ImmutableList.m11634y(list);
    }

    @Override // com.google.android.exoplayer2.Bundleable
    /* renamed from: a */
    public Bundle mo5679a() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(Integer.toString(0, 36), BundleableUtil.m7525d(this.f10082b));
        return bundle;
    }

    /* renamed from: b */
    public boolean m6007b(int i2) {
        boolean z;
        for (int i3 = 0; i3 < this.f10082b.size(); i3++) {
            TrackGroupInfo trackGroupInfo = this.f10082b.get(i3);
            boolean[] zArr = trackGroupInfo.f10087e;
            int length = zArr.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    z = false;
                    break;
                }
                if (zArr[i4]) {
                    z = true;
                    break;
                }
                i4++;
            }
            if (z && trackGroupInfo.f10086d == i2) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TracksInfo.class != obj.getClass()) {
            return false;
        }
        return this.f10082b.equals(((TracksInfo) obj).f10082b);
    }

    public int hashCode() {
        return this.f10082b.hashCode();
    }
}
