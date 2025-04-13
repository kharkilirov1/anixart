package com.yandex.div2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivContentAlignmentHorizontal.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m31884d2 = {"Lcom/yandex/div2/DivContentAlignmentHorizontal;", "", "Converter", "LEFT", "CENTER", "RIGHT", "SPACE_BETWEEN", "SPACE_AROUND", "SPACE_EVENLY", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public enum DivContentAlignmentHorizontal {
    LEFT("left"),
    CENTER("center"),
    RIGHT("right"),
    SPACE_BETWEEN("space-between"),
    SPACE_AROUND("space-around"),
    SPACE_EVENLY("space-evenly");


    /* renamed from: c */
    @NotNull
    public static final Converter f35193c = new Converter(null);

    /* renamed from: d */
    @NotNull
    public static final Function1<String, DivContentAlignmentHorizontal> f35194d = new Function1<String, DivContentAlignmentHorizontal>() { // from class: com.yandex.div2.DivContentAlignmentHorizontal$Converter$FROM_STRING$1
        @Override // kotlin.jvm.functions.Function1
        public DivContentAlignmentHorizontal invoke(String str) {
            String string = str;
            Intrinsics.m32179h(string, "string");
            DivContentAlignmentHorizontal divContentAlignmentHorizontal = DivContentAlignmentHorizontal.LEFT;
            if (Intrinsics.m32174c(string, "left")) {
                return divContentAlignmentHorizontal;
            }
            DivContentAlignmentHorizontal divContentAlignmentHorizontal2 = DivContentAlignmentHorizontal.CENTER;
            if (Intrinsics.m32174c(string, "center")) {
                return divContentAlignmentHorizontal2;
            }
            DivContentAlignmentHorizontal divContentAlignmentHorizontal3 = DivContentAlignmentHorizontal.RIGHT;
            if (Intrinsics.m32174c(string, "right")) {
                return divContentAlignmentHorizontal3;
            }
            DivContentAlignmentHorizontal divContentAlignmentHorizontal4 = DivContentAlignmentHorizontal.SPACE_BETWEEN;
            if (Intrinsics.m32174c(string, "space-between")) {
                return divContentAlignmentHorizontal4;
            }
            DivContentAlignmentHorizontal divContentAlignmentHorizontal5 = DivContentAlignmentHorizontal.SPACE_AROUND;
            if (Intrinsics.m32174c(string, "space-around")) {
                return divContentAlignmentHorizontal5;
            }
            DivContentAlignmentHorizontal divContentAlignmentHorizontal6 = DivContentAlignmentHorizontal.SPACE_EVENLY;
            if (Intrinsics.m32174c(string, "space-evenly")) {
                return divContentAlignmentHorizontal6;
            }
            return null;
        }
    };

    /* renamed from: b */
    @NotNull
    public final String f35202b;

    /* compiled from: DivContentAlignmentHorizontal.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivContentAlignmentHorizontal$Converter;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Converter {
        public Converter() {
        }

        public Converter(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    DivContentAlignmentHorizontal(String str) {
        this.f35202b = str;
    }
}
