package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: ClassData.kt */
/* loaded from: classes3.dex */
public final class ClassData {

    /* renamed from: a */
    @NotNull
    public final NameResolver f66035a;

    /* renamed from: b */
    @NotNull
    public final ProtoBuf.Class f66036b;

    /* renamed from: c */
    @NotNull
    public final BinaryVersion f66037c;

    /* renamed from: d */
    @NotNull
    public final SourceElement f66038d;

    public ClassData(@NotNull NameResolver nameResolver, @NotNull ProtoBuf.Class classProto, @NotNull BinaryVersion metadataVersion, @NotNull SourceElement sourceElement) {
        Intrinsics.m32180i(nameResolver, "nameResolver");
        Intrinsics.m32180i(classProto, "classProto");
        Intrinsics.m32180i(metadataVersion, "metadataVersion");
        Intrinsics.m32180i(sourceElement, "sourceElement");
        this.f66035a = nameResolver;
        this.f66036b = classProto;
        this.f66037c = metadataVersion;
        this.f66038d = sourceElement;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassData)) {
            return false;
        }
        ClassData classData = (ClassData) obj;
        return Intrinsics.m32174c(this.f66035a, classData.f66035a) && Intrinsics.m32174c(this.f66036b, classData.f66036b) && Intrinsics.m32174c(this.f66037c, classData.f66037c) && Intrinsics.m32174c(this.f66038d, classData.f66038d);
    }

    public int hashCode() {
        NameResolver nameResolver = this.f66035a;
        int hashCode = (nameResolver != null ? nameResolver.hashCode() : 0) * 31;
        ProtoBuf.Class r2 = this.f66036b;
        int hashCode2 = (hashCode + (r2 != null ? r2.hashCode() : 0)) * 31;
        BinaryVersion binaryVersion = this.f66037c;
        int hashCode3 = (hashCode2 + (binaryVersion != null ? binaryVersion.hashCode() : 0)) * 31;
        SourceElement sourceElement = this.f66038d;
        return hashCode3 + (sourceElement != null ? sourceElement.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("ClassData(nameResolver=");
        m24u.append(this.f66035a);
        m24u.append(", classProto=");
        m24u.append(this.f66036b);
        m24u.append(", metadataVersion=");
        m24u.append(this.f66037c);
        m24u.append(", sourceElement=");
        m24u.append(this.f66038d);
        m24u.append(")");
        return m24u.toString();
    }
}
