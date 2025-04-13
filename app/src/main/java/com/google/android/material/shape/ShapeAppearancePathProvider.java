package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import java.util.Objects;

/* loaded from: classes.dex */
public class ShapeAppearancePathProvider {

    /* renamed from: a */
    public final ShapePath[] f18708a = new ShapePath[4];

    /* renamed from: b */
    public final Matrix[] f18709b = new Matrix[4];

    /* renamed from: c */
    public final Matrix[] f18710c = new Matrix[4];

    /* renamed from: d */
    public final PointF f18711d = new PointF();

    /* renamed from: e */
    public final Path f18712e = new Path();

    /* renamed from: f */
    public final Path f18713f = new Path();

    /* renamed from: g */
    public final ShapePath f18714g = new ShapePath();

    /* renamed from: h */
    public final float[] f18715h = new float[2];

    /* renamed from: i */
    public final float[] f18716i = new float[2];

    /* renamed from: j */
    public final Path f18717j = new Path();

    /* renamed from: k */
    public final Path f18718k = new Path();

    /* renamed from: l */
    public boolean f18719l = true;

    public static class Lazy {

        /* renamed from: a */
        public static final ShapeAppearancePathProvider f18720a = new ShapeAppearancePathProvider();
    }

    @RestrictTo
    public interface PathListener {
        /* renamed from: a */
        void mo10304a(ShapePath shapePath, Matrix matrix, int i2);

        /* renamed from: b */
        void mo10305b(ShapePath shapePath, Matrix matrix, int i2);
    }

    public static final class ShapeAppearancePathSpec {

        /* renamed from: a */
        @NonNull
        public final ShapeAppearanceModel f18721a;

        /* renamed from: b */
        @NonNull
        public final Path f18722b;

        /* renamed from: c */
        @NonNull
        public final RectF f18723c;

        /* renamed from: d */
        @Nullable
        public final PathListener f18724d;

        /* renamed from: e */
        public final float f18725e;

        public ShapeAppearancePathSpec(@NonNull ShapeAppearanceModel shapeAppearanceModel, float f2, RectF rectF, @Nullable PathListener pathListener, Path path) {
            this.f18724d = pathListener;
            this.f18721a = shapeAppearanceModel;
            this.f18725e = f2;
            this.f18723c = rectF;
            this.f18722b = path;
        }
    }

    public ShapeAppearancePathProvider() {
        for (int i2 = 0; i2 < 4; i2++) {
            this.f18708a[i2] = new ShapePath();
            this.f18709b[i2] = new Matrix();
            this.f18710c[i2] = new Matrix();
        }
    }

    @NonNull
    @RestrictTo
    @UiThread
    /* renamed from: c */
    public static ShapeAppearancePathProvider m10326c() {
        return Lazy.f18720a;
    }

    /* renamed from: a */
    public void m10327a(ShapeAppearanceModel shapeAppearanceModel, float f2, RectF rectF, @NonNull Path path) {
        m10328b(shapeAppearanceModel, f2, rectF, null, path);
    }

