package com.yandex.div.json.expressions;

import com.yandex.div.core.C2814a;
import com.yandex.div.core.Disposable;
import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.ValueValidator;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Expression.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div/json/expressions/Expression;", "", "T", "Companion", "ConstantExpression", "MutableExpression", "div-json_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class Expression<T> {

    /* renamed from: a */
    @NotNull
    public static final Companion f34334a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final ConcurrentHashMap<Object, Expression<?>> f34335b = new ConcurrentHashMap<>(1000);

    /* compiled from: Expression.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R$\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div/json/expressions/Expression$Companion;", "", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/yandex/div/json/expressions/Expression;", "pool", "Ljava/util/concurrent/ConcurrentHashMap;", "div-json_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public final <T> Expression<T> m17539a(@NotNull T value) {
            Object putIfAbsent;
            Intrinsics.m32179h(value, "value");
            ConcurrentMap concurrentMap = Expression.f34335b;
            Object obj = concurrentMap.get(value);
            if (obj == null && (putIfAbsent = concurrentMap.putIfAbsent(value, (obj = new ConstantExpression(value)))) != null) {
                obj = putIfAbsent;
            }
            return (Expression) obj;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: Expression.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/json/expressions/Expression$ConstantExpression;", "", "T", "Lcom/yandex/div/json/expressions/Expression;", "div-json_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class ConstantExpression<T> extends Expression<T> {

        /* renamed from: c */
        @NotNull
        public final T f34336c;

        public ConstantExpression(@NotNull T t) {
            this.f34336c = t;
        }

        @Override // com.yandex.div.json.expressions.Expression
        @NotNull
        /* renamed from: b */
        public T mo17535b(@NotNull ExpressionResolver resolver) {
            Intrinsics.m32179h(resolver, "resolver");
            return this.f34336c;
        }

        @Override // com.yandex.div.json.expressions.Expression
        @NotNull
        /* renamed from: c, reason: from getter */
        public Object getF34336c() {
            return this.f34336c;
        }

        @Override // com.yandex.div.json.expressions.Expression
        @NotNull
        /* renamed from: e */
        public Disposable mo17537e(@NotNull ExpressionResolver resolver, @NotNull Function1<? super T, Unit> callback) {
            Intrinsics.m32179h(resolver, "resolver");
            Intrinsics.m32179h(callback, "callback");
            int i2 = Disposable.f30873B1;
            return C2814a.f31000b;
        }

        @Override // com.yandex.div.json.expressions.Expression
        @NotNull
        /* renamed from: f */
        public Disposable mo17538f(@NotNull ExpressionResolver resolver, @NotNull Function1<? super T, Unit> callback) {
            Intrinsics.m32179h(resolver, "resolver");
            Intrinsics.m32179h(callback, "callback");
            callback.invoke(this.f34336c);
            int i2 = Disposable.f30873B1;
            return C2814a.f31000b;
        }
    }

    /* compiled from: Expression.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00020\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div/json/expressions/Expression$MutableExpression;", "R", "", "T", "Lcom/yandex/div/json/expressions/Expression;", "div-json_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class MutableExpression<R, T> extends Expression<T> {

        /* renamed from: c */
        @NotNull
        public final String f34337c;

        /* renamed from: d */
        @NotNull
        public final String f34338d;

        /* renamed from: e */
        @Nullable
        public final Function1<R, T> f34339e;

        /* renamed from: f */
        @NotNull
        public final ValueValidator<T> f34340f;

        /* renamed from: g */
        @NotNull
        public final ParsingErrorLogger f34341g;

        /* renamed from: h */
        @NotNull
        public final TypeHelper<T> f34342h;

        /* renamed from: i */
        @Nullable
        public final Expression<T> f34343i;

        /* renamed from: j */
        @NotNull
        public final String f34344j;

        /* renamed from: k */
        @Nullable
        public Evaluable f34345k;

        /* renamed from: l */
        @Nullable
        public T f34346l;

        /* JADX WARN: Multi-variable type inference failed */
        public MutableExpression(@NotNull String expressionKey, @NotNull String rawExpression, @Nullable Function1<? super R, ? extends T> function1, @NotNull ValueValidator<T> validator, @NotNull ParsingErrorLogger logger, @NotNull TypeHelper<T> typeHelper, @Nullable Expression<T> expression) {
            Intrinsics.m32179h(expressionKey, "expressionKey");
            Intrinsics.m32179h(rawExpression, "rawExpression");
            Intrinsics.m32179h(validator, "validator");
            Intrinsics.m32179h(logger, "logger");
            Intrinsics.m32179h(typeHelper, "typeHelper");
            this.f34337c = expressionKey;
            this.f34338d = rawExpression;
            this.f34339e = function1;
            this.f34340f = validator;
            this.f34341g = logger;
            this.f34342h = typeHelper;
            this.f34343i = expression;
            this.f34344j = rawExpression;
        }

        @Override // com.yandex.div.json.expressions.Expression
        @NotNull
        /* renamed from: b */
        public T mo17535b(@NotNull ExpressionResolver resolver) {
            T mo17535b;
            Intrinsics.m32179h(resolver, "resolver");
            try {
                T m17541h = m17541h(resolver);
                this.f34346l = m17541h;
                return m17541h;
            } catch (ParsingException e2) {
                this.f34341g.mo17368a(e2);
                resolver.mo16672c(e2);
                T t = this.f34346l;
                if (t != null) {
                    return t;
                }
                try {
                    Expression<T> expression = this.f34343i;
                    if (expression != null && (mo17535b = expression.mo17535b(resolver)) != null) {
                        this.f34346l = mo17535b;
                        return mo17535b;
                    }
                    return this.f34342h.getF33854b();
                } catch (ParsingException e3) {
                    this.f34341g.mo17368a(e3);
                    resolver.mo16672c(e3);
                    throw e3;
                }
            }
        }

        @Override // com.yandex.div.json.expressions.Expression
        /* renamed from: c */
        public Object getF34336c() {
            return this.f34344j;
        }

        @Override // com.yandex.div.json.expressions.Expression
        @NotNull
        /* renamed from: e */
        public Disposable mo17537e(@NotNull final ExpressionResolver resolver, @NotNull final Function1<? super T, Unit> callback) {
            Intrinsics.m32179h(resolver, "resolver");
            Intrinsics.m32179h(callback, "callback");
            try {
                List<String> mo17216c = m17540g().mo17216c();
                if (!mo17216c.isEmpty()) {
                    return resolver.mo16671b(this.f34338d, mo17216c, new Function0<Unit>() { // from class: com.yandex.div.json.expressions.Expression$MutableExpression$observe$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public Unit invoke() {
                            callback.invoke(this.mo17535b(resolver));
                            return Unit.f63088a;
                        }
                    });
                }
                int i2 = Disposable.f30873B1;
                return C2814a.f31000b;
            } catch (Exception e2) {
                ParsingException m17524i = ParsingExceptionKt.m17524i(this.f34337c, this.f34338d, e2);
                this.f34341g.mo17368a(m17524i);
                resolver.mo16672c(m17524i);
                int i3 = Disposable.f30873B1;
                return C2814a.f31000b;
            }
        }

        /* renamed from: g */
        public final Evaluable m17540g() {
            Evaluable evaluable = this.f34345k;
            if (evaluable != null) {
                return evaluable;
            }
            try {
                String expr = this.f34338d;
                Intrinsics.m32179h(expr, "expr");
                Evaluable.Lazy lazy = new Evaluable.Lazy(expr);
                this.f34345k = lazy;
                return lazy;
            } catch (EvaluableException e2) {
                throw ParsingExceptionKt.m17524i(this.f34337c, this.f34338d, e2);
            }
        }

        /* renamed from: h */
        public final T m17541h(ExpressionResolver expressionResolver) {
            T t = (T) expressionResolver.mo16670a(this.f34337c, this.f34338d, m17540g(), this.f34339e, this.f34340f, this.f34342h, this.f34341g);
            if (t == null) {
                throw ParsingExceptionKt.m17524i(this.f34337c, this.f34338d, null);
            }
            if (this.f34342h.mo17371b(t)) {
                return t;
            }
            throw ParsingExceptionKt.m17526k(this.f34337c, this.f34338d, t, null);
        }
    }

    @JvmStatic
    @NotNull
    /* renamed from: a */
    public static final <T> Expression<T> m17533a(@NotNull T t) {
        return f34334a.m17539a(t);
    }

    @JvmStatic
    /* renamed from: d */
    public static final boolean m17534d(@Nullable Object obj) {
        return (obj instanceof String) && StringsKt.m33922t((CharSequence) obj, "@{", false, 2, null);
    }

    @NotNull
    /* renamed from: b */
    public abstract T mo17535b(@NotNull ExpressionResolver expressionResolver);

    @NotNull
    /* renamed from: c */
    public abstract Object getF34336c();

    @NotNull
    /* renamed from: e */
    public abstract Disposable mo17537e(@NotNull ExpressionResolver expressionResolver, @NotNull Function1<? super T, Unit> function1);

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Expression) {
            return Intrinsics.m32174c(getF34336c(), ((Expression) obj).getF34336c());
        }
        return false;
    }

    @NotNull
    /* renamed from: f */
    public Disposable mo17538f(@NotNull ExpressionResolver resolver, @NotNull Function1<? super T, Unit> callback) {
        T t;
        Intrinsics.m32179h(resolver, "resolver");
        Intrinsics.m32179h(callback, "callback");
        try {
            t = mo17535b(resolver);
        } catch (ParsingException unused) {
            t = null;
        }
        if (t != null) {
            callback.invoke(t);
        }
        return mo17537e(resolver, callback);
    }

    public int hashCode() {
        return getF34336c().hashCode() * 16;
    }
}
