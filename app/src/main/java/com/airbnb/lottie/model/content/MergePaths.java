package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.MergePathsContent;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.Logger;
import p000a.C0000a;

/* loaded from: classes.dex */
public class MergePaths implements ContentModel {

    /* renamed from: a */
    public final String f7557a;

    /* renamed from: b */
    public final MergePathsMode f7558b;

    /* renamed from: c */
    public final boolean f7559c;

    public enum MergePathsMode {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS
    }

    public MergePaths(String str, MergePathsMode mergePathsMode, boolean z) {
        this.f7557a = str;
        this.f7558b = mergePathsMode;
        this.f7559c = z;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    @Nullable
    /* renamed from: a */
    public Content mo4741a(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        if (lottieDrawable.f7182p) {
            return new MergePathsContent(this);
        }
        Logger.m4833a("Animation contains merge paths but they are disabled.");
        return null;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("MergePaths{mode=");
        m24u.append(this.f7558b);
        m24u.append('}');
        return m24u.toString();
    }
}
