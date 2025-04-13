package kotlin.jvm.internal;

import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ArrayIterator.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-stdlib"}, m31885k = 2, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class ArrayIteratorKt {
    @NotNull
    /* renamed from: a */
    public static final <T> Iterator<T> m32154a(@NotNull T[] array) {
        Intrinsics.m32179h(array, "array");
        return new ArrayIterator(array);
    }
}
