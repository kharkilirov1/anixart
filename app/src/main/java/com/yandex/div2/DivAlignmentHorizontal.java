package com.yandex.div2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivAlignmentHorizontal.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div2/DivAlignmentHorizontal;", "", "Converter", "LEFT", "CENTER", "RIGHT", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public enum DivAlignmentHorizontal {
    LEFT("left"),
    CENTER("center"),
    RIGHT("right");


    /* renamed from: c */
    @NotNull
    public static final Converter f34617c = new Converter(null);

    /* renamed from: d */
    @NotNull
    public static final Function1<String, DivAlignmentHorizontal> f34618d = new Function1<String, DivAlignmentHorizontal>() { // from class: com.yandex.div2.DivAlignmentHorizontal$Converter$FROM_STRING$1
        @Override // kotlin.jvm.functions.Function1
        public DivAlignmentHorizontal invoke(String str) {
            String string = str;
            Intrinsics.m32179h(string, "string");
            DivAlignmentHorizontal divAlignmentHorizontal = DivAlignmentHorizontal.LEFT;
            if (Intrinsics.m32174c(string, "left")) {
                return divAlignmentHorizontal;
            }
            DivAlignmentHorizontal divAlignmentHorizontal2 = DivAlignmentHorizontal.CENTER;
            if (Intrinsics.m32174c(string, "center")) {
                return divAlignmentHorizontal2;
            }
            DivAlignmentHorizontal divAlignmentHorizontal3 = DivAlignmentHorizontal.RIGHT;
            if (Intrinsics.m32174c(string, "right")) {
                return divAlignmentHorizontal3;
            }
            return null;
        }
    };

    /* renamed from: b */
    @NotNull
    public final String f34623b;

    /* compiled from: DivAlignmentHorizontal.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivAlignmentHorizontal$Converter;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Converter {
        public Converter() {
        }

        @NotNull
        /* renamed from: a */
        public final String m17558a(@NotNull DivAlignmentHorizontal divAlignmentHorizontal) {
            return divAlignmentHorizontal.f34623b;
        }

        public Converter(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    DivAlignmentHorizontal(String str) {
        this.f34623b = str;
    }
}
