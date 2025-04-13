package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: Caller.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u0000*\f\b\u0000\u0010\u0002 \u0001*\u0004\u0018\u00010\u00012\u00020\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/calls/Caller;", "Ljava/lang/reflect/Member;", "M", "", "", "args", "", "checkArguments", "([Ljava/lang/Object;)V", "kotlin-reflect-api"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public interface Caller<M extends Member> {

    /* compiled from: Caller.kt */
    @Metadata(m31882bv = {1, 0, 3}, m31885k = 3, m31886mv = {1, 1, 13})
    public static final class DefaultImpls {
        /* renamed from: a */
        public static <M extends Member> void m32331a(Caller<? extends M> caller, @NotNull Object[] objArr) {
            if (caller.mo32328a().size() == objArr.length) {
                return;
            }
            StringBuilder m24u = C0000a.m24u("Callable expects ");
            m24u.append(caller.mo32328a().size());
            m24u.append(" arguments, but ");
            throw new IllegalArgumentException(C0000a.m18o(m24u, objArr.length, " were provided."));
        }
    }

    @NotNull
    /* renamed from: a */
    List<Type> mo32328a();

    @Nullable
    Object call(@NotNull Object[] objArr);

    M getMember();

    @NotNull
    Type getReturnType();
}
