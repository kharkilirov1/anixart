package androidx.constraintlayout.core;

import androidx.constraintlayout.core.Pools;

/* loaded from: classes.dex */
public class Cache {

    /* renamed from: a */
    public Pools.Pool<ArrayRow> f1899a = new Pools.SimplePool(256);

    /* renamed from: b */
    public Pools.Pool<ArrayRow> f1900b = new Pools.SimplePool(256);

    /* renamed from: c */
    public Pools.Pool<SolverVariable> f1901c = new Pools.SimplePool(256);

    /* renamed from: d */
    public SolverVariable[] f1902d = new SolverVariable[32];
}
