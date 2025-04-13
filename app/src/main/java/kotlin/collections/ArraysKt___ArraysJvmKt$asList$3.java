package kotlin.collections;

import java.util.RandomAccess;
import kotlin.Metadata;

/* compiled from: _ArraysJvm.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, m31884d2 = {"kotlin/collections/ArraysKt___ArraysJvmKt$asList$3", "Lkotlin/collections/AbstractList;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class ArraysKt___ArraysJvmKt$asList$3 extends AbstractList<Integer> implements RandomAccess {

    /* renamed from: c */
    public final /* synthetic */ int[] f63135c;

    public ArraysKt___ArraysJvmKt$asList$3(int[] iArr) {
        this.f63135c = iArr;
    }

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: b */
    public int getF63120e() {
        return this.f63135c.length;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return ArraysKt.m31961k(this.f63135c, ((Number) obj).intValue());
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public Object get(int i2) {
        return Integer.valueOf(this.f63135c[i2]);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        return ArraysKt.m31933I(this.f63135c, ((Number) obj).intValue());
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f63135c.length == 0;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        return ArraysKt.m31942R(this.f63135c, ((Number) obj).intValue());
    }
}
