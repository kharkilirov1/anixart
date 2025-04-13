package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.FloatRect;
import java.util.HashMap;

/* loaded from: classes.dex */
public class MotionKeyTrigger extends MotionKey {

    /* renamed from: q */
    public float f2017q;

    /* renamed from: e */
    public int f2005e = -1;

    /* renamed from: f */
    public String f2006f = null;

    /* renamed from: g */
    public int f2007g = -1;

    /* renamed from: h */
    public String f2008h = null;

    /* renamed from: i */
    public String f2009i = null;

    /* renamed from: j */
    public int f2010j = -1;

    /* renamed from: k */
    public int f2011k = -1;

    /* renamed from: l */
    public float f2012l = 0.1f;

    /* renamed from: m */
    public boolean f2013m = true;

    /* renamed from: n */
    public boolean f2014n = true;

    /* renamed from: o */
    public boolean f2015o = true;

    /* renamed from: p */
    public float f2016p = Float.NaN;

    /* renamed from: r */
    public boolean f2018r = false;

    /* renamed from: s */
    public FloatRect f2019s = new FloatRect();

    /* renamed from: t */
    public FloatRect f2020t = new FloatRect();

    public MotionKeyTrigger() {
        this.f1977d = 5;
        new HashMap();
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* renamed from: a */
    public MotionKey clone() {
        MotionKeyTrigger motionKeyTrigger = new MotionKeyTrigger();
        motionKeyTrigger.mo1216b(this);
        motionKeyTrigger.f2005e = this.f2005e;
        motionKeyTrigger.f2006f = this.f2006f;
        motionKeyTrigger.f2007g = this.f2007g;
        motionKeyTrigger.f2008h = this.f2008h;
        motionKeyTrigger.f2009i = this.f2009i;
        motionKeyTrigger.f2010j = this.f2010j;
        motionKeyTrigger.f2011k = this.f2011k;
        motionKeyTrigger.f2012l = this.f2012l;
        motionKeyTrigger.f2013m = this.f2013m;
        motionKeyTrigger.f2014n = this.f2014n;
        motionKeyTrigger.f2015o = this.f2015o;
        motionKeyTrigger.f2016p = this.f2016p;
        motionKeyTrigger.f2017q = this.f2017q;
        motionKeyTrigger.f2018r = this.f2018r;
        motionKeyTrigger.f2019s = this.f2019s;
        motionKeyTrigger.f2020t = this.f2020t;
        return motionKeyTrigger;
    }
}
