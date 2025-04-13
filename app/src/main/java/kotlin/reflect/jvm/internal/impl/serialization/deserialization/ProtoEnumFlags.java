package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ProtoEnumFlags.kt */
/* loaded from: classes3.dex */
public final class ProtoEnumFlags {

    /* renamed from: a */
    public static final ProtoEnumFlags f66128a = new ProtoEnumFlags();

    public final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ProtoBuf.MemberKind.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            iArr[3] = 4;
            int[] iArr2 = new int[CallableMemberDescriptor.Kind.values().length];
            iArr2[0] = 1;
            iArr2[1] = 2;
            iArr2[2] = 3;
            iArr2[3] = 4;
            int[] iArr3 = new int[ProtoBuf.Modality.values().length];
            iArr3[0] = 1;
            iArr3[1] = 2;
            iArr3[2] = 3;
            iArr3[3] = 4;
            int[] iArr4 = new int[Modality.values().length];
            iArr4[0] = 1;
            iArr4[2] = 2;
            iArr4[3] = 3;
            iArr4[1] = 4;
            int[] iArr5 = new int[ProtoBuf.Visibility.values().length];
            iArr5[0] = 1;
            iArr5[1] = 2;
            iArr5[4] = 3;
            iArr5[2] = 4;
            iArr5[3] = 5;
            iArr5[5] = 6;
            int[] iArr6 = new int[ProtoBuf.Class.Kind.values().length];
            iArr6[0] = 1;
            iArr6[1] = 2;
            iArr6[2] = 3;
            iArr6[3] = 4;
            iArr6[4] = 5;
            iArr6[5] = 6;
            iArr6[6] = 7;
            int[] iArr7 = new int[ClassKind.values().length];
            iArr7[0] = 1;
            iArr7[1] = 2;
            iArr7[2] = 3;
            iArr7[3] = 4;
            iArr7[4] = 5;
            iArr7[5] = 6;
            int[] iArr8 = new int[ProtoBuf.TypeParameter.Variance.values().length];
            iArr8[0] = 1;
            iArr8[1] = 2;
            iArr8[2] = 3;
            int[] iArr9 = new int[ProtoBuf.Type.Argument.Projection.values().length];
            iArr9[0] = 1;
            iArr9[1] = 2;
            iArr9[2] = 3;
            iArr9[3] = 4;
        }
    }

    @NotNull
    /* renamed from: a */
    public final CallableMemberDescriptor.Kind m33587a(@Nullable ProtoBuf.MemberKind memberKind) {
        int ordinal;
        CallableMemberDescriptor.Kind kind = CallableMemberDescriptor.Kind.DECLARATION;
        return (memberKind == null || (ordinal = memberKind.ordinal()) == 0) ? kind : ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? kind : CallableMemberDescriptor.Kind.SYNTHESIZED : CallableMemberDescriptor.Kind.DELEGATION : CallableMemberDescriptor.Kind.FAKE_OVERRIDE;
    }

    @NotNull
    /* renamed from: b */
    public final Modality m33588b(@Nullable ProtoBuf.Modality modality) {
        int ordinal;
        Modality modality2 = Modality.FINAL;
        return (modality == null || (ordinal = modality.ordinal()) == 0) ? modality2 : ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? modality2 : Modality.SEALED : Modality.ABSTRACT : Modality.OPEN;
    }

    @NotNull
    /* renamed from: c */
    public final Visibility m33589c(@Nullable ProtoBuf.Visibility visibility) {
        Visibility visibility2;
        if (visibility != null) {
            int ordinal = visibility.ordinal();
            if (ordinal == 0) {
                visibility2 = Visibilities.f63987d;
            } else if (ordinal == 1) {
                visibility2 = Visibilities.f63984a;
            } else if (ordinal == 2) {
                visibility2 = Visibilities.f63986c;
            } else if (ordinal == 3) {
                visibility2 = Visibilities.f63988e;
            } else if (ordinal == 4) {
                visibility2 = Visibilities.f63985b;
            } else if (ordinal == 5) {
                visibility2 = Visibilities.f63989f;
            }
            Intrinsics.m32175d(visibility2, "when (visibility) {\n    …isibilities.PRIVATE\n    }");
            return visibility2;
        }
        visibility2 = Visibilities.f63984a;
        Intrinsics.m32175d(visibility2, "when (visibility) {\n    …isibilities.PRIVATE\n    }");
        return visibility2;
    }
}
