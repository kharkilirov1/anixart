package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import android.graphics.PathMeasure;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.utils.Utils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class CompoundTrimPathContent {

    /* renamed from: a */
    public List<TrimPathContent> f7293a = new ArrayList();

    /* renamed from: a */
    public void m4694a(Path path) {
        for (int size = this.f7293a.size() - 1; size >= 0; size--) {
            TrimPathContent trimPathContent = this.f7293a.get(size);
            PathMeasure pathMeasure = Utils.f7847a;
            if (trimPathContent != null && !trimPathContent.f7404a) {
                Utils.m4851a(path, ((FloatKeyframeAnimation) trimPathContent.f7407d).m4718i() / 100.0f, ((FloatKeyframeAnimation) trimPathContent.f7408e).m4718i() / 100.0f, ((FloatKeyframeAnimation) trimPathContent.f7409f).m4718i() / 360.0f);
            }
        }
    }
}
