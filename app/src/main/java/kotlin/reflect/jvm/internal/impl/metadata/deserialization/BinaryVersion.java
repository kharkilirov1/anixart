package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import com.yandex.metrica.push.common.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt$asList$3;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BinaryVersion.kt */
/* loaded from: classes3.dex */
public abstract class BinaryVersion {

    /* renamed from: a */
    public final int f65382a;

    /* renamed from: b */
    public final int f65383b;

    /* renamed from: c */
    public final int f65384c;

    /* renamed from: d */
    @NotNull
    public final List<Integer> f65385d;

    /* renamed from: e */
    public final int[] f65386e;

    /* compiled from: BinaryVersion.kt */
    public static final class Companion {
    }

    public BinaryVersion(@NotNull int... numbers) {
        Intrinsics.m32180i(numbers, "numbers");
        this.f65386e = numbers;
        Integer m31930F = ArraysKt.m31930F(numbers, 0);
        this.f65382a = m31930F != null ? m31930F.intValue() : -1;
        Integer m31930F2 = ArraysKt.m31930F(numbers, 1);
        this.f65383b = m31930F2 != null ? m31930F2.intValue() : -1;
        Integer m31930F3 = ArraysKt.m31930F(numbers, 2);
        this.f65384c = m31930F3 != null ? m31930F3.intValue() : -1;
        this.f65385d = numbers.length > 3 ? CollectionsKt.m32027j0(new ArraysKt___ArraysJvmKt$asList$3(numbers).subList(3, numbers.length)) : EmptyList.f63144b;
    }

    /* renamed from: a */
    public final boolean m33111a(@NotNull BinaryVersion ourVersion) {
        Intrinsics.m32180i(ourVersion, "ourVersion");
        int i2 = this.f65382a;
        if (i2 == 0) {
            if (ourVersion.f65382a == 0 && this.f65383b == ourVersion.f65383b) {
                return true;
            }
        } else if (i2 == ourVersion.f65382a && this.f65383b <= ourVersion.f65383b) {
            return true;
        }
        return false;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj != null && Intrinsics.m32174c(getClass(), obj.getClass())) {
            BinaryVersion binaryVersion = (BinaryVersion) obj;
            if (this.f65382a == binaryVersion.f65382a && this.f65383b == binaryVersion.f65383b && this.f65384c == binaryVersion.f65384c && Intrinsics.m32174c(this.f65385d, binaryVersion.f65385d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i2 = this.f65382a;
        int i3 = (i2 * 31) + this.f65383b + i2;
        int i4 = (i3 * 31) + this.f65384c + i3;
        return this.f65385d.hashCode() + (i4 * 31) + i4;
    }

    @NotNull
    public String toString() {
        int[] iArr = this.f65386e;
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = iArr[i2];
            if (!(i3 != -1)) {
                break;
            }
            arrayList.add(Integer.valueOf(i3));
        }
        return arrayList.isEmpty() ? CoreConstants.Transport.UNKNOWN : CollectionsKt.m31989B(arrayList, ".", null, null, 0, null, null, 62, null);
    }
}
