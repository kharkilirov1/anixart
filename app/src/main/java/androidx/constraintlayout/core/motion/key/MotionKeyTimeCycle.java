package androidx.constraintlayout.core.motion.key;

import java.util.HashMap;

/* loaded from: classes.dex */
public class MotionKeyTimeCycle extends MotionKey {

    /* renamed from: e */
    public String f1988e;

    /* renamed from: f */
    public int f1989f = -1;

    /* renamed from: g */
    public float f1990g = Float.NaN;

    /* renamed from: h */
    public float f1991h = Float.NaN;

    /* renamed from: i */
    public float f1992i = Float.NaN;

    /* renamed from: j */
    public float f1993j = Float.NaN;

    /* renamed from: k */
    public float f1994k = Float.NaN;

    /* renamed from: l */
    public float f1995l = Float.NaN;

    /* renamed from: m */
    public float f1996m = Float.NaN;

    /* renamed from: n */
    public float f1997n = Float.NaN;

    /* renamed from: o */
    public float f1998o = Float.NaN;

    /* renamed from: p */
    public float f1999p = Float.NaN;

    /* renamed from: q */
    public float f2000q = Float.NaN;

    /* renamed from: r */
    public float f2001r = Float.NaN;

    /* renamed from: s */
    public int f2002s = 0;

    /* renamed from: t */
    public float f2003t = Float.NaN;

    /* renamed from: u */
    public float f2004u = 0.0f;

    public MotionKeyTimeCycle() {
        this.f1977d = 3;
        new HashMap();
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* renamed from: a */
    public MotionKey clone() {
        MotionKeyTimeCycle motionKeyTimeCycle = new MotionKeyTimeCycle();
        motionKeyTimeCycle.mo1216b(this);
        motionKeyTimeCycle.f1988e = this.f1988e;
        motionKeyTimeCycle.f1989f = this.f1989f;
        motionKeyTimeCycle.f2002s = this.f2002s;
        motionKeyTimeCycle.f2003t = this.f2003t;
        motionKeyTimeCycle.f2004u = this.f2004u;
        motionKeyTimeCycle.f2001r = this.f2001r;
        motionKeyTimeCycle.f1990g = this.f1990g;
        motionKeyTimeCycle.f1991h = this.f1991h;
        motionKeyTimeCycle.f1992i = this.f1992i;
        motionKeyTimeCycle.f1995l = this.f1995l;
        motionKeyTimeCycle.f1993j = this.f1993j;
        motionKeyTimeCycle.f1994k = this.f1994k;
        motionKeyTimeCycle.f1996m = this.f1996m;
        motionKeyTimeCycle.f1997n = this.f1997n;
        motionKeyTimeCycle.f1998o = this.f1998o;
        motionKeyTimeCycle.f1999p = this.f1999p;
        motionKeyTimeCycle.f2000q = this.f2000q;
        return motionKeyTimeCycle;
    }
}
