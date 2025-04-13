package com.yandex.div.json.expressions;

import com.yandex.div.core.C2814a;
import com.yandex.div.core.CompositeDisposable;
import com.yandex.div.core.Disposable;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ExpressionList.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/json/expressions/MutableExpressionList;", "", "T", "Lcom/yandex/div/json/expressions/ExpressionList;", "div-json_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class MutableExpressionList<T> implements ExpressionList<T> {

    /* renamed from: a */
    @NotNull
    public final String f34351a;

    /* renamed from: b */
    @NotNull
    public final List<Expression<T>> f34352b;

    /* renamed from: c */
    @NotNull
    public final ListValidator<T> f34353c;

    /* renamed from: d */
    @NotNull
    public final ParsingErrorLogger f34354d;

    /* renamed from: e */
    @Nullable
    public List<? extends T> f34355e;

    /* JADX WARN: Multi-variable type inference failed */
    public MutableExpressionList(@NotNull String key, @NotNull List<? extends Expression<T>> list, @NotNull ListValidator<T> listValidator, @NotNull ParsingErrorLogger logger) {
        Intrinsics.m32179h(key, "key");
        Intrinsics.m32179h(listValidator, "listValidator");
        Intrinsics.m32179h(logger, "logger");
        this.f34351a = key;
        this.f34352b = list;
        this.f34353c = listValidator;
        this.f34354d = logger;
    }

    @Override // com.yandex.div.json.expressions.ExpressionList
    @NotNull
    /* renamed from: a */
    public List<T> mo17531a(@NotNull ExpressionResolver resolver) {
        Intrinsics.m32179h(resolver, "resolver");
        try {
            List<T> m17542c = m17542c(resolver);
            this.f34355e = m17542c;
            return m17542c;
        } catch (ParsingException e2) {
            this.f34354d.mo17368a(e2);
            List<? extends T> list = this.f34355e;
            if (list != null) {
                return list;
            }
            throw e2;
        }
    }

    @Override // com.yandex.div.json.expressions.ExpressionList
    @NotNull
    /* renamed from: b */
    public Disposable mo17532b(@NotNull final ExpressionResolver resolver, @NotNull final Function1<? super List<? extends T>, Unit> callback) {
        Intrinsics.m32179h(resolver, "resolver");
        Intrinsics.m32179h(callback, "callback");
        Function1<T, Unit> function1 = new Function1<T, Unit>() { // from class: com.yandex.div.json.expressions.MutableExpressionList$observe$itemCallback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Object noName_0) {
                Intrinsics.m32179h(noName_0, "$noName_0");
                callback.invoke(this.mo17531a(resolver));
                return Unit.f63088a;
            }
        };
        if (this.f34352b.size() == 1) {
            return ((Expression) CollectionsKt.m32044u(this.f34352b)).mo17537e(resolver, function1);
        }
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        Iterator<T> it = this.f34352b.iterator();
        while (it.hasNext()) {
            Disposable disposable = ((Expression) it.next()).mo17537e(resolver, function1);
            Intrinsics.m32179h(disposable, "disposable");
            if (!(!compositeDisposable.f30867c)) {
                throw new IllegalArgumentException("close() method was called".toString());
            }
            if (disposable != C2814a.f31000b) {
                compositeDisposable.f30866b.add(disposable);
            }
        }
        return compositeDisposable;
    }

    /* renamed from: c */
    public final List<T> m17542c(ExpressionResolver expressionResolver) {
        List<Expression<T>> list = this.f34352b;
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Expression) it.next()).mo17535b(expressionResolver));
        }
        if (this.f34353c.isValid(arrayList)) {
            return arrayList;
        }
        throw ParsingExceptionKt.m17517b(this.f34351a, arrayList);
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof MutableExpressionList) && Intrinsics.m32174c(this.f34352b, ((MutableExpressionList) obj).f34352b);
    }
}
