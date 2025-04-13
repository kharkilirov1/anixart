package com.stfalcon.imageviewer.common.pager;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

/* compiled from: MultiTouchViewPager.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, m31884d2 = {"<anonymous>", "", "p1", "", "Lkotlin/ParameterName;", "name", "state", "invoke"}, m31885k = 3, m31886mv = {1, 1, 15})
/* loaded from: classes2.dex */
public final /* synthetic */ class MultiTouchViewPager$onAttachedToWindow$1 extends FunctionReference implements Function1<Integer, Unit> {
    public MultiTouchViewPager$onAttachedToWindow$1(MultiTouchViewPager multiTouchViewPager) {
        super(1, multiTouchViewPager);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return "onPageScrollStateChanged";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.m32193a(MultiTouchViewPager.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "onPageScrollStateChanged(I)V";
    }

    @Override // kotlin.jvm.functions.Function1
    public Unit invoke(Integer num) {
        int intValue = num.intValue();
        ((MultiTouchViewPager) this.receiver).f25248j0 = intValue == 0;
        return Unit.f63088a;
    }
}
