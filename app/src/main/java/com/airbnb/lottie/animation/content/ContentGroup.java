package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.LPaint;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.model.KeyPathElement;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public class ContentGroup implements DrawingContent, PathContent, BaseKeyframeAnimation.AnimationListener, KeyPathElement {

    /* renamed from: a */
    public Paint f7294a;

    /* renamed from: b */
    public RectF f7295b;

    /* renamed from: c */
    public final Matrix f7296c;

    /* renamed from: d */
    public final Path f7297d;

    /* renamed from: e */
    public final RectF f7298e;

    /* renamed from: f */
    public final String f7299f;

    /* renamed from: g */
    public final boolean f7300g;

    /* renamed from: h */
    public final List<Content> f7301h;

    /* renamed from: i */
    public final LottieDrawable f7302i;

    /* renamed from: j */
    @Nullable
    public List<PathContent> f7303j;

    /* renamed from: k */
    @Nullable
    public TransformKeyframeAnimation f7304k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ContentGroup(com.airbnb.lottie.LottieDrawable r8, com.airbnb.lottie.model.layer.BaseLayer r9, com.airbnb.lottie.model.content.ShapeGroup r10) {
        /*
            r7 = this;
            java.lang.String r3 = r10.f7598a
            boolean r4 = r10.f7600c
            java.util.List<com.airbnb.lottie.model.content.ContentModel> r0 = r10.f7599b
            java.util.ArrayList r5 = new java.util.ArrayList
            int r1 = r0.size()
            r5.<init>(r1)
            r1 = 0
            r2 = 0
        L11:
            int r6 = r0.size()
            if (r2 >= r6) goto L29
            java.lang.Object r6 = r0.get(r2)
            com.airbnb.lottie.model.content.ContentModel r6 = (com.airbnb.lottie.model.content.ContentModel) r6
            com.airbnb.lottie.animation.content.Content r6 = r6.mo4741a(r8, r9)
            if (r6 == 0) goto L26
            r5.add(r6)
        L26:
            int r2 = r2 + 1
            goto L11
        L29:
            java.util.List<com.airbnb.lottie.model.content.ContentModel> r10 = r10.f7599b
        L2b:
            int r0 = r10.size()
            if (r1 >= r0) goto L42
            java.lang.Object r0 = r10.get(r1)
            com.airbnb.lottie.model.content.ContentModel r0 = (com.airbnb.lottie.model.content.ContentModel) r0
            boolean r2 = r0 instanceof com.airbnb.lottie.model.animatable.AnimatableTransform
            if (r2 == 0) goto L3f
            com.airbnb.lottie.model.animatable.AnimatableTransform r0 = (com.airbnb.lottie.model.animatable.AnimatableTransform) r0
            r6 = r0
            goto L44
        L3f:
            int r1 = r1 + 1
            goto L2b
        L42:
            r10 = 0
            r6 = r10
        L44:
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.animation.content.ContentGroup.<init>(com.airbnb.lottie.LottieDrawable, com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.content.ShapeGroup):void");
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    /* renamed from: a */
    public void mo4688a() {
        this.f7302i.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    /* renamed from: b */
    public void mo4689b(List<Content> list, List<Content> list2) {
        ArrayList arrayList = new ArrayList(this.f7301h.size() + list.size());
        arrayList.addAll(list);
        for (int size = this.f7301h.size() - 1; size >= 0; size--) {
            Content content = this.f7301h.get(size);
            content.mo4689b(arrayList, this.f7301h.subList(0, size));
            arrayList.add(content);
        }
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    /* renamed from: c */
    public void mo4690c(KeyPath keyPath, int i2, List<KeyPath> list, KeyPath keyPath2) {
        if (keyPath.m4734e(this.f7299f, i2)) {
            if (!"__container".equals(this.f7299f)) {
                keyPath2 = keyPath2.m4730a(this.f7299f);
                if (keyPath.m4732c(this.f7299f, i2)) {
                    list.add(keyPath2.m4736g(this));
                }
            }
            if (keyPath.m4735f(this.f7299f, i2)) {
                int m4733d = keyPath.m4733d(this.f7299f, i2) + i2;
                for (int i3 = 0; i3 < this.f7301h.size(); i3++) {
                    Content content = this.f7301h.get(i3);
                    if (content instanceof KeyPathElement) {
                        ((KeyPathElement) content).mo4690c(keyPath, m4733d, list, keyPath2);
                    }
                }
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    /* renamed from: d */
    public void mo4691d(RectF rectF, Matrix matrix, boolean z) {
        this.f7296c.set(matrix);
        TransformKeyframeAnimation transformKeyframeAnimation = this.f7304k;
        if (transformKeyframeAnimation != null) {
            this.f7296c.preConcat(transformKeyframeAnimation.m4726e());
        }
        this.f7298e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f7301h.size() - 1; size >= 0; size--) {
            Content content = this.f7301h.get(size);
            if (content instanceof DrawingContent) {
                ((DrawingContent) content).mo4691d(this.f7298e, this.f7296c, z);
                rectF.union(this.f7298e);
            }
        }
    }

    /* renamed from: e */
    public List<PathContent> m4695e() {
        if (this.f7303j == null) {
            this.f7303j = new ArrayList();
            for (int i2 = 0; i2 < this.f7301h.size(); i2++) {
                Content content = this.f7301h.get(i2);
                if (content instanceof PathContent) {
                    this.f7303j.add((PathContent) content);
                }
            }
        }
        return this.f7303j;
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    /* renamed from: f */
    public void mo4692f(Canvas canvas, Matrix matrix, int i2) {
        boolean z;
        if (this.f7300g) {
            return;
        }
        this.f7296c.set(matrix);
        TransformKeyframeAnimation transformKeyframeAnimation = this.f7304k;
        if (transformKeyframeAnimation != null) {
            this.f7296c.preConcat(transformKeyframeAnimation.m4726e());
            i2 = (int) (((((this.f7304k.f7450j == null ? 100 : r7.mo4707e().intValue()) / 100.0f) * i2) / 255.0f) * 255.0f);
        }
        boolean z2 = false;
        if (this.f7302i.f7186t) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i3 >= this.f7301h.size()) {
                    z = false;
                    break;
                } else {
                    if ((this.f7301h.get(i3) instanceof DrawingContent) && (i4 = i4 + 1) >= 2) {
                        z = true;
                        break;
                    }
                    i3++;
                }
            }
            if (z && i2 != 255) {
                z2 = true;
            }
        }
        if (z2) {
            this.f7295b.set(0.0f, 0.0f, 0.0f, 0.0f);
            mo4691d(this.f7295b, this.f7296c, true);
            this.f7294a.setAlpha(i2);
            Utils.m4856f(canvas, this.f7295b, this.f7294a, 31);
        }
        if (z2) {
            i2 = KotlinVersion.MAX_COMPONENT_VALUE;
        }
        for (int size = this.f7301h.size() - 1; size >= 0; size--) {
            Content content = this.f7301h.get(size);
            if (content instanceof DrawingContent) {
                ((DrawingContent) content).mo4692f(canvas, this.f7296c, i2);
            }
        }
        if (z2) {
            canvas.restore();
        }
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    /* renamed from: g */
    public <T> void mo4693g(T t, @Nullable LottieValueCallback<T> lottieValueCallback) {
        TransformKeyframeAnimation transformKeyframeAnimation = this.f7304k;
        if (transformKeyframeAnimation != null) {
            transformKeyframeAnimation.m4724c(t, lottieValueCallback);
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public String getName() {
        return this.f7299f;
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    /* renamed from: t */
    public Path mo4696t() {
        this.f7296c.reset();
        TransformKeyframeAnimation transformKeyframeAnimation = this.f7304k;
        if (transformKeyframeAnimation != null) {
            this.f7296c.set(transformKeyframeAnimation.m4726e());
        }
        this.f7297d.reset();
        if (this.f7300g) {
            return this.f7297d;
        }
        for (int size = this.f7301h.size() - 1; size >= 0; size--) {
            Content content = this.f7301h.get(size);
            if (content instanceof PathContent) {
                this.f7297d.addPath(((PathContent) content).mo4696t(), this.f7296c);
            }
        }
        return this.f7297d;
    }

    public ContentGroup(LottieDrawable lottieDrawable, BaseLayer baseLayer, String str, boolean z, List<Content> list, @Nullable AnimatableTransform animatableTransform) {
        this.f7294a = new LPaint();
        this.f7295b = new RectF();
        this.f7296c = new Matrix();
        this.f7297d = new Path();
        this.f7298e = new RectF();
        this.f7299f = str;
        this.f7302i = lottieDrawable;
        this.f7300g = z;
        this.f7301h = list;
        if (animatableTransform != null) {
            TransformKeyframeAnimation transformKeyframeAnimation = new TransformKeyframeAnimation(animatableTransform);
            this.f7304k = transformKeyframeAnimation;
            transformKeyframeAnimation.m4722a(baseLayer);
            this.f7304k.m4723b(this);
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            Content content = list.get(size);
            if (content instanceof GreedyContent) {
                arrayList.add((GreedyContent) content);
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                ((GreedyContent) arrayList.get(size2)).mo4701e(list.listIterator(list.size()));
            }
        }
    }
}
