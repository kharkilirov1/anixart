package com.bumptech.glide;

import com.bumptech.glide.TransitionOptions;
import com.bumptech.glide.request.transition.NoTransition;
import com.bumptech.glide.request.transition.TransitionFactory;

/* loaded from: classes.dex */
public abstract class TransitionOptions<CHILD extends TransitionOptions<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: b */
    public TransitionFactory<? super TranscodeType> f7959b = (TransitionFactory<? super TranscodeType>) NoTransition.f8821b;

    /* renamed from: a */
    public final CHILD m4906a() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public Object clone() throws CloneNotSupportedException {
        try {
            return (TransitionOptions) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }
}
