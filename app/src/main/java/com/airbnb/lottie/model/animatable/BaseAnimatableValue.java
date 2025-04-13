package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.value.Keyframe;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class BaseAnimatableValue<V, O> implements AnimatableValue<V, O> {

    /* renamed from: a */
    public final List<Keyframe<V>> f7516a;

    public BaseAnimatableValue(V v) {
        this.f7516a = Collections.singletonList(new Keyframe(v));
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    /* renamed from: i */
    public boolean mo4739i() {
        return this.f7516a.isEmpty() || (this.f7516a.size() == 1 && this.f7516a.get(0).m4860d());
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    /* renamed from: k */
    public List<Keyframe<V>> mo4738k() {
        return this.f7516a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f7516a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f7516a.toArray()));
        }
        return sb.toString();
    }

    public BaseAnimatableValue(List<Keyframe<V>> list) {
        this.f7516a = list;
    }
}
