package com.yandex.div2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivVisibility.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div2/DivVisibility;", "", "Converter", "VISIBLE", "INVISIBLE", "GONE", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public enum DivVisibility {
    VISIBLE("visible"),
    INVISIBLE("invisible"),
    GONE("gone");


    /* renamed from: c */
    @NotNull
    public static final Converter f40930c = new Converter(null);

    /* renamed from: d */
    @NotNull
    public static final Function1<String, DivVisibility> f40931d = new Function1<String, DivVisibility>() { // from class: com.yandex.div2.DivVisibility$Converter$FROM_STRING$1
        @Override // kotlin.jvm.functions.Function1
        public DivVisibility invoke(String str) {
            String string = str;
            Intrinsics.m32179h(string, "string");
            DivVisibility divVisibility = DivVisibility.VISIBLE;
            if (Intrinsics.m32174c(string, "visible")) {
                return divVisibility;
            }
            DivVisibility divVisibility2 = DivVisibility.INVISIBLE;
            if (Intrinsics.m32174c(string, "invisible")) {
                return divVisibility2;
            }
            DivVisibility divVisibility3 = DivVisibility.GONE;
            if (Intrinsics.m32174c(string, "gone")) {
                return divVisibility3;
            }
            return null;
        }
    };

    /* renamed from: b */
    @NotNull
    public final String f40936b;

    /* compiled from: DivVisibility.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivVisibility$Converter;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Converter {
        public Converter() {
        }

        @NotNull
        /* renamed from: a */
        public final String m17728a(@NotNull DivVisibility divVisibility) {
            return divVisibility.f40936b;
        }

        public Converter(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    DivVisibility(String str) {
        this.f40936b = str;
    }
}
