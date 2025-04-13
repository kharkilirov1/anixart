package com.fasterxml.jackson.core.sym;

/* loaded from: classes.dex */
public final class Name2 extends Name {

    /* renamed from: q1 */
    private final int f8871q1;

    /* renamed from: q2 */
    private final int f8872q2;

    public Name2(String str, int i2, int i3, int i4) {
        super(str, i2);
        this.f8871q1 = i3;
        this.f8872q2 = i4;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i2) {
        return false;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i2, int i3) {
        return i2 == this.f8871q1 && i3 == this.f8872q2;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i2, int i3, int i4) {
        return false;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int[] iArr, int i2) {
        return i2 == 2 && iArr[0] == this.f8871q1 && iArr[1] == this.f8872q2;
    }
}
