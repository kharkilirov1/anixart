package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import com.fasterxml.jackson.core.JsonPointer;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: ModuleMapping.kt */
/* loaded from: classes3.dex */
public final class ModuleMappingKt {
    @NotNull
    /* renamed from: a */
    public static final String m33185a(@NotNull String str, @NotNull String str2) {
        return str.length() == 0 ? str2 : C0000a.m21r(new StringBuilder(), StringsKt.m33890P(str, '.', JsonPointer.SEPARATOR, false, 4, null), "/", str2);
    }
}