    @RestrictTo
    /* renamed from: b */
    public void m10328b(ShapeAppearanceModel shapeAppearanceModel, float f2, RectF rectF, PathListener pathListener, @NonNull Path path) {
        path.rewind();
        this.f18712e.rewind();
        this.f18713f.rewind();
        this.f18713f.addRect(rectF, Path.Direction.CW);
        ShapeAppearancePathSpec shapeAppearancePathSpec = new ShapeAppearancePathSpec(shapeAppearanceModel, f2, rectF, pathListener, path);
        int i2 = 0;
        while (i2 < 4) {
            ShapeAppearanceModel shapeAppearanceModel2 = shapeAppearancePathSpec.f18721a;
            CornerSize cornerSize = i2 != 1 ? i2 != 2 ? i2 != 3 ? shapeAppearanceModel2.f18689f : shapeAppearanceModel2.f18688e : shapeAppearanceModel2.f18691h : shapeAppearanceModel2.f18690g;
            CornerTreatment cornerTreatment = i2 != 1 ? i2 != 2 ? i2 != 3 ? shapeAppearanceModel2.f18685b : shapeAppearanceModel2.f18684a : shapeAppearanceModel2.f18687d : shapeAppearanceModel2.f18686c;
            ShapePath shapePath = this.f18708a[i2];
            float f3 = shapeAppearancePathSpec.f18725e;
            RectF rectF2 = shapeAppearancePathSpec.f18723c;
            Objects.requireNonNull(cornerTreatment);
            cornerTreatment.mo10266a(shapePath, 90.0f, f3, cornerSize.mo10265a(rectF2));
            int i3 = i2 + 1;
            float f4 = (i3 % 4) * 90;
            this.f18709b[i2].reset();
            RectF rectF3 = shapeAppearancePathSpec.f18723c;
            PointF pointF = this.f18711d;
            if (i2 == 1) {
                pointF.set(rectF3.right, rectF3.bottom);
            } else if (i2 == 2) {
                pointF.set(rectF3.left, rectF3.bottom);
            } else if (i2 != 3) {
                pointF.set(rectF3.right, rectF3.top);
            } else {
                pointF.set(rectF3.left, rectF3.top);
            }
            Matrix matrix = this.f18709b[i2];
            PointF pointF2 = this.f18711d;
            matrix.setTranslate(pointF2.x, pointF2.y);
            this.f18709b[i2].preRotate(f4);
            float[] fArr = this.f18715h;
            ShapePath[] shapePathArr = this.f18708a;
            fArr[0] = shapePathArr[i2].f18728c;
            fArr[1] = shapePathArr[i2].f18729d;
            this.f18709b[i2].mapPoints(fArr);
            this.f18710c[i2].reset();
            Matrix matrix2 = this.f18710c[i2];
            float[] fArr2 = this.f18715h;
            matrix2.setTranslate(fArr2[0], fArr2[1]);
            this.f18710c[i2].preRotate(f4);
            i2 = i3;
        }
        int i4 = 0;
        while (i4 < 4) {
            float[] fArr3 = this.f18715h;
            ShapePath[] shapePathArr2 = this.f18708a;
            fArr3[0] = shapePathArr2[i4].f18726a;
            fArr3[1] = shapePathArr2[i4].f18727b;
            this.f18709b[i4].mapPoints(fArr3);
            if (i4 == 0) {
                Path path2 = shapeAppearancePathSpec.f18722b;
                float[] fArr4 = this.f18715h;
                path2.moveTo(fArr4[0], fArr4[1]);
            } else {
                Path path3 = shapeAppearancePathSpec.f18722b;
                float[] fArr5 = this.f18715h;
                path3.lineTo(fArr5[0], fArr5[1]);
            }
            this.f18708a[i4].m10332c(this.f18709b[i4], shapeAppearancePathSpec.f18722b);
            PathListener pathListener2 = shapeAppearancePathSpec.f18724d;
            if (pathListener2 != null) {
                pathListener2.mo10304a(this.f18708a[i4], this.f18709b[i4], i4);
            }
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            float[] fArr6 = this.f18715h;
            ShapePath[] shapePathArr3 = this.f18708a;
            fArr6[0] = shapePathArr3[i4].f18728c;
            fArr6[1] = shapePathArr3[i4].f18729d;
            this.f18709b[i4].mapPoints(fArr6);
            float[] fArr7 = this.f18716i;
            ShapePath[] shapePathArr4 = this.f18708a;
            fArr7[0] = shapePathArr4[i6].f18726a;
            fArr7[1] = shapePathArr4[i6].f18727b;
            this.f18709b[i6].mapPoints(fArr7);
            float f5 = this.f18715h[0];
            float[] fArr8 = this.f18716i;
            float max = Math.max(((float) Math.hypot(f5 - fArr8[0], r10[1] - fArr8[1])) - 0.001f, 0.0f);
            RectF rectF4 = shapeAppearancePathSpec.f18723c;
            float[] fArr9 = this.f18715h;
            ShapePath[] shapePathArr5 = this.f18708a;
            fArr9[0] = shapePathArr5[i4].f18728c;
            fArr9[1] = shapePathArr5[i4].f18729d;
            this.f18709b[i4].mapPoints(fArr9);
            float abs = (i4 == 1 || i4 == 3) ? Math.abs(rectF4.centerX() - this.f18715h[0]) : Math.abs(rectF4.centerY() - this.f18715h[1]);
            this.f18714g.m10335f(0.0f, 0.0f);
            ShapeAppearanceModel shapeAppearanceModel3 = shapeAppearancePathSpec.f18721a;
            EdgeTreatment edgeTreatment = i4 != 1 ? i4 != 2 ? i4 != 3 ? shapeAppearanceModel3.f18693j : shapeAppearanceModel3.f18692i : shapeAppearanceModel3.f18695l : shapeAppearanceModel3.f18694k;
            edgeTreatment.mo9836b(max, abs, shapeAppearancePathSpec.f18725e, this.f18714g);
            this.f18717j.reset();
            this.f18714g.m10332c(this.f18710c[i4], this.f18717j);
            if (this.f18719l && (edgeTreatment.mo10267a() || m10329d(this.f18717j, i4) || m10329d(this.f18717j, i6))) {
                Path path4 = this.f18717j;
                path4.op(path4, this.f18713f, Path.Op.DIFFERENCE);
                float[] fArr10 = this.f18715h;
                ShapePath shapePath2 = this.f18714g;
                fArr10[0] = shapePath2.f18726a;
                fArr10[1] = shapePath2.f18727b;
                this.f18710c[i4].mapPoints(fArr10);
                Path path5 = this.f18712e;
                float[] fArr11 = this.f18715h;
                path5.moveTo(fArr11[0], fArr11[1]);
                this.f18714g.m10332c(this.f18710c[i4], this.f18712e);
            } else {
                this.f18714g.m10332c(this.f18710c[i4], shapeAppearancePathSpec.f18722b);
            }
            PathListener pathListener3 = shapeAppearancePathSpec.f18724d;
            if (pathListener3 != null) {
                pathListener3.mo10305b(this.f18714g, this.f18710c[i4], i4);
            }
            i4 = i5;
        }
        path.close();
        this.f18712e.close();
        if (this.f18712e.isEmpty()) {
            return;
        }
        path.op(this.f18712e, Path.Op.UNION);
    }

    @RequiresApi
    /* renamed from: d */
    public final boolean m10329d(Path path, int i2) {
        this.f18718k.reset();
        this.f18708a[i2].m10332c(this.f18709b[i2], this.f18718k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f18718k.computeBounds(rectF, true);
        path.op(this.f18718k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
