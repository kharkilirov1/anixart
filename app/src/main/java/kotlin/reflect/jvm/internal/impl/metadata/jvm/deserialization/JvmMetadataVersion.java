package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.Arrays;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import org.jetbrains.annotations.NotNull;

/* compiled from: JvmMetadataVersion.kt */
/* loaded from: classes3.dex */
public final class JvmMetadataVersion extends BinaryVersion {

    /* renamed from: g */
    @JvmField
    @NotNull
    public static final JvmMetadataVersion f65577g = new JvmMetadataVersion(1, 1, 13);

    /* renamed from: f */
    public final boolean f65578f;

    /* compiled from: JvmMetadataVersion.kt */
    public static final class Companion {
    }

    static {
        new JvmMetadataVersion(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmMetadataVersion(@NotNull int[] versionArray, boolean z) {
        super(Arrays.copyOf(versionArray, versionArray.length));
        Intrinsics.m32180i(versionArray, "versionArray");
        this.f65578f = z;
    }

    /* renamed from: b */
    public boolean m33176b() {
        int i2 = this.f65382a;
        if (i2 == 1 && this.f65383b == 0) {
            return false;
        }
        return this.f65578f ? m33111a(f65577g) : i2 == 1 && this.f65383b <= 4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JvmMetadataVersion(@NotNull int... numbers) {
        this(numbers, false);
        Intrinsics.m32180i(numbers, "numbers");
    }
}
