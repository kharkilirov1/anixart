package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: IncompatibleVersionErrorData.kt */
/* loaded from: classes3.dex */
public final class IncompatibleVersionErrorData<T extends BinaryVersion> {

    /* renamed from: a */
    @NotNull
    public final T f66088a;

    /* renamed from: b */
    @NotNull
    public final T f66089b;

    /* renamed from: c */
    @NotNull
    public final String f66090c;

    /* renamed from: d */
    @NotNull
    public final ClassId f66091d;

    public IncompatibleVersionErrorData(@NotNull T actualVersion, @NotNull T expectedVersion, @NotNull String filePath, @NotNull ClassId classId) {
        Intrinsics.m32180i(actualVersion, "actualVersion");
        Intrinsics.m32180i(expectedVersion, "expectedVersion");
        Intrinsics.m32180i(filePath, "filePath");
        Intrinsics.m32180i(classId, "classId");
        this.f66088a = actualVersion;
        this.f66089b = expectedVersion;
        this.f66090c = filePath;
        this.f66091d = classId;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncompatibleVersionErrorData)) {
            return false;
        }
        IncompatibleVersionErrorData incompatibleVersionErrorData = (IncompatibleVersionErrorData) obj;
        return Intrinsics.m32174c(this.f66088a, incompatibleVersionErrorData.f66088a) && Intrinsics.m32174c(this.f66089b, incompatibleVersionErrorData.f66089b) && Intrinsics.m32174c(this.f66090c, incompatibleVersionErrorData.f66090c) && Intrinsics.m32174c(this.f66091d, incompatibleVersionErrorData.f66091d);
    }

    public int hashCode() {
        T t = this.f66088a;
        int hashCode = (t != null ? t.hashCode() : 0) * 31;
        T t2 = this.f66089b;
        int hashCode2 = (hashCode + (t2 != null ? t2.hashCode() : 0)) * 31;
        String str = this.f66090c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        ClassId classId = this.f66091d;
        return hashCode3 + (classId != null ? classId.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("IncompatibleVersionErrorData(actualVersion=");
        m24u.append(this.f66088a);
        m24u.append(", expectedVersion=");
        m24u.append(this.f66089b);
        m24u.append(", filePath=");
        m24u.append(this.f66090c);
        m24u.append(", classId=");
        m24u.append(this.f66091d);
        m24u.append(")");
        return m24u.toString();
    }
}
