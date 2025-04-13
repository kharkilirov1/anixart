package com.yandex.div.evaluable;

import androidx.emoji2.text.flatbuffer.C0321a;
import androidx.room.util.C0576a;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.internal.Parser;
import com.yandex.div.evaluable.internal.Token;
import com.yandex.div.evaluable.internal.Tokenizer;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.DateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Evaluable.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b&\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, m31884d2 = {"Lcom/yandex/div/evaluable/Evaluable;", "", "Binary", "Companion", "FunctionCall", "Lazy", "StringTemplate", "Ternary", "Unary", "Value", "Variable", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class Evaluable {

    /* renamed from: a */
    @NotNull
    public final String f33120a;

    /* renamed from: b */
    public boolean f33121b;

    /* compiled from: Evaluable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/Evaluable$Binary;", "Lcom/yandex/div/evaluable/Evaluable;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final /* data */ class Binary extends Evaluable {

        /* renamed from: c */
        @NotNull
        public final Token.Operator.Binary f33122c;

        /* renamed from: d */
        @NotNull
        public final Evaluable f33123d;

        /* renamed from: e */
        @NotNull
        public final Evaluable f33124e;

        /* renamed from: f */
        @NotNull
        public final String f33125f;

        /* renamed from: g */
        @NotNull
        public final List<String> f33126g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Binary(@NotNull Token.Operator.Binary token, @NotNull Evaluable left, @NotNull Evaluable right, @NotNull String rawExpression) {
            super(rawExpression);
            Intrinsics.m32179h(token, "token");
            Intrinsics.m32179h(left, "left");
            Intrinsics.m32179h(right, "right");
            Intrinsics.m32179h(rawExpression, "rawExpression");
            this.f33122c = token;
            this.f33123d = left;
            this.f33124e = right;
            this.f33125f = rawExpression;
            this.f33126g = CollectionsKt.m32002O(left.mo17216c(), right.mo17216c());
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        /* renamed from: b */
        public Object mo17215b(@NotNull final Evaluator evaluator) {
            Object m17227b;
            Object m17226a = evaluator.m17226a(this.f33123d);
            m17217d(this.f33123d.f33121b);
            Token.Operator.Binary binary = this.f33122c;
            boolean z = true;
            if (binary instanceof Token.Operator.Binary.Logical) {
                Token.Operator.Binary.Logical logical = (Token.Operator.Binary.Logical) binary;
                Function0<Object> function0 = new Function0<Object>() { // from class: com.yandex.div.evaluable.Evaluator$evalBinary$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Object invoke() {
                        Object m17226a2 = Evaluator.this.m17226a(this.f33124e);
                        Evaluable.Binary binary2 = this;
                        binary2.m17217d(binary2.f33124e.f33121b);
                        return m17226a2;
                    }
                };
                if (!(m17226a instanceof Boolean)) {
                    EvaluableExceptionKt.m17220c(m17226a + ' ' + logical + " ...", '\'' + logical + "' must be called with boolean operands.", null);
                    throw null;
                }
                boolean z2 = logical instanceof Token.Operator.Binary.Logical.C2893Or;
                if (z2 && ((Boolean) m17226a).booleanValue()) {
                    return m17226a;
                }
                if ((logical instanceof Token.Operator.Binary.Logical.And) && !((Boolean) m17226a).booleanValue()) {
                    return m17226a;
                }
                Object invoke = function0.invoke();
                if (!(invoke instanceof Boolean)) {
                    EvaluableExceptionKt.m17219b(logical, m17226a, invoke);
                    throw null;
                }
                if (!z2 ? !((Boolean) m17226a).booleanValue() || !((Boolean) invoke).booleanValue() : !((Boolean) m17226a).booleanValue() && !((Boolean) invoke).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            Object m17226a2 = evaluator.m17226a(this.f33124e);
            m17217d(this.f33124e.f33121b);
            if (!Intrinsics.m32174c(m17226a.getClass(), m17226a2.getClass())) {
                EvaluableExceptionKt.m17219b(this.f33122c, m17226a, m17226a2);
                throw null;
            }
            Token.Operator.Binary binary2 = this.f33122c;
            if (binary2 instanceof Token.Operator.Binary.Equality) {
                Token.Operator.Binary.Equality equality = (Token.Operator.Binary.Equality) binary2;
                if (equality instanceof Token.Operator.Binary.Equality.Equal) {
                    z = Intrinsics.m32174c(m17226a, m17226a2);
                } else {
                    if (!(equality instanceof Token.Operator.Binary.Equality.NotEqual)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (Intrinsics.m32174c(m17226a, m17226a2)) {
                        z = false;
                    }
                }
                m17227b = Boolean.valueOf(z);
            } else if (binary2 instanceof Token.Operator.Binary.Sum) {
                m17227b = Evaluator.f33163c.m17229b((Token.Operator.Binary.Sum) binary2, m17226a, m17226a2);
            } else if (binary2 instanceof Token.Operator.Binary.Factor) {
                m17227b = Evaluator.f33163c.m17228a((Token.Operator.Binary.Factor) binary2, m17226a, m17226a2);
            } else {
                if (!(binary2 instanceof Token.Operator.Binary.Comparison)) {
                    EvaluableExceptionKt.m17219b(binary2, m17226a, m17226a2);
                    throw null;
                }
                Token.Operator.Binary.Comparison comparison = (Token.Operator.Binary.Comparison) binary2;
                if ((m17226a instanceof Double) && (m17226a2 instanceof Double)) {
                    m17227b = evaluator.m17227b(comparison, (Comparable) m17226a, (Comparable) m17226a2);
                } else if ((m17226a instanceof Long) && (m17226a2 instanceof Long)) {
                    m17227b = evaluator.m17227b(comparison, (Comparable) m17226a, (Comparable) m17226a2);
                } else {
                    if (!(m17226a instanceof DateTime) || !(m17226a2 instanceof DateTime)) {
                        EvaluableExceptionKt.m17219b(comparison, m17226a, m17226a2);
                        throw null;
                    }
                    m17227b = evaluator.m17227b(comparison, (Comparable) m17226a, (Comparable) m17226a2);
                }
            }
            return m17227b;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        /* renamed from: c */
        public List<String> mo17216c() {
            return this.f33126g;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Binary)) {
                return false;
            }
            Binary binary = (Binary) obj;
            return Intrinsics.m32174c(this.f33122c, binary.f33122c) && Intrinsics.m32174c(this.f33123d, binary.f33123d) && Intrinsics.m32174c(this.f33124e, binary.f33124e) && Intrinsics.m32174c(this.f33125f, binary.f33125f);
        }

        public int hashCode() {
            return this.f33125f.hashCode() + ((this.f33124e.hashCode() + ((this.f33123d.hashCode() + (this.f33122c.hashCode() * 31)) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder m2872a = C0321a.m2872a('(');
            m2872a.append(this.f33123d);
            m2872a.append(' ');
            m2872a.append(this.f33122c);
            m2872a.append(' ');
            m2872a.append(this.f33124e);
            m2872a.append(')');
            return m2872a.toString();
        }
    }

    /* compiled from: Evaluable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/Evaluable$Companion;", "", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    /* compiled from: Evaluable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/Evaluable$FunctionCall;", "Lcom/yandex/div/evaluable/Evaluable;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final /* data */ class FunctionCall extends Evaluable {

        /* renamed from: c */
        @NotNull
        public final Token.Function f33127c;

        /* renamed from: d */
        @NotNull
        public final List<Evaluable> f33128d;

        /* renamed from: e */
        @NotNull
        public final String f33129e;

        /* renamed from: f */
        @NotNull
        public final List<String> f33130f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FunctionCall(@NotNull Token.Function token, @NotNull List<? extends Evaluable> list, @NotNull String rawExpression) {
            super(rawExpression);
            Object obj;
            Intrinsics.m32179h(token, "token");
            Intrinsics.m32179h(rawExpression, "rawExpression");
            this.f33127c = token;
            this.f33128d = list;
            this.f33129e = rawExpression;
            ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Evaluable) it.next()).mo17216c());
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                while (it2.hasNext()) {
                    next = CollectionsKt.m32002O((List) next, (List) it2.next());
                }
                obj = next;
            } else {
                obj = null;
            }
            List<String> list2 = (List) obj;
            this.f33130f = list2 == null ? EmptyList.f63144b : list2;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        /* renamed from: b */
        public Object mo17215b(@NotNull Evaluator evaluator) {
            EvaluableType evaluableType;
            ArrayList arrayList = new ArrayList();
            for (Evaluable evaluable : this.f33128d) {
                arrayList.add(evaluator.m17226a(evaluable));
                m17217d(evaluable.f33121b);
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof Long) {
                    evaluableType = EvaluableType.INTEGER;
                } else if (next instanceof Double) {
                    evaluableType = EvaluableType.NUMBER;
                } else if (next instanceof Boolean) {
                    evaluableType = EvaluableType.BOOLEAN;
                } else if (next instanceof String) {
                    evaluableType = EvaluableType.STRING;
                } else if (next instanceof DateTime) {
                    evaluableType = EvaluableType.DATETIME;
                } else {
                    if (!(next instanceof Color)) {
                        if (next == null) {
                            throw new EvaluableException("Unable to find type for null", null);
                        }
                        throw new EvaluableException(Intrinsics.m32187p("Unable to find type for ", next.getClass().getName()), null);
                    }
                    evaluableType = EvaluableType.COLOR;
                }
                arrayList2.add(evaluableType);
            }
            try {
                Function mo17237a = evaluator.f33165b.mo17237a(this.f33127c.f33606a, arrayList2);
                m17217d(mo17237a.getF33249f());
                try {
                    return mo17237a.m17234e(arrayList);
                } catch (IntegerOverflow unused) {
                    throw new IntegerOverflow(EvaluableExceptionKt.m17218a(mo17237a.mo17232c(), arrayList), null, 2);
                }
            } catch (EvaluableException e2) {
                String str = this.f33127c.f33606a;
                String message = e2.getMessage();
                if (message == null) {
                    message = "";
                }
                EvaluableExceptionKt.m17222e(str, arrayList, message, null);
                throw null;
            }
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        /* renamed from: c */
        public List<String> mo17216c() {
            return this.f33130f;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FunctionCall)) {
                return false;
            }
            FunctionCall functionCall = (FunctionCall) obj;
            return Intrinsics.m32174c(this.f33127c, functionCall.f33127c) && Intrinsics.m32174c(this.f33128d, functionCall.f33128d) && Intrinsics.m32174c(this.f33129e, functionCall.f33129e);
        }

        public int hashCode() {
            return this.f33129e.hashCode() + ((this.f33128d.hashCode() + (this.f33127c.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return this.f33127c.f33606a + '(' + CollectionsKt.m31989B(this.f33128d, ",", null, null, 0, null, null, 62, null) + ')';
        }
    }

    /* compiled from: Evaluable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/Evaluable$Lazy;", "Lcom/yandex/div/evaluable/Evaluable;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Lazy extends Evaluable {

        /* renamed from: c */
        @NotNull
        public final String f33131c;

        /* renamed from: d */
        @NotNull
        public final List<Token> f33132d;

        /* renamed from: e */
        public Evaluable f33133e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Lazy(@NotNull String expr) {
            super(expr);
            Intrinsics.m32179h(expr, "expr");
            this.f33131c = expr;
            this.f33132d = Tokenizer.f33636a.m17266k(expr);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        /* renamed from: b */
        public Object mo17215b(@NotNull Evaluator evaluator) {
            if (this.f33133e == null) {
                this.f33133e = Parser.f33600a.m17249f(this.f33132d, this.f33120a);
            }
            Evaluable evaluable = this.f33133e;
            if (evaluable == null) {
                Intrinsics.m32189r("expression");
                throw null;
            }
            Object mo17215b = evaluable.mo17215b(evaluator);
            Evaluable evaluable2 = this.f33133e;
            if (evaluable2 != null) {
                m17217d(evaluable2.f33121b);
                return mo17215b;
            }
            Intrinsics.m32189r("expression");
            throw null;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        /* renamed from: c */
        public List<String> mo17216c() {
            Evaluable evaluable = this.f33133e;
            if (evaluable != null) {
                if (evaluable != null) {
                    return evaluable.mo17216c();
                }
                Intrinsics.m32189r("expression");
                throw null;
            }
            List<Token> list = this.f33132d;
            Intrinsics.m32179h(list, "<this>");
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (Token.Operand.Variable.class.isInstance(obj)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Token.Operand.Variable) it.next()).f33611a);
            }
            return arrayList2;
        }

        @NotNull
        /* renamed from: toString, reason: from getter */
        public String getF33131c() {
            return this.f33131c;
        }
    }

    /* compiled from: Evaluable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/Evaluable$StringTemplate;", "Lcom/yandex/div/evaluable/Evaluable;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final /* data */ class StringTemplate extends Evaluable {

        /* renamed from: c */
        @NotNull
        public final List<Evaluable> f33134c;

        /* renamed from: d */
        @NotNull
        public final String f33135d;

        /* renamed from: e */
        @NotNull
        public final List<String> f33136e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public StringTemplate(@NotNull List<? extends Evaluable> list, @NotNull String rawExpression) {
            super(rawExpression);
            Intrinsics.m32179h(rawExpression, "rawExpression");
            this.f33134c = list;
            this.f33135d = rawExpression;
            ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Evaluable) it.next()).mo17216c());
            }
            Iterator it2 = arrayList.iterator();
            if (!it2.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it2.next();
            while (it2.hasNext()) {
                next = CollectionsKt.m32002O((List) next, (List) it2.next());
            }
            this.f33136e = (List) next;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        /* renamed from: b */
        public Object mo17215b(@NotNull Evaluator evaluator) {
            ArrayList arrayList = new ArrayList();
            for (Evaluable evaluable : this.f33134c) {
                arrayList.add(evaluator.m17226a(evaluable).toString());
                m17217d(evaluable.f33121b);
            }
            return CollectionsKt.m31989B(arrayList, "", null, null, 0, null, null, 62, null);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        /* renamed from: c */
        public List<String> mo17216c() {
            return this.f33136e;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StringTemplate)) {
                return false;
            }
            StringTemplate stringTemplate = (StringTemplate) obj;
            return Intrinsics.m32174c(this.f33134c, stringTemplate.f33134c) && Intrinsics.m32174c(this.f33135d, stringTemplate.f33135d);
        }

        public int hashCode() {
            return this.f33135d.hashCode() + (this.f33134c.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return CollectionsKt.m31989B(this.f33134c, "", null, null, 0, null, null, 62, null);
        }
    }

    /* compiled from: Evaluable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/Evaluable$Ternary;", "Lcom/yandex/div/evaluable/Evaluable;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final /* data */ class Ternary extends Evaluable {

        /* renamed from: c */
        @NotNull
        public final Token.Operator f33137c;

        /* renamed from: d */
        @NotNull
        public final Evaluable f33138d;

        /* renamed from: e */
        @NotNull
        public final Evaluable f33139e;

        /* renamed from: f */
        @NotNull
        public final Evaluable f33140f;

        /* renamed from: g */
        @NotNull
        public final String f33141g;

        /* renamed from: h */
        @NotNull
        public final List<String> f33142h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ternary(@NotNull Token.Operator operator, @NotNull Evaluable firstExpression, @NotNull Evaluable secondExpression, @NotNull Evaluable thirdExpression, @NotNull String rawExpression) {
            super(rawExpression);
            Intrinsics.m32179h(firstExpression, "firstExpression");
            Intrinsics.m32179h(secondExpression, "secondExpression");
            Intrinsics.m32179h(thirdExpression, "thirdExpression");
            Intrinsics.m32179h(rawExpression, "rawExpression");
            this.f33137c = operator;
            this.f33138d = firstExpression;
            this.f33139e = secondExpression;
            this.f33140f = thirdExpression;
            this.f33141g = rawExpression;
            this.f33142h = CollectionsKt.m32002O(CollectionsKt.m32002O(firstExpression.mo17216c(), secondExpression.mo17216c()), thirdExpression.mo17216c());
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        /* renamed from: b */
        public Object mo17215b(@NotNull Evaluator evaluator) {
            if (!(this.f33137c instanceof Token.Operator.TernaryIfElse)) {
                EvaluableExceptionKt.m17220c(this.f33120a, this.f33137c + " was incorrectly parsed as a ternary operator.", null);
                throw null;
            }
            Object m17226a = evaluator.m17226a(this.f33138d);
            m17217d(this.f33138d.f33121b);
            if (m17226a instanceof Boolean) {
                if (((Boolean) m17226a).booleanValue()) {
                    Object m17226a2 = evaluator.m17226a(this.f33139e);
                    m17217d(this.f33139e.f33121b);
                    return m17226a2;
                }
                Object m17226a3 = evaluator.m17226a(this.f33140f);
                m17217d(this.f33140f.f33121b);
                return m17226a3;
            }
            EvaluableExceptionKt.m17220c(this.f33138d + " ? " + this.f33139e + " : " + this.f33140f, "Ternary must be called with a Boolean value as a condition.", null);
            throw null;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        /* renamed from: c */
        public List<String> mo17216c() {
            return this.f33142h;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ternary)) {
                return false;
            }
            Ternary ternary = (Ternary) obj;
            return Intrinsics.m32174c(this.f33137c, ternary.f33137c) && Intrinsics.m32174c(this.f33138d, ternary.f33138d) && Intrinsics.m32174c(this.f33139e, ternary.f33139e) && Intrinsics.m32174c(this.f33140f, ternary.f33140f) && Intrinsics.m32174c(this.f33141g, ternary.f33141g);
        }

        public int hashCode() {
            return this.f33141g.hashCode() + ((this.f33140f.hashCode() + ((this.f33139e.hashCode() + ((this.f33138d.hashCode() + (this.f33137c.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            Token.Operator.TernaryIf ternaryIf = Token.Operator.TernaryIf.f33627a;
            Token.Operator.TernaryElse ternaryElse = Token.Operator.TernaryElse.f33626a;
            StringBuilder m2872a = C0321a.m2872a('(');
            m2872a.append(this.f33138d);
            m2872a.append(' ');
            m2872a.append(ternaryIf);
            m2872a.append(' ');
            m2872a.append(this.f33139e);
            m2872a.append(' ');
            m2872a.append(ternaryElse);
            m2872a.append(' ');
            m2872a.append(this.f33140f);
            m2872a.append(')');
            return m2872a.toString();
        }
    }

    /* compiled from: Evaluable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/Evaluable$Unary;", "Lcom/yandex/div/evaluable/Evaluable;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final /* data */ class Unary extends Evaluable {

        /* renamed from: c */
        @NotNull
        public final Token.Operator f33143c;

        /* renamed from: d */
        @NotNull
        public final Evaluable f33144d;

        /* renamed from: e */
        @NotNull
        public final String f33145e;

        /* renamed from: f */
        @NotNull
        public final List<String> f33146f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unary(@NotNull Token.Operator token, @NotNull Evaluable expression, @NotNull String rawExpression) {
            super(rawExpression);
            Intrinsics.m32179h(token, "token");
            Intrinsics.m32179h(expression, "expression");
            Intrinsics.m32179h(rawExpression, "rawExpression");
            this.f33143c = token;
            this.f33144d = expression;
            this.f33145e = rawExpression;
            this.f33146f = expression.mo17216c();
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        /* renamed from: b */
        public Object mo17215b(@NotNull Evaluator evaluator) {
            Object m17226a = evaluator.m17226a(this.f33144d);
            m17217d(this.f33144d.f33121b);
            Token.Operator operator = this.f33143c;
            if (operator instanceof Token.Operator.Unary.Plus) {
                if (m17226a instanceof Long) {
                    return Long.valueOf(((Number) m17226a).longValue());
                }
                if (m17226a instanceof Double) {
                    return Double.valueOf(((Number) m17226a).doubleValue());
                }
                EvaluableExceptionKt.m17220c(Intrinsics.m32187p("+", m17226a), "A Number is expected after a unary plus.", null);
                throw null;
            }
            if (operator instanceof Token.Operator.Unary.Minus) {
                if (m17226a instanceof Long) {
                    return Long.valueOf(-((Number) m17226a).longValue());
                }
                if (m17226a instanceof Double) {
                    return Double.valueOf(-((Number) m17226a).doubleValue());
                }
                EvaluableExceptionKt.m17220c(Intrinsics.m32187p("-", m17226a), "A Number is expected after a unary minus.", null);
                throw null;
            }
            if (Intrinsics.m32174c(operator, Token.Operator.Unary.Not.f33630a)) {
                if (m17226a instanceof Boolean) {
                    return Boolean.valueOf(!((Boolean) m17226a).booleanValue());
                }
                EvaluableExceptionKt.m17220c(Intrinsics.m32187p("!", m17226a), "A Boolean is expected after a unary not.", null);
                throw null;
            }
            throw new EvaluableException(this.f33143c + " was incorrectly parsed as a unary operator.", null);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        /* renamed from: c */
        public List<String> mo17216c() {
            return this.f33146f;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Unary)) {
                return false;
            }
            Unary unary = (Unary) obj;
            return Intrinsics.m32174c(this.f33143c, unary.f33143c) && Intrinsics.m32174c(this.f33144d, unary.f33144d) && Intrinsics.m32174c(this.f33145e, unary.f33145e);
        }

        public int hashCode() {
            return this.f33145e.hashCode() + ((this.f33144d.hashCode() + (this.f33143c.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f33143c);
            sb.append(this.f33144d);
            return sb.toString();
        }
    }

    /* compiled from: Evaluable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/Evaluable$Value;", "Lcom/yandex/div/evaluable/Evaluable;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final /* data */ class Value extends Evaluable {

        /* renamed from: c */
        @NotNull
        public final Token.Operand.Literal f33147c;

        /* renamed from: d */
        @NotNull
        public final String f33148d;

        /* renamed from: e */
        @NotNull
        public final List<String> f33149e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Value(@NotNull Token.Operand.Literal token, @NotNull String rawExpression) {
            super(rawExpression);
            Intrinsics.m32179h(token, "token");
            Intrinsics.m32179h(rawExpression, "rawExpression");
            this.f33147c = token;
            this.f33148d = rawExpression;
            this.f33149e = EmptyList.f63144b;
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        /* renamed from: b */
        public Object mo17215b(@NotNull Evaluator evaluator) {
            Token.Operand.Literal literal = this.f33147c;
            if (literal instanceof Token.Operand.Literal.Num) {
                return ((Token.Operand.Literal.Num) literal).value;
            }
            if (literal instanceof Token.Operand.Literal.Bool) {
                return Boolean.valueOf(((Token.Operand.Literal.Bool) literal).value);
            }
            if (literal instanceof Token.Operand.Literal.Str) {
                return ((Token.Operand.Literal.Str) literal).f33610a;
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        /* renamed from: c */
        public List<String> mo17216c() {
            return this.f33149e;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Value)) {
                return false;
            }
            Value value = (Value) obj;
            return Intrinsics.m32174c(this.f33147c, value.f33147c) && Intrinsics.m32174c(this.f33148d, value.f33148d);
        }

        public int hashCode() {
            return this.f33148d.hashCode() + (this.f33147c.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            Token.Operand.Literal literal = this.f33147c;
            if (literal instanceof Token.Operand.Literal.Str) {
                return C0576a.m4118q(C0321a.m2872a('\''), ((Token.Operand.Literal.Str) this.f33147c).f33610a, '\'');
            }
            if (literal instanceof Token.Operand.Literal.Num) {
                return ((Token.Operand.Literal.Num) literal).value.toString();
            }
            if (literal instanceof Token.Operand.Literal.Bool) {
                return String.valueOf(((Token.Operand.Literal.Bool) literal).value);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: Evaluable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/Evaluable$Variable;", "Lcom/yandex/div/evaluable/Evaluable;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final /* data */ class Variable extends Evaluable {

        /* renamed from: c */
        @NotNull
        public final String f33150c;

        /* renamed from: d */
        @NotNull
        public final String f33151d;

        /* renamed from: e */
        @NotNull
        public final List<String> f33152e;

        public Variable(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            super(str2);
            this.f33150c = str;
            this.f33151d = str2;
            this.f33152e = CollectionsKt.m31993F(str);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        /* renamed from: b */
        public Object mo17215b(@NotNull Evaluator evaluator) {
            Object obj = evaluator.f33164a.get(this.f33150c);
            if (obj != null) {
                return obj;
            }
            throw new MissingVariableException(this.f33150c, null, 2);
        }

        @Override // com.yandex.div.evaluable.Evaluable
        @NotNull
        /* renamed from: c */
        public List<String> mo17216c() {
            return this.f33152e;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Variable)) {
                return false;
            }
            Variable variable = (Variable) obj;
            return Intrinsics.m32174c(this.f33150c, variable.f33150c) && Intrinsics.m32174c(this.f33151d, variable.f33151d);
        }

        public int hashCode() {
            return this.f33151d.hashCode() + (this.f33150c.hashCode() * 31);
        }

        @NotNull
        /* renamed from: toString, reason: from getter */
        public String getF33150c() {
            return this.f33150c;
        }
    }

    public Evaluable(@NotNull String rawExpr) {
        Intrinsics.m32179h(rawExpr, "rawExpr");
        this.f33120a = rawExpr;
        this.f33121b = true;
    }

    @NotNull
    /* renamed from: a */
    public final Object m17214a(@NotNull Evaluator evaluator) throws EvaluableException {
        return mo17215b(evaluator);
    }

    @NotNull
    /* renamed from: b */
    public abstract Object mo17215b(@NotNull Evaluator evaluator) throws EvaluableException;

    @NotNull
    /* renamed from: c */
    public abstract List<String> mo17216c();

    /* renamed from: d */
    public final void m17217d(boolean z) {
        this.f33121b = this.f33121b && z;
    }
}
