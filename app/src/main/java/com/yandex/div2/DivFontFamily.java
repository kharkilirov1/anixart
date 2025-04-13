package com.yandex.div2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivFontFamily.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div2/DivFontFamily;", "", "Converter", "TEXT", "DISPLAY", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public enum DivFontFamily {
    TEXT("text"),
    DISPLAY("display");


    /* renamed from: c */
    @NotNull
    public static final Converter f35876c = new Converter(null);

    /* renamed from: d */
    @NotNull
    public static final Function1<String, DivFontFamily> f35877d = new Function1<String, DivFontFamily>() { // from class: com.yandex.div2.DivFontFamily$Converter$FROM_STRING$1
        @Override // kotlin.jvm.functions.Function1
        public DivFontFamily invoke(String str) {
            String string = str;
            Intrinsics.m32179h(string, "string");
            DivFontFamily divFontFamily = DivFontFamily.TEXT;
            if (Intrinsics.m32174c(string, "text")) {
                return divFontFamily;
            }
            DivFontFamily divFontFamily2 = DivFontFamily.DISPLAY;
            if (Intrinsics.m32174c(string, "display")) {
                return divFontFamily2;
            }
            return null;
        }
    };

    /* renamed from: b */
    @NotNull
    public final String f35881b;

    /* compiled from: DivFontFamily.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivFontFamily$Converter;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Converter {
        public Converter() {
        }

        @NotNull
        /* renamed from: a */
        public final String m17622a(@NotNull DivFontFamily divFontFamily) {
            return divFontFamily.f35881b;
        }

        public Converter(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    DivFontFamily(String str) {
        this.f35881b = str;
    }
}
