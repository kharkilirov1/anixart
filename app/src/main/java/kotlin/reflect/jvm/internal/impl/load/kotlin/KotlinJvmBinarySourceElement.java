package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.IncompatibleVersionErrorData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: KotlinJvmBinarySourceElement.kt */
/* loaded from: classes3.dex */
public final class KotlinJvmBinarySourceElement implements DeserializedContainerSource {

    /* renamed from: b */
    @NotNull
    public final KotlinJvmBinaryClass f64803b;

    public KotlinJvmBinarySourceElement(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass, @Nullable IncompatibleVersionErrorData<JvmMetadataVersion> incompatibleVersionErrorData, boolean z) {
        this.f64803b = kotlinJvmBinaryClass;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    @NotNull
    /* renamed from: a */
    public SourceFile mo32339a() {
        return SourceFile.f63980a;
    }

    @NotNull
    public String toString() {
        StringBuilder m27x = C0000a.m27x("KotlinJvmBinarySourceElement", ": ");
        m27x.append(this.f64803b);
        return m27x.toString();
    }
}
