package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* loaded from: classes.dex */
public abstract class MotionKey implements TypedValues {

    /* renamed from: a */
    public int f1974a = -1;

    /* renamed from: b */
    public int f1975b = -1;

    /* renamed from: c */
    public String f1976c = null;

    /* renamed from: d */
    public int f1977d;

    @Override // 
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract MotionKey clone();

    /* renamed from: b */
    public MotionKey mo1216b(MotionKey motionKey) {
        this.f1974a = motionKey.f1974a;
        this.f1975b = motionKey.f1975b;
        this.f1976c = motionKey.f1976c;
        this.f1977d = motionKey.f1977d;
        return this;
    }
}
