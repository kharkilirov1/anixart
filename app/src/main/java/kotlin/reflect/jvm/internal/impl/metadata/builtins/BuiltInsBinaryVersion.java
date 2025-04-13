package kotlin.reflect.jvm.internal.impl.metadata.builtins;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import org.jetbrains.annotations.NotNull;

/* compiled from: BuiltInsBinaryVersion.kt */
/* loaded from: classes3.dex */
public final class BuiltInsBinaryVersion extends BinaryVersion {

    /* renamed from: g */
    public static final Companion f65371g = new Companion(null);

    /* renamed from: f */
    @JvmField
    @NotNull
    public static final BuiltInsBinaryVersion f65370f = new BuiltInsBinaryVersion(1, 0, 6);

    /* compiled from: BuiltInsBinaryVersion.kt */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        /* renamed from: a */
        public final BuiltInsBinaryVersion m33110a(@NotNull InputStream inputStream) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            IntRange intRange = new IntRange(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(intRange, 10));
            IntIterator it = intRange.iterator();
            while (((IntProgressionIterator) it).f63385d) {
                it.mo1135a();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] m32025i0 = CollectionsKt.m32025i0(arrayList);
            return new BuiltInsBinaryVersion(Arrays.copyOf(m32025i0, m32025i0.length));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new BuiltInsBinaryVersion(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuiltInsBinaryVersion(@NotNull int... numbers) {
        super(Arrays.copyOf(numbers, numbers.length));
        Intrinsics.m32180i(numbers, "numbers");
    }
}
