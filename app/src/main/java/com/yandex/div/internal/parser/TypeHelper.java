package com.yandex.div.internal.parser;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TypeHelpers.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/internal/parser/TypeHelper;", "T", "", "Companion", "div-json_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public interface TypeHelper<T> {

    /* renamed from: a */
    public static final /* synthetic */ int f33843a = 0;

    /* compiled from: TypeHelpers.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/internal/parser/TypeHelper$Companion;", "", "div-json_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {

        /* renamed from: a */
        public static final /* synthetic */ Companion f33844a = new Companion();

        @NotNull
        /* renamed from: a */
        public final <T> TypeHelper<T> m17372a(@NotNull final T t, @NotNull final Function1<Object, Boolean> validator) {
            Intrinsics.m32179h(t, "default");
            Intrinsics.m32179h(validator, "validator");
            return new TypeHelper<T>(t, validator) { // from class: com.yandex.div.internal.parser.TypeHelper$Companion$from$1

                /* renamed from: b */
                @NotNull
                public final T f33845b;

                /* renamed from: c */
                public final /* synthetic */ T f33846c;

                /* renamed from: d */
                public final /* synthetic */ Function1<Object, Boolean> f33847d;

                {
                    this.f33846c = t;
                    this.f33847d = validator;
                    this.f33845b = t;
                }

                @Override // com.yandex.div.internal.parser.TypeHelper
                @NotNull
                /* renamed from: a */
                public T mo17370a() {
                    return this.f33845b;
                }

                @Override // com.yandex.div.internal.parser.TypeHelper
                /* renamed from: b */
                public boolean mo17371b(@NotNull Object value) {
                    Intrinsics.m32179h(value, "value");
                    return this.f33847d.invoke(value).booleanValue();
                }
            };
        }
    }

    /* renamed from: a */
    T mo17370a();

    /* renamed from: b */
    boolean mo17371b(@NotNull Object obj);
}
