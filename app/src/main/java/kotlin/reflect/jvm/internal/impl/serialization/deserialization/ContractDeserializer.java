package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ContractDeserializer.kt */
/* loaded from: classes3.dex */
public interface ContractDeserializer {

    /* renamed from: a */
    public static final /* synthetic */ int f66046a = 0;

    /* compiled from: ContractDeserializer.kt */
    public static final class Companion {

        /* renamed from: b */
        public static final /* synthetic */ Companion f66048b = new Companion();

        /* renamed from: a */
        @NotNull
        public static final ContractDeserializer f66047a = new ContractDeserializer() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer$Companion$DEFAULT$1
            @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer
            @Nullable
            /* renamed from: a */
            public Pair mo33560a(@NotNull ProtoBuf.Function function, @NotNull FunctionDescriptor functionDescriptor, @NotNull TypeTable typeTable, @NotNull TypeDeserializer typeDeserializer) {
                Intrinsics.m32180i(typeTable, "typeTable");
                Intrinsics.m32180i(typeDeserializer, "typeDeserializer");
                return null;
            }
        };
    }

    @Nullable
    /* renamed from: a */
    Pair<CallableDescriptor.UserDataKey<?>, Object> mo33560a(@NotNull ProtoBuf.Function function, @NotNull FunctionDescriptor functionDescriptor, @NotNull TypeTable typeTable, @NotNull TypeDeserializer typeDeserializer);
}
