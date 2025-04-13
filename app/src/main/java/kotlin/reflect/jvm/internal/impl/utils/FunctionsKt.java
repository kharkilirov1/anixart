package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: functions.kt */
/* loaded from: classes3.dex */
public final class FunctionsKt {

    /* renamed from: a */
    public static final Function1<Object, Boolean> f66482a;

    /* renamed from: b */
    @NotNull
    public static final Function2<Object, Object, Unit> f66483b;

    /* renamed from: c */
    @NotNull
    public static final Function3<Object, Object, Object, Unit> f66484c;

    static {
        FunctionsKt$IDENTITY$1 functionsKt$IDENTITY$1 = new Function1<Object, Object>() { // from class: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$IDENTITY$1
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final Object invoke(@Nullable Object obj) {
                return obj;
            }
        };
        f66482a = new Function1<Object, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$ALWAYS_TRUE$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                return Boolean.TRUE;
            }
        };
        FunctionsKt$ALWAYS_NULL$1 functionsKt$ALWAYS_NULL$1 = new Function1() { // from class: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$ALWAYS_NULL$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return null;
            }
        };
        FunctionsKt$DO_NOTHING$1 functionsKt$DO_NOTHING$1 = new Function1<Object, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$DO_NOTHING$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                return Unit.f63088a;
            }
        };
        f66483b = new Function2<Object, Object, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$DO_NOTHING_2$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2) {
                return Unit.f63088a;
            }
        };
        f66484c = new Function3<Object, Object, Object, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.utils.FunctionsKt$DO_NOTHING_3$1
            @Override // kotlin.jvm.functions.Function3
            /* renamed from: k */
            public /* bridge */ /* synthetic */ Unit mo16505k(Object obj, Object obj2, Object obj3) {
                return Unit.f63088a;
            }
        };
    }
}
