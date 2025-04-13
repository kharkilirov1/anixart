package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.cache.Striped64;

@GwtCompatible
/* loaded from: classes.dex */
final class LongAdder extends Striped64 implements LongAddable {
    /* JADX WARN: Code restructure failed: missing block: B:109:0x00b2, code lost:
    
        if (r13.f20770b != r6) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00b4, code lost:
    
        r5 = new com.google.common.cache.Striped64.Cell[r7 << 1];
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x00b9, code lost:
    
        if (r8 >= r7) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00bb, code lost:
    
        r5[r8] = r6[r8];
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00c2, code lost:
    
        r13.f20770b = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0049 A[SYNTHETIC] */
    @Override // com.google.common.cache.LongAddable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo11315a(long r14) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.LongAdder.mo11315a(long):void");
    }

    @Override // com.google.common.cache.LongAddable
    /* renamed from: b */
    public void mo11316b() {
        mo11315a(1L);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return m11319g();
    }

    /* renamed from: f */
    public final long m11318f(long j2, long j3) {
        return j2 + j3;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return m11319g();
    }

    /* renamed from: g */
    public long m11319g() {
        long j2 = this.f20771c;
        Striped64.Cell[] cellArr = this.f20770b;
        if (cellArr != null) {
            for (Striped64.Cell cell : cellArr) {
                if (cell != null) {
                    j2 += cell.f20775a;
                }
            }
        }
        return j2;
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) m11319g();
    }

    @Override // java.lang.Number
    public long longValue() {
        return m11319g();
    }

    public String toString() {
        return Long.toString(m11319g());
    }
}
