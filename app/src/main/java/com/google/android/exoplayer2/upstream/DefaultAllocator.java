package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class DefaultAllocator implements Allocator {

    /* renamed from: a */
    public final boolean f14382a;

    /* renamed from: b */
    public final int f14383b;

    /* renamed from: c */
    @Nullable
    public final byte[] f14384c;

    /* renamed from: d */
    public final Allocation[] f14385d;

    /* renamed from: e */
    public int f14386e;

    /* renamed from: f */
    public int f14387f;

    /* renamed from: g */
    public int f14388g;

    /* renamed from: h */
    public Allocation[] f14389h;

    public DefaultAllocator(boolean z, int i2) {
        Assertions.m7513a(i2 > 0);
        this.f14382a = z;
        this.f14383b = i2;
        this.f14388g = 0;
        this.f14389h = new Allocation[100];
        this.f14384c = null;
        this.f14385d = new Allocation[1];
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    /* renamed from: a */
    public synchronized void mo7421a(Allocation allocation) {
        Allocation[] allocationArr = this.f14385d;
        allocationArr[0] = allocation;
        mo7424d(allocationArr);
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    /* renamed from: b */
    public synchronized Allocation mo7422b() {
        Allocation allocation;
        this.f14387f++;
        int i2 = this.f14388g;
        if (i2 > 0) {
            Allocation[] allocationArr = this.f14389h;
            int i3 = i2 - 1;
            this.f14388g = i3;
            allocation = allocationArr[i3];
            Objects.requireNonNull(allocation);
            this.f14389h[this.f14388g] = null;
        } else {
            allocation = new Allocation(new byte[this.f14383b], 0);
        }
        return allocation;
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    /* renamed from: c */
    public synchronized void mo7423c() {
        int i2 = 0;
        int max = Math.max(0, Util.m7738g(this.f14386e, this.f14383b) - this.f14387f);
        int i3 = this.f14388g;
        if (max >= i3) {
            return;
        }
        if (this.f14384c != null) {
            int i4 = i3 - 1;
            while (i2 <= i4) {
                Allocation allocation = this.f14389h[i2];
                Objects.requireNonNull(allocation);
                if (allocation.f14324a == this.f14384c) {
                    i2++;
                } else {
                    Allocation allocation2 = this.f14389h[i4];
                    Objects.requireNonNull(allocation2);
                    if (allocation2.f14324a != this.f14384c) {
                        i4--;
                    } else {
                        Allocation[] allocationArr = this.f14389h;
                        allocationArr[i2] = allocation2;
                        allocationArr[i4] = allocation;
                        i4--;
                        i2++;
                    }
                }
            }
            max = Math.max(max, i2);
            if (max >= this.f14388g) {
                return;
            }
        }
        Arrays.fill(this.f14389h, max, this.f14388g, (Object) null);
        this.f14388g = max;
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    /* renamed from: d */
    public synchronized void mo7424d(Allocation[] allocationArr) {
        int i2 = this.f14388g;
        int length = allocationArr.length + i2;
        Allocation[] allocationArr2 = this.f14389h;
        if (length >= allocationArr2.length) {
            this.f14389h = (Allocation[]) Arrays.copyOf(allocationArr2, Math.max(allocationArr2.length * 2, i2 + allocationArr.length));
        }
        for (Allocation allocation : allocationArr) {
            Allocation[] allocationArr3 = this.f14389h;
            int i3 = this.f14388g;
            this.f14388g = i3 + 1;
            allocationArr3[i3] = allocation;
        }
        this.f14387f -= allocationArr.length;
        notifyAll();
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    /* renamed from: e */
    public int mo7425e() {
        return this.f14383b;
    }

    /* renamed from: f */
    public synchronized void m7439f(int i2) {
        boolean z = i2 < this.f14386e;
        this.f14386e = i2;
        if (z) {
            mo7423c();
        }
    }
}
