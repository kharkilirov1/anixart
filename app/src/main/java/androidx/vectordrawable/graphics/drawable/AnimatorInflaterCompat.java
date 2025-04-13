package androidx.vectordrawable.graphics.drawable;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser;
import java.util.ArrayList;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;

@RestrictTo
/* loaded from: classes.dex */
public class AnimatorInflaterCompat {

    public static class PathDataEvaluator implements TypeEvaluator<PathParser.PathDataNode[]> {

        /* renamed from: a */
        public PathParser.PathDataNode[] f6404a;

        @Override // android.animation.TypeEvaluator
        public PathParser.PathDataNode[] evaluate(float f2, PathParser.PathDataNode[] pathDataNodeArr, PathParser.PathDataNode[] pathDataNodeArr2) {
            PathParser.PathDataNode[] pathDataNodeArr3 = pathDataNodeArr;
            PathParser.PathDataNode[] pathDataNodeArr4 = pathDataNodeArr2;
            if (!PathParser.m1786a(pathDataNodeArr3, pathDataNodeArr4)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!PathParser.m1786a(this.f6404a, pathDataNodeArr3)) {
                this.f6404a = PathParser.m1790e(pathDataNodeArr3);
            }
            for (int i2 = 0; i2 < pathDataNodeArr3.length; i2++) {
                PathParser.PathDataNode pathDataNode = this.f6404a[i2];
                PathParser.PathDataNode pathDataNode2 = pathDataNodeArr3[i2];
                PathParser.PathDataNode pathDataNode3 = pathDataNodeArr4[i2];
                Objects.requireNonNull(pathDataNode);
                pathDataNode.f3374a = pathDataNode2.f3374a;
                int i3 = 0;
                while (true) {
                    float[] fArr = pathDataNode2.f3375b;
                    if (i3 < fArr.length) {
                        pathDataNode.f3375b[i3] = (pathDataNode3.f3375b[i3] * f2) + ((1.0f - f2) * fArr[i3]);
                        i3++;
                    }
                }
            }
            return this.f6404a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0360, code lost:
    
        if (r2.hasNext() == false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0362, code lost:
    
        r1[r3] = (android.animation.Animator) r2.next();
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x036e, code lost:
    
        if (r27 != 0) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0370, code lost:
    
        r26.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0374, code lost:
    
        r26.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0377, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x034d, code lost:
    
        if (r26 == null) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x034f, code lost:
    
        if (r13 == null) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0351, code lost:
    
        r1 = new android.animation.Animator[r13.size()];
        r2 = r13.iterator();
        r3 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.Animator m4298a(android.content.Context r21, android.content.res.Resources r22, android.content.res.Resources.Theme r23, org.xmlpull.v1.XmlPullParser r24, android.util.AttributeSet r25, android.animation.AnimatorSet r26, int r27, float r28) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 888
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.AnimatorInflaterCompat.m4298a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* renamed from: b */
    public static Keyframe m4299b(Keyframe keyframe, float f2) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f2) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f2) : Keyframe.ofObject(f2);
    }

