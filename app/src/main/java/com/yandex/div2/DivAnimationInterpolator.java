package com.yandex.div2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivAnimationInterpolator.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m31884d2 = {"Lcom/yandex/div2/DivAnimationInterpolator;", "", "Converter", "LINEAR", "EASE", "EASE_IN", "EASE_OUT", "EASE_IN_OUT", "SPRING", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public enum DivAnimationInterpolator {
    LINEAR("linear"),
    EASE("ease"),
    EASE_IN("ease_in"),
    EASE_OUT("ease_out"),
    EASE_IN_OUT("ease_in_out"),
    SPRING("spring");


    /* renamed from: c */
    @NotNull
    public static final Converter f34666c = new Converter(null);

    /* renamed from: d */
    @NotNull
    public static final Function1<String, DivAnimationInterpolator> f34667d = new Function1<String, DivAnimationInterpolator>() { // from class: com.yandex.div2.DivAnimationInterpolator$Converter$FROM_STRING$1
        @Override // kotlin.jvm.functions.Function1
        public DivAnimationInterpolator invoke(String str) {
            String string = str;
            Intrinsics.m32179h(string, "string");
            DivAnimationInterpolator divAnimationInterpolator = DivAnimationInterpolator.LINEAR;
            if (Intrinsics.m32174c(string, "linear")) {
                return divAnimationInterpolator;
            }
            DivAnimationInterpolator divAnimationInterpolator2 = DivAnimationInterpolator.EASE;
            if (Intrinsics.m32174c(string, "ease")) {
                return divAnimationInterpolator2;
            }
            DivAnimationInterpolator divAnimationInterpolator3 = DivAnimationInterpolator.EASE_IN;
            if (Intrinsics.m32174c(string, "ease_in")) {
                return divAnimationInterpolator3;
            }
            DivAnimationInterpolator divAnimationInterpolator4 = DivAnimationInterpolator.EASE_OUT;
            if (Intrinsics.m32174c(string, "ease_out")) {
                return divAnimationInterpolator4;
            }
            DivAnimationInterpolator divAnimationInterpolator5 = DivAnimationInterpolator.EASE_IN_OUT;
            if (Intrinsics.m32174c(string, "ease_in_out")) {
                return divAnimationInterpolator5;
            }
            DivAnimationInterpolator divAnimationInterpolator6 = DivAnimationInterpolator.SPRING;
            if (Intrinsics.m32174c(string, "spring")) {
                return divAnimationInterpolator6;
            }
            return null;
        }
    };

    /* renamed from: b */
    @NotNull
    public final String f34675b;

    /* compiled from: DivAnimationInterpolator.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivAnimationInterpolator$Converter;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Converter {
        public Converter() {
        }

        @NotNull
        /* renamed from: a */
        public final String m17560a(@NotNull DivAnimationInterpolator divAnimationInterpolator) {
            return divAnimationInterpolator.f34675b;
        }

        public Converter(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    DivAnimationInterpolator(String str) {
        this.f34675b = str;
    }
}
