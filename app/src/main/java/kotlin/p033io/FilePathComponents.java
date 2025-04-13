package kotlin.p033io;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FilePathComponents.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/io/FilePathComponents;", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final /* data */ class FilePathComponents {
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilePathComponents)) {
            return false;
        }
        Objects.requireNonNull((FilePathComponents) obj);
        return Intrinsics.m32174c(null, null) && Intrinsics.m32174c(null, null);
    }

    public int hashCode() {
        throw null;
    }

    @NotNull
    public String toString() {
        return "FilePathComponents(root=null, segments=null)";
    }
}
