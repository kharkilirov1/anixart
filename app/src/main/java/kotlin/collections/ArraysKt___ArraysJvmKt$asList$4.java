package kotlin.collections;

import java.util.RandomAccess;
import kotlin.Metadata;

/* compiled from: _ArraysJvm.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, m31884d2 = {"kotlin/collections/ArraysKt___ArraysJvmKt$asList$4", "Lkotlin/collections/AbstractList;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class ArraysKt___ArraysJvmKt$asList$4 extends AbstractList<Long> implements RandomAccess {
    @Override // kotlin.collections.AbstractCollection
    /* renamed from: b */
    public int getF63120e() {
        throw null;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Long) {
            return ArraysKt.m31962l(null, ((Number) obj).longValue());
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public Object get(int i2) {
        throw null;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Long) {
            return ArraysKt.m31934J(null, ((Number) obj).longValue());
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        throw null;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Long) {
            return ArraysKt.m31943S(null, ((Number) obj).longValue());
        }
        return -1;
    }
}
