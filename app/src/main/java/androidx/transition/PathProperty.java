package androidx.transition;

import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* loaded from: classes.dex */
class PathProperty<T> extends Property<T, Float> {

    /* renamed from: a */
    public final Property<T, PointF> f6240a;

    /* renamed from: b */
    public final PathMeasure f6241b;

    /* renamed from: c */
    public final float f6242c;

    /* renamed from: d */
    public final float[] f6243d;

    /* renamed from: e */
    public final PointF f6244e;

    /* renamed from: f */
    public float f6245f;

    @Override // android.util.Property
    public Float get(Object obj) {
        return Float.valueOf(this.f6245f);
    }

    @Override // android.util.Property
    public void set(Object obj, Float f2) {
        Float f3 = f2;
        this.f6245f = f3.floatValue();
        this.f6241b.getPosTan(f3.floatValue() * this.f6242c, this.f6243d, null);
        PointF pointF = this.f6244e;
        float[] fArr = this.f6243d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f6240a.set(obj, pointF);
    }
}
