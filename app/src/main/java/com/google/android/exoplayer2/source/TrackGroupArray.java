package com.google.android.exoplayer2.source;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.common.collect.Lists;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class TrackGroupArray implements Bundleable {

    /* renamed from: e */
    public static final TrackGroupArray f12592e = new TrackGroupArray(new TrackGroup[0]);

    /* renamed from: f */
    public static final Bundleable.Creator<TrackGroupArray> f12593f = C1123j.f13405g;

    /* renamed from: b */
    public final int f12594b;

    /* renamed from: c */
    public final TrackGroup[] f12595c;

    /* renamed from: d */
    public int f12596d;

    public TrackGroupArray(TrackGroup... trackGroupArr) {
        this.f12595c = trackGroupArr;
        this.f12594b = trackGroupArr.length;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    /* renamed from: a */
    public Bundle mo5679a() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(Integer.toString(0, 36), BundleableUtil.m7525d(Lists.m11737d(this.f12595c)));
        return bundle;
    }

    /* renamed from: b */
    public int m6923b(TrackGroup trackGroup) {
        for (int i2 = 0; i2 < this.f12594b; i2++) {
            if (this.f12595c[i2] == trackGroup) {
                return i2;
            }
        }
        return -1;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroupArray.class != obj.getClass()) {
            return false;
        }
        TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
        return this.f12594b == trackGroupArray.f12594b && Arrays.equals(this.f12595c, trackGroupArray.f12595c);
    }

    public int hashCode() {
        if (this.f12596d == 0) {
            this.f12596d = Arrays.hashCode(this.f12595c);
        }
        return this.f12596d;
    }
}
