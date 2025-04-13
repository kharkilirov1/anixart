package kotlin.collections;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import p000a.C0000a;

/* compiled from: ArraysJVM.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-stdlib"}, m31885k = 5, m31886mv = {1, 7, 1}, m31889xs = "kotlin/collections/ArraysKt")
/* loaded from: classes3.dex */
class ArraysKt__ArraysJVMKt {
    @SinceKotlin
    /* renamed from: a */
    public static final void m31977a(int i2, int i3) {
        if (i2 > i3) {
            throw new IndexOutOfBoundsException(C0000a.m10g("toIndex (", i2, ") is greater than size (", i3, ")."));
        }
    }
}
