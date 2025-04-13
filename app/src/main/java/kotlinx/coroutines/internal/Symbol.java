package kotlinx.coroutines.internal;

import androidx.emoji2.text.flatbuffer.C0321a;
import androidx.room.util.C0576a;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* compiled from: Symbol.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/internal/Symbol;", "", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class Symbol {

    /* renamed from: a */
    @JvmField
    @NotNull
    public final String f68304a;

    public Symbol(@NotNull String str) {
        this.f68304a = str;
    }

    @NotNull
    public String toString() {
        return C0576a.m4118q(C0321a.m2872a('<'), this.f68304a, '>');
    }
}
