package androidx.constraintlayout.motion.widget;

import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class Key {

    /* renamed from: a */
    public int f2449a = -1;

    /* renamed from: b */
    public int f2450b = -1;

    /* renamed from: c */
    public String f2451c = null;

    /* renamed from: d */
    public int f2452d;

    /* renamed from: e */
    public HashMap<String, ConstraintAttribute> f2453e;

    @Override // 
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract Key clone();

    /* renamed from: b */
    public Key m1392b(Key key) {
        this.f2449a = key.f2449a;
        this.f2450b = key.f2450b;
        this.f2451c = key.f2451c;
        this.f2452d = key.f2452d;
        this.f2453e = key.f2453e;
        return this;
    }
}
