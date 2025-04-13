package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import com.google.android.material.shadow.ShadowRenderer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ShapePath {

    /* renamed from: a */
    @Deprecated
    public float f18726a;

    /* renamed from: b */
    @Deprecated
    public float f18727b;

    /* renamed from: c */
    @Deprecated
    public float f18728c;

    /* renamed from: d */
    @Deprecated
    public float f18729d;

    /* renamed from: e */
    @Deprecated
    public float f18730e;

    /* renamed from: f */
    @Deprecated
    public float f18731f;

    /* renamed from: g */
    public final List<PathOperation> f18732g = new ArrayList();

    /* renamed from: h */
    public final List<ShadowCompatOperation> f18733h = new ArrayList();

    /* renamed from: com.google.android.material.shape.ShapePath$1 */
    class C13691 extends ShadowCompatOperation {

        /* renamed from: c */
        public final /* synthetic */ List f18734c;

        /* renamed from: d */
        public final /* synthetic */ Matrix f18735d;

        public C13691(ShapePath shapePath, List list, Matrix matrix) {
            this.f18734c = list;
            this.f18735d = matrix;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        /* renamed from: a */
        public void mo10337a(Matrix matrix, ShadowRenderer shadowRenderer, int i2, Canvas canvas) {
            Iterator it = this.f18734c.iterator();
            while (it.hasNext()) {
                ((ShadowCompatOperation) it.next()).mo10337a(this.f18735d, shadowRenderer, i2, canvas);
            }
        }
    }

    public static class ArcShadowOperation extends ShadowCompatOperation {

        /* renamed from: c */
        public final PathArcOperation f18736c;

        public ArcShadowOperation(PathArcOperation pathArcOperation) {
            this.f18736c = pathArcOperation;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        /* renamed from: a */
        public void mo10337a(Matrix matrix, @NonNull ShadowRenderer shadowRenderer, int i2, @NonNull Canvas canvas) {
            PathArcOperation pathArcOperation = this.f18736c;
            float f2 = pathArcOperation.f18749f;
            float f3 = pathArcOperation.f18750g;
            PathArcOperation pathArcOperation2 = this.f18736c;
            shadowRenderer.m10262a(canvas, matrix, new RectF(pathArcOperation2.f18745b, pathArcOperation2.f18746c, pathArcOperation2.f18747d, pathArcOperation2.f18748e), i2, f2, f3);
        }
    }

    public static class InnerCornerShadowOperation extends ShadowCompatOperation {

        /* renamed from: c */
        public final PathLineOperation f18737c;

        /* renamed from: d */
        public final PathLineOperation f18738d;

        /* renamed from: e */
        public final float f18739e;

        /* renamed from: f */
        public final float f18740f;

        public InnerCornerShadowOperation(PathLineOperation pathLineOperation, PathLineOperation pathLineOperation2, float f2, float f3) {
            this.f18737c = pathLineOperation;
            this.f18738d = pathLineOperation2;
            this.f18739e = f2;
            this.f18740f = f3;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        /* renamed from: a */
        public void mo10337a(Matrix matrix, ShadowRenderer shadowRenderer, int i2, Canvas canvas) {
            ShadowRenderer shadowRenderer2;
            float f2;
            float f3;
            float m10340d = m10340d();
            if (m10340d > 0.0f) {
                return;
            }
            PathLineOperation pathLineOperation = this.f18737c;
            double hypot = Math.hypot(pathLineOperation.f18751b - this.f18739e, pathLineOperation.f18752c - this.f18740f);
            float f4 = this.f18738d.f18751b;
            PathLineOperation pathLineOperation2 = this.f18737c;
            double hypot2 = Math.hypot(f4 - pathLineOperation2.f18751b, r6.f18752c - pathLineOperation2.f18752c);
            float min = (float) Math.min(i2, Math.min(hypot, hypot2));
            double d = min;
            float f5 = -m10340d;
            double tan = Math.tan(Math.toRadians(f5 / 2.0f)) * d;
            if (hypot > tan) {
                RectF rectF = new RectF(0.0f, 0.0f, (float) (hypot - tan), 0.0f);
                this.f18755a.set(matrix);
                this.f18755a.preTranslate(this.f18739e, this.f18740f);
                this.f18755a.preRotate(m10339c());
                shadowRenderer2 = shadowRenderer;
                shadowRenderer2.m10263b(canvas, this.f18755a, rectF, i2);
            } else {
                shadowRenderer2 = shadowRenderer;
            }
            float f6 = 2.0f * min;
            RectF rectF2 = new RectF(0.0f, 0.0f, f6, f6);
            this.f18755a.set(matrix);
            Matrix matrix2 = this.f18755a;
            PathLineOperation pathLineOperation3 = this.f18737c;
            matrix2.preTranslate(pathLineOperation3.f18751b, pathLineOperation3.f18752c);
            this.f18755a.preRotate(m10339c());
            this.f18755a.preTranslate((float) ((-tan) - d), (-2.0f) * min);
            Matrix matrix3 = this.f18755a;
            int i3 = (int) min;
            float[] fArr = {(float) (d + tan), f6};
            if (m10340d > 0.0f) {
                f3 = 450.0f + m10340d;
                f2 = f5;
            } else {
                f2 = m10340d;
                f3 = 450.0f;
            }
            shadowRenderer.m10262a(canvas, matrix3, rectF2, i3, f3, f2);
            Path path = shadowRenderer2.f18626g;
            path.rewind();
            path.moveTo(fArr[0], fArr[1]);
            path.arcTo(rectF2, f3, f2);
            path.close();
            canvas.save();
            canvas.concat(matrix3);
            canvas.scale(1.0f, rectF2.height() / rectF2.width());
            canvas.drawPath(path, shadowRenderer2.f18627h);
            canvas.drawPath(path, shadowRenderer2.f18620a);
            canvas.restore();
            if (hypot2 > tan) {
                RectF rectF3 = new RectF(0.0f, 0.0f, (float) (hypot2 - tan), 0.0f);
                this.f18755a.set(matrix);
                Matrix matrix4 = this.f18755a;
                PathLineOperation pathLineOperation4 = this.f18737c;
                matrix4.preTranslate(pathLineOperation4.f18751b, pathLineOperation4.f18752c);
                this.f18755a.preRotate(m10338b());
                this.f18755a.preTranslate((float) tan, 0.0f);
                shadowRenderer2.m10263b(canvas, this.f18755a, rectF3, i2);
            }
        }

        /* renamed from: b */
        public float m10338b() {
            float f2 = this.f18738d.f18752c;
            PathLineOperation pathLineOperation = this.f18737c;
            return (float) Math.toDegrees(Math.atan((f2 - pathLineOperation.f18752c) / (r0.f18751b - pathLineOperation.f18751b)));
        }

        /* renamed from: c */
        public float m10339c() {
            PathLineOperation pathLineOperation = this.f18737c;
            return (float) Math.toDegrees(Math.atan((pathLineOperation.f18752c - this.f18740f) / (pathLineOperation.f18751b - this.f18739e)));
        }

        /* renamed from: d */
        public float m10340d() {
            float m10338b = ((m10338b() - m10339c()) + 360.0f) % 360.0f;
            return m10338b <= 180.0f ? m10338b : m10338b - 360.0f;
        }
    }

    public static class LineShadowOperation extends ShadowCompatOperation {

        /* renamed from: c */
        public final PathLineOperation f18741c;

        /* renamed from: d */
        public final float f18742d;

        /* renamed from: e */
        public final float f18743e;

        public LineShadowOperation(PathLineOperation pathLineOperation, float f2, float f3) {
            this.f18741c = pathLineOperation;
            this.f18742d = f2;
            this.f18743e = f3;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        /* renamed from: a */
        public void mo10337a(Matrix matrix, @NonNull ShadowRenderer shadowRenderer, int i2, @NonNull Canvas canvas) {
            PathLineOperation pathLineOperation = this.f18741c;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(pathLineOperation.f18752c - this.f18743e, pathLineOperation.f18751b - this.f18742d), 0.0f);
            this.f18755a.set(matrix);
            this.f18755a.preTranslate(this.f18742d, this.f18743e);
            this.f18755a.preRotate(m10341b());
            shadowRenderer.m10263b(canvas, this.f18755a, rectF, i2);
        }

        /* renamed from: b */
        public float m10341b() {
            PathLineOperation pathLineOperation = this.f18741c;
            return (float) Math.toDegrees(Math.atan((pathLineOperation.f18752c - this.f18743e) / (pathLineOperation.f18751b - this.f18742d)));
        }
    }

    public static class PathArcOperation extends PathOperation {

        /* renamed from: h */
        public static final RectF f18744h = new RectF();

        /* renamed from: b */
        @Deprecated
        public float f18745b;

        /* renamed from: c */
        @Deprecated
        public float f18746c;

        /* renamed from: d */
        @Deprecated
        public float f18747d;

        /* renamed from: e */
        @Deprecated
        public float f18748e;

        /* renamed from: f */
        @Deprecated
        public float f18749f;

        /* renamed from: g */
        @Deprecated
        public float f18750g;

        public PathArcOperation(float f2, float f3, float f4, float f5) {
            this.f18745b = f2;
            this.f18746c = f3;
            this.f18747d = f4;
            this.f18748e = f5;
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        /* renamed from: a */
        public void mo10342a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f18753a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f18744h;
            rectF.set(this.f18745b, this.f18746c, this.f18747d, this.f18748e);
            path.arcTo(rectF, this.f18749f, this.f18750g, false);
            path.transform(matrix);
        }
    }

    public static class PathCubicOperation extends PathOperation {
        @Override // com.google.android.material.shape.ShapePath.PathOperation
        /* renamed from: a */
        public void mo10342a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f18753a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
            path.transform(matrix);
        }
    }

    public static class PathLineOperation extends PathOperation {

        /* renamed from: b */
        public float f18751b;

        /* renamed from: c */
        public float f18752c;

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        /* renamed from: a */
        public void mo10342a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f18753a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f18751b, this.f18752c);
            path.transform(matrix);
        }
    }

    public static abstract class PathOperation {

        /* renamed from: a */
        public final Matrix f18753a = new Matrix();

        /* renamed from: a */
        public abstract void mo10342a(Matrix matrix, Path path);
    }

    public static class PathQuadOperation extends PathOperation {
        @Override // com.google.android.material.shape.ShapePath.PathOperation
        /* renamed from: a */
        public void mo10342a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f18753a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(0.0f, 0.0f, 0.0f, 0.0f);
            path.transform(matrix);
        }
    }

    public static abstract class ShadowCompatOperation {

        /* renamed from: b */
        public static final Matrix f18754b = new Matrix();

        /* renamed from: a */
        public final Matrix f18755a = new Matrix();

        /* renamed from: a */
        public abstract void mo10337a(Matrix matrix, ShadowRenderer shadowRenderer, int i2, Canvas canvas);
    }

    public ShapePath() {
        m10335f(0.0f, 0.0f);
    }

    /* renamed from: a */
    public void m10330a(float f2, float f3, float f4, float f5, float f6, float f7) {
        PathArcOperation pathArcOperation = new PathArcOperation(f2, f3, f4, f5);
        pathArcOperation.f18749f = f6;
        pathArcOperation.f18750g = f7;
        this.f18732g.add(pathArcOperation);
        ArcShadowOperation arcShadowOperation = new ArcShadowOperation(pathArcOperation);
        float f8 = f6 + f7;
        boolean z = f7 < 0.0f;
        if (z) {
            f6 = (f6 + 180.0f) % 360.0f;
        }
        float f9 = z ? (180.0f + f8) % 360.0f : f8;
        m10331b(f6);
        this.f18733h.add(arcShadowOperation);
        this.f18730e = f9;
        double d = f8;
        this.f18728c = (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))) + ((f2 + f4) * 0.5f);
        this.f18729d = (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))) + ((f3 + f5) * 0.5f);
    }

    /* renamed from: b */
    public final void m10331b(float f2) {
        float f3 = this.f18730e;
        if (f3 == f2) {
            return;
        }
        float f4 = ((f2 - f3) + 360.0f) % 360.0f;
        if (f4 > 180.0f) {
            return;
        }
        float f5 = this.f18728c;
        float f6 = this.f18729d;
        PathArcOperation pathArcOperation = new PathArcOperation(f5, f6, f5, f6);
        pathArcOperation.f18749f = this.f18730e;
        pathArcOperation.f18750g = f4;
        this.f18733h.add(new ArcShadowOperation(pathArcOperation));
        this.f18730e = f2;
    }

    /* renamed from: c */
    public void m10332c(Matrix matrix, Path path) {
        int size = this.f18732g.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f18732g.get(i2).mo10342a(matrix, path);
        }
    }

    /* renamed from: d */
    public void m10333d(float f2, float f3) {
        PathLineOperation pathLineOperation = new PathLineOperation();
        pathLineOperation.f18751b = f2;
        pathLineOperation.f18752c = f3;
        this.f18732g.add(pathLineOperation);
        LineShadowOperation lineShadowOperation = new LineShadowOperation(pathLineOperation, this.f18728c, this.f18729d);
        float m10341b = lineShadowOperation.m10341b() + 270.0f;
        float m10341b2 = lineShadowOperation.m10341b() + 270.0f;
        m10331b(m10341b);
        this.f18733h.add(lineShadowOperation);
        this.f18730e = m10341b2;
        this.f18728c = f2;
        this.f18729d = f3;
    }

    /* renamed from: e */
    public void m10334e(float f2, float f3, float f4, float f5) {
        if ((Math.abs(f2 - this.f18728c) < 0.001f && Math.abs(f3 - this.f18729d) < 0.001f) || (Math.abs(f2 - f4) < 0.001f && Math.abs(f3 - f5) < 0.001f)) {
            m10333d(f4, f5);
            return;
        }
        PathLineOperation pathLineOperation = new PathLineOperation();
        pathLineOperation.f18751b = f2;
        pathLineOperation.f18752c = f3;
        this.f18732g.add(pathLineOperation);
        PathLineOperation pathLineOperation2 = new PathLineOperation();
        pathLineOperation2.f18751b = f4;
        pathLineOperation2.f18752c = f5;
        this.f18732g.add(pathLineOperation2);
        InnerCornerShadowOperation innerCornerShadowOperation = new InnerCornerShadowOperation(pathLineOperation, pathLineOperation2, this.f18728c, this.f18729d);
        if (innerCornerShadowOperation.m10340d() > 0.0f) {
            m10333d(f2, f3);
            m10333d(f4, f5);
            return;
        }
        float m10339c = innerCornerShadowOperation.m10339c() + 270.0f;
        float m10338b = innerCornerShadowOperation.m10338b() + 270.0f;
        m10331b(m10339c);
        this.f18733h.add(innerCornerShadowOperation);
        this.f18730e = m10338b;
        this.f18728c = f4;
        this.f18729d = f5;
    }

    /* renamed from: f */
    public void m10335f(float f2, float f3) {
        m10336g(f2, f3, 270.0f, 0.0f);
    }

    /* renamed from: g */
    public void m10336g(float f2, float f3, float f4, float f5) {
        this.f18726a = f2;
        this.f18727b = f3;
        this.f18728c = f2;
        this.f18729d = f3;
        this.f18730e = f4;
        this.f18731f = (f4 + f5) % 360.0f;
        this.f18732g.clear();
        this.f18733h.clear();
    }
}
