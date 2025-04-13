package com.yandex.div.core.view2.animations;

import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Transitions.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"div_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class TransitionsKt {
    /* renamed from: a */
    public static final void m16897a(@NotNull TransitionSet transitionSet, @NotNull Iterable<? extends Transition> iterable) {
        Iterator<? extends Transition> it = iterable.iterator();
        while (it.hasNext()) {
            transitionSet.m4263O(it.next());
        }
    }
}
