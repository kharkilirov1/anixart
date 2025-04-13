package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;

/* compiled from: Mutex.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlinx-coroutines-core"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class MutexKt {

    /* renamed from: a */
    @NotNull
    public static final Symbol f68419a = new Symbol("LOCK_FAIL");

    /* renamed from: b */
    @NotNull
    public static final Symbol f68420b = new Symbol("UNLOCK_FAIL");

    /* renamed from: c */
    @NotNull
    public static final Symbol f68421c;

    /* renamed from: d */
    @NotNull
    public static final Symbol f68422d;

    /* renamed from: e */
    @NotNull
    public static final Empty f68423e;

    /* renamed from: f */
    @NotNull
    public static final Empty f68424f;

    static {
        Symbol symbol = new Symbol("LOCKED");
        f68421c = symbol;
        Symbol symbol2 = new Symbol("UNLOCKED");
        f68422d = symbol2;
        f68423e = new Empty(symbol);
        f68424f = new Empty(symbol2);
    }
}
