package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.content.ShapeData;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class MaskKeyframeAnimation {

    /* renamed from: a */
    public final List<BaseKeyframeAnimation<ShapeData, Path>> f7425a;

    /* renamed from: b */
    public final List<BaseKeyframeAnimation<Integer, Integer>> f7426b;

    /* renamed from: c */
    public final List<Mask> f7427c;

    public MaskKeyframeAnimation(List<Mask> list) {
        this.f7427c = list;
        this.f7425a = new ArrayList(list.size());
        this.f7426b = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f7425a.add(list.get(i2).f7549b.mo4737j());
            this.f7426b.add(list.get(i2).f7550c.mo4737j());
        }
    }
}
