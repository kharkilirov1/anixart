package androidx.transition;

import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p000a.C0000a;

/* loaded from: classes.dex */
public class TransitionValues {

    /* renamed from: b */
    public View f6318b;

    /* renamed from: a */
    public final Map<String, Object> f6317a = new HashMap();

    /* renamed from: c */
    public final ArrayList<Transition> f6319c = new ArrayList<>();

    @Deprecated
    public TransitionValues() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TransitionValues)) {
            return false;
        }
        TransitionValues transitionValues = (TransitionValues) obj;
        return this.f6318b == transitionValues.f6318b && this.f6317a.equals(transitionValues.f6317a);
    }

    public int hashCode() {
        return this.f6317a.hashCode() + (this.f6318b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("TransitionValues@");
        m24u.append(Integer.toHexString(hashCode()));
        m24u.append(":\n");
        StringBuilder m27x = C0000a.m27x(m24u.toString(), "    view = ");
        m27x.append(this.f6318b);
        m27x.append("\n");
        String m14k = C0000a.m14k(m27x.toString(), "    values:");
        for (String str : this.f6317a.keySet()) {
            m14k = m14k + "    " + str + ": " + this.f6317a.get(str) + "\n";
        }
        return m14k;
    }

    public TransitionValues(@NonNull View view) {
        this.f6318b = view;
    }
}
