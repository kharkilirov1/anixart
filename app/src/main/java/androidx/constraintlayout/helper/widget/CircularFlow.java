package androidx.constraintlayout.helper.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.C0218R;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import java.util.Arrays;
import p000a.C0000a;

/* loaded from: classes.dex */
public class CircularFlow extends VirtualLayout {

    /* renamed from: v */
    public static int f2412v;

    /* renamed from: w */
    public static float f2413w;

    /* renamed from: l */
    public ConstraintLayout f2414l;

    /* renamed from: m */
    public int f2415m;

    /* renamed from: n */
    public float[] f2416n;

    /* renamed from: o */
    public int[] f2417o;

    /* renamed from: p */
    public int f2418p;

    /* renamed from: q */
    public int f2419q;

    /* renamed from: r */
    public String f2420r;

    /* renamed from: s */
    public String f2421s;

    /* renamed from: t */
    public Float f2422t;

    /* renamed from: u */
    public Integer f2423u;

    private void setAngles(String str) {
        if (str == null) {
            return;
        }
        int i2 = 0;
        this.f2419q = 0;
        while (true) {
            int indexOf = str.indexOf(44, i2);
            if (indexOf == -1) {
                m1377r(str.substring(i2).trim());
                return;
            } else {
                m1377r(str.substring(i2, indexOf).trim());
                i2 = indexOf + 1;
            }
        }
    }

    private void setRadius(String str) {
        if (str == null) {
            return;
        }
        int i2 = 0;
        this.f2418p = 0;
        while (true) {
            int indexOf = str.indexOf(44, i2);
            if (indexOf == -1) {
                m1378s(str.substring(i2).trim());
                return;
            } else {
                m1378s(str.substring(i2, indexOf).trim());
                i2 = indexOf + 1;
            }
        }
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.f2416n, this.f2419q);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.f2417o, this.f2418p);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: l */
    public void mo1376l(AttributeSet attributeSet) {
        super.mo1376l(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0218R.styleable.f3026b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 33) {
                    this.f2415m = obtainStyledAttributes.getResourceId(index, 0);
                } else if (index == 29) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f2420r = string;
                    setAngles(string);
                } else if (index == 32) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f2421s = string2;
                    setRadius(string2);
                } else if (index == 30) {
                    Float valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, f2413w));
                    this.f2422t = valueOf;
                    setDefaultAngle(valueOf.floatValue());
                } else if (index == 31) {
                    Integer valueOf2 = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, f2412v));
                    this.f2423u = valueOf2;
                    setDefaultRadius(valueOf2.intValue());
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f2420r;
        if (str != null) {
            this.f2416n = new float[1];
            setAngles(str);
        }
        String str2 = this.f2421s;
        if (str2 != null) {
            this.f2417o = new int[1];
            setRadius(str2);
        }
        Float f2 = this.f2422t;
        if (f2 != null) {
            setDefaultAngle(f2.floatValue());
        }
        Integer num = this.f2423u;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        this.f2414l = (ConstraintLayout) getParent();
        for (int i2 = 0; i2 < this.f2757c; i2++) {
            View m1433e = this.f2414l.m1433e(this.f2756b[i2]);
            if (m1433e != null) {
                int i3 = f2412v;
                float f3 = f2413w;
                int[] iArr = this.f2417o;
                if (iArr == null || i2 >= iArr.length) {
                    Integer num2 = this.f2423u;
                    if (num2 == null || num2.intValue() == -1) {
                        StringBuilder m24u = C0000a.m24u("Added radius to view with id: ");
                        m24u.append(this.f2763i.get(Integer.valueOf(m1433e.getId())));
                        Log.e("CircularFlow", m24u.toString());
                    } else {
                        this.f2418p++;
                        if (this.f2417o == null) {
                            this.f2417o = new int[1];
                        }
                        int[] radius = getRadius();
                        this.f2417o = radius;
                        radius[this.f2418p - 1] = i3;
                    }
                } else {
                    i3 = iArr[i2];
                }
                float[] fArr = this.f2416n;
                if (fArr == null || i2 >= fArr.length) {
                    Float f4 = this.f2422t;
                    if (f4 == null || f4.floatValue() == -1.0f) {
                        StringBuilder m24u2 = C0000a.m24u("Added angle to view with id: ");
                        m24u2.append(this.f2763i.get(Integer.valueOf(m1433e.getId())));
                        Log.e("CircularFlow", m24u2.toString());
                    } else {
                        this.f2419q++;
                        if (this.f2416n == null) {
                            this.f2416n = new float[1];
                        }
                        float[] angles = getAngles();
                        this.f2416n = angles;
                        angles[this.f2419q - 1] = f3;
                    }
                } else {
                    f3 = fArr[i2];
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) m1433e.getLayoutParams();
                layoutParams.f2843r = f3;
                layoutParams.f2839p = this.f2415m;
                layoutParams.f2841q = i3;
                m1433e.setLayoutParams(layoutParams);
            }
        }
        m1424f();
    }

    /* renamed from: r */
    public final void m1377r(String str) {
        float[] fArr;
        if (str == null || str.length() == 0 || this.f2758d == null || (fArr = this.f2416n) == null) {
            return;
        }
        if (this.f2419q + 1 > fArr.length) {
            this.f2416n = Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.f2416n[this.f2419q] = Integer.parseInt(str);
        this.f2419q++;
    }

    /* renamed from: s */
    public final void m1378s(String str) {
        int[] iArr;
        if (str == null || str.length() == 0 || this.f2758d == null || (iArr = this.f2417o) == null) {
            return;
        }
        if (this.f2418p + 1 > iArr.length) {
            this.f2417o = Arrays.copyOf(iArr, iArr.length + 1);
        }
        this.f2417o[this.f2418p] = (int) (Integer.parseInt(str) * this.f2758d.getResources().getDisplayMetrics().density);
        this.f2418p++;
    }

    public void setDefaultAngle(float f2) {
        f2413w = f2;
    }

    public void setDefaultRadius(int i2) {
        f2412v = i2;
    }
}
