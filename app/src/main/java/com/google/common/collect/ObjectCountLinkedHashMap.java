package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.Arrays;

@GwtCompatible
/* loaded from: classes.dex */
class ObjectCountLinkedHashMap<K> extends ObjectCountHashMap<K> {

    /* renamed from: i */
    @VisibleForTesting
    public transient long[] f21398i;

    /* renamed from: j */
    public transient int f21399j;

    /* renamed from: k */
    public transient int f21400k;

    public ObjectCountLinkedHashMap() {
        super(3, 1.0f);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    /* renamed from: a */
    public void mo11833a() {
        super.mo11833a();
        this.f21399j = -2;
        this.f21400k = -2;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    /* renamed from: c */
    public int mo11835c() {
        int i2 = this.f21399j;
        if (i2 == -2) {
            return -1;
        }
        return i2;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    /* renamed from: j */
    public void mo11841j(int i2, float f2) {
        super.mo11841j(i2, f2);
        this.f21399j = -2;
        this.f21400k = -2;
        long[] jArr = new long[i2];
        this.f21398i = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    /* renamed from: k */
    public void mo11842k(int i2, K k2, int i3, int i4) {
        super.mo11842k(i2, k2, i3, i4);
        m11853w(this.f21400k, i2);
        m11853w(i2, -2);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    /* renamed from: l */
    public void mo11843l(int i2) {
        int i3 = this.f21389c - 1;
        long[] jArr = this.f21398i;
        m11853w((int) (jArr[i2] >>> 32), (int) jArr[i2]);
        if (i2 < i3) {
            m11853w((int) (this.f21398i[i3] >>> 32), i2);
            m11853w(i2, m11852v(i3));
        }
        super.mo11843l(i2);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    /* renamed from: m */
    public int mo11844m(int i2) {
        int i3 = (int) this.f21398i[i2];
        if (i3 == -2) {
            return -1;
        }
        return i3;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    /* renamed from: n */
    public int mo11845n(int i2, int i3) {
        return i2 == this.f21389c ? i3 : i2;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    /* renamed from: r */
    public void mo11849r(int i2) {
        super.mo11849r(i2);
        long[] jArr = this.f21398i;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i2);
        this.f21398i = copyOf;
        Arrays.fill(copyOf, length, i2, -1L);
    }

    /* renamed from: v */
    public final int m11852v(int i2) {
        return (int) this.f21398i[i2];
    }

    /* renamed from: w */
    public final void m11853w(int i2, int i3) {
        if (i2 == -2) {
            this.f21399j = i3;
        } else {
            long[] jArr = this.f21398i;
            jArr[i2] = (jArr[i2] & (-4294967296L)) | (i3 & 4294967295L);
        }
        if (i3 == -2) {
            this.f21400k = i2;
        } else {
            long[] jArr2 = this.f21398i;
            jArr2[i3] = (4294967295L & jArr2[i3]) | (i2 << 32);
        }
    }
}
