package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JobSupport.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlinx-coroutines-core"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class JobSupportKt {

    /* renamed from: a */
    @NotNull
    public static final Symbol f67036a = new Symbol("COMPLETING_ALREADY");

    /* renamed from: b */
    @JvmField
    @NotNull
    public static final Symbol f67037b = new Symbol("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c */
    @NotNull
    public static final Symbol f67038c = new Symbol("COMPLETING_RETRY");

    /* renamed from: d */
    @NotNull
    public static final Symbol f67039d = new Symbol("TOO_LATE_TO_CANCEL");

    /* renamed from: e */
    @NotNull
    public static final Symbol f67040e = new Symbol("SEALED");

    /* renamed from: f */
    @NotNull
    public static final Empty f67041f = new Empty(false);

    /* renamed from: g */
    @NotNull
    public static final Empty f67042g = new Empty(true);

    @Nullable
    /* renamed from: a */
    public static final Object m34114a(@Nullable Object obj) {
        Incomplete incomplete;
        IncompleteStateBox incompleteStateBox = obj instanceof IncompleteStateBox ? (IncompleteStateBox) obj : null;
        return (incompleteStateBox == null || (incomplete = incompleteStateBox.f67011a) == null) ? obj : incomplete;
    }
}
