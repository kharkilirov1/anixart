package kotlinx.coroutines.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: OnUndeliveredElement.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/internal/UndeliveredElementException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class UndeliveredElementException extends RuntimeException {
    public UndeliveredElementException(@NotNull String str, @NotNull Throwable th) {
        super(str, th);
    }
}