    /* renamed from: c */
    public static PropertyValuesHolder m4300c(TypedArray typedArray, int i2, int i3, int i4, String str) {
        PropertyValuesHolder ofInt;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i3);
        boolean z = peekValue != null;
        int i5 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i4);
        boolean z2 = peekValue2 != null;
        int i6 = z2 ? peekValue2.type : 0;
        if (i2 == 4) {
            i2 = ((z && m4301d(i5)) || (z2 && m4301d(i6))) ? 3 : 0;
        }
        boolean z3 = i2 == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i2 != 2) {
            ArgbEvaluator argbEvaluator = i2 == 3 ? ArgbEvaluator.f6405a : null;
            if (z3) {
                if (z) {
                    float dimension = i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f);
                    if (z2) {
                        ofInt = PropertyValuesHolder.ofFloat(str, dimension, i6 == 5 ? typedArray.getDimension(i4, 0.0f) : typedArray.getFloat(i4, 0.0f));
                    } else {
                        ofInt = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    ofInt = PropertyValuesHolder.ofFloat(str, i6 == 5 ? typedArray.getDimension(i4, 0.0f) : typedArray.getFloat(i4, 0.0f));
                }
            } else {
                if (!z) {
                    if (z2) {
                        ofInt = PropertyValuesHolder.ofInt(str, i6 == 5 ? (int) typedArray.getDimension(i4, 0.0f) : m4301d(i6) ? typedArray.getColor(i4, 0) : typedArray.getInt(i4, 0));
                    }
                    if (propertyValuesHolder == null && argbEvaluator != null) {
                        propertyValuesHolder.setEvaluator(argbEvaluator);
                        return propertyValuesHolder;
                    }
                }
                int dimension2 = i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m4301d(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0);
                if (z2) {
                    ofInt = PropertyValuesHolder.ofInt(str, dimension2, i6 == 5 ? (int) typedArray.getDimension(i4, 0.0f) : m4301d(i6) ? typedArray.getColor(i4, 0) : typedArray.getInt(i4, 0));
                } else {
                    ofInt = PropertyValuesHolder.ofInt(str, dimension2);
                }
            }
            propertyValuesHolder = ofInt;
            return propertyValuesHolder == null ? propertyValuesHolder : propertyValuesHolder;
        }
        String string = typedArray.getString(i3);
        String string2 = typedArray.getString(i4);
        PathParser.PathDataNode[] m1788c = PathParser.m1788c(string);
        PathParser.PathDataNode[] m1788c2 = PathParser.m1788c(string2);
        if (m1788c == null && m1788c2 == null) {
            return null;
        }
        if (m1788c == null) {
            if (m1788c2 != null) {
                return PropertyValuesHolder.ofObject(str, new PathDataEvaluator(), m1788c2);
            }
            return null;
        }
        PathDataEvaluator pathDataEvaluator = new PathDataEvaluator();
        if (m1788c2 == null) {
            ofObject = PropertyValuesHolder.ofObject(str, pathDataEvaluator, m1788c);
        } else {
            if (!PathParser.m1786a(m1788c, m1788c2)) {
                throw new InflateException(" Can't morph from " + string + " to " + string2);
            }
            ofObject = PropertyValuesHolder.ofObject(str, pathDataEvaluator, m1788c, m1788c2);
        }
        return ofObject;
    }

    /* renamed from: d */
    public static boolean m4301d(int i2) {
        return i2 >= 28 && i2 <= 31;
    }

    /* renamed from: e */
    public static ValueAnimator m4302e(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f2, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ValueAnimator valueAnimator2;
        TypedArray typedArray;
        TypedArray typedArray2;
        ValueAnimator valueAnimator3;
        TypedArray m1757i = TypedArrayUtils.m1757i(resources, theme, attributeSet, AndroidResources.f6382g);
        TypedArray m1757i2 = TypedArrayUtils.m1757i(resources, theme, attributeSet, AndroidResources.f6386k);
        ValueAnimator valueAnimator4 = valueAnimator == null ? new ValueAnimator() : valueAnimator;
        long j2 = TypedArrayUtils.m1756h(xmlPullParser, "duration") ? m1757i.getInt(1, 300) : 300;
        int i2 = 0;
        long j3 = !TypedArrayUtils.m1756h(xmlPullParser, "startOffset") ? 0 : m1757i.getInt(2, 0);
        int i3 = !TypedArrayUtils.m1756h(xmlPullParser, "valueType") ? 4 : m1757i.getInt(7, 4);
        if (TypedArrayUtils.m1756h(xmlPullParser, "valueFrom") && TypedArrayUtils.m1756h(xmlPullParser, "valueTo")) {
            if (i3 == 4) {
                TypedValue peekValue = m1757i.peekValue(5);
                boolean z = peekValue != null;
                int i4 = z ? peekValue.type : 0;
                TypedValue peekValue2 = m1757i.peekValue(6);
                boolean z2 = peekValue2 != null;
                i3 = ((z && m4301d(i4)) || (z2 && m4301d(z2 ? peekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder m4300c = m4300c(m1757i, i3, 5, 6, "");
            if (m4300c != null) {
                valueAnimator4.setValues(m4300c);
            }
        }
        valueAnimator4.setDuration(j2);
        valueAnimator4.setStartDelay(j3);
        valueAnimator4.setRepeatCount(!TypedArrayUtils.m1756h(xmlPullParser, "repeatCount") ? 0 : m1757i.getInt(3, 0));
        valueAnimator4.setRepeatMode(!TypedArrayUtils.m1756h(xmlPullParser, "repeatMode") ? 1 : m1757i.getInt(4, 1));
        if (m1757i2 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator4;
            String m1752d = TypedArrayUtils.m1752d(m1757i2, xmlPullParser, "pathData", 1);
            if (m1752d != null) {
                String m1752d2 = TypedArrayUtils.m1752d(m1757i2, xmlPullParser, "propertyXName", 2);
                String m1752d3 = TypedArrayUtils.m1752d(m1757i2, xmlPullParser, "propertyYName", 3);
                if (m1752d2 == null && m1752d3 == null) {
                    throw new InflateException(m1757i2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path m1789d = PathParser.m1789d(m1752d);
                float f3 = 0.5f * f2;
                PathMeasure pathMeasure = new PathMeasure(m1789d, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f4 = 0.0f;
                do {
                    f4 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f4));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(m1789d, false);
                int min = Math.min(100, ((int) (f4 / f3)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f5 = f4 / (min - 1);
                valueAnimator2 = valueAnimator4;
                typedArray = m1757i;
                int i5 = 0;
                float f6 = 0.0f;
                while (true) {
                    if (i2 >= min) {
                        break;
                    }
                    int i6 = min;
                    pathMeasure2.getPosTan(f6 - ((Float) arrayList.get(i5)).floatValue(), fArr3, null);
                    fArr[i2] = fArr3[0];
                    fArr2[i2] = fArr3[1];
                    f6 += f5;
                    int i7 = i5 + 1;
                    if (i7 < arrayList.size() && f6 > ((Float) arrayList.get(i7)).floatValue()) {
                        pathMeasure2.nextContour();
                        i5 = i7;
                    }
                    i2++;
                    min = i6;
                }
                PropertyValuesHolder ofFloat = m1752d2 != null ? PropertyValuesHolder.ofFloat(m1752d2, fArr) : null;
                PropertyValuesHolder ofFloat2 = m1752d3 != null ? PropertyValuesHolder.ofFloat(m1752d3, fArr2) : null;
                if (ofFloat == null) {
                    i2 = 0;
                    objectAnimator.setValues(ofFloat2);
                } else {
                    i2 = 0;
                    if (ofFloat2 == null) {
                        objectAnimator.setValues(ofFloat);
                    } else {
                        objectAnimator.setValues(ofFloat, ofFloat2);
                    }
                }
            } else {
                valueAnimator2 = valueAnimator4;
                typedArray = m1757i;
                objectAnimator.setPropertyName(TypedArrayUtils.m1752d(m1757i2, xmlPullParser, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator4;
            typedArray = m1757i;
        }
        if (TypedArrayUtils.m1756h(xmlPullParser, "interpolator")) {
            typedArray2 = typedArray;
            i2 = typedArray2.getResourceId(i2, i2);
        } else {
            typedArray2 = typedArray;
        }
        if (i2 > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(AnimationUtils.loadInterpolator(context, i2));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        typedArray2.recycle();
        if (m1757i2 != null) {
            m1757i2.recycle();
        }
        return valueAnimator3;
    }
}
