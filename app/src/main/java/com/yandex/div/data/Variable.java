package com.yandex.div.data;

import android.net.Uri;
import androidx.annotation.MainThread;
import com.yandex.div.core.ObserverList;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.C0000a;

/* compiled from: Variable.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m31884d2 = {"Lcom/yandex/div/data/Variable;", "", "BooleanVariable", "ColorVariable", "DictVariable", "DoubleVariable", "IntegerVariable", "StringVariable", "UrlVariable", "Lcom/yandex/div/data/Variable$StringVariable;", "Lcom/yandex/div/data/Variable$IntegerVariable;", "Lcom/yandex/div/data/Variable$BooleanVariable;", "Lcom/yandex/div/data/Variable$DoubleVariable;", "Lcom/yandex/div/data/Variable$ColorVariable;", "Lcom/yandex/div/data/Variable$UrlVariable;", "Lcom/yandex/div/data/Variable$DictVariable;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class Variable {

    /* renamed from: a */
    @NotNull
    public final ObserverList<Function1<Variable, Unit>> f33098a = new ObserverList<>();

    /* compiled from: Variable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/data/Variable$BooleanVariable;", "Lcom/yandex/div/data/Variable;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class BooleanVariable extends Variable {

        /* renamed from: b */
        @NotNull
        public final String f33099b;

        /* renamed from: c */
        public final boolean f33100c;

        /* renamed from: d */
        public boolean f33101d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BooleanVariable(@NotNull String name, boolean z) {
            super(null);
            Intrinsics.m32179h(name, "name");
            this.f33099b = name;
            this.f33100c = z;
            this.f33101d = z;
        }

        @Override // com.yandex.div.data.Variable
        @NotNull
        /* renamed from: a, reason: from getter */
        public String getF33117b() {
            return this.f33099b;
        }
    }

    /* compiled from: Variable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/data/Variable$ColorVariable;", "Lcom/yandex/div/data/Variable;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class ColorVariable extends Variable {

        /* renamed from: b */
        @NotNull
        public final String f33102b;

        /* renamed from: c */
        public final int f33103c;

        /* renamed from: d */
        public int f33104d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ColorVariable(@NotNull String name, int i2) {
            super(null);
            Intrinsics.m32179h(name, "name");
            this.f33102b = name;
            this.f33103c = i2;
            this.f33104d = i2;
        }

        @Override // com.yandex.div.data.Variable
        @NotNull
        /* renamed from: a, reason: from getter */
        public String getF33117b() {
            return this.f33102b;
        }
    }

    /* compiled from: Variable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/data/Variable$DictVariable;", "Lcom/yandex/div/data/Variable;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class DictVariable extends Variable {

        /* renamed from: b */
        @NotNull
        public final String f33105b;

        /* renamed from: c */
        @NotNull
        public final JSONObject f33106c;

        /* renamed from: d */
        @NotNull
        public JSONObject f33107d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DictVariable(@NotNull String name, @NotNull JSONObject defaultValue) {
            super(null);
            Intrinsics.m32179h(name, "name");
            Intrinsics.m32179h(defaultValue, "defaultValue");
            this.f33105b = name;
            this.f33106c = defaultValue;
            this.f33107d = defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        @NotNull
        /* renamed from: a, reason: from getter */
        public String getF33117b() {
            return this.f33105b;
        }
    }

    /* compiled from: Variable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/data/Variable$DoubleVariable;", "Lcom/yandex/div/data/Variable;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class DoubleVariable extends Variable {

        /* renamed from: b */
        @NotNull
        public final String f33108b;

        /* renamed from: c */
        public final double f33109c;

        /* renamed from: d */
        public double f33110d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DoubleVariable(@NotNull String name, double d) {
            super(null);
            Intrinsics.m32179h(name, "name");
            this.f33108b = name;
            this.f33109c = d;
            this.f33110d = d;
        }

        @Override // com.yandex.div.data.Variable
        @NotNull
        /* renamed from: a, reason: from getter */
        public String getF33117b() {
            return this.f33108b;
        }

        /* renamed from: e */
        public void m17213e(double d) {
            if (this.f33110d == d) {
                return;
            }
            this.f33110d = d;
            m17211c(this);
        }
    }

    /* compiled from: Variable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/data/Variable$IntegerVariable;", "Lcom/yandex/div/data/Variable;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class IntegerVariable extends Variable {

        /* renamed from: b */
        @NotNull
        public final String f33111b;

        /* renamed from: c */
        public final long f33112c;

        /* renamed from: d */
        public long f33113d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IntegerVariable(@NotNull String name, long j2) {
            super(null);
            Intrinsics.m32179h(name, "name");
            this.f33111b = name;
            this.f33112c = j2;
            this.f33113d = j2;
        }

        @Override // com.yandex.div.data.Variable
        @NotNull
        /* renamed from: a, reason: from getter */
        public String getF33117b() {
            return this.f33111b;
        }
    }

    /* compiled from: Variable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/data/Variable$StringVariable;", "Lcom/yandex/div/data/Variable;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class StringVariable extends Variable {

        /* renamed from: b */
        @NotNull
        public final String f33114b;

        /* renamed from: c */
        @NotNull
        public final String f33115c;

        /* renamed from: d */
        @NotNull
        public String f33116d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StringVariable(@NotNull String name, @NotNull String defaultValue) {
            super(null);
            Intrinsics.m32179h(name, "name");
            Intrinsics.m32179h(defaultValue, "defaultValue");
            this.f33114b = name;
            this.f33115c = defaultValue;
            this.f33116d = defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        @NotNull
        /* renamed from: a, reason: from getter */
        public String getF33117b() {
            return this.f33114b;
        }
    }

    /* compiled from: Variable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/data/Variable$UrlVariable;", "Lcom/yandex/div/data/Variable;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class UrlVariable extends Variable {

        /* renamed from: b */
        @NotNull
        public final String f33117b;

        /* renamed from: c */
        @NotNull
        public final Uri f33118c;

        /* renamed from: d */
        @NotNull
        public Uri f33119d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UrlVariable(@NotNull String name, @NotNull Uri defaultValue) {
            super(null);
            Intrinsics.m32179h(name, "name");
            Intrinsics.m32179h(defaultValue, "defaultValue");
            this.f33117b = name;
            this.f33118c = defaultValue;
            this.f33119d = defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        @NotNull
        /* renamed from: a, reason: from getter */
        public String getF33117b() {
            return this.f33117b;
        }
    }

    public Variable() {
    }

    @NotNull
    /* renamed from: a */
    public abstract String getF33117b();

    @NotNull
    /* renamed from: b */
    public Object m17210b() {
        if (this instanceof StringVariable) {
            return ((StringVariable) this).f33116d;
        }
        if (this instanceof IntegerVariable) {
            return Long.valueOf(((IntegerVariable) this).f33113d);
        }
        if (this instanceof BooleanVariable) {
            return Boolean.valueOf(((BooleanVariable) this).f33101d);
        }
        if (this instanceof DoubleVariable) {
            return Double.valueOf(((DoubleVariable) this).f33110d);
        }
        if (this instanceof ColorVariable) {
            return new Color(((ColorVariable) this).f33104d);
        }
        if (this instanceof UrlVariable) {
            return ((UrlVariable) this).f33119d;
        }
        if (this instanceof DictVariable) {
            return ((DictVariable) this).f33107d;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: c */
    public void m17211c(@NotNull Variable variable) {
        Assert.m17298b();
        Iterator<Function1<Variable, Unit>> it = this.f33098a.iterator();
        while (it.hasNext()) {
            it.next().invoke(variable);
        }
    }

    @MainThread
    /* renamed from: d */
    public void m17212d(@NotNull String newValue) throws VariableMutationException {
        Intrinsics.m32179h(newValue, "newValue");
        if (this instanceof StringVariable) {
            StringVariable stringVariable = (StringVariable) this;
            if (Intrinsics.m32174c(stringVariable.f33116d, newValue)) {
                return;
            }
            stringVariable.f33116d = newValue;
            stringVariable.m17211c(stringVariable);
            return;
        }
        if (this instanceof IntegerVariable) {
            IntegerVariable integerVariable = (IntegerVariable) this;
            try {
                long parseLong = Long.parseLong(newValue);
                if (integerVariable.f33113d == parseLong) {
                    return;
                }
                integerVariable.f33113d = parseLong;
                integerVariable.m17211c(integerVariable);
                return;
            } catch (NumberFormatException e2) {
                throw new VariableMutationException(null, e2, 1);
            }
        }
        if (this instanceof BooleanVariable) {
            BooleanVariable booleanVariable = (BooleanVariable) this;
            try {
                Boolean bool = Intrinsics.m32174c(newValue, "true") ? Boolean.TRUE : Intrinsics.m32174c(newValue, "false") ? Boolean.FALSE : null;
                if (bool == null) {
                    try {
                        int parseInt = Integer.parseInt(newValue);
                        Function1<Object, Integer> function1 = ParsingConvertersKt.f33827a;
                        if (parseInt == 0) {
                            r1 = false;
                        } else if (parseInt != 1) {
                            throw new IllegalArgumentException("Unable to convert " + parseInt + " to boolean");
                        }
                    } catch (NumberFormatException e3) {
                        throw new VariableMutationException(null, e3, 1);
                    }
                } else {
                    r1 = bool.booleanValue();
                }
                if (booleanVariable.f33101d == r1) {
                    return;
                }
                booleanVariable.f33101d = r1;
                booleanVariable.m17211c(booleanVariable);
                return;
            } catch (IllegalArgumentException e4) {
                throw new VariableMutationException(null, e4, 1);
            }
        }
        if (this instanceof DoubleVariable) {
            try {
                ((DoubleVariable) this).m17213e(Double.parseDouble(newValue));
                return;
            } catch (NumberFormatException e5) {
                throw new VariableMutationException(null, e5, 1);
            }
        }
        if (this instanceof ColorVariable) {
            Integer invoke = ParsingConvertersKt.f33827a.invoke(newValue);
            if (invoke == null) {
                throw new VariableMutationException(C0000a.m15l("Wrong value format for color variable: '", newValue, '\''), null, 2);
            }
            int intValue = invoke.intValue();
            ColorVariable colorVariable = (ColorVariable) this;
            if (colorVariable.f33104d == intValue) {
                return;
            }
            colorVariable.f33104d = intValue;
            colorVariable.m17211c(colorVariable);
            return;
        }
        if (this instanceof UrlVariable) {
            UrlVariable urlVariable = (UrlVariable) this;
            try {
                Uri parse = Uri.parse(newValue);
                Intrinsics.m32178g(parse, "{\n            Uri.parse(this)\n        }");
                if (Intrinsics.m32174c(urlVariable.f33119d, parse)) {
                    return;
                }
                urlVariable.f33119d = parse;
                urlVariable.m17211c(urlVariable);
                return;
            } catch (IllegalArgumentException e6) {
                throw new VariableMutationException(null, e6, 1);
            }
        }
        if (!(this instanceof DictVariable)) {
            throw new NoWhenBranchMatchedException();
        }
        DictVariable dictVariable = (DictVariable) this;
        try {
            JSONObject jSONObject = new JSONObject(newValue);
            if (Intrinsics.m32174c(dictVariable.f33107d, jSONObject)) {
                return;
            }
            dictVariable.f33107d = jSONObject;
            dictVariable.m17211c(dictVariable);
        } catch (JSONException e7) {
            throw new VariableMutationException(null, e7, 1);
        }
    }

    public Variable(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
