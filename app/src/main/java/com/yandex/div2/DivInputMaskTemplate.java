package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParserKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div2.DivInputMask;
import com.yandex.div2.DivInputMaskTemplate;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivInputMaskTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003\u0004\u0005\u0006\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m31884d2 = {"Lcom/yandex/div2/DivInputMaskTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/DivInputMask;", "Companion", "Currency", "FixedLength", "Lcom/yandex/div2/DivInputMaskTemplate$FixedLength;", "Lcom/yandex/div2/DivInputMaskTemplate$Currency;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivInputMaskTemplate implements JSONSerializable, JsonTemplate<DivInputMask> {

    /* renamed from: a */
    @NotNull
    public static final Companion f37393a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivInputMaskTemplate> f37394b = new Function2<ParsingEnvironment, JSONObject, DivInputMaskTemplate>() { // from class: com.yandex.div2.DivInputMaskTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivInputMaskTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            Object m17338a;
            DivInputMaskTemplate currency;
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            DivInputMaskTemplate.Companion companion = DivInputMaskTemplate.f37393a;
            m17338a = JsonParserKt.m17338a(it, "type", (r5 & 2) != 0 ? C2904b.f33860g : null, env.getF34328a(), env);
            String str = (String) m17338a;
            JsonTemplate<?> jsonTemplate = env.mo17207b().get(str);
            DivInputMaskTemplate divInputMaskTemplate = jsonTemplate instanceof DivInputMaskTemplate ? (DivInputMaskTemplate) jsonTemplate : null;
            if (divInputMaskTemplate != null) {
                if (divInputMaskTemplate instanceof DivInputMaskTemplate.FixedLength) {
                    str = "fixed_length";
                } else {
                    if (!(divInputMaskTemplate instanceof DivInputMaskTemplate.Currency)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "currency";
                }
            }
            if (Intrinsics.m32174c(str, "fixed_length")) {
                currency = new DivInputMaskTemplate.FixedLength(new DivFixedLengthInputMaskTemplate(env, (DivFixedLengthInputMaskTemplate) (divInputMaskTemplate != null ? divInputMaskTemplate.m17642c() : null), false, it));
            } else {
                if (!Intrinsics.m32174c(str, "currency")) {
                    throw ParsingExceptionKt.m17528m(it, "type", str);
                }
                currency = new DivInputMaskTemplate.Currency(new DivCurrencyInputMaskTemplate(env, (DivCurrencyInputMaskTemplate) (divInputMaskTemplate != null ? divInputMaskTemplate.m17642c() : null), false, it));
            }
            return currency;
        }
    };

    /* compiled from: DivInputMaskTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivInputMaskTemplate$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivInputMaskTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivInputMaskTemplate$Currency;", "Lcom/yandex/div2/DivInputMaskTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Currency extends DivInputMaskTemplate {

        /* renamed from: c */
        @NotNull
        public final DivCurrencyInputMaskTemplate f37396c;

        public Currency(@NotNull DivCurrencyInputMaskTemplate divCurrencyInputMaskTemplate) {
            super(null);
            this.f37396c = divCurrencyInputMaskTemplate;
        }
    }

    /* compiled from: DivInputMaskTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivInputMaskTemplate$FixedLength;", "Lcom/yandex/div2/DivInputMaskTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class FixedLength extends DivInputMaskTemplate {

        /* renamed from: c */
        @NotNull
        public final DivFixedLengthInputMaskTemplate f37397c;

        public FixedLength(@NotNull DivFixedLengthInputMaskTemplate divFixedLengthInputMaskTemplate) {
            super(null);
            this.f37397c = divFixedLengthInputMaskTemplate;
        }
    }

    public DivInputMaskTemplate() {
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DivInputMask mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        if (this instanceof FixedLength) {
            return new DivInputMask.FixedLength(((FixedLength) this).f37397c.mo17514a(env, data));
        }
        if (this instanceof Currency) {
            return new DivInputMask.Currency(((Currency) this).f37396c.mo17514a(env, data));
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    /* renamed from: c */
    public Object m17642c() {
        if (this instanceof FixedLength) {
            return ((FixedLength) this).f37397c;
        }
        if (this instanceof Currency) {
            return ((Currency) this).f37396c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public DivInputMaskTemplate(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
