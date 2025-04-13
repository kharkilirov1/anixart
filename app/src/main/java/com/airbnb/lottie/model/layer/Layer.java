package com.airbnb.lottie.model.layer;

import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableTextFrame;
import com.airbnb.lottie.model.animatable.AnimatableTextProperties;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.value.Keyframe;
import java.util.List;
import java.util.Locale;
import p000a.C0000a;

/* loaded from: classes.dex */
public class Layer {

    /* renamed from: a */
    public final List<ContentModel> f7664a;

    /* renamed from: b */
    public final LottieComposition f7665b;

    /* renamed from: c */
    public final String f7666c;

    /* renamed from: d */
    public final long f7667d;

    /* renamed from: e */
    public final LayerType f7668e;

    /* renamed from: f */
    public final long f7669f;

    /* renamed from: g */
    @Nullable
    public final String f7670g;

    /* renamed from: h */
    public final List<Mask> f7671h;

    /* renamed from: i */
    public final AnimatableTransform f7672i;

    /* renamed from: j */
    public final int f7673j;

    /* renamed from: k */
    public final int f7674k;

    /* renamed from: l */
    public final int f7675l;

    /* renamed from: m */
    public final float f7676m;

    /* renamed from: n */
    public final float f7677n;

    /* renamed from: o */
    public final int f7678o;

    /* renamed from: p */
    public final int f7679p;

    /* renamed from: q */
    @Nullable
    public final AnimatableTextFrame f7680q;

    /* renamed from: r */
    @Nullable
    public final AnimatableTextProperties f7681r;

    /* renamed from: s */
    @Nullable
    public final AnimatableFloatValue f7682s;

    /* renamed from: t */
    public final List<Keyframe<Float>> f7683t;

    /* renamed from: u */
    public final MatteType f7684u;

    /* renamed from: v */
    public final boolean f7685v;

    public enum LayerType {
        PRE_COMP,
        /* JADX INFO: Fake field, exist only in values array */
        SOLID,
        IMAGE,
        /* JADX INFO: Fake field, exist only in values array */
        NULL,
        /* JADX INFO: Fake field, exist only in values array */
        SHAPE,
        /* JADX INFO: Fake field, exist only in values array */
        TEXT,
        UNKNOWN
    }

    public enum MatteType {
        NONE,
        /* JADX INFO: Fake field, exist only in values array */
        ADD,
        INVERT,
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN
    }

    public Layer(List<ContentModel> list, LottieComposition lottieComposition, String str, long j2, LayerType layerType, long j3, @Nullable String str2, List<Mask> list2, AnimatableTransform animatableTransform, int i2, int i3, int i4, float f2, float f3, int i5, int i6, @Nullable AnimatableTextFrame animatableTextFrame, @Nullable AnimatableTextProperties animatableTextProperties, List<Keyframe<Float>> list3, MatteType matteType, @Nullable AnimatableFloatValue animatableFloatValue, boolean z) {
        this.f7664a = list;
        this.f7665b = lottieComposition;
        this.f7666c = str;
        this.f7667d = j2;
        this.f7668e = layerType;
        this.f7669f = j3;
        this.f7670g = str2;
        this.f7671h = list2;
        this.f7672i = animatableTransform;
        this.f7673j = i2;
        this.f7674k = i3;
        this.f7675l = i4;
        this.f7676m = f2;
        this.f7677n = f3;
        this.f7678o = i5;
        this.f7679p = i6;
        this.f7680q = animatableTextFrame;
        this.f7681r = animatableTextProperties;
        this.f7683t = list3;
        this.f7684u = matteType;
        this.f7682s = animatableFloatValue;
        this.f7685v = z;
    }

    /* renamed from: a */
    public String m4755a(String str) {
        StringBuilder m24u = C0000a.m24u(str);
        m24u.append(this.f7666c);
        m24u.append("\n");
        Layer m4650e = this.f7665b.m4650e(this.f7669f);
        if (m4650e != null) {
            m24u.append("\t\tParents: ");
            m24u.append(m4650e.f7666c);
            Layer m4650e2 = this.f7665b.m4650e(m4650e.f7669f);
            while (m4650e2 != null) {
                m24u.append("->");
                m24u.append(m4650e2.f7666c);
                m4650e2 = this.f7665b.m4650e(m4650e2.f7669f);
            }
            m24u.append(str);
            m24u.append("\n");
        }
        if (!this.f7671h.isEmpty()) {
            m24u.append(str);
            m24u.append("\tMasks: ");
            m24u.append(this.f7671h.size());
            m24u.append("\n");
        }
        if (this.f7673j != 0 && this.f7674k != 0) {
            m24u.append(str);
            m24u.append("\tBackground: ");
            m24u.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(this.f7673j), Integer.valueOf(this.f7674k), Integer.valueOf(this.f7675l)));
        }
        if (!this.f7664a.isEmpty()) {
            m24u.append(str);
            m24u.append("\tShapes:\n");
            for (ContentModel contentModel : this.f7664a) {
                m24u.append(str);
                m24u.append("\t\t");
                m24u.append(contentModel);
                m24u.append("\n");
            }
        }
        return m24u.toString();
    }

    public String toString() {
        return m4755a("");
    }
}
