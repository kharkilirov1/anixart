package kotlin.script.experimental.api;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: scriptEvaluation.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m31884d2 = {"Lkotlin/script/experimental/api/ResultValue;", "", "Unit", "Value", "Lkotlin/script/experimental/api/ResultValue$Value;", "Lkotlin/script/experimental/api/ResultValue$Unit;", "kotlin-scripting-common"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public abstract class ResultValue {

    /* compiled from: scriptEvaluation.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/script/experimental/api/ResultValue$Unit;", "Lkotlin/script/experimental/api/ResultValue;", "kotlin-scripting-common"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Unit extends ResultValue {
        public Unit() {
            super(null);
        }
    }

    /* compiled from: scriptEvaluation.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/script/experimental/api/ResultValue$Value;", "Lkotlin/script/experimental/api/ResultValue;", "kotlin-scripting-common"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Value extends ResultValue {
        @NotNull
        public String toString() {
            return "null: null = null";
        }
    }

    public ResultValue() {
    }

    public ResultValue(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
