package kotlinx.coroutines.internal;

import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OnUndeliveredElement.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002**\b\u0000\u0010\u0003\u001a\u0004\b\u0000\u0010\u0000\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0004"}, m31884d2 = {"E", "Lkotlin/Function1;", "", "OnUndeliveredElement", "kotlinx-coroutines-core"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class OnUndeliveredElementKt {
    @NotNull
    /* renamed from: a */
    public static final <E> Function1<Throwable, Unit> m34317a(@NotNull final Function1<? super E, Unit> function1, final E e2, @NotNull final CoroutineContext coroutineContext) {
        return new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.internal.OnUndeliveredElementKt$bindCancellationFun$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                OnUndeliveredElementKt.m34318b(function1, e2, coroutineContext);
                return Unit.f63088a;
            }
        };
    }

    /* renamed from: b */
    public static final <E> void m34318b(@NotNull Function1<? super E, Unit> function1, E e2, @NotNull CoroutineContext coroutineContext) {
        UndeliveredElementException m34319c = m34319c(function1, e2, null);
        if (m34319c == null) {
            return;
        }
        CoroutineExceptionHandlerKt.m34016a(coroutineContext, m34319c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* renamed from: c */
    public static final <E> UndeliveredElementException m34319c(@NotNull Function1<? super E, Unit> function1, E e2, @Nullable UndeliveredElementException undeliveredElementException) {
        try {
            function1.invoke(e2);
        } catch (Throwable th) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th) {
                return new UndeliveredElementException(Intrinsics.m32187p("Exception in undelivered element handler for ", e2), th);
            }
            ExceptionsKt.m31878a(undeliveredElementException, th);
        }
        return undeliveredElementException;
    }
}
