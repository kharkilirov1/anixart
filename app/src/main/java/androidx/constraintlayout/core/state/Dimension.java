package androidx.constraintlayout.core.state;

/* loaded from: classes.dex */
public class Dimension {

    /* renamed from: b */
    public static final Object f2092b = new Object();

    /* renamed from: c */
    public static final Object f2093c = new Object();

    /* renamed from: a */
    public Object f2094a;

    public enum Type {
        /* JADX INFO: Fake field, exist only in values array */
        FIXED,
        /* JADX INFO: Fake field, exist only in values array */
        WRAP,
        /* JADX INFO: Fake field, exist only in values array */
        MATCH_PARENT,
        /* JADX INFO: Fake field, exist only in values array */
        MATCH_CONSTRAINT
    }

    public Dimension() {
        this.f2094a = f2093c;
    }

    public Dimension(Object obj) {
        this.f2094a = f2093c;
        this.f2094a = obj;
    }
}
