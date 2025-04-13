package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StringsJVM.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-stdlib"}, m31885k = 5, m31886mv = {1, 7, 1}, m31889xs = "kotlin/text/StringsKt")
/* loaded from: classes3.dex */
public class StringsKt__StringsJVMKt extends StringsKt__StringNumberConversionsKt {
    /* renamed from: b */
    public static final boolean m33930b(@NotNull String str, int i2, @NotNull String other, int i3, int i4, boolean z) {
        Intrinsics.m32179h(str, "<this>");
        Intrinsics.m32179h(other, "other");
        return !z ? str.regionMatches(i2, other, i3, i4) : str.regionMatches(z, i2, other, i3, i4);
    }
}
