package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;

/* compiled from: Select.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlinx-coroutines-core"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class SelectKt {

    /* renamed from: a */
    @NotNull
    public static final Object f68384a = new Symbol("NOT_SELECTED");

    /* renamed from: b */
    @NotNull
    public static final Object f68385b = new Symbol("ALREADY_SELECTED");

    /* renamed from: c */
    @NotNull
    public static final Object f68386c = new Symbol("UNDECIDED");

    /* renamed from: d */
    @NotNull
    public static final Object f68387d = new Symbol("RESUMED");

    /* renamed from: e */
    @NotNull
    public static final SeqNumber f68388e = new SeqNumber();
}
