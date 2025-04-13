package kotlin.reflect.jvm.internal.impl.incremental.components;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: LookupTracker.kt */
/* loaded from: classes3.dex */
public interface LookupTracker {

    /* compiled from: LookupTracker.kt */
    public static final class DO_NOTHING implements LookupTracker {

        /* renamed from: a */
        public static final DO_NOTHING f64271a = new DO_NOTHING();

        @Override // kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker
        /* renamed from: a */
        public boolean mo32663a() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker
        /* renamed from: b */
        public void mo32664b(@NotNull String filePath, @NotNull Position position, @NotNull String str, @NotNull ScopeKind scopeKind, @NotNull String str2) {
            Intrinsics.m32180i(filePath, "filePath");
            Intrinsics.m32180i(position, "position");
        }
    }

    /* renamed from: a */
    boolean mo32663a();

    /* renamed from: b */
    void mo32664b(@NotNull String str, @NotNull Position position, @NotNull String str2, @NotNull ScopeKind scopeKind, @NotNull String str3);
}
