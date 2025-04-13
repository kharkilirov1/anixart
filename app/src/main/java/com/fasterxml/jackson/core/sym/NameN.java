package com.fasterxml.jackson.core.sym;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class NameN extends Name {

    /* renamed from: q */
    private final int[] f8876q;

    /* renamed from: q1 */
    private final int f8877q1;

    /* renamed from: q2 */
    private final int f8878q2;

    /* renamed from: q3 */
    private final int f8879q3;

    /* renamed from: q4 */
    private final int f8880q4;
    private final int qlen;

    public NameN(String str, int i2, int i3, int i4, int i5, int i6, int[] iArr, int i7) {
        super(str, i2);
        this.f8877q1 = i3;
        this.f8878q2 = i4;
        this.f8879q3 = i5;
        this.f8880q4 = i6;
        this.f8876q = iArr;
        this.qlen = i7;
    }

    private final boolean _equals2(int[] iArr) {
        int i2 = this.qlen - 4;
        for (int i3 = 0; i3 < i2; i3++) {
            if (iArr[i3 + 4] != this.f8876q[i3]) {
                return false;
            }
        }
        return true;
    }

    public static NameN construct(String str, int i2, int[] iArr, int i3) {
        if (i3 >= 4) {
            return new NameN(str, i2, iArr[0], iArr[1], iArr[2], iArr[3], i3 + (-4) > 0 ? Arrays.copyOfRange(iArr, 4, i3) : null, i3);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i2) {
        return false;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i2, int i3) {
        return false;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i2, int i3, int i4) {
        return false;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int[] iArr, int i2) {
        if (i2 != this.qlen || iArr[0] != this.f8877q1 || iArr[1] != this.f8878q2 || iArr[2] != this.f8879q3 || iArr[3] != this.f8880q4) {
            return false;
        }
        switch (i2) {
            case 8:
                if (iArr[7] != this.f8876q[3]) {
                }
                break;
            case 7:
                if (iArr[6] != this.f8876q[2]) {
                }
                break;
            case 6:
                if (iArr[5] != this.f8876q[1]) {
                }
                break;
            case 5:
                if (iArr[4] != this.f8876q[0]) {
                }
                break;
            case 4:
                return true;
        }
        return false;
    }
}
