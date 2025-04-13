package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ModuleMapping.kt */
/* loaded from: classes3.dex */
public final class PackageParts {

    /* renamed from: a */
    public final LinkedHashMap<String, String> f65590a = new LinkedHashMap<>();

    /* renamed from: b */
    @NotNull
    public final Set<String> f65591b = new LinkedHashSet();

    /* renamed from: c */
    @NotNull
    public final String f65592c;

    public PackageParts(@NotNull String str) {
        this.f65592c = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof PackageParts) {
            PackageParts packageParts = (PackageParts) obj;
            if (Intrinsics.m32174c(packageParts.f65592c, this.f65592c) && Intrinsics.m32174c(packageParts.f65590a, this.f65590a) && Intrinsics.m32174c(packageParts.f65591b, this.f65591b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f65591b.hashCode() + ((this.f65590a.hashCode() + (this.f65592c.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        Set<String> keySet = this.f65590a.keySet();
        Intrinsics.m32175d(keySet, "packageParts.keys");
        return SetsKt.m32077d(keySet, this.f65591b).toString();
    }
}
