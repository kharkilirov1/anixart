package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParserKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div2.DivInputMask;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivInputMask.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div2/DivInputMask;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "Currency", "FixedLength", "Lcom/yandex/div2/DivInputMask$FixedLength;", "Lcom/yandex/div2/DivInputMask$Currency;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivInputMask implements JSONSerializable {

    /* renamed from: a */
    @NotNull
    public static final Companion f37388a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivInputMask> f37389b = new Function2<ParsingEnvironment, JSONObject, DivInputMask>() { // from class: com.yandex.div2.DivInputMask$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivInputMask invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            Object m17338a;
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivInputMask.Companion companion = DivInputMask.f37388a;
            m17338a = JsonParserKt.m17338a(it, "type", (r5 & 2) != 0 ? C2904b.f33860g : null, env.getF34328a(), env);
            String str = (String) m17338a;
            if (Intrinsics.m32174c(str, "fixed_length")) {
                return new DivInputMask.FixedLength(DivFixedLengthInputMask.f35732e.m17618a(env, it));
            }
            if (Intrinsics.m32174c(str, "currency")) {
                return new DivInputMask.Currency(DivCurrencyInputMask.f35246c.m17605a(env, it));
            }
            JsonTemplate<?> mo17515a = env.mo17207b().mo17515a(str, it);
            DivInputMaskTemplate divInputMaskTemplate = mo17515a instanceof DivInputMaskTemplate ? (DivInputMaskTemplate) mo17515a : null;
            if (divInputMaskTemplate != null) {
                return divInputMaskTemplate.m17641b(env, it);
            }
            throw ParsingExceptionKt.m17528m(it, "type", str);
        }
    };

    /* compiled from: DivInputMask.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivInputMask$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivInputMask.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivInputMask$Currency;", "Lcom/yandex/div2/DivInputMask;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Currency extends DivInputMask {

        /* renamed from: c */
        @NotNull
        public final DivCurrencyInputMask f37391c;

        public Currency(@NotNull DivCurrencyInputMask divCurrencyInputMask) {
            super(null);
            this.f37391c = divCurrencyInputMask;
        }
    }

    /* compiled from: DivInputMask.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivInputMask$FixedLength;", "Lcom/yandex/div2/DivInputMask;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class FixedLength extends DivInputMask {

        /* renamed from: c */
        @NotNull
        public final DivFixedLengthInputMask f37392c;

        public FixedLength(@NotNull DivFixedLengthInputMask divFixedLengthInputMask) {
            super(null);
            this.f37392c = divFixedLengthInputMask;
        }
    }

    public DivInputMask() {
    }

    @NotNull
    /* renamed from: a */
    public DivInputMaskBase m17640a() {
        if (this instanceof FixedLength) {
            return ((FixedLength) this).f37392c;
        }
        if (this instanceof Currency) {
            return ((Currency) this).f37391c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public DivInputMask(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
