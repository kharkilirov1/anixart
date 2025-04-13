package kotlin.reflect.jvm.internal.components;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import org.jetbrains.annotations.NotNull;

/* compiled from: RuntimeModuleData.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\fB\u0019\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\r"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/ModuleDescriptor;", "getModule", "()Lorg/jetbrains/kotlin/descriptors/ModuleDescriptor;", "module", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/DeserializationComponents;", "deserialization", "Lkotlin/reflect/jvm/internal/components/RuntimePackagePartProvider;", "packagePartProvider", "<init>", "(Lorg/jetbrains/kotlin/serialization/deserialization/DeserializationComponents;Lkotlin/reflect/jvm/internal/components/RuntimePackagePartProvider;)V", "Companion", "descriptors.runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class RuntimeModuleData {

    /* renamed from: a */
    @NotNull
    public final DeserializationComponents f63702a;

    /* renamed from: b */
    @NotNull
    public final RuntimePackagePartProvider f63703b;

    /* compiled from: RuntimeModuleData.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/components/RuntimeModuleData$Companion;", "", "descriptors.runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
    }

    public RuntimeModuleData(@NotNull DeserializationComponents deserializationComponents, @NotNull RuntimePackagePartProvider runtimePackagePartProvider, DefaultConstructorMarker defaultConstructorMarker) {
        this.f63702a = deserializationComponents;
        this.f63703b = runtimePackagePartProvider;
    }
}
