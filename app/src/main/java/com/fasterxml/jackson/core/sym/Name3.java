package com.fasterxml.jackson.core.sym;

/* loaded from: classes.dex */
public final class Name3 extends Name {

    /* renamed from: q1 */
    private final int f8873q1;

    /* renamed from: q2 */
    private final int f8874q2;

    /* renamed from: q3 */
    private final int f8875q3;

    public Name3(String str, int i2, int i3, int i4, int i5) {
        super(str, i2);
        this.f8873q1 = i3;
        this.f8874q2 = i4;
        this.f8875q3 = i5;
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
        return this.f8873q1 == i2 && this.f8874q2 == i3 && this.f8875q3 == i4;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int[] iArr, int i2) {
        return i2 == 3 && iArr[0] == this.f8873q1 && iArr[1] == this.f8874q2 && iArr[2] == this.f8875q3;
    }
}
