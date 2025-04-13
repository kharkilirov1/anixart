package com.yandex.div.core.expression.triggers;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ConditionPart.kt */
@Metadata(m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000 \u00022\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/core/expression/triggers/ConditionPart;", "", "Companion", "RawString", "Variable", "Lcom/yandex/div/core/expression/triggers/ConditionPart$RawString;", "Lcom/yandex/div/core/expression/triggers/ConditionPart$Variable;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public interface ConditionPart {

    /* compiled from: ConditionPart.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/expression/triggers/ConditionPart$Companion;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    /* compiled from: ConditionPart.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/expression/triggers/ConditionPart$RawString;", "Lcom/yandex/div/core/expression/triggers/ConditionPart;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final /* data */ class RawString implements ConditionPart {
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RawString)) {
                return false;
            }
            Objects.requireNonNull((RawString) obj);
            return Intrinsics.m32174c(null, null);
        }

        public int hashCode() {
            throw null;
        }

        @NotNull
        public String toString() {
            return "RawString(value=null)";
        }
    }

    /* compiled from: ConditionPart.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/expression/triggers/ConditionPart$Variable;", "Lcom/yandex/div/core/expression/triggers/ConditionPart;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final /* data */ class Variable implements ConditionPart {
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Variable)) {
                return false;
            }
            Objects.requireNonNull((Variable) obj);
            return Intrinsics.m32174c(null, null);
        }

        public int hashCode() {
            throw null;
        }

        @NotNull
        public String toString() {
            return "Variable(name=null)";
        }
    }
}
