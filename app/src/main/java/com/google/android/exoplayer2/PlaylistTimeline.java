package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.util.Util;
import java.util.Collection;
import java.util.HashMap;

/* loaded from: classes.dex */
final class PlaylistTimeline extends AbstractConcatenatedTimeline {

    /* renamed from: f */
    public final int f9976f;

    /* renamed from: g */
    public final int f9977g;

    /* renamed from: h */
    public final int[] f9978h;

    /* renamed from: i */
    public final int[] f9979i;

    /* renamed from: j */
    public final Timeline[] f9980j;

    /* renamed from: k */
    public final Object[] f9981k;

    /* renamed from: l */
    public final HashMap<Object, Integer> f9982l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistTimeline(Collection<? extends MediaSourceInfoHolder> collection, ShuffleOrder shuffleOrder) {
        super(false, shuffleOrder);
        int i2 = 0;
        int size = collection.size();
        this.f9978h = new int[size];
        this.f9979i = new int[size];
        this.f9980j = new Timeline[size];
        this.f9981k = new Object[size];
        this.f9982l = new HashMap<>();
        int i3 = 0;
        int i4 = 0;
        for (MediaSourceInfoHolder mediaSourceInfoHolder : collection) {
            this.f9980j[i4] = mediaSourceInfoHolder.mo5749b();
            this.f9979i[i4] = i2;
            this.f9978h[i4] = i3;
            i2 += this.f9980j[i4].mo5937r();
            i3 += this.f9980j[i4].mo5936k();
            this.f9981k[i4] = mediaSourceInfoHolder.mo5748a();
            this.f9982l.put(this.f9981k[i4], Integer.valueOf(i4));
            i4++;
        }
        this.f9976f = i2;
        this.f9977g = i3;
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    /* renamed from: C */
    public Timeline mo5607C(int i2) {
        return this.f9980j[i2];
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: k */
    public int mo5936k() {
        return this.f9977g;
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: r */
    public int mo5937r() {
        return this.f9976f;
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    /* renamed from: u */
    public int mo5617u(Object obj) {
        Integer num = this.f9982l.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    /* renamed from: v */
    public int mo5618v(int i2) {
        return Util.m7736e(this.f9978h, i2 + 1, false, false);
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    /* renamed from: w */
    public int mo5619w(int i2) {
        return Util.m7736e(this.f9979i, i2 + 1, false, false);
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    /* renamed from: x */
    public Object mo5620x(int i2) {
        return this.f9981k[i2];
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    /* renamed from: y */
    public int mo5621y(int i2) {
        return this.f9978h[i2];
    }

    @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
    /* renamed from: z */
    public int mo5622z(int i2) {
        return this.f9979i[i2];
    }
}
