package com.airbnb.lottie.animation.content;

import android.annotation.TargetApi;
import android.graphics.Matrix;
import android.graphics.Path;
import com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@TargetApi
/* loaded from: classes.dex */
public class MergePathsContent implements PathContent, GreedyContent {

    /* renamed from: a */
    public final Path f7352a = new Path();

    /* renamed from: b */
    public final Path f7353b = new Path();

    /* renamed from: c */
    public final Path f7354c = new Path();

    /* renamed from: d */
    public final List<PathContent> f7355d = new ArrayList();

    /* renamed from: e */
    public final MergePaths f7356e;

    /* renamed from: com.airbnb.lottie.animation.content.MergePathsContent$1 */
    public static /* synthetic */ class C07601 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7357a;

        static {
            int[] iArr = new int[MergePaths.MergePathsMode.values().length];
            f7357a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7357a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7357a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7357a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7357a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public MergePathsContent(MergePaths mergePaths) {
        this.f7356e = mergePaths;
    }

    @TargetApi
    /* renamed from: a */
    public final void m4702a(Path.Op op) {
        Matrix matrix;
        Matrix matrix2;
        this.f7353b.reset();
        this.f7352a.reset();
        for (int size = this.f7355d.size() - 1; size >= 1; size--) {
            PathContent pathContent = this.f7355d.get(size);
            if (pathContent instanceof ContentGroup) {
                ContentGroup contentGroup = (ContentGroup) pathContent;
                List<PathContent> m4695e = contentGroup.m4695e();
                for (int size2 = m4695e.size() - 1; size2 >= 0; size2--) {
                    Path mo4696t = m4695e.get(size2).mo4696t();
                    TransformKeyframeAnimation transformKeyframeAnimation = contentGroup.f7304k;
                    if (transformKeyframeAnimation != null) {
                        matrix2 = transformKeyframeAnimation.m4726e();
                    } else {
                        contentGroup.f7296c.reset();
                        matrix2 = contentGroup.f7296c;
                    }
                    mo4696t.transform(matrix2);
                    this.f7353b.addPath(mo4696t);
                }
            } else {
                this.f7353b.addPath(pathContent.mo4696t());
            }
        }
        PathContent pathContent2 = this.f7355d.get(0);
        if (pathContent2 instanceof ContentGroup) {
            ContentGroup contentGroup2 = (ContentGroup) pathContent2;
            List<PathContent> m4695e2 = contentGroup2.m4695e();
            for (int i2 = 0; i2 < m4695e2.size(); i2++) {
                Path mo4696t2 = m4695e2.get(i2).mo4696t();
                TransformKeyframeAnimation transformKeyframeAnimation2 = contentGroup2.f7304k;
                if (transformKeyframeAnimation2 != null) {
                    matrix = transformKeyframeAnimation2.m4726e();
                } else {
                    contentGroup2.f7296c.reset();
                    matrix = contentGroup2.f7296c;
                }
                mo4696t2.transform(matrix);
                this.f7352a.addPath(mo4696t2);
            }
        } else {
            this.f7352a.set(pathContent2.mo4696t());
        }
        this.f7354c.op(this.f7352a, this.f7353b, op);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    /* renamed from: b */
    public void mo4689b(List<Content> list, List<Content> list2) {
        for (int i2 = 0; i2 < this.f7355d.size(); i2++) {
            this.f7355d.get(i2).mo4689b(list, list2);
        }
    }

    @Override // com.airbnb.lottie.animation.content.GreedyContent
    /* renamed from: e */
    public void mo4701e(ListIterator<Content> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            Content previous = listIterator.previous();
            if (previous instanceof PathContent) {
                this.f7355d.add((PathContent) previous);
                listIterator.remove();
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.PathContent
    /* renamed from: t */
    public Path mo4696t() {
        this.f7354c.reset();
        MergePaths mergePaths = this.f7356e;
        if (mergePaths.f7559c) {
            return this.f7354c;
        }
        int ordinal = mergePaths.f7558b.ordinal();
        if (ordinal == 0) {
            for (int i2 = 0; i2 < this.f7355d.size(); i2++) {
                this.f7354c.addPath(this.f7355d.get(i2).mo4696t());
            }
        } else if (ordinal == 1) {
            m4702a(Path.Op.UNION);
        } else if (ordinal == 2) {
            m4702a(Path.Op.REVERSE_DIFFERENCE);
        } else if (ordinal == 3) {
            m4702a(Path.Op.INTERSECT);
        } else if (ordinal == 4) {
            m4702a(Path.Op.XOR);
        }
        return this.f7354c;
    }
}
