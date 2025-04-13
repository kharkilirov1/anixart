package com.yandex.div.evaluable;

import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.DateTime;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: Function.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/evaluable/Function;", "", "Companion", "MatchResult", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class Function {

    /* renamed from: b */
    @JvmField
    @NotNull
    public static final Function f33168b = new Function() { // from class: com.yandex.div.evaluable.Function$Companion$STUB$1
        @Override // com.yandex.div.evaluable.Function
        @NotNull
        /* renamed from: a */
        public Object mo17230a(@NotNull List<? extends Object> args) {
            Intrinsics.m32179h(args, "args");
            return Boolean.TRUE;
        }

        @Override // com.yandex.div.evaluable.Function
        @NotNull
        /* renamed from: b */
        public List<FunctionArgument> mo17231b() {
            return EmptyList.f63144b;
        }

        @Override // com.yandex.div.evaluable.Function
        @NotNull
        /* renamed from: c */
        public String mo17232c() {
            return "stub";
        }

        @Override // com.yandex.div.evaluable.Function
        @NotNull
        /* renamed from: d */
        public EvaluableType getF33212e() {
            return EvaluableType.BOOLEAN;
        }

        @Override // com.yandex.div.evaluable.Function
        /* renamed from: f */
        public boolean getF33213f() {
            return true;
        }
    };

    /* renamed from: a */
    @Nullable
    public final VariableProvider f33169a;

    /* compiled from: Function.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div/evaluable/Function$Companion;", "", "Lcom/yandex/div/evaluable/Function;", "STUB", "Lcom/yandex/div/evaluable/Function;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    /* compiled from: Function.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m31884d2 = {"Lcom/yandex/div/evaluable/Function$MatchResult;", "", "ArgTypeMismatch", "Ok", "TooFewArguments", "TooManyArguments", "Lcom/yandex/div/evaluable/Function$MatchResult$Ok;", "Lcom/yandex/div/evaluable/Function$MatchResult$TooFewArguments;", "Lcom/yandex/div/evaluable/Function$MatchResult$TooManyArguments;", "Lcom/yandex/div/evaluable/Function$MatchResult$ArgTypeMismatch;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static abstract class MatchResult {

        /* compiled from: Function.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/Function$MatchResult$ArgTypeMismatch;", "Lcom/yandex/div/evaluable/Function$MatchResult;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class ArgTypeMismatch extends MatchResult {

            /* renamed from: a */
            @NotNull
            public final EvaluableType f33170a;

            /* renamed from: b */
            @NotNull
            public final EvaluableType f33171b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ArgTypeMismatch(@NotNull EvaluableType expected, @NotNull EvaluableType actual) {
                super(null);
                Intrinsics.m32179h(expected, "expected");
                Intrinsics.m32179h(actual, "actual");
                this.f33170a = expected;
                this.f33171b = actual;
            }
        }

        /* compiled from: Function.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/Function$MatchResult$Ok;", "Lcom/yandex/div/evaluable/Function$MatchResult;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
        /* renamed from: com.yandex.div.evaluable.Function$MatchResult$Ok */
        public static final class C2884Ok extends MatchResult {

            /* renamed from: a */
            @NotNull
            public static final C2884Ok f33172a = new C2884Ok();

            public C2884Ok() {
                super(null);
            }
        }

        /* compiled from: Function.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/Function$MatchResult$TooFewArguments;", "Lcom/yandex/div/evaluable/Function$MatchResult;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class TooFewArguments extends MatchResult {

            /* renamed from: a */
            public final int f33173a;

            /* renamed from: b */
            public final int f33174b;

            public TooFewArguments(int i2, int i3) {
                super(null);
                this.f33173a = i2;
                this.f33174b = i3;
            }
        }

        /* compiled from: Function.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/Function$MatchResult$TooManyArguments;", "Lcom/yandex/div/evaluable/Function$MatchResult;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class TooManyArguments extends MatchResult {

            /* renamed from: a */
            public final int f33175a;

            /* renamed from: b */
            public final int f33176b;

            public TooManyArguments(int i2, int i3) {
                super(null);
                this.f33175a = i2;
                this.f33176b = i3;
            }
        }

        public MatchResult() {
        }

        public MatchResult(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public Function() {
        this(null, 1);
    }

    public Function(@Nullable VariableProvider variableProvider) {
        this.f33169a = variableProvider;
    }

    @NotNull
    /* renamed from: a */
    public abstract Object mo17230a(@NotNull List<? extends Object> list);

    @NotNull
    /* renamed from: b */
    public abstract List<FunctionArgument> mo17231b();

    @NotNull
    /* renamed from: c */
    public abstract String mo17232c();

    @NotNull
    /* renamed from: d */
    public abstract EvaluableType getF33212e();

    @NotNull
    /* renamed from: e */
    public final Object m17234e(@NotNull List<? extends Object> list) {
        EvaluableType evaluableType;
        EvaluableType evaluableType2 = EvaluableType.COLOR;
        EvaluableType evaluableType3 = EvaluableType.DATETIME;
        EvaluableType evaluableType4 = EvaluableType.STRING;
        EvaluableType evaluableType5 = EvaluableType.BOOLEAN;
        EvaluableType evaluableType6 = EvaluableType.NUMBER;
        EvaluableType evaluableType7 = EvaluableType.INTEGER;
        Object mo17230a = mo17230a(list);
        boolean z = mo17230a instanceof Long;
        if (z) {
            evaluableType = evaluableType7;
        } else if (mo17230a instanceof Double) {
            evaluableType = evaluableType6;
        } else if (mo17230a instanceof Boolean) {
            evaluableType = evaluableType5;
        } else if (mo17230a instanceof String) {
            evaluableType = evaluableType4;
        } else if (mo17230a instanceof DateTime) {
            evaluableType = evaluableType3;
        } else {
            if (!(mo17230a instanceof Color)) {
                if (mo17230a == null) {
                    throw new EvaluableException("Unable to find type for null", null);
                }
                throw new EvaluableException(Intrinsics.m32187p("Unable to find type for ", mo17230a.getClass().getName()), null);
            }
            evaluableType = evaluableType2;
        }
        if (evaluableType == getF33212e()) {
            return mo17230a;
        }
        StringBuilder m24u = C0000a.m24u("Function returned ");
        if (z) {
            evaluableType2 = evaluableType7;
        } else if (mo17230a instanceof Double) {
            evaluableType2 = evaluableType6;
        } else if (mo17230a instanceof Boolean) {
            evaluableType2 = evaluableType5;
        } else if (mo17230a instanceof String) {
            evaluableType2 = evaluableType4;
        } else if (mo17230a instanceof DateTime) {
            evaluableType2 = evaluableType3;
        } else if (!(mo17230a instanceof Color)) {
            if (mo17230a == null) {
                throw new EvaluableException("Unable to find type for null", null);
            }
            throw new EvaluableException(Intrinsics.m32187p("Unable to find type for ", mo17230a.getClass().getName()), null);
        }
        m24u.append(evaluableType2);
        m24u.append(", but  ");
        m24u.append(getF33212e());
        m24u.append(" was expected");
        throw new EvaluableException(m24u.toString(), null);
    }

    /* renamed from: f */
    public abstract boolean getF33213f();

    @NotNull
    /* renamed from: g */
    public final MatchResult m17236g(@NotNull List<? extends EvaluableType> list) {
        int size;
        int size2;
        int i2 = 0;
        if (mo17231b().isEmpty()) {
            size2 = 0;
            size = 0;
        } else {
            boolean z = ((FunctionArgument) CollectionsKt.m31991D(mo17231b())).f33179b;
            size = mo17231b().size();
            if (z) {
                size--;
            }
            size2 = z ? Integer.MAX_VALUE : mo17231b().size();
        }
        if (list.size() < size) {
            return new MatchResult.TooFewArguments(size, list.size());
        }
        if (list.size() > size2) {
            return new MatchResult.TooManyArguments(size2, list.size());
        }
        int size3 = list.size();
        while (i2 < size3) {
            int i3 = i2 + 1;
            List<FunctionArgument> mo17231b = mo17231b();
            int m32047x = CollectionsKt.m32047x(mo17231b());
            if (i2 <= m32047x) {
                m32047x = i2;
            }
            FunctionArgument functionArgument = mo17231b.get(m32047x);
            EvaluableType evaluableType = list.get(i2);
            EvaluableType evaluableType2 = functionArgument.f33178a;
            if (evaluableType != evaluableType2) {
                return new MatchResult.ArgTypeMismatch(evaluableType2, list.get(i2));
            }
            i2 = i3;
        }
        return MatchResult.C2884Ok.f33172a;
    }

    @NotNull
    public String toString() {
        return CollectionsKt.m31989B(mo17231b(), null, Intrinsics.m32187p(mo17232c(), "("), ")", 0, null, new Function1<FunctionArgument, CharSequence>() { // from class: com.yandex.div.evaluable.Function$toString$1
            @Override // kotlin.jvm.functions.Function1
            public CharSequence invoke(FunctionArgument functionArgument) {
                FunctionArgument arg = functionArgument;
                Intrinsics.m32179h(arg, "arg");
                return arg.f33179b ? Intrinsics.m32187p("vararg ", arg.f33178a) : arg.f33178a.f33162b;
            }
        }, 25, null);
    }

    public Function(VariableProvider variableProvider, int i2) {
        this.f33169a = null;
    }
}
