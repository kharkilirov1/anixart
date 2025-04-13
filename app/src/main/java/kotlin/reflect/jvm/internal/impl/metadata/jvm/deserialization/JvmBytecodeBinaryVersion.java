package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.Arrays;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import org.jetbrains.annotations.NotNull;

/* compiled from: JvmBytecodeBinaryVersion.kt */
/* loaded from: classes3.dex */
public final class JvmBytecodeBinaryVersion extends BinaryVersion {

    /* renamed from: f */
    @JvmField
    @NotNull
    public static final JvmBytecodeBinaryVersion f65570f;

    /* compiled from: JvmBytecodeBinaryVersion.kt */
    public static final class Companion {
    }

    static {
        new JvmBytecodeBinaryVersion(1, 0, 3);
        f65570f = new JvmBytecodeBinaryVersion(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBytecodeBinaryVersion(@NotNull int... numbers) {
        super(Arrays.copyOf(numbers, numbers.length));
        Intrinsics.m32180i(numbers, "numbers");
    }
}
