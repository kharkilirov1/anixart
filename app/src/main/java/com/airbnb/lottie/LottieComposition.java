package com.airbnb.lottie;

import android.graphics.Rect;
import androidx.annotation.RestrictTo;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.FontCharacter;
import com.airbnb.lottie.model.Marker;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.utils.Logger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class LottieComposition {

    /* renamed from: c */
    public Map<String, List<Layer>> f7141c;

    /* renamed from: d */
    public Map<String, LottieImageAsset> f7142d;

    /* renamed from: e */
    public Map<String, Font> f7143e;

    /* renamed from: f */
    public List<Marker> f7144f;

    /* renamed from: g */
    public SparseArrayCompat<FontCharacter> f7145g;

    /* renamed from: h */
    public LongSparseArray<Layer> f7146h;

    /* renamed from: i */
    public List<Layer> f7147i;

    /* renamed from: j */
    public Rect f7148j;

    /* renamed from: k */
    public float f7149k;

    /* renamed from: l */
    public float f7150l;

    /* renamed from: m */
    public float f7151m;

    /* renamed from: n */
    public boolean f7152n;

    /* renamed from: a */
    public final PerformanceTracker f7139a = new PerformanceTracker();

    /* renamed from: b */
    public final HashSet<String> f7140b = new HashSet<>();

    /* renamed from: o */
    public int f7153o = 0;

    @Deprecated
    public static class Factory {

        public static final class ListenerAdapter implements LottieListener<LottieComposition>, Cancellable {
            @Override // com.airbnb.lottie.LottieListener
            public void onResult(LottieComposition lottieComposition) {
                throw null;
            }
        }
    }

    @RestrictTo
    /* renamed from: a */
    public void m4646a(String str) {
        Logger.m4833a(str);
        this.f7140b.add(str);
    }

    /* renamed from: b */
    public float m4647b() {
        return (long) ((m4648c() / this.f7151m) * 1000.0f);
    }

    /* renamed from: c */
    public float m4648c() {
        return this.f7150l - this.f7149k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        if (r3.substring(0, r3.length() - 1).equalsIgnoreCase(r7) != false) goto L14;
     */
    @androidx.annotation.Nullable
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.airbnb.lottie.model.Marker m4649d(java.lang.String r7) {
        /*
            r6 = this;
            java.util.List<com.airbnb.lottie.model.Marker> r0 = r6.f7144f
            r0.size()
            r0 = 0
            r1 = 0
        L7:
            java.util.List<com.airbnb.lottie.model.Marker> r2 = r6.f7144f
            int r2 = r2.size()
            if (r1 >= r2) goto L44
            java.util.List<com.airbnb.lottie.model.Marker> r2 = r6.f7144f
            java.lang.Object r2 = r2.get(r1)
            com.airbnb.lottie.model.Marker r2 = (com.airbnb.lottie.model.Marker) r2
            java.lang.String r3 = r2.f7495a
            boolean r3 = r3.equalsIgnoreCase(r7)
            r4 = 1
            if (r3 == 0) goto L21
            goto L3e
        L21:
            java.lang.String r3 = r2.f7495a
            java.lang.String r5 = "\r"
            boolean r3 = r3.endsWith(r5)
            if (r3 == 0) goto L3d
            java.lang.String r3 = r2.f7495a
            int r5 = r3.length()
            int r5 = r5 - r4
            java.lang.String r3 = r3.substring(r0, r5)
            boolean r3 = r3.equalsIgnoreCase(r7)
            if (r3 == 0) goto L3d
            goto L3e
        L3d:
            r4 = 0
        L3e:
            if (r4 == 0) goto L41
            return r2
        L41:
            int r1 = r1 + 1
            goto L7
        L44:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieComposition.m4649d(java.lang.String):com.airbnb.lottie.model.Marker");
    }

    @RestrictTo
    /* renamed from: e */
    public Layer m4650e(long j2) {
        return this.f7146h.m1095i(j2, null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<Layer> it = this.f7147i.iterator();
        while (it.hasNext()) {
            sb.append(it.next().m4755a("\t"));
        }
        return sb.toString();
    }
}
