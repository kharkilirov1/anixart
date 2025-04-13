package com.yandex.div.evaluable.internal;

import androidx.room.util.C0576a;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.internal.Token;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: Parser.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Parser;", "", "ParsingState", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class Parser {

    /* renamed from: a */
    @NotNull
    public static final Parser f33600a = new Parser();

    /* compiled from: Parser.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Parser$ParsingState;", "", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final /* data */ class ParsingState {

        /* renamed from: a */
        @NotNull
        public final List<Token> f33601a;

        /* renamed from: b */
        @NotNull
        public final String f33602b;

        /* renamed from: c */
        public int f33603c;

        /* JADX WARN: Multi-variable type inference failed */
        public ParsingState(@NotNull List<? extends Token> list, @NotNull String str) {
            this.f33601a = list;
            this.f33602b = str;
        }

        @NotNull
        /* renamed from: a */
        public final Token m17252a() {
            return this.f33601a.get(this.f33603c);
        }

        /* renamed from: b */
        public final int m17253b() {
            int i2 = this.f33603c;
            this.f33603c = i2 + 1;
            return i2;
        }

        /* renamed from: c */
        public final boolean m17254c() {
            return !(this.f33603c >= this.f33601a.size());
        }

        @NotNull
        /* renamed from: d */
        public final Token m17255d() {
            return this.f33601a.get(m17253b());
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ParsingState)) {
                return false;
            }
            ParsingState parsingState = (ParsingState) obj;
            return Intrinsics.m32174c(this.f33601a, parsingState.f33601a) && Intrinsics.m32174c(this.f33602b, parsingState.f33602b);
        }

        public int hashCode() {
            return this.f33602b.hashCode() + (this.f33601a.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder m24u = C0000a.m24u("ParsingState(tokens=");
            m24u.append(this.f33601a);
            m24u.append(", rawExpr=");
            return C0576a.m4118q(m24u, this.f33602b, ')');
        }
    }

    /* renamed from: a */
    public final Evaluable m17244a(ParsingState parsingState) {
        Evaluable m17246c = m17246c(parsingState);
        while (parsingState.m17254c() && (parsingState.m17252a() instanceof Token.Operator.Binary.Logical.And)) {
            parsingState.m17253b();
            m17246c = new Evaluable.Binary(Token.Operator.Binary.Logical.And.f33621a, m17246c, m17246c(parsingState), parsingState.f33602b);
        }
        return m17246c;
    }

    /* renamed from: b */
    public final Evaluable m17245b(ParsingState parsingState) {
        Evaluable m17250g = m17250g(parsingState);
        while (parsingState.m17254c() && (parsingState.m17252a() instanceof Token.Operator.Binary.Comparison)) {
            m17250g = new Evaluable.Binary((Token.Operator.Binary) parsingState.m17255d(), m17250g, m17250g(parsingState), parsingState.f33602b);
        }
        return m17250g;
    }

    /* renamed from: c */
    public final Evaluable m17246c(ParsingState parsingState) {
        Evaluable m17245b = m17245b(parsingState);
        while (parsingState.m17254c() && (parsingState.m17252a() instanceof Token.Operator.Binary.Equality)) {
            m17245b = new Evaluable.Binary((Token.Operator.Binary) parsingState.m17255d(), m17245b, m17245b(parsingState), parsingState.f33602b);
        }
        return m17245b;
    }

    /* renamed from: d */
    public final Evaluable m17247d(ParsingState parsingState) {
        Evaluable m17244a = m17244a(parsingState);
        while (parsingState.m17254c() && (parsingState.m17252a() instanceof Token.Operator.Binary.Logical.C2893Or)) {
            parsingState.m17253b();
            m17244a = new Evaluable.Binary(Token.Operator.Binary.Logical.C2893Or.f33622a, m17244a, m17244a(parsingState), parsingState.f33602b);
        }
        if (!parsingState.m17254c() || !(parsingState.m17252a() instanceof Token.Operator.TernaryIf)) {
            return m17244a;
        }
        parsingState.m17253b();
        Evaluable m17247d = m17247d(parsingState);
        if (!(parsingState.m17252a() instanceof Token.Operator.TernaryElse)) {
            throw new EvaluableException("':' expected in ternary-if-else expression", null);
        }
        parsingState.m17253b();
        return new Evaluable.Ternary(Token.Operator.TernaryIfElse.f33628a, m17244a, m17247d, m17247d(parsingState), parsingState.f33602b);
    }

    /* renamed from: e */
    public final Evaluable m17248e(ParsingState parsingState) {
        Evaluable m17251h = m17251h(parsingState);
        while (parsingState.m17254c() && (parsingState.m17252a() instanceof Token.Operator.Binary.Factor)) {
            m17251h = new Evaluable.Binary((Token.Operator.Binary) parsingState.m17255d(), m17251h, m17251h(parsingState), parsingState.f33602b);
        }
        return m17251h;
    }

    @NotNull
    /* renamed from: f */
    public final Evaluable m17249f(@NotNull List<? extends Token> tokens, @NotNull String rawExpression) {
        Intrinsics.m32179h(tokens, "tokens");
        Intrinsics.m32179h(rawExpression, "rawExpression");
        if (tokens.isEmpty()) {
            throw new EvaluableException("Expression expected", null);
        }
        ParsingState parsingState = new ParsingState(tokens, rawExpression);
        Evaluable m17247d = m17247d(parsingState);
        if (parsingState.m17254c()) {
            throw new EvaluableException("Expression expected", null);
        }
        return m17247d;
    }

    /* renamed from: g */
    public final Evaluable m17250g(ParsingState parsingState) {
        Evaluable m17248e = m17248e(parsingState);
        while (parsingState.m17254c() && (parsingState.m17252a() instanceof Token.Operator.Binary.Sum)) {
            m17248e = new Evaluable.Binary((Token.Operator.Binary) parsingState.m17255d(), m17248e, m17248e(parsingState), parsingState.f33602b);
        }
        return m17248e;
    }

    /* renamed from: h */
    public final Evaluable m17251h(ParsingState parsingState) {
        Evaluable stringTemplate;
        if (parsingState.m17254c() && (parsingState.m17252a() instanceof Token.Operator.Unary)) {
            return new Evaluable.Unary((Token.Operator) parsingState.m17255d(), m17251h(parsingState), parsingState.f33602b);
        }
        if (parsingState.f33603c >= parsingState.f33601a.size()) {
            throw new EvaluableException("Expression expected", null);
        }
        Token m17255d = parsingState.m17255d();
        if (m17255d instanceof Token.Operand.Literal) {
            stringTemplate = new Evaluable.Value((Token.Operand.Literal) m17255d, parsingState.f33602b);
        } else if (m17255d instanceof Token.Operand.Variable) {
            stringTemplate = new Evaluable.Variable(((Token.Operand.Variable) m17255d).f33611a, parsingState.f33602b, null);
        } else if (m17255d instanceof Token.Function) {
            if (!(parsingState.m17255d() instanceof Token.Bracket.LeftRound)) {
                throw new EvaluableException("'(' expected after function call", null);
            }
            ArrayList arrayList = new ArrayList();
            while (!(parsingState.m17252a() instanceof Token.Bracket.RightRound)) {
                arrayList.add(m17247d(parsingState));
                if (parsingState.m17252a() instanceof Token.Function.ArgumentDelimiter) {
                    parsingState.m17253b();
                }
            }
            if (!(parsingState.m17255d() instanceof Token.Bracket.RightRound)) {
                throw new EvaluableException("expected ')' after a function call", null);
            }
            stringTemplate = new Evaluable.FunctionCall((Token.Function) m17255d, arrayList, parsingState.f33602b);
        } else if (m17255d instanceof Token.Bracket.LeftRound) {
            stringTemplate = m17247d(parsingState);
            if (!(parsingState.m17255d() instanceof Token.Bracket.RightRound)) {
                throw new EvaluableException("')' expected after expression", null);
            }
        } else {
            if (!(m17255d instanceof Token.StringTemplate.Start)) {
                throw new EvaluableException("Expression expected", null);
            }
            ArrayList arrayList2 = new ArrayList();
            while (parsingState.m17254c() && !(parsingState.m17252a() instanceof Token.StringTemplate.End)) {
                if ((parsingState.m17252a() instanceof Token.StringTemplate.StartOfExpression) || (parsingState.m17252a() instanceof Token.StringTemplate.EndOfExpression)) {
                    parsingState.m17253b();
                } else {
                    arrayList2.add(m17247d(parsingState));
                }
            }
            if (!(parsingState.m17255d() instanceof Token.StringTemplate.End)) {
                throw new EvaluableException("expected ''' at end of a string template", null);
            }
            stringTemplate = new Evaluable.StringTemplate(arrayList2, parsingState.f33602b);
        }
        if (!parsingState.m17254c() || !(parsingState.m17252a() instanceof Token.Operator.Binary.Power)) {
            return stringTemplate;
        }
        parsingState.m17253b();
        return new Evaluable.Binary(Token.Operator.Binary.Power.f33623a, stringTemplate, m17251h(parsingState), parsingState.f33602b);
    }
}
