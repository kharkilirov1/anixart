package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DeserializedMemberDescriptor.kt */
/* loaded from: classes3.dex */
public interface DeserializedMemberDescriptor extends MemberDescriptor {

    /* compiled from: DeserializedMemberDescriptor.kt */
    public enum CoroutinesCompatibilityMode {
        COMPATIBLE,
        NEEDS_WRAPPER,
        INCOMPATIBLE
    }

    /* compiled from: DeserializedMemberDescriptor.kt */
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:25:0x00e1  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x012e A[SYNTHETIC] */
        @org.jetbrains.annotations.NotNull
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.util.List<kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement> m33612a(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor r18) {
            /*
                Method dump skipped, instructions count: 337
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.DefaultImpls.m33612a(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor):java.util.List");
        }
    }

    @NotNull
    /* renamed from: E0 */
    List<VersionRequirement> mo33598E0();

    @NotNull
    /* renamed from: R */
    TypeTable mo33600R();

    @NotNull
    /* renamed from: X */
    VersionRequirementTable mo33601X();

    @NotNull
    /* renamed from: Y */
    NameResolver mo33602Y();

    @Nullable
    /* renamed from: c0 */
    DeserializedContainerSource mo33603c0();

    @NotNull
    /* renamed from: z */
    MessageLite mo33604z();
}
