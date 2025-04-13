package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class ConstraintLayoutStates {

    /* renamed from: a */
    public final ConstraintLayout f2861a;

    /* renamed from: b */
    public int f2862b = -1;

    /* renamed from: c */
    public int f2863c = -1;

    /* renamed from: d */
    public SparseArray<State> f2864d = new SparseArray<>();

    /* renamed from: e */
    public SparseArray<ConstraintSet> f2865e = new SparseArray<>();

    /* renamed from: f */
    public ConstraintsChangedListener f2866f = null;

    public static class State {

        /* renamed from: a */
        public int f2867a;

        /* renamed from: b */
        public ArrayList<Variant> f2868b = new ArrayList<>();

        /* renamed from: c */
        public int f2869c;

        /* renamed from: d */
        public ConstraintSet f2870d;

        public State(Context context, XmlPullParser xmlPullParser) {
            this.f2869c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0218R.styleable.f3034j);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 0) {
                    this.f2867a = obtainStyledAttributes.getResourceId(index, this.f2867a);
                } else if (index == 1) {
                    this.f2869c = obtainStyledAttributes.getResourceId(index, this.f2869c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2869c);
                    context.getResources().getResourceName(this.f2869c);
                    if ("layout".equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.f2870d = constraintSet;
                        constraintSet.m1451c((ConstraintLayout) LayoutInflater.from(context).inflate(this.f2869c, (ViewGroup) null));
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public int m1445a(float f2, float f3) {
            for (int i2 = 0; i2 < this.f2868b.size(); i2++) {
                if (this.f2868b.get(i2).m1446a(f2, f3)) {
                    return i2;
                }
            }
            return -1;
        }
    }

    public static class Variant {

        /* renamed from: a */
        public float f2871a;

        /* renamed from: b */
        public float f2872b;

        /* renamed from: c */
        public float f2873c;

        /* renamed from: d */
        public float f2874d;

        /* renamed from: e */
        public int f2875e;

        /* renamed from: f */
        public ConstraintSet f2876f;

        public Variant(Context context, XmlPullParser xmlPullParser) {
            this.f2871a = Float.NaN;
            this.f2872b = Float.NaN;
            this.f2873c = Float.NaN;
            this.f2874d = Float.NaN;
            this.f2875e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0218R.styleable.f3036l);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 0) {
                    this.f2875e = obtainStyledAttributes.getResourceId(index, this.f2875e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2875e);
                    context.getResources().getResourceName(this.f2875e);
                    if ("layout".equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.f2876f = constraintSet;
                        constraintSet.m1451c((ConstraintLayout) LayoutInflater.from(context).inflate(this.f2875e, (ViewGroup) null));
                    }
                } else if (index == 1) {
                    this.f2874d = obtainStyledAttributes.getDimension(index, this.f2874d);
                } else if (index == 2) {
                    this.f2872b = obtainStyledAttributes.getDimension(index, this.f2872b);
                } else if (index == 3) {
                    this.f2873c = obtainStyledAttributes.getDimension(index, this.f2873c);
                } else if (index == 4) {
                    this.f2871a = obtainStyledAttributes.getDimension(index, this.f2871a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public boolean m1446a(float f2, float f3) {
            if (!Float.isNaN(this.f2871a) && f2 < this.f2871a) {
                return false;
            }
            if (!Float.isNaN(this.f2872b) && f3 < this.f2872b) {
                return false;
            }
            if (Float.isNaN(this.f2873c) || f2 <= this.f2873c) {
                return Float.isNaN(this.f2874d) || f3 <= this.f2874d;
            }
            return false;
        }
    }

    public ConstraintLayoutStates(Context context, ConstraintLayout constraintLayout, int i2) {
        State state = null;
        this.f2861a = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            int eventType = xml.getEventType();
            while (true) {
                char c2 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    if (c2 == 2) {
                        State state2 = new State(context, xml);
                        this.f2864d.put(state2.f2867a, state2);
                        state = state2;
                    } else if (c2 == 3) {
                        Variant variant = new Variant(context, xml);
                        if (state != null) {
                            state.f2868b.add(variant);
                        }
                    } else if (c2 == 4) {
                        m1443a(context, xml);
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0228, code lost:
    
        continue;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1443a(android.content.Context r12, org.xmlpull.v1.XmlPullParser r13) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayoutStates.m1443a(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    /* renamed from: b */
    public void m1444b(int i2, float f2, float f3) {
        int m1445a;
        int i3 = this.f2862b;
        if (i3 == i2) {
            State valueAt = i2 == -1 ? this.f2864d.valueAt(0) : this.f2864d.get(i3);
            int i4 = this.f2863c;
            if ((i4 == -1 || !valueAt.f2868b.get(i4).m1446a(f2, f3)) && this.f2863c != (m1445a = valueAt.m1445a(f2, f3))) {
                ConstraintSet constraintSet = m1445a == -1 ? null : valueAt.f2868b.get(m1445a).f2876f;
                if (m1445a != -1) {
                    int i5 = valueAt.f2868b.get(m1445a).f2875e;
                }
                if (constraintSet == null) {
                    return;
                }
                this.f2863c = m1445a;
                ConstraintsChangedListener constraintsChangedListener = this.f2866f;
                if (constraintsChangedListener != null) {
                    Objects.requireNonNull(constraintsChangedListener);
                }
                constraintSet.m1449a(this.f2861a);
                ConstraintsChangedListener constraintsChangedListener2 = this.f2866f;
                if (constraintsChangedListener2 != null) {
                    Objects.requireNonNull(constraintsChangedListener2);
                    return;
                }
                return;
            }
            return;
        }
        this.f2862b = i2;
        State state = this.f2864d.get(i2);
        int m1445a2 = state.m1445a(f2, f3);
        ConstraintSet constraintSet2 = m1445a2 == -1 ? state.f2870d : state.f2868b.get(m1445a2).f2876f;
        if (m1445a2 != -1) {
            int i6 = state.f2868b.get(m1445a2).f2875e;
        }
        if (constraintSet2 == null) {
            Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i2 + ", dim =" + f2 + ", " + f3);
            return;
        }
        this.f2863c = m1445a2;
        ConstraintsChangedListener constraintsChangedListener3 = this.f2866f;
        if (constraintsChangedListener3 != null) {
            Objects.requireNonNull(constraintsChangedListener3);
        }
        constraintSet2.m1449a(this.f2861a);
        ConstraintsChangedListener constraintsChangedListener4 = this.f2866f;
        if (constraintsChangedListener4 != null) {
            Objects.requireNonNull(constraintsChangedListener4);
        }
    }
}
