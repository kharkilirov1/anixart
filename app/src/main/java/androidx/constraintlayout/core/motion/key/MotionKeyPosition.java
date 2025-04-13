package androidx.constraintlayout.core.motion.key;

/* loaded from: classes.dex */
public class MotionKeyPosition extends MotionKey {

    /* renamed from: e */
    public String f1978e = null;

    /* renamed from: f */
    public int f1979f = -1;

    /* renamed from: g */
    public int f1980g = 0;

    /* renamed from: h */
    public float f1981h = Float.NaN;

    /* renamed from: i */
    public float f1982i = Float.NaN;

    /* renamed from: j */
    public float f1983j = Float.NaN;

    /* renamed from: k */
    public float f1984k = Float.NaN;

    /* renamed from: l */
    public float f1985l = Float.NaN;

    /* renamed from: m */
    public float f1986m = Float.NaN;

    /* renamed from: n */
    public float f1987n = Float.NaN;

    public MotionKeyPosition() {
        this.f1977d = 2;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* renamed from: a */
    public MotionKey clone() {
        MotionKeyPosition motionKeyPosition = new MotionKeyPosition();
        super.mo1216b(this);
        motionKeyPosition.f1978e = this.f1978e;
        motionKeyPosition.f1979f = this.f1979f;
        motionKeyPosition.f1980g = this.f1980g;
        motionKeyPosition.f1981h = this.f1981h;
        motionKeyPosition.f1982i = this.f1982i;
        motionKeyPosition.f1983j = this.f1983j;
        motionKeyPosition.f1984k = this.f1984k;
        motionKeyPosition.f1985l = this.f1985l;
        motionKeyPosition.f1986m = this.f1986m;
        motionKeyPosition.f1987n = this.f1987n;
        return motionKeyPosition;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* renamed from: b */
    public MotionKey mo1216b(MotionKey motionKey) {
        super.mo1216b(motionKey);
        MotionKeyPosition motionKeyPosition = (MotionKeyPosition) motionKey;
        this.f1978e = motionKeyPosition.f1978e;
        this.f1979f = motionKeyPosition.f1979f;
        this.f1980g = motionKeyPosition.f1980g;
        this.f1981h = motionKeyPosition.f1981h;
        this.f1982i = motionKeyPosition.f1982i;
        this.f1983j = motionKeyPosition.f1983j;
        this.f1984k = motionKeyPosition.f1984k;
        this.f1985l = motionKeyPosition.f1985l;
        this.f1986m = motionKeyPosition.f1986m;
        this.f1987n = motionKeyPosition.f1987n;
        return this;
    }
}
