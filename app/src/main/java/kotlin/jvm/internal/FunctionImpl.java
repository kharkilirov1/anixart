package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.Deprecated;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import p000a.C0000a;

@Deprecated
@Deprecated
/* loaded from: classes3.dex */
public abstract class FunctionImpl implements Function, Serializable, Function0, Function1, Function2, Function3, Function4, Function5, Function6, Function7, Function8, Function9, Function10, Function11, Function12, Function13, Function14, Function15, Function16, Function17, Function18, Function19, Function20, Function21, Function22 {
    @Override // kotlin.jvm.functions.Function7
    /* renamed from: A */
    public Object mo32153A(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        m32171a(7);
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void m32171a(int i2) {
        if (getArity() == i2) {
            return;
        }
        StringBuilder m25v = C0000a.m25v("Wrong function arity, expected: ", i2, ", actual: ");
        m25v.append(getArity());
        throw new IllegalStateException(m25v.toString());
    }

    public abstract int getArity();

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        m32171a(0);
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.jvm.functions.Function3
    /* renamed from: k */
    public Object mo16505k(Object obj, Object obj2, Object obj3) {
        m32171a(3);
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.jvm.functions.Function4
    /* renamed from: n */
    public Object mo1110n(Object obj, Object obj2, Object obj3, Object obj4) {
        m32171a(4);
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.jvm.functions.Function6
    /* renamed from: q */
    public Object mo32152q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        m32171a(6);
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.jvm.functions.Function5
    /* renamed from: v */
    public Object mo32151v(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        m32171a(5);
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        m32171a(1);
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        m32171a(2);
        throw new UnsupportedOperationException();
    }
}
